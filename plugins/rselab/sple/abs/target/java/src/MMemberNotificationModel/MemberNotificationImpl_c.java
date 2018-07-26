package MMemberNotificationModel;
// MemberNotification.abs:19:0: 
public final class MemberNotificationImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MMemberNotificationModel.MemberNotification_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "idMemberNotification", "idDonor", "title", "content", "publishDate", "thumbnailUrl" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    // MemberNotification.abs:20:4: 
    private abs.backend.java.lib.types.ABSInteger idMemberNotification;
    // MemberNotification.abs:21:4: 
    private abs.backend.java.lib.types.ABSInteger idDonor;
    // MemberNotification.abs:22:4: 
    private abs.backend.java.lib.types.ABSString title;
    // MemberNotification.abs:23:4: 
    private abs.backend.java.lib.types.ABSString content;
    // MemberNotification.abs:24:4: 
    private abs.backend.java.lib.types.ABSString publishDate;
    // MemberNotification.abs:25:4: 
    private abs.backend.java.lib.types.ABSString thumbnailUrl;
    public MemberNotificationImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.idMemberNotification = abs.backend.java.lib.types.ABSInteger.fromString("0");this.idDonor = abs.backend.java.lib.types.ABSInteger.fromString("0");this.title = abs.backend.java.lib.types.ABSString.fromString("");this.content = abs.backend.java.lib.types.ABSString.fromString("");this.publishDate = abs.backend.java.lib.types.ABSString.fromString("");this.thumbnailUrl = abs.backend.java.lib.types.ABSString.fromString("");getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("idMemberNotification".equals(__ABS_fieldName)) return idMemberNotification;
        if ("idDonor".equals(__ABS_fieldName)) return idDonor;
        if ("title".equals(__ABS_fieldName)) return title;
        if ("content".equals(__ABS_fieldName)) return content;
        if ("publishDate".equals(__ABS_fieldName)) return publishDate;
        if ("thumbnailUrl".equals(__ABS_fieldName)) return thumbnailUrl;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "MemberNotificationImpl"; }
    public static final <T extends MemberNotificationImpl_c> T createNewCOG() { return (T)MemberNotificationImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends MemberNotificationImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(MemberNotificationImpl_c.class) : __ABS_runtime.createCOG(MemberNotificationImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            MemberNotificationImpl_c __ABS_result = new MemberNotificationImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends MemberNotificationImpl_c> T createNewObject() { return (T)MemberNotificationImpl_c.__ABS_createNewObject(null); }
    public static final <T extends MemberNotificationImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        MemberNotificationImpl_c __ABS_result = new MemberNotificationImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getIdMemberNotification() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "getIdMemberNotification";
                }
                public Object execute() {
                    return target.getIdMemberNotification();
                }
            }.init())
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getIdMemberNotification() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getIdMemberNotification");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",27);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MemberNotificationImpl_c.this.idMemberNotification;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setIdMemberNotification(abs.backend.java.lib.types.ABSInteger idMemberNotification) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "setIdMemberNotification";
                }
                public Object execute() {
                    return target.setIdMemberNotification(arg0
                    .truncate());
                }
            }.init(idMemberNotification))
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setIdMemberNotification(abs.backend.java.lib.types.ABSInteger idMemberNotification) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setIdMemberNotification");
            __ABS_currentTask.setLocalVariable("idMemberNotification",idMemberNotification);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",28);
            MemberNotificationImpl_c.this.idMemberNotification = idMemberNotification;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getIdDonor() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "getIdDonor";
                }
                public Object execute() {
                    return target.getIdDonor();
                }
            }.init())
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getIdDonor() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getIdDonor");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",29);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MemberNotificationImpl_c.this.idDonor;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setIdDonor(abs.backend.java.lib.types.ABSInteger idDonor) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "setIdDonor";
                }
                public Object execute() {
                    return target.setIdDonor(arg0
                    .truncate());
                }
            }.init(idDonor))
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setIdDonor(abs.backend.java.lib.types.ABSInteger idDonor) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setIdDonor");
            __ABS_currentTask.setLocalVariable("idDonor",idDonor);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",30);
            MemberNotificationImpl_c.this.idDonor = idDonor;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getTitle() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "getTitle";
                }
                public Object execute() {
                    return target.getTitle();
                }
            }.init())
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getTitle() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getTitle");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",31);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MemberNotificationImpl_c.this.title;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setTitle(abs.backend.java.lib.types.ABSString title) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "setTitle";
                }
                public Object execute() {
                    return target.setTitle(arg0
                    );
                }
            }.init(title))
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setTitle(abs.backend.java.lib.types.ABSString title) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setTitle");
            __ABS_currentTask.setLocalVariable("title",title);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",32);
            MemberNotificationImpl_c.this.title = title;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getContent() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "getContent";
                }
                public Object execute() {
                    return target.getContent();
                }
            }.init())
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getContent() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getContent");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",33);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MemberNotificationImpl_c.this.content;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setContent(abs.backend.java.lib.types.ABSString content) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "setContent";
                }
                public Object execute() {
                    return target.setContent(arg0
                    );
                }
            }.init(content))
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setContent(abs.backend.java.lib.types.ABSString content) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setContent");
            __ABS_currentTask.setLocalVariable("content",content);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",34);
            MemberNotificationImpl_c.this.content = content;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getPublishDate() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "getPublishDate";
                }
                public Object execute() {
                    return target.getPublishDate();
                }
            }.init())
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getPublishDate() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getPublishDate");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",35);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MemberNotificationImpl_c.this.publishDate;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setPublishDate(abs.backend.java.lib.types.ABSString publishDate) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "setPublishDate";
                }
                public Object execute() {
                    return target.setPublishDate(arg0
                    );
                }
            }.init(publishDate))
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setPublishDate(abs.backend.java.lib.types.ABSString publishDate) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setPublishDate");
            __ABS_currentTask.setLocalVariable("publishDate",publishDate);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",36);
            MemberNotificationImpl_c.this.publishDate = publishDate;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getThumbnailUrl() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "getThumbnailUrl";
                }
                public Object execute() {
                    return target.getThumbnailUrl();
                }
            }.init())
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getThumbnailUrl() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getThumbnailUrl");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",37);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MemberNotificationImpl_c.this.thumbnailUrl;
        }
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setThumbnailUrl(abs.backend.java.lib.types.ABSString thumbnailUrl) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MMemberNotificationModel.MemberNotificationImpl_c>(
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
                    return "setThumbnailUrl";
                }
                public Object execute() {
                    return target.setThumbnailUrl(arg0
                    );
                }
            }.init(thumbnailUrl))
        ;
    }
    // MemberNotification.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setThumbnailUrl(abs.backend.java.lib.types.ABSString thumbnailUrl) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setThumbnailUrl");
            __ABS_currentTask.setLocalVariable("thumbnailUrl",thumbnailUrl);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",38);
            MemberNotificationImpl_c.this.thumbnailUrl = thumbnailUrl;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/model/MemberNotification.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
}
