package MAutomaticReportDbImpl;
// AutomaticReportDb.abs:8:0: 
public interface AutomaticReportDb_i extends abs.backend.java.lib.types.ABSInterface {
    // AutomaticReportDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAutomaticReportModel.AutomaticReport_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // AutomaticReportDb.abs:9:1: 
    public  ABS.StdLib.List<MAutomaticReportModel.AutomaticReport_i> findAll(abs.backend.java.lib.types.ABSString className);
    // AutomaticReportDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAutomaticReportModel.AutomaticReport_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AutomaticReportDb.abs:10:1: 
    public  ABS.StdLib.List<MAutomaticReportModel.AutomaticReport_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AutomaticReportDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAutomaticReportModel.AutomaticReport_i> async_find(abs.backend.java.lib.types.ABSString className);
    // AutomaticReportDb.abs:11:1: 
    public  MAutomaticReportModel.AutomaticReport_i find(abs.backend.java.lib.types.ABSString className);
    // AutomaticReportDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAutomaticReportModel.AutomaticReport_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AutomaticReportDb.abs:12:1: 
    public  MAutomaticReportModel.AutomaticReport_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AutomaticReportDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MAutomaticReportModel.AutomaticReport_i object);
    // AutomaticReportDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MAutomaticReportModel.AutomaticReport_i object);
    // AutomaticReportDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MAutomaticReportModel.AutomaticReport_i object);
    // AutomaticReportDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MAutomaticReportModel.AutomaticReport_i object);
    // AutomaticReportDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAutomaticReportModel.AutomaticReport_i> async_update(MAutomaticReportModel.AutomaticReport_i object);
    // AutomaticReportDb.abs:15:1: 
    public  MAutomaticReportModel.AutomaticReport_i update(MAutomaticReportModel.AutomaticReport_i object);
    // AutomaticReportDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // AutomaticReportDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
