package MContinuousProgramDbImpl;
// ContinuousProgramDb.abs:8:0: 
public interface ContinuousProgramDb_i extends abs.backend.java.lib.types.ABSInterface {
    // ContinuousProgramDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MContinuousProgramModel.ContinuousProgram_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // ContinuousProgramDb.abs:9:1: 
    public  ABS.StdLib.List<MContinuousProgramModel.ContinuousProgram_i> findAll(abs.backend.java.lib.types.ABSString className);
    // ContinuousProgramDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MContinuousProgramModel.ContinuousProgram_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ContinuousProgramDb.abs:10:1: 
    public  ABS.StdLib.List<MContinuousProgramModel.ContinuousProgram_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ContinuousProgramDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MContinuousProgramModel.ContinuousProgram_i> async_find(abs.backend.java.lib.types.ABSString className);
    // ContinuousProgramDb.abs:11:1: 
    public  MContinuousProgramModel.ContinuousProgram_i find(abs.backend.java.lib.types.ABSString className);
    // ContinuousProgramDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MContinuousProgramModel.ContinuousProgram_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ContinuousProgramDb.abs:12:1: 
    public  MContinuousProgramModel.ContinuousProgram_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ContinuousProgramDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MContinuousProgramModel.ContinuousProgram_i object);
    // ContinuousProgramDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MContinuousProgramModel.ContinuousProgram_i object);
    // ContinuousProgramDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MContinuousProgramModel.ContinuousProgram_i object);
    // ContinuousProgramDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MContinuousProgramModel.ContinuousProgram_i object);
    // ContinuousProgramDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MContinuousProgramModel.ContinuousProgram_i> async_update(MContinuousProgramModel.ContinuousProgram_i object);
    // ContinuousProgramDb.abs:15:1: 
    public  MContinuousProgramModel.ContinuousProgram_i update(MContinuousProgramModel.ContinuousProgram_i object);
    // ContinuousProgramDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // ContinuousProgramDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
