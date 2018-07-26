package ABS.Productline;
// abslang.abs:0:0: 
public final class Feature_FinancialReport extends Feature {
    public Feature_FinancialReport() {
    }
    protected abs.backend.java.lib.types.ABSValue[] getArgs() { return new abs.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "FinancialReport";} 
    public abs.backend.java.lib.types.ABSBool eq(abs.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Feature_FinancialReport)) return abs.backend.java.lib.types.ABSBool.FALSE;
        Feature_FinancialReport other = (Feature_FinancialReport) o;
        return abs.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(abs.backend.java.lib.expr.PatternConstructor c, abs.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
