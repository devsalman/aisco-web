package MSummaryDbImpl;
// SummaryDb.abs:8:0: 
public interface SummaryDb_i extends abs.backend.java.lib.types.ABSInterface {
    // SummaryDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MSummaryModel.Summary_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // SummaryDb.abs:9:1: 
    public  ABS.StdLib.List<MSummaryModel.Summary_i> findAll(abs.backend.java.lib.types.ABSString className);
    // SummaryDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MSummaryModel.Summary_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // SummaryDb.abs:10:1: 
    public  ABS.StdLib.List<MSummaryModel.Summary_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // SummaryDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MSummaryModel.Summary_i> async_find(abs.backend.java.lib.types.ABSString className);
    // SummaryDb.abs:11:1: 
    public  MSummaryModel.Summary_i find(abs.backend.java.lib.types.ABSString className);
    // SummaryDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MSummaryModel.Summary_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // SummaryDb.abs:12:1: 
    public  MSummaryModel.Summary_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // SummaryDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MSummaryModel.Summary_i object);
    // SummaryDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MSummaryModel.Summary_i object);
    // SummaryDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MSummaryModel.Summary_i object);
    // SummaryDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MSummaryModel.Summary_i object);
    // SummaryDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MSummaryModel.Summary_i> async_update(MSummaryModel.Summary_i object);
    // SummaryDb.abs:15:1: 
    public  MSummaryModel.Summary_i update(MSummaryModel.Summary_i object);
    // SummaryDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // SummaryDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
