package clang;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXIdxImportedASTFileInfo extends Structure {
	/**
	 * \brief Top level AST file containing the imported PCH, module or submodule.<br>
	 * C type : CXFile
	 */
	public Pointer file;
	/**
	 * \brief The imported module or NULL if the AST file is a PCH.<br>
	 * C type : CXModule
	 */
	public Pointer module;
	/**
	 * \brief Location where the file is imported. Applicable only for modules.<br>
	 * C type : CXIdxLoc
	 */
	public CXIdxLoc loc;
	/**
	 * \brief Non-zero if an inclusion directive was automatically turned into<br>
	 * a module import. Applicable only for modules.
	 */
	public int isImplicit;
	public CXIdxImportedASTFileInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"file", "module", "loc", "isImplicit"});
	}
	/**
	 * @param file \brief Top level AST file containing the imported PCH, module or submodule.<br>
	 * C type : CXFile<br>
	 * @param module \brief The imported module or NULL if the AST file is a PCH.<br>
	 * C type : CXModule<br>
	 * @param loc \brief Location where the file is imported. Applicable only for modules.<br>
	 * C type : CXIdxLoc<br>
	 * @param isImplicit \brief Non-zero if an inclusion directive was automatically turned into<br>
	 * a module import. Applicable only for modules.
	 */
	public CXIdxImportedASTFileInfo(Pointer file, Pointer module, CXIdxLoc loc, int isImplicit) {
		super();
		this.file = file;
		this.module = module;
		this.loc = loc;
		this.isImplicit = isImplicit;
		initFieldOrder();
	}
	public static class ByReference extends CXIdxImportedASTFileInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CXIdxImportedASTFileInfo implements Structure.ByValue {
		
	};
}
