package clang;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXToken extends Structure {
	/// C type : unsigned[4]
	public int[] int_data = new int[4];
	/// C type : void*
	public Pointer ptr_data;
	public CXToken() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"int_data", "ptr_data"});
	}
	/**
	 * @param int_data C type : unsigned[4]<br>
	 * @param ptr_data C type : void*
	 */
	public CXToken(int int_data[], Pointer ptr_data) {
		super();
		if (int_data.length != this.int_data.length) 
			throw new IllegalArgumentException("Wrong array size !");
		this.int_data = int_data;
		this.ptr_data = ptr_data;
		initFieldOrder();
	}
	public static class ByReference extends CXToken implements Structure.ByReference {
		
	};
	public static class ByValue extends CXToken implements Structure.ByValue {
		
	};
}