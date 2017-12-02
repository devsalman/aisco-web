<?php namespace RseLab\Sple\Updates;

use Schema;
use October\Rain\Database\Updates\Migration;

class BuilderTableUpdateRselabSpleProducts2 extends Migration
{
    public function up()
    {
        Schema::table('rselab_sple_products', function($table)
        {
            $table->integer('group_id');
            $table->foreign('group_id')->references('id')->on('rselab_sple_groups');
        });
    }
    
    public function down()
    {
        Schema::table('rselab_sple_products', function($table)
        {
            $table->dropColumn('group_id');
        });
    }
}