package MIncomeDbImpl;
// IncomeDb.abs:8:0: 
public interface IncomeDb_i extends abs.backend.java.lib.types.ABSInterface {
    // IncomeDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MIncomeModel.Income_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // IncomeDb.abs:9:1: 
    public  ABS.StdLib.List<MIncomeModel.Income_i> findAll(abs.backend.java.lib.types.ABSString className);
    // IncomeDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MIncomeModel.Income_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IncomeDb.abs:10:1: 
    public  ABS.StdLib.List<MIncomeModel.Income_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IncomeDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MIncomeModel.Income_i> async_find(abs.backend.java.lib.types.ABSString className);
    // IncomeDb.abs:11:1: 
    public  MIncomeModel.Income_i find(abs.backend.java.lib.types.ABSString className);
    // IncomeDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MIncomeModel.Income_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IncomeDb.abs:12:1: 
    public  MIncomeModel.Income_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IncomeDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MIncomeModel.Income_i object);
    // IncomeDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MIncomeModel.Income_i object);
    // IncomeDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MIncomeModel.Income_i object);
    // IncomeDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MIncomeModel.Income_i object);
    // IncomeDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MIncomeModel.Income_i> async_update(MIncomeModel.Income_i object);
    // IncomeDb.abs:15:1: 
    public  MIncomeModel.Income_i update(MIncomeModel.Income_i object);
    // IncomeDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // IncomeDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
