package MProductDbImpl;
// ProductDb.abs:8:0: 
public interface ProductDb_i extends abs.backend.java.lib.types.ABSInterface {
    // ProductDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MProductModel.Product_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // ProductDb.abs:9:1: 
    public  ABS.StdLib.List<MProductModel.Product_i> findAll(abs.backend.java.lib.types.ABSString className);
    // ProductDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MProductModel.Product_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ProductDb.abs:10:1: 
    public  ABS.StdLib.List<MProductModel.Product_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ProductDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MProductModel.Product_i> async_find(abs.backend.java.lib.types.ABSString className);
    // ProductDb.abs:11:1: 
    public  MProductModel.Product_i find(abs.backend.java.lib.types.ABSString className);
    // ProductDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MProductModel.Product_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ProductDb.abs:12:1: 
    public  MProductModel.Product_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ProductDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MProductModel.Product_i object);
    // ProductDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MProductModel.Product_i object);
    // ProductDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MProductModel.Product_i object);
    // ProductDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MProductModel.Product_i object);
    // ProductDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MProductModel.Product_i> async_update(MProductModel.Product_i object);
    // ProductDb.abs:15:1: 
    public  MProductModel.Product_i update(MProductModel.Product_i object);
    // ProductDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // ProductDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
