package MMemberNotificationDbImpl;
// MemberNotificationDb.abs:8:0: 
public interface MemberNotificationDb_i extends abs.backend.java.lib.types.ABSInterface {
    // MemberNotificationDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MMemberNotificationModel.MemberNotification_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // MemberNotificationDb.abs:9:1: 
    public  ABS.StdLib.List<MMemberNotificationModel.MemberNotification_i> findAll(abs.backend.java.lib.types.ABSString className);
    // MemberNotificationDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MMemberNotificationModel.MemberNotification_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MemberNotificationDb.abs:10:1: 
    public  ABS.StdLib.List<MMemberNotificationModel.MemberNotification_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MemberNotificationDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MMemberNotificationModel.MemberNotification_i> async_find(abs.backend.java.lib.types.ABSString className);
    // MemberNotificationDb.abs:11:1: 
    public  MMemberNotificationModel.MemberNotification_i find(abs.backend.java.lib.types.ABSString className);
    // MemberNotificationDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MMemberNotificationModel.MemberNotification_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MemberNotificationDb.abs:12:1: 
    public  MMemberNotificationModel.MemberNotification_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MemberNotificationDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MMemberNotificationModel.MemberNotification_i object);
    // MemberNotificationDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MMemberNotificationModel.MemberNotification_i object);
    // MemberNotificationDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MMemberNotificationModel.MemberNotification_i object);
    // MemberNotificationDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MMemberNotificationModel.MemberNotification_i object);
    // MemberNotificationDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MMemberNotificationModel.MemberNotification_i> async_update(MMemberNotificationModel.MemberNotification_i object);
    // MemberNotificationDb.abs:15:1: 
    public  MMemberNotificationModel.MemberNotification_i update(MMemberNotificationModel.MemberNotification_i object);
    // MemberNotificationDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // MemberNotificationDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
