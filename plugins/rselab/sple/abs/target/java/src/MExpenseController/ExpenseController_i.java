package MExpenseController;
// ExpenseController.abs:8:0: 
public interface ExpenseController_i extends abs.backend.java.lib.types.ABSInterface {
    // ExpenseController.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>>> async_list(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:9:1: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>> list(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>>> async_detail(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:10:1: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>> detail(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>>> async_create(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:11:1: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>> create(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>>> async_save(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:12:1: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>> save(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>>> async_edit(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:13:1: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>> edit(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>>> async_update(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:14:1: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>> update(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>>> async_delete(ABS.Framework.Http.ABSHttpRequest_i request);
    // ExpenseController.abs:15:1: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MExpenseModel.Expense_i>> delete(ABS.Framework.Http.ABSHttpRequest_i request);
}
