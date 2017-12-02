<?php namespace RseLab\Sple\Updates;

use Schema;
use October\Rain\Database\Updates\Migration;

class BuilderTableUpdateRselabSpleProducts extends Migration
{
    public function up()
    {
        Schema::table('rselab_sple_products', function($table)
        {
            $table->timestamp('created_at');
            $table->timestamp('updated_at');
            $table->timestamp('deleted_at')->nullable();
        });
    }
    
    public function down()
    {
        Schema::table('rselab_sple_products', function($table)
        {
            $table->dropColumn('created_at');
            $table->dropColumn('updated_at');
            $table->dropColumn('deleted_at');
        });
    }
}
