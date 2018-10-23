<?php

namespace RseLab\Sple\Components;

class ProductConfigurations extends \Cms\Classes\ComponentBase
{
    public function componentDetails()
    {
        return [
            'name' => 'Product Configuration',
            'description' => 'Generate Product Configuration File'
        ];
    }

    public function onCreate()
    {
        $name = input('name');
        $description = input('description');
        $subdomain = input('subdomain');
        $features = input('features');

        $productName = strtoupper($subdomain);
        $this->generateConfigProperties($productName);
        $this->createProductDatabase($productName);

        $config = "\nproduct " . $productName . "(ProgramData,FinancialReport," . implode(',', $features) . ");";
        $file = file_put_contents(__DIR__ . '/../abs/src/abs/framework/Products.abs', $config.PHP_EOL, FILE_APPEND | LOCK_EX);

        chdir(__DIR__ . "/../abs");
        $result = shell_exec("ant -Dabsproduct=" . $productName . " abs.deploy");

        return $config;
    }

    private function generateConfigProperties($dbName)
    {
        $dbUrl = "jdbc:mysql://localhost:3306/";
        $dbUser = "devel";
        $dbPassword = "password123";

        $config = "database=" . $dbUrl . "\n";
        $config .= "dbname=" . $dbName . "\n";
        $config .= "dbuser=" . $dbUser . "\n";
        $config .= "dbpassword=" . $dbPassword . "\n";

        $file = file_put_contents(__DIR__ . "/../abs/config.properties", $config.PHP_EOL);
    }

    private function createProductDatabase($dbName)
    {
        $query = "CREATE DATABASE IF NOT EXISTS " . $dbName . ";";
        $queryFile = $dbName . ".sql";
        $file = file_put_contents(__DIR__ . "/../abs/" . $queryFile, $query.PHP_EOL);
        chdir(__DIR__ . "/../abs");
        $result = shell_exec("mysql -u devel -ppassword123 < " . $queryFile);
    }
}
