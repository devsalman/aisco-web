<?php namespace RseLab\Sple;

use System\Classes\PluginBase;

class Plugin extends PluginBase
{
    public function registerComponents()
    {
        return [
            'RseLab\Sple\Components\SpleProducts' => 'spleProducts',
            'RseLab\Sple\Components\ProductConfigurations' => 'productConfigurations',
        ];
    }

    public function registerSettings()
    {
    }
}
