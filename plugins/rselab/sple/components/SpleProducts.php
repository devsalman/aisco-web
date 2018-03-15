<?php

namespace RseLab\Sple\Components;

use \RseLab\Sple\Models\Product;

class SpleProducts extends \Cms\Classes\ComponentBase
{
    public function componentDetails()
    {
        return [
            'name' => 'SPLE Products',
            'description' => 'Display a Collection of SPLE Products'
        ];
    }

    public function products()
    {
        $products = Product::all();
        $data = [];

        foreach($products as $product) {
            if(!array_key_exists($product->group->display_name, $data)) {
                $data[$product->group->display_name] = [];
            }

            array_push($data[$product->group->display_name], $product);
        }

        return $data;
    }
}
