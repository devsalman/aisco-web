package MExpenseModel;
// Expense.abs:4:0: 
public interface Expense_i extends abs.backend.java.lib.types.ABSInterface {
    // Expense.abs:5:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setIdExpense(abs.backend.java.lib.types.ABSInteger id);
    // Expense.abs:5:1: 
    public  abs.backend.java.lib.types.ABSUnit setIdExpense(abs.backend.java.lib.types.ABSInteger id);
    // Expense.abs:6:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getIdExpense();
    // Expense.abs:6:1: 
    public  abs.backend.java.lib.types.ABSInteger getIdExpense();
    // Expense.abs:7:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setDate(abs.backend.java.lib.types.ABSString date);
    // Expense.abs:7:1: 
    public  abs.backend.java.lib.types.ABSUnit setDate(abs.backend.java.lib.types.ABSString date);
    // Expense.abs:8:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getDate();
    // Expense.abs:8:1: 
    public  abs.backend.java.lib.types.ABSString getDate();
    // Expense.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setIdProgram(abs.backend.java.lib.types.ABSInteger idProgram);
    // Expense.abs:9:1: 
    public  abs.backend.java.lib.types.ABSUnit setIdProgram(abs.backend.java.lib.types.ABSInteger idProgram);
    // Expense.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getIdProgram();
    // Expense.abs:10:1: 
    public  abs.backend.java.lib.types.ABSInteger getIdProgram();
    // Expense.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setDescription(abs.backend.java.lib.types.ABSString description);
    // Expense.abs:11:1: 
    public  abs.backend.java.lib.types.ABSUnit setDescription(abs.backend.java.lib.types.ABSString description);
    // Expense.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getDescription();
    // Expense.abs:12:1: 
    public  abs.backend.java.lib.types.ABSString getDescription();
    // Expense.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setAmount(abs.backend.java.lib.types.ABSInteger amount);
    // Expense.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit setAmount(abs.backend.java.lib.types.ABSInteger amount);
    // Expense.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getAmount();
    // Expense.abs:14:1: 
    public  abs.backend.java.lib.types.ABSInteger getAmount();
}
