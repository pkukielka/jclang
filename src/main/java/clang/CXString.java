package clang;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * <i>native declaration : src/main/c/clang-c/CXString.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXString extends Structure {
	/// C type : void*
	public Pointer data;
	public int private_flags;
	public CXString() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"data", "private_flags"});
	}
	/// @param data C type : void*
	public CXString(Pointer data, int private_flags) {
		super();
		this.data = data;
		this.private_flags = private_flags;
		initFieldOrder();
	}
	public static class ByReference extends CXString implements Structure.ByReference {
		
	};
	public static class ByValue extends CXString implements Structure.ByValue {
		
	};
}
