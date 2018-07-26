package MIndividualBeneficiaryDbImpl;
// IndividualBeneficiaryDb.abs:8:0: 
public interface IndividualBeneficiaryDb_i extends abs.backend.java.lib.types.ABSInterface {
    // IndividualBeneficiaryDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MIndividualBeneficiaryModel.IndividualBeneficiary_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // IndividualBeneficiaryDb.abs:9:1: 
    public  ABS.StdLib.List<MIndividualBeneficiaryModel.IndividualBeneficiary_i> findAll(abs.backend.java.lib.types.ABSString className);
    // IndividualBeneficiaryDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MIndividualBeneficiaryModel.IndividualBeneficiary_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IndividualBeneficiaryDb.abs:10:1: 
    public  ABS.StdLib.List<MIndividualBeneficiaryModel.IndividualBeneficiary_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IndividualBeneficiaryDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MIndividualBeneficiaryModel.IndividualBeneficiary_i> async_find(abs.backend.java.lib.types.ABSString className);
    // IndividualBeneficiaryDb.abs:11:1: 
    public  MIndividualBeneficiaryModel.IndividualBeneficiary_i find(abs.backend.java.lib.types.ABSString className);
    // IndividualBeneficiaryDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MIndividualBeneficiaryModel.IndividualBeneficiary_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IndividualBeneficiaryDb.abs:12:1: 
    public  MIndividualBeneficiaryModel.IndividualBeneficiary_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // IndividualBeneficiaryDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MIndividualBeneficiaryModel.IndividualBeneficiary_i object);
    // IndividualBeneficiaryDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MIndividualBeneficiaryModel.IndividualBeneficiary_i object);
    // IndividualBeneficiaryDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MIndividualBeneficiaryModel.IndividualBeneficiary_i object);
    // IndividualBeneficiaryDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MIndividualBeneficiaryModel.IndividualBeneficiary_i object);
    // IndividualBeneficiaryDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MIndividualBeneficiaryModel.IndividualBeneficiary_i> async_update(MIndividualBeneficiaryModel.IndividualBeneficiary_i object);
    // IndividualBeneficiaryDb.abs:15:1: 
    public  MIndividualBeneficiaryModel.IndividualBeneficiary_i update(MIndividualBeneficiaryModel.IndividualBeneficiary_i object);
    // IndividualBeneficiaryDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // IndividualBeneficiaryDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
