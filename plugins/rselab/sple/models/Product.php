<?php namespace RseLab\Sple\Models;

use Model;

/**
 * Model
 */
class Product extends Model
{
    use \October\Rain\Database\Traits\Validation;
    
    use \October\Rain\Database\Traits\SoftDelete;

    protected $dates = ['deleted_at'];
    public $attachOne = ['abs_file' => 'System\Models\File'];

    /**
     * @var array Validation rules
     */
    public $rules = [
    ];

    /**
     * @var string The database table used by the model.
     */
    public $table = 'rselab_sple_products';

    public $belongsTo = [
        'group' => 'RseLab\Sple\Models\Group'
    ];

    public function getGroupIdOptions($value, $formData)
    {
        $groups = Group::all();
        $data = [];
        foreach($groups as $group) {
            $data[$group->id] = $group->display_name;
        }

        return $data;
    }
}
