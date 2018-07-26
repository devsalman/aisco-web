package MSummaryController;
// SummaryController.abs:18:0: 
public final class SummaryControllerImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MSummaryController.SummaryController_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public SummaryControllerImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "SummaryControllerImpl"; }
    public static final <T extends SummaryControllerImpl_c> T createNewCOG() { return (T)SummaryControllerImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends SummaryControllerImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(SummaryControllerImpl_c.class) : __ABS_runtime.createCOG(SummaryControllerImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            SummaryControllerImpl_c __ABS_result = new SummaryControllerImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends SummaryControllerImpl_c> T createNewObject() { return (T)SummaryControllerImpl_c.__ABS_createNewObject(null); }
    public static final <T extends SummaryControllerImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        SummaryControllerImpl_c __ABS_result = new SummaryControllerImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // SummaryController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>>> async_list(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MSummaryController.SummaryControllerImpl_c>(
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
    // SummaryController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>> list(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "list");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",20);
            MSummaryDbImpl.SummaryDb_i orm = MSummaryDbImpl.SummaryDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",22);
            ABS.StdLib.List<MSummaryModel.Summary_i> summaries = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findAll(abs.backend.java.lib.types.ABSString.fromString("MSummaryModel.SummaryImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("summaries",summaries);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",24);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("summary/list"), summaries);
        }
    }
    // SummaryController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>>> async_detail(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MSummaryController.SummaryControllerImpl_c>(
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
    // SummaryController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>> detail(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "detail");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",28);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idSummary"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",29);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idSummary=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",30);
            MSummaryDbImpl.SummaryDb_i orm = MSummaryDbImpl.SummaryDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",31);
            MSummaryModel.Summary_i summary = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MSummaryModel.SummaryImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("summary",summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",33);
            ABS.StdLib.List<MSummaryModel.Summary_i> dataModel = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel",dataModel);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",34);
            dataModel = ABS.StdLib.appendright_f.apply(dataModel, summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel", dataModel);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",36);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("summary/detail"), dataModel);
        }
    }
    // SummaryController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>>> async_create(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MSummaryController.SummaryControllerImpl_c>(
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
    // SummaryController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>> create(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "create");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",40);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("summary/create"), new ABS.StdLib.List_Nil());
        }
    }
    // SummaryController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>>> async_save(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MSummaryController.SummaryControllerImpl_c>(
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
    // SummaryController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>> save(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "save");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",44);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",46);
            MSummaryDbImpl.SummaryDb_i orm = MSummaryDbImpl.SummaryDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",47);
            MSummaryModel.Summary_i summary = MSummaryModel.SummaryImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("summary",summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",49);
            abs.backend.java.lib.types.ABSString date = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("date"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("date",date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",50);
            abs.backend.java.lib.types.ABSString description = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("description"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("description",description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",51);
            abs.backend.java.lib.types.ABSString incomeStr = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("income"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("incomeStr",incomeStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",52);
            abs.backend.java.lib.types.ABSInteger income = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(incomeStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("income",income);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",53);
            abs.backend.java.lib.types.ABSString expenseStr = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("expense"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("expenseStr",expenseStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",54);
            abs.backend.java.lib.types.ABSInteger expense = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(expenseStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("expense",expense);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",55);
            abs.backend.java.lib.types.ABSString idProgramStr = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idProgram"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("idProgramStr",idProgramStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",56);
            abs.backend.java.lib.types.ABSInteger idProgram = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(idProgramStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("idProgram",idProgram);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",58);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setDate(date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",59);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setDescription(description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",60);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setIncome(income);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",61);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setExpense(expense);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",62);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setIdProgram(idProgram);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",63);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).save(summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",65);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return list(request);
        }
    }
    // SummaryController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>>> async_edit(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MSummaryController.SummaryControllerImpl_c>(
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
    // SummaryController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>> edit(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "edit");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",69);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idSummary"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",70);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idSummary=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",71);
            MSummaryDbImpl.SummaryDb_i orm = MSummaryDbImpl.SummaryDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",72);
            MSummaryModel.Summary_i summary = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MSummaryModel.SummaryImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("summary",summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",74);
            ABS.StdLib.List<MSummaryModel.Summary_i> dataModel = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel",dataModel);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",75);
            dataModel = ABS.StdLib.appendright_f.apply(dataModel, summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel", dataModel);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",76);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.Pair_Pair(abs.backend.java.lib.types.ABSString.fromString("summary/edit"), dataModel);
        }
    }
    // SummaryController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>>> async_update(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MSummaryController.SummaryControllerImpl_c>(
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
    // SummaryController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>> update(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",80);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",82);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idSummary"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",83);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idSummary=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",84);
            MSummaryDbImpl.SummaryDb_i orm = MSummaryDbImpl.SummaryDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",85);
            MSummaryModel.Summary_i summary = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MSummaryModel.SummaryImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("summary",summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",87);
            abs.backend.java.lib.types.ABSString date = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("date"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("date",date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",88);
            abs.backend.java.lib.types.ABSString description = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("description"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("description",description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",89);
            abs.backend.java.lib.types.ABSString incomeStr = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("income"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("incomeStr",incomeStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",90);
            abs.backend.java.lib.types.ABSInteger income = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(incomeStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("income",income);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",91);
            abs.backend.java.lib.types.ABSString expenseStr = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("expense"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("expenseStr",expenseStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",92);
            abs.backend.java.lib.types.ABSInteger expense = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(expenseStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("expense",expense);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",93);
            abs.backend.java.lib.types.ABSString idProgramStr = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idProgram"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("idProgramStr",idProgramStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",94);
            abs.backend.java.lib.types.ABSInteger idProgram = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(idProgramStr);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("idProgram",idProgram);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",96);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setDate(date);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",97);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setDescription(description);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",98);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setIncome(income);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",99);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setExpense(expense);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",100);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(summary).setIdProgram(idProgram);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",101);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).save(summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",103);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return detail(request);
        }
    }
    // SummaryController.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>>> async_delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MSummaryController.SummaryControllerImpl_c>(
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
    // SummaryController.abs:0:0: 
    public final ABS.StdLib.Pair<abs.backend.java.lib.types.ABSString,ABS.StdLib.List<MSummaryModel.Summary_i>> delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",107);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("idSummary"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",108);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("idSummary=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",109);
            MSummaryDbImpl.SummaryDb_i orm = MSummaryDbImpl.SummaryDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",110);
            MSummaryModel.Summary_i summary = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MSummaryModel.SummaryImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("summary",summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",112);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).delete(summary);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/controller/SummaryController.abs",114);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return list(request);
        }
    }
}
