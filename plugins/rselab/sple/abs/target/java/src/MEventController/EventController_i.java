package MEventController;
// EventController.abs:7:0: 
public interface EventController_i extends abs.backend.java.lib.types.ABSInterface {
    // EventController.abs:9:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_list(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:9:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> list(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:10:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_detail(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:10:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> detail(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:11:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_create(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:11:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> create(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:12:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_save(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:12:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> save(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:13:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_edit(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:13:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> edit(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:14:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_update(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:14:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> update(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:15:4: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_delete(ABS.Framework.Http.ABSHttpRequest_i request);
    // EventController.abs:15:4: 
    public  ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> delete(ABS.Framework.Http.ABSHttpRequest_i request);
}
