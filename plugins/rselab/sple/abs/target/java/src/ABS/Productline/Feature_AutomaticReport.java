package ABS.Productline;
// abslang.abs:0:0: 
public final class Feature_AutomaticReport extends Feature {
    public Feature_AutomaticReport() {
    }
    protected abs.backend.java.lib.types.ABSValue[] getArgs() { return new abs.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "AutomaticReport";} 
    public abs.backend.java.lib.types.ABSBool eq(abs.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Feature_AutomaticReport)) return abs.backend.java.lib.types.ABSBool.FALSE;
        Feature_AutomaticReport other = (Feature_AutomaticReport) o;
        return abs.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(abs.backend.java.lib.expr.PatternConstructor c, abs.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
