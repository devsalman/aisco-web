package MExpenseDbImpl;
// ExpenseDb.abs:8:0: 
public interface ExpenseDb_i extends abs.backend.java.lib.types.ABSInterface {
    // ExpenseDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MExpenseModel.Expense_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // ExpenseDb.abs:9:1: 
    public  ABS.StdLib.List<MExpenseModel.Expense_i> findAll(abs.backend.java.lib.types.ABSString className);
    // ExpenseDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MExpenseModel.Expense_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ExpenseDb.abs:10:1: 
    public  ABS.StdLib.List<MExpenseModel.Expense_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ExpenseDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MExpenseModel.Expense_i> async_find(abs.backend.java.lib.types.ABSString className);
    // ExpenseDb.abs:11:1: 
    public  MExpenseModel.Expense_i find(abs.backend.java.lib.types.ABSString className);
    // ExpenseDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MExpenseModel.Expense_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ExpenseDb.abs:12:1: 
    public  MExpenseModel.Expense_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // ExpenseDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MExpenseModel.Expense_i object);
    // ExpenseDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MExpenseModel.Expense_i object);
    // ExpenseDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MExpenseModel.Expense_i object);
    // ExpenseDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MExpenseModel.Expense_i object);
    // ExpenseDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MExpenseModel.Expense_i> async_update(MExpenseModel.Expense_i object);
    // ExpenseDb.abs:15:1: 
    public  MExpenseModel.Expense_i update(MExpenseModel.Expense_i object);
    // ExpenseDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // ExpenseDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
