package ABS.Productline;
// abslang.abs:1113:0: 
public final class product_features_f implements abs.backend.java.lib.types.ABSFunction {
    private product_features_f() { }
    public static ABS.StdLib.List<ABS.Productline.Feature> apply() {
        return (new ABS.StdLib.List_Cons(new ABS.Productline.Feature_ProgramData(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_FinancialReport(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_Periodic(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_Continuous(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_Eventual(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_StoryBoard(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_Confirmation(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_Summary(), new ABS.StdLib.List_Cons(new ABS.Productline.Feature_AutomaticReport(), new ABS.StdLib.List_Nil()))))))))));
    }
}
