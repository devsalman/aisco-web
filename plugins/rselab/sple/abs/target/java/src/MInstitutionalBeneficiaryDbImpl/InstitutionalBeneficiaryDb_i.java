package MInstitutionalBeneficiaryDbImpl;
// InstitutionalBeneficiaryDb.abs:8:0: 
public interface InstitutionalBeneficiaryDb_i extends abs.backend.java.lib.types.ABSInterface {
    // InstitutionalBeneficiaryDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // InstitutionalBeneficiaryDb.abs:9:1: 
    public  ABS.StdLib.List<MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i> findAll(abs.backend.java.lib.types.ABSString className);
    // InstitutionalBeneficiaryDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // InstitutionalBeneficiaryDb.abs:10:1: 
    public  ABS.StdLib.List<MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // InstitutionalBeneficiaryDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i> async_find(abs.backend.java.lib.types.ABSString className);
    // InstitutionalBeneficiaryDb.abs:11:1: 
    public  MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i find(abs.backend.java.lib.types.ABSString className);
    // InstitutionalBeneficiaryDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // InstitutionalBeneficiaryDb.abs:12:1: 
    public  MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // InstitutionalBeneficiaryDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i object);
    // InstitutionalBeneficiaryDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i object);
    // InstitutionalBeneficiaryDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i object);
    // InstitutionalBeneficiaryDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i object);
    // InstitutionalBeneficiaryDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i> async_update(MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i object);
    // InstitutionalBeneficiaryDb.abs:15:1: 
    public  MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i update(MInstitutionalBeneficiaryModel.InstitutionalBeneficiary_i object);
    // InstitutionalBeneficiaryDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // InstitutionalBeneficiaryDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
