package MProductController;
// ProductController.abs:7:0: 
public interface ProductController_i extends abs.backend.java.lib.types.ABSInterface {
    // ProductController.abs:9:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_list(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:9:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> list(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:10:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_detail(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:10:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> detail(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:11:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_create(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:11:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> create(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:12:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_save(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:12:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> save(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:13:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_edit(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:13:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> edit(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:14:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_update(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:14:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> update(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:15:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_delete(ABS.Framework.Http.ABSHttpRequest_i request);
    // ProductController.abs:15:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> delete(ABS.Framework.Http.ABSHttpRequest_i request);
}
