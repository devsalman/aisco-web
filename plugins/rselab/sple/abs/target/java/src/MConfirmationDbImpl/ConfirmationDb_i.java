package MConfirmationDbImpl;
// ConfirmationDb.abs:8:0: 
public interface ConfirmationDb_i extends abs.backend.java.lib.types.ABSInterface {
    // ConfirmationDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MConfirmationModel.Confirmation_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // ConfirmationDb.abs:9:1: 
    public  ABS.StdLib.List<MConfirmationModel.Confirmation_i> findAll(abs.backend.java.lib.types.ABSString className);
    // ConfirmationDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MConfirmationModel.Confirmation_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ConfirmationDb.abs:10:1: 
    public  ABS.StdLib.List<MConfirmationModel.Confirmation_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ConfirmationDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MConfirmationModel.Confirmation_i> async_find(abs.backend.java.lib.types.ABSString className);
    // ConfirmationDb.abs:11:1: 
    public  MConfirmationModel.Confirmation_i find(abs.backend.java.lib.types.ABSString className);
    // ConfirmationDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MConfirmationModel.Confirmation_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ConfirmationDb.abs:12:1: 
    public  MConfirmationModel.Confirmation_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ConfirmationDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MConfirmationModel.Confirmation_i object);
    // ConfirmationDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MConfirmationModel.Confirmation_i object);
    // ConfirmationDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MConfirmationModel.Confirmation_i object);
    // ConfirmationDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MConfirmationModel.Confirmation_i object);
    // ConfirmationDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MConfirmationModel.Confirmation_i> async_update(MConfirmationModel.Confirmation_i object);
    // ConfirmationDb.abs:15:1: 
    public  MConfirmationModel.Confirmation_i update(MConfirmationModel.Confirmation_i object);
    // ConfirmationDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // ConfirmationDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
