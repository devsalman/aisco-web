<?php namespace RseLab\Sple\Updates;

use Schema;
use October\Rain\Database\Updates\Migration;

class BuilderTableCreateRselabSpleProducts extends Migration
{
    public function up()
    {
        Schema::create('rselab_sple_products', function($table)
        {
            $table->engine = 'InnoDB';
            $table->increments('id')->unsigned();
            $table->string('name', 50);
            $table->string('display_name', 50);
            $table->text('description');
            $table->string('file_location', 255);
        });
    }
    
    public function down()
    {
        Schema::dropIfExists('rselab_sple_products');
    }
}
