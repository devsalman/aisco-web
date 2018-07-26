package MProductController;
// ProductController.abs:18:0: 
public final class ProductControllerImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MProductController.ProductController_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public ProductControllerImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "ProductControllerImpl"; }
    public static final <T extends ProductControllerImpl_c> T createNewCOG() { return (T)ProductControllerImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends ProductControllerImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(ProductControllerImpl_c.class) : __ABS_runtime.createCOG(ProductControllerImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            ProductControllerImpl_c __ABS_result = new ProductControllerImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends ProductControllerImpl_c> T createNewObject() { return (T)ProductControllerImpl_c.__ABS_createNewObject(null); }
    public static final <T extends ProductControllerImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        ProductControllerImpl_c __ABS_result = new ProductControllerImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // ProductController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_list(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MProductController.ProductControllerImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "list";
                }
                public Object execute() {
                    return target.list(arg0
                    );
                }
            }.init(request))
        ;
    }
    // ProductController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> list(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "list");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",21);
            MProductDbImpl.ProductDb_i orm = MProductDbImpl.ProductDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",23);
            ABS.StdLib.List<MProductModel.Product_i> productItems = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findAll(abs.backend.java.lib.types.ABSString.fromString("MProductModel.ProductImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("productItems",productItems);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",25);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("product/list"), productItems);
        }
    }
    // ProductController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_detail(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MProductController.ProductControllerImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "detail";
                }
                public Object execute() {
                    return target.detail(arg0
                    );
                }
            }.init(request))
        ;
    }
    // ProductController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> detail(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "detail");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",29);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idProduct"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",30);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idProduct=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",31);
            MProductDbImpl.ProductDb_i orm = MProductDbImpl.ProductDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",32);
            MProductModel.Product_i productItem = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MProductModel.ProductImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("productItem",productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",34);
            ABS.StdLib.List<MProductModel.Product_i> dataModel = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel",dataModel);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",35);
            dataModel = ABS.StdLib.appendright_f.apply(dataModel, productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel", dataModel);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",37);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("product/detail"), dataModel);
        }
    }
    // ProductController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_create(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MProductController.ProductControllerImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "create";
                }
                public Object execute() {
                    return target.create(arg0
                    );
                }
            }.init(request))
        ;
    }
    // ProductController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> create(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "create");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",41);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("product/create"), new ABS.StdLib.List_Nil());
        }
    }
    // ProductController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_save(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MProductController.ProductControllerImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "save";
                }
                public Object execute() {
                    return target.save(arg0
                    );
                }
            }.init(request))
        ;
    }
    // ProductController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> save(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "save");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",45);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",47);
            MProductDbImpl.ProductDb_i orm = MProductDbImpl.ProductDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",48);
            MProductModel.Product_i productItem = MProductModel.ProductImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("productItem",productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",50);
            abs.backend.java.lib.types.ABSString name = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("name"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("name",name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",51);
            abs.backend.java.lib.types.ABSString description = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("description"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("description",description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",53);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(productItem).setName(name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",54);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(productItem).setDescription(description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",55);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).save(productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",57);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return list(request);
        }
    }
    // ProductController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_edit(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MProductController.ProductControllerImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "edit";
                }
                public Object execute() {
                    return target.edit(arg0
                    );
                }
            }.init(request))
        ;
    }
    // ProductController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> edit(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "edit");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",61);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idProduct"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",62);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idProduct=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",63);
            MProductDbImpl.ProductDb_i orm = MProductDbImpl.ProductDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",64);
            MProductModel.Product_i productItem = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MProductModel.ProductImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("productItem",productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",66);
            ABS.StdLib.List<MProductModel.Product_i> dataModel = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel",dataModel);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",67);
            dataModel = ABS.StdLib.appendright_f.apply(dataModel, productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel", dataModel);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",68);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("product/edit"), dataModel);
        }
    }
    // ProductController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_update(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MProductController.ProductControllerImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "update";
                }
                public Object execute() {
                    return target.update(arg0
                    );
                }
            }.init(request))
        ;
    }
    // ProductController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> update(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",72);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",74);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idProduct"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",75);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idProduct=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",76);
            MProductDbImpl.ProductDb_i orm = MProductDbImpl.ProductDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",77);
            MProductModel.Product_i productItem = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MProductModel.ProductImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("productItem",productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",79);
            abs.backend.java.lib.types.ABSString name = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("name"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("name",name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",80);
            abs.backend.java.lib.types.ABSString description = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("description"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("description",description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",82);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(productItem).setName(name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",83);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(productItem).setDescription(description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",84);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).update(productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",86);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return detail(request);
        }
    }
    // ProductController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>>> async_delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MProductController.ProductControllerImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "delete";
                }
                public Object execute() {
                    return target.delete(arg0
                    );
                }
            }.init(request))
        ;
    }
    // ProductController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MProductModel.Product_i>> delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",90);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idProduct"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",91);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idProduct=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",92);
            MProductDbImpl.ProductDb_i orm = MProductDbImpl.ProductDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",93);
            MProductModel.Product_i productItem = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MProductModel.ProductImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("productItem",productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",95);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).delete(productItem);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/ProductController.abs",97);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return list(request);
        }
    }
}
