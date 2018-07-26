package ABS.Framework.Route;
// Route.abs:8:0: 
public final class RouteConfigImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, ABS.Framework.Route.RouteConfig_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public RouteConfigImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "RouteConfigImpl"; }
    public static final <T extends RouteConfigImpl_c> T createNewCOG() { return (T)RouteConfigImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends RouteConfigImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(RouteConfigImpl_c.class) : __ABS_runtime.createCOG(RouteConfigImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            RouteConfigImpl_c __ABS_result = new RouteConfigImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends RouteConfigImpl_c> T createNewObject() { return (T)RouteConfigImpl_c.__ABS_createNewObject(null); }
    public static final <T extends RouteConfigImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        RouteConfigImpl_c __ABS_result = new RouteConfigImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // Route.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_route(abs.backend.java.lib.types.ABSString url) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.Framework.Route.RouteConfigImpl_c>(
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
                    return "route";
                }
                public Object execute() {
                    return target.route(arg0
                    );
                }
            }.init(url))
        ;
    }
    // Route.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString route(abs.backend.java.lib.types.ABSString url) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "route");
            __ABS_currentTask.setLocalVariable("url",url);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/framework/Route.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/framework/Route.abs",12);
            abs.backend.java.lib.types.ABSString result = new abs.backend.java.lib.expr.Case() {
                public abs.backend.java.lib.types.ABSString of(final abs.backend.java.lib.types.ABSString url, final abs.backend.java.lib.types.ABSString __ABS_value) {
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/")).match(__ABS_value);
                    if (__ABS_binding0 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@list"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding1 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/program/list.abs")).match(__ABS_value);
                    if (__ABS_binding1 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@list"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding2 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/program/detail.abs")).match(__ABS_value);
                    if (__ABS_binding2 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@detail"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding3 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/program/create.abs")).match(__ABS_value);
                    if (__ABS_binding3 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@create"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding4 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/program/save.abs")).match(__ABS_value);
                    if (__ABS_binding4 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@save"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding5 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/program/edit.abs")).match(__ABS_value);
                    if (__ABS_binding5 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@edit"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding6 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/program/update.abs")).match(__ABS_value);
                    if (__ABS_binding6 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@update"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding7 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/program/delete.abs")).match(__ABS_value);
                    if (__ABS_binding7 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MProgramController.ProgramControllerImpl@delete"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding8 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/financial-report/list.abs")).match(__ABS_value);
                    if (__ABS_binding8 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MFinancialReportController.FinancialReportControllerImpl@list"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding9 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/financial-report/detail.abs")).match(__ABS_value);
                    if (__ABS_binding9 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MFinancialReportController.FinancialReportControllerImpl@detail"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding10 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/financial-report/create.abs")).match(__ABS_value);
                    if (__ABS_binding10 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MFinancialReportController.FinancialReportControllerImpl@create"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding11 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/financial-report/save.abs")).match(__ABS_value);
                    if (__ABS_binding11 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MFinancialReportController.FinancialReportControllerImpl@save"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding12 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/financial-report/edit.abs")).match(__ABS_value);
                    if (__ABS_binding12 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MFinancialReportController.FinancialReportControllerImpl@edit"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding13 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/financial-report/update.abs")).match(__ABS_value);
                    if (__ABS_binding13 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MFinancialReportController.FinancialReportControllerImpl@update"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding14 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/financial-report/delete.abs")).match(__ABS_value);
                    if (__ABS_binding14 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MFinancialReportController.FinancialReportControllerImpl@delete"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding15 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/story-board/list.abs")).match(__ABS_value);
                    if (__ABS_binding15 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MStoryBoardController.StoryBoardControllerImpl@list"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding16 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/story-board/detail.abs")).match(__ABS_value);
                    if (__ABS_binding16 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MStoryBoardController.StoryBoardControllerImpl@detail"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding17 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/story-board/create.abs")).match(__ABS_value);
                    if (__ABS_binding17 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MStoryBoardController.StoryBoardControllerImpl@create"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding18 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/story-board/save.abs")).match(__ABS_value);
                    if (__ABS_binding18 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MStoryBoardController.StoryBoardControllerImpl@save"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding19 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/story-board/edit.abs")).match(__ABS_value);
                    if (__ABS_binding19 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MStoryBoardController.StoryBoardControllerImpl@edit"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding20 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/story-board/update.abs")).match(__ABS_value);
                    if (__ABS_binding20 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MStoryBoardController.StoryBoardControllerImpl@update"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding21 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/story-board/delete.abs")).match(__ABS_value);
                    if (__ABS_binding21 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MStoryBoardController.StoryBoardControllerImpl@delete"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding22 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/general-journal/list.abs")).match(__ABS_value);
                    if (__ABS_binding22 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MGeneralJournalController.GeneralJournalControllerImpl@list"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding23 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/general-journal/detail.abs")).match(__ABS_value);
                    if (__ABS_binding23 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MGeneralJournalController.GeneralJournalControllerImpl@detail"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding24 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/general-journal/create.abs")).match(__ABS_value);
                    if (__ABS_binding24 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MGeneralJournalController.GeneralJournalControllerImpl@create"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding25 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/general-journal/save.abs")).match(__ABS_value);
                    if (__ABS_binding25 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MGeneralJournalController.GeneralJournalControllerImpl@save"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding26 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/general-journal/edit.abs")).match(__ABS_value);
                    if (__ABS_binding26 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MGeneralJournalController.GeneralJournalControllerImpl@edit"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding27 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/general-journal/update.abs")).match(__ABS_value);
                    if (__ABS_binding27 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MGeneralJournalController.GeneralJournalControllerImpl@update"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding28 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/general-journal/delete.abs")).match(__ABS_value);
                    if (__ABS_binding28 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MGeneralJournalController.GeneralJournalControllerImpl@delete"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding29 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/item-donation/list.abs")).match(__ABS_value);
                    if (__ABS_binding29 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MItemDonationController.ItemDonationControllerImpl@list"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding30 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/item-donation/detail.abs")).match(__ABS_value);
                    if (__ABS_binding30 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MItemDonationController.ItemDonationControllerImpl@detail"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding31 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/item-donation/create.abs")).match(__ABS_value);
                    if (__ABS_binding31 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MItemDonationController.ItemDonationControllerImpl@create"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding32 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/item-donation/save.abs")).match(__ABS_value);
                    if (__ABS_binding32 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MItemDonationController.ItemDonationControllerImpl@save"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding33 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/item-donation/edit.abs")).match(__ABS_value);
                    if (__ABS_binding33 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MItemDonationController.ItemDonationControllerImpl@edit"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding34 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/item-donation/update.abs")).match(__ABS_value);
                    if (__ABS_binding34 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MItemDonationController.ItemDonationControllerImpl@update"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding35 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/item-donation/delete.abs")).match(__ABS_value);
                    if (__ABS_binding35 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MItemDonationController.ItemDonationControllerImpl@delete"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding36 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/money-donation/list.abs")).match(__ABS_value);
                    if (__ABS_binding36 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MMoneyDonationController.MoneyDonationControllerImpl@list"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding37 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/money-donation/detail.abs")).match(__ABS_value);
                    if (__ABS_binding37 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MMoneyDonationController.MoneyDonationControllerImpl@detail"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding38 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/money-donation/create.abs")).match(__ABS_value);
                    if (__ABS_binding38 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MMoneyDonationController.MoneyDonationControllerImpl@create"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding39 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/money-donation/save.abs")).match(__ABS_value);
                    if (__ABS_binding39 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MMoneyDonationController.MoneyDonationControllerImpl@save"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding40 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/money-donation/edit.abs")).match(__ABS_value);
                    if (__ABS_binding40 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MMoneyDonationController.MoneyDonationControllerImpl@edit"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding41 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/money-donation/update.abs")).match(__ABS_value);
                    if (__ABS_binding41 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MMoneyDonationController.MoneyDonationControllerImpl@update"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding42 = new abs.backend.java.lib.expr.PatternValue(abs.backend.java.lib.types.ABSString.fromString("/admin/money-donation/delete.abs")).match(__ABS_value);
                    if (__ABS_binding42 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString("all:MMoneyDonationController.MoneyDonationControllerImpl@delete"); }
                    }.execute();
                    final abs.backend.java.lib.expr.PatternBinding __ABS_binding43 = new abs.backend.java.lib.expr.AnyPattern().match(__ABS_value);
                    if (__ABS_binding43 != null) return new Object() {
                        public abs.backend.java.lib.types.ABSString execute() { return abs.backend.java.lib.types.ABSString.fromString(""); }
                    }.execute();
                    throw new abs.backend.java.lib.expr.UnmatchedCaseException("Route.abs:12:18:  value " + __ABS_value + " did not match any pattern.");
                }
            }.of(url, url);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("result",result);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("/home/salman/Workspaces/aisco-web/plugins/rselab/sple/abs/src/abs/framework/Route.abs",78);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return result;
        }
    }
}
