package MIndividualBeneficiaryModel;
// IndividualBeneficiary.abs:13:0: 
public final class IndividualBeneficiaryImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MIndividualBeneficiaryModel.IndividualBeneficiary_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "idIndividualBeneficiary", "name", "address" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    // IndividualBeneficiary.abs:14:1: 
    private abs.backend.java.lib.types.ABSInteger idIndividualBeneficiary;
    // IndividualBeneficiary.abs:15:1: 
    private abs.backend.java.lib.types.ABSString name;
    // IndividualBeneficiary.abs:16:1: 
    private abs.backend.java.lib.types.ABSString address;
    public IndividualBeneficiaryImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.idIndividualBeneficiary = abs.backend.java.lib.types.ABSInteger.fromString("0");this.name = abs.backend.java.lib.types.ABSString.fromString("");this.address = abs.backend.java.lib.types.ABSString.fromString("");getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("idIndividualBeneficiary".equals(__ABS_fieldName)) return idIndividualBeneficiary;
        if ("name".equals(__ABS_fieldName)) return name;
        if ("address".equals(__ABS_fieldName)) return address;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "IndividualBeneficiaryImpl"; }
    public static final <T extends IndividualBeneficiaryImpl_c> T createNewCOG() { return (T)IndividualBeneficiaryImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends IndividualBeneficiaryImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(IndividualBeneficiaryImpl_c.class) : __ABS_runtime.createCOG(IndividualBeneficiaryImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            IndividualBeneficiaryImpl_c __ABS_result = new IndividualBeneficiaryImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends IndividualBeneficiaryImpl_c> T createNewObject() { return (T)IndividualBeneficiaryImpl_c.__ABS_createNewObject(null); }
    public static final <T extends IndividualBeneficiaryImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        IndividualBeneficiaryImpl_c __ABS_result = new IndividualBeneficiaryImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setIdIndividualBeneficiary(abs.backend.java.lib.types.ABSInteger idIndividualBeneficiary) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MIndividualBeneficiaryModel.IndividualBeneficiaryImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setIdIndividualBeneficiary";
                }
                public Object execute() {
                    return target.setIdIndividualBeneficiary(arg0
                    .truncate());
                }
            }.init(idIndividualBeneficiary))
        ;
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setIdIndividualBeneficiary(abs.backend.java.lib.types.ABSInteger idIndividualBeneficiary) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setIdIndividualBeneficiary");
            __ABS_currentTask.setLocalVariable("idIndividualBeneficiary",idIndividualBeneficiary);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",19);
            IndividualBeneficiaryImpl_c.this.idIndividualBeneficiary = idIndividualBeneficiary;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getIdIndividualBeneficiary() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MIndividualBeneficiaryModel.IndividualBeneficiaryImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getIdIndividualBeneficiary";
                }
                public Object execute() {
                    return target.getIdIndividualBeneficiary();
                }
            }.init())
        ;
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getIdIndividualBeneficiary() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getIdIndividualBeneficiary");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",23);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return IndividualBeneficiaryImpl_c.this.idIndividualBeneficiary;
        }
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setName(abs.backend.java.lib.types.ABSString name) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MIndividualBeneficiaryModel.IndividualBeneficiaryImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setName";
                }
                public Object execute() {
                    return target.setName(arg0
                    );
                }
            }.init(name))
        ;
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setName(abs.backend.java.lib.types.ABSString name) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setName");
            __ABS_currentTask.setLocalVariable("name",name);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",27);
            IndividualBeneficiaryImpl_c.this.name = name;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getName() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MIndividualBeneficiaryModel.IndividualBeneficiaryImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getName";
                }
                public Object execute() {
                    return target.getName();
                }
            }.init())
        ;
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getName() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getName");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",31);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return IndividualBeneficiaryImpl_c.this.name;
        }
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setAddress(abs.backend.java.lib.types.ABSString address) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MIndividualBeneficiaryModel.IndividualBeneficiaryImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setAddress";
                }
                public Object execute() {
                    return target.setAddress(arg0
                    );
                }
            }.init(address))
        ;
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setAddress(abs.backend.java.lib.types.ABSString address) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setAddress");
            __ABS_currentTask.setLocalVariable("address",address);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",35);
            IndividualBeneficiaryImpl_c.this.address = address;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getAddress() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MIndividualBeneficiaryModel.IndividualBeneficiaryImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getAddress";
                }
                public Object execute() {
                    return target.getAddress();
                }
            }.init())
        ;
    }
    // IndividualBeneficiary.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getAddress() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getAddress");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/IndividualBeneficiary.abs",39);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return IndividualBeneficiaryImpl_c.this.address;
        }
    }
}
