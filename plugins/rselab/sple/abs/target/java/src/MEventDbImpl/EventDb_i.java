package MEventDbImpl;
// EventDb.abs:8:0: 
public interface EventDb_i extends abs.backend.java.lib.types.ABSInterface {
    // EventDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MEventModel.Event_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // EventDb.abs:9:1: 
    public  ABS.StdLib.List<MEventModel.Event_i> findAll(abs.backend.java.lib.types.ABSString className);
    // EventDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MEventModel.Event_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // EventDb.abs:10:1: 
    public  ABS.StdLib.List<MEventModel.Event_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // EventDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MEventModel.Event_i> async_find(abs.backend.java.lib.types.ABSString className);
    // EventDb.abs:11:1: 
    public  MEventModel.Event_i find(abs.backend.java.lib.types.ABSString className);
    // EventDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MEventModel.Event_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // EventDb.abs:12:1: 
    public  MEventModel.Event_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // EventDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MEventModel.Event_i object);
    // EventDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MEventModel.Event_i object);
    // EventDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MEventModel.Event_i object);
    // EventDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MEventModel.Event_i object);
    // EventDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MEventModel.Event_i> async_update(MEventModel.Event_i object);
    // EventDb.abs:15:1: 
    public  MEventModel.Event_i update(MEventModel.Event_i object);
    // EventDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // EventDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
