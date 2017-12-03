<?php namespace RseLab\Sple\Updates;

use Schema;
use October\Rain\Database\Updates\Migration;

class RselabSpleCreateProductGroupForeignConstraint extends Migration
{
    public function up()
    {
        Schema::table('rselab_sple_products', function($table)
        {
            $table->integer('group_id')->unsigned();
            $table->foreign('group_id')->references('id')->on('rselab_sple_groups');
        });
    }
    
    public function down()
    {
        Schema::table('rselab_sple_products', function($table)
        {
            $table->dropForeign('rselab_sple_products_group_id_foreign');
            $table->dropColumn('group_id');
        });
    }
}