<?php namespace RseLab\Sple\Updates;

use Schema;
use October\Rain\Database\Updates\Migration;

class BuilderTableCreateRselabSpleGroups extends Migration
{
    public function up()
    {
        Schema::create('rselab_sple_groups', function($table)
        {
            $table->engine = 'InnoDB';
            $table->increments('id')->unsigned();
            $table->string('name', 50);
            $table->string('display_name', 50);
            $table->text('description');
            $table->timestamp('created_at');
            $table->timestamp('updated_at');
            $table->timestamp('deleted_at')->nullable();
        });
    }
    
    public function down()
    {
        Schema::dropIfExists('rselab_sple_groups');
    }
}
