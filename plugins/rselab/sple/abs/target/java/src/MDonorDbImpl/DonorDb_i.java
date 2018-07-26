package MDonorDbImpl;
// DonorDb.abs:8:0: 
public interface DonorDb_i extends abs.backend.java.lib.types.ABSInterface {
    // DonorDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MDonorModel.Donor_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // DonorDb.abs:9:1: 
    public  ABS.StdLib.List<MDonorModel.Donor_i> findAll(abs.backend.java.lib.types.ABSString className);
    // DonorDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MDonorModel.Donor_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // DonorDb.abs:10:1: 
    public  ABS.StdLib.List<MDonorModel.Donor_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // DonorDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MDonorModel.Donor_i> async_find(abs.backend.java.lib.types.ABSString className);
    // DonorDb.abs:11:1: 
    public  MDonorModel.Donor_i find(abs.backend.java.lib.types.ABSString className);
    // DonorDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MDonorModel.Donor_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // DonorDb.abs:12:1: 
    public  MDonorModel.Donor_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // DonorDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MDonorModel.Donor_i object);
    // DonorDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MDonorModel.Donor_i object);
    // DonorDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MDonorModel.Donor_i object);
    // DonorDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MDonorModel.Donor_i object);
    // DonorDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MDonorModel.Donor_i> async_update(MDonorModel.Donor_i object);
    // DonorDb.abs:15:1: 
    public  MDonorModel.Donor_i update(MDonorModel.Donor_i object);
    // DonorDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // DonorDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
