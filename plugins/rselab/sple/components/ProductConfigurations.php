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

        $config = "\nproduct " . strtoupper($subdomain) . "(" . implode(',', $features) . ");";
        $file = file_put_contents(__DIR__ . '/../lib/abs/framework/Products.abs', $config.PHP_EOL, FILE_APPEND | LOCK_EX);

        return $config;
    }
}
