package MMoneyDonationDbImpl;
// MoneyDonationDb.abs:8:0: 
public interface MoneyDonationDb_i extends abs.backend.java.lib.types.ABSInterface {
    // MoneyDonationDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MMoneyDonationModel.MoneyDonation_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // MoneyDonationDb.abs:9:1: 
    public  ABS.StdLib.List<MMoneyDonationModel.MoneyDonation_i> findAll(abs.backend.java.lib.types.ABSString className);
    // MoneyDonationDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MMoneyDonationModel.MoneyDonation_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MoneyDonationDb.abs:10:1: 
    public  ABS.StdLib.List<MMoneyDonationModel.MoneyDonation_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MoneyDonationDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MMoneyDonationModel.MoneyDonation_i> async_find(abs.backend.java.lib.types.ABSString className);
    // MoneyDonationDb.abs:11:1: 
    public  MMoneyDonationModel.MoneyDonation_i find(abs.backend.java.lib.types.ABSString className);
    // MoneyDonationDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MMoneyDonationModel.MoneyDonation_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MoneyDonationDb.abs:12:1: 
    public  MMoneyDonationModel.MoneyDonation_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // MoneyDonationDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MMoneyDonationModel.MoneyDonation_i object);
    // MoneyDonationDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MMoneyDonationModel.MoneyDonation_i object);
    // MoneyDonationDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MMoneyDonationModel.MoneyDonation_i object);
    // MoneyDonationDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MMoneyDonationModel.MoneyDonation_i object);
    // MoneyDonationDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MMoneyDonationModel.MoneyDonation_i> async_update(MMoneyDonationModel.MoneyDonation_i object);
    // MoneyDonationDb.abs:15:1: 
    public  MMoneyDonationModel.MoneyDonation_i update(MMoneyDonationModel.MoneyDonation_i object);
    // MoneyDonationDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // MoneyDonationDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
