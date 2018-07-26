package MProductModel;
// Product.abs:4:0: 
public interface Product_i extends abs.backend.java.lib.types.ABSInterface {
    // Product.abs:5:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setIdProduct(abs.backend.java.lib.types.ABSInteger id);
    // Product.abs:5:1: 
    public  abs.backend.java.lib.types.ABSUnit setIdProduct(abs.backend.java.lib.types.ABSInteger id);
    // Product.abs:6:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getIdProduct();
    // Product.abs:6:1: 
    public  abs.backend.java.lib.types.ABSInteger getIdProduct();
    // Product.abs:7:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setName(abs.backend.java.lib.types.ABSString name);
    // Product.abs:7:1: 
    public  abs.backend.java.lib.types.ABSUnit setName(abs.backend.java.lib.types.ABSString name);
    // Product.abs:8:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getName();
    // Product.abs:8:1: 
    public  abs.backend.java.lib.types.ABSString getName();
    // Product.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setDescription(abs.backend.java.lib.types.ABSString description);
    // Product.abs:9:1: 
    public  abs.backend.java.lib.types.ABSUnit setDescription(abs.backend.java.lib.types.ABSString description);
    // Product.abs:10:4: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getDescription();
    // Product.abs:10:4: 
    public  abs.backend.java.lib.types.ABSString getDescription();
}
