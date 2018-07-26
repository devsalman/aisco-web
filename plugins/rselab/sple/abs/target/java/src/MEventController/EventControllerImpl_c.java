package MEventController;
// EventController.abs:18:0: 
public final class EventControllerImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MEventController.EventController_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public EventControllerImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "EventControllerImpl"; }
    public static final <T extends EventControllerImpl_c> T createNewCOG() { return (T)EventControllerImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends EventControllerImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(EventControllerImpl_c.class) : __ABS_runtime.createCOG(EventControllerImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            EventControllerImpl_c __ABS_result = new EventControllerImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends EventControllerImpl_c> T createNewObject() { return (T)EventControllerImpl_c.__ABS_createNewObject(null); }
    public static final <T extends EventControllerImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        EventControllerImpl_c __ABS_result = new EventControllerImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // EventController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_list(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MEventController.EventControllerImpl_c>(
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
    // EventController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> list(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "list");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",21);
            MEventDbImpl.EventDb_i orm = MEventDbImpl.EventDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",23);
            ABS.StdLib.List<MEventModel.Event_i> events = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findAll(abs.backend.java.lib.types.ABSString.fromString("MEventModel.EventImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("events",events);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",25);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("event/list"), events);
        }
    }
    // EventController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_detail(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MEventController.EventControllerImpl_c>(
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
    // EventController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> detail(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "detail");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",29);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idEvent"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",30);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idEvent=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",31);
            MEventDbImpl.EventDb_i orm = MEventDbImpl.EventDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",32);
            MEventModel.Event_i event = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MEventModel.EventImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("event",event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",34);
            ABS.StdLib.List<MEventModel.Event_i> dataModel = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel",dataModel);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",35);
            dataModel = ABS.StdLib.appendright_f.apply(dataModel, event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel", dataModel);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",37);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("event/detail"), dataModel);
        }
    }
    // EventController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_create(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MEventController.EventControllerImpl_c>(
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
    // EventController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> create(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "create");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",41);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("event/create"), new ABS.StdLib.List_Nil());
        }
    }
    // EventController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_save(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MEventController.EventControllerImpl_c>(
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
    // EventController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> save(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "save");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",45);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",47);
            MEventDbImpl.EventDb_i orm = MEventDbImpl.EventDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",48);
            MEventModel.Event_i event = MEventModel.EventImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("event",event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",50);
            abs.backend.java.lib.types.ABSString name = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("name"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("name",name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",51);
            abs.backend.java.lib.types.ABSString description = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("description"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("description",description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",52);
            abs.backend.java.lib.types.ABSString date = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("date"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("date",date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",53);
            abs.backend.java.lib.types.ABSString partner = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("partner"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("partner",partner);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",54);
            abs.backend.java.lib.types.ABSString target = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("target"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("target",target);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",55);
            abs.backend.java.lib.types.ABSString logoUrl = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("logoUrl"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("logoUrl",logoUrl);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",57);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setName(name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",58);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setDescription(description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",59);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setDate(date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",60);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setPartner(partner);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",61);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setTarget(target);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",62);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setLogoUrl(logoUrl);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",63);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).save(event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",65);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return list(request);
        }
    }
    // EventController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_edit(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MEventController.EventControllerImpl_c>(
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
    // EventController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> edit(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "edit");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",69);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idEvent"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",70);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idEvent=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",71);
            MEventDbImpl.EventDb_i orm = MEventDbImpl.EventDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",72);
            MEventModel.Event_i event = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MEventModel.EventImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("event",event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",74);
            ABS.StdLib.List<MEventModel.Event_i> dataModel = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel",dataModel);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",75);
            dataModel = ABS.StdLib.appendright_f.apply(dataModel, event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel", dataModel);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",76);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("event/edit"), dataModel);
        }
    }
    // EventController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_update(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MEventController.EventControllerImpl_c>(
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
    // EventController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> update(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",80);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",82);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idEvent"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",83);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idEvent=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",84);
            MEventDbImpl.EventDb_i orm = MEventDbImpl.EventDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",85);
            MEventModel.Event_i event = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MEventModel.EventImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("event",event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",87);
            abs.backend.java.lib.types.ABSString name = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("name"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("name",name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",88);
            abs.backend.java.lib.types.ABSString description = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("description"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("description",description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",89);
            abs.backend.java.lib.types.ABSString date = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("date"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("date",date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",90);
            abs.backend.java.lib.types.ABSString partner = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("partner"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("partner",partner);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",91);
            abs.backend.java.lib.types.ABSString target = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("target"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("target",target);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",92);
            abs.backend.java.lib.types.ABSString logoUrl = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("logoUrl"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("logoUrl",logoUrl);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",94);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setName(name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",95);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setDescription(description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",96);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setDate(date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",97);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setPartner(partner);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",98);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setTarget(target);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",99);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(event).setLogoUrl(logoUrl);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",100);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).update(event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",102);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return detail(request);
        }
    }
    // EventController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>>> async_delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MEventController.EventControllerImpl_c>(
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
    // EventController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MEventModel.Event_i>> delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",106);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idEvent"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",107);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idEvent=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",108);
            MEventDbImpl.EventDb_i orm = MEventDbImpl.EventDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",109);
            MEventModel.Event_i event = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MEventModel.EventImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("event",event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",111);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).delete(event);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/EventController.abs",113);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return list(request);
        }
    }
}
