package clang;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXIdxDeclInfo extends Structure {
	/// C type : const CXIdxEntityInfo*
	public clang.CXIdxEntityInfo.ByReference entityInfo;
	/// C type : CXCursor
	public CXCursor cursor;
	/// C type : CXIdxLoc
	public CXIdxLoc loc;
	/// C type : const CXIdxContainerInfo*
	public clang.CXIdxContainerInfo.ByReference semanticContainer;
	/**
	 * \brief Generally same as #semanticContainer but can be different in<br>
	 * cases like out-of-line C++ member functions.<br>
	 * C type : const CXIdxContainerInfo*
	 */
	public clang.CXIdxContainerInfo.ByReference lexicalContainer;
	public int isRedeclaration;
	public int isDefinition;
	public int isContainer;
	/// C type : const CXIdxContainerInfo*
	public clang.CXIdxContainerInfo.ByReference declAsContainer;
	/**
	 * \brief Whether the declaration exists in code or was created implicitly<br>
	 * by the compiler, e.g. implicit objc methods for properties.
	 */
	public int isImplicit;
	/// C type : const CXIdxAttrInfo**
	public PointerByReference attributes;
	public int numAttributes;
	public int flags;
	public CXIdxDeclInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"entityInfo", "cursor", "loc", "semanticContainer", "lexicalContainer", "isRedeclaration", "isDefinition", "isContainer", "declAsContainer", "isImplicit", "attributes", "numAttributes", "flags"});
	}
	public static class ByReference extends CXIdxDeclInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CXIdxDeclInfo implements Structure.ByValue {
		
	};
}
