// generated java fli code for ProductImpl
package MProductDbImpl;
import MProductModel.*;
import com.fmse.abs.orm.AbsDbOrm;
import java.lang.reflect.Method;
public class ProductDbImpl_fli extends ProductDbImpl_c {
	@Override
	public ABS.StdLib.List<Product_i> fli_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString condition) {
		AbsDbOrm absdborm = new AbsDbOrm();
		ABS.StdLib.List<abs.backend.java.lib.types.ABSValue> list = absdborm.findAllByAttributes(className, condition);
		ABS.StdLib.List<Product_i> listObject = new ABS.StdLib.List_Nil();
		if (list instanceof ABS.StdLib.List_Nil) return new ABS.StdLib.List_Nil();
		do
		{
			abs.backend.java.lib.runtime.ABSObject object = (abs.backend.java.lib.runtime.ABSObject) ABS.StdLib.head_f.apply(list);
			listObject = ABS.StdLib.appendright_f.apply(listObject, (Product_i) object);
			list = ABS.StdLib.tail_f.apply(list);
		}
		while(!(list instanceof ABS.StdLib.List_Nil));
		return listObject;
	}


	@Override
	public ABS.StdLib.List<Product_i> fli_findAll(abs.backend.java.lib.types.ABSString className) {
		return this.fli_findAllByAttributes(className, abs.backend.java.lib.types.ABSString.fromString(""));
	}
	@Override
	public Product_i fli_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString condition) {
		AbsDbOrm absdborm = new AbsDbOrm();
		return (Product_i) absdborm.findByAttributes(className, condition);
	}


	@Override
	public Product_i fli_find(abs.backend.java.lib.types.ABSString className) {
		return this.fli_findByAttributes(className, abs.backend.java.lib.types.ABSString.fromString(""));
	}


	@Override
	public abs.backend.java.lib.types.ABSUnit fli_save(Product_i object) {
		AbsDbOrm absdborm = new AbsDbOrm();
		absdborm.save((abs.backend.java.lib.runtime.ABSObject) object);
		return null;
	}


	@Override
	public abs.backend.java.lib.types.ABSUnit fli_delete(Product_i object) {
		AbsDbOrm absdborm = new AbsDbOrm();
		absdborm.delete((abs.backend.java.lib.runtime.ABSObject) object);
		return null;
	}


	@Override
	public Product_i fli_update(Product_i object) {
		AbsDbOrm absdborm = new AbsDbOrm();
		absdborm.update((abs.backend.java.lib.runtime.ABSObject) object);
		return null;
	}


	@Override
	public abs.backend.java.lib.types.ABSString fli_log(abs.backend.java.lib.types.ABSString text) {
		System.out.println(text.getString());
		return abs.backend.java.lib.types.ABSString.fromString("Java String");
	}
}
