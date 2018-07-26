package MItemDonationDbImpl;
// ItemDonationDb.abs:8:0: 
public interface ItemDonationDb_i extends abs.backend.java.lib.types.ABSInterface {
    // ItemDonationDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MItemDonationModel.ItemDonation_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // ItemDonationDb.abs:9:1: 
    public  ABS.StdLib.List<MItemDonationModel.ItemDonation_i> findAll(abs.backend.java.lib.types.ABSString className);
    // ItemDonationDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MItemDonationModel.ItemDonation_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ItemDonationDb.abs:10:1: 
    public  ABS.StdLib.List<MItemDonationModel.ItemDonation_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ItemDonationDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MItemDonationModel.ItemDonation_i> async_find(abs.backend.java.lib.types.ABSString className);
    // ItemDonationDb.abs:11:1: 
    public  MItemDonationModel.ItemDonation_i find(abs.backend.java.lib.types.ABSString className);
    // ItemDonationDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MItemDonationModel.ItemDonation_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ItemDonationDb.abs:12:1: 
    public  MItemDonationModel.ItemDonation_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ItemDonationDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MItemDonationModel.ItemDonation_i object);
    // ItemDonationDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MItemDonationModel.ItemDonation_i object);
    // ItemDonationDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MItemDonationModel.ItemDonation_i object);
    // ItemDonationDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MItemDonationModel.ItemDonation_i object);
    // ItemDonationDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MItemDonationModel.ItemDonation_i> async_update(MItemDonationModel.ItemDonation_i object);
    // ItemDonationDb.abs:15:1: 
    public  MItemDonationModel.ItemDonation_i update(MItemDonationModel.ItemDonation_i object);
    // ItemDonationDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // ItemDonationDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
