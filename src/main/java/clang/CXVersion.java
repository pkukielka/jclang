package clang;
import com.sun.jna.Structure;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXVersion extends Structure {
	/**
	 * \brief The major version number, e.g., the '10' in '10.7.3'. A negative<br>
	 * value indicates that there is no version number at all.
	 */
	public int Major;
	/**
	 * \brief The minor version number, e.g., the '7' in '10.7.3'. This value<br>
	 * will be negative if no minor version number was provided, e.g., for <br>
	 * version '10'.
	 */
	public int Minor;
	/**
	 * \brief The subminor version number, e.g., the '3' in '10.7.3'. This value<br>
	 * will be negative if no minor or subminor version number was provided,<br>
	 * e.g., in version '10' or '10.7'.
	 */
	public int Subminor;
	public CXVersion() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"Major", "Minor", "Subminor"});
	}
	/**
	 * @param Major \brief The major version number, e.g., the '10' in '10.7.3'. A negative<br>
	 * value indicates that there is no version number at all.<br>
	 * @param Minor \brief The minor version number, e.g., the '7' in '10.7.3'. This value<br>
	 * will be negative if no minor version number was provided, e.g., for <br>
	 * version '10'.<br>
	 * @param Subminor \brief The subminor version number, e.g., the '3' in '10.7.3'. This value<br>
	 * will be negative if no minor or subminor version number was provided,<br>
	 * e.g., in version '10' or '10.7'.
	 */
	public CXVersion(int Major, int Minor, int Subminor) {
		super();
		this.Major = Major;
		this.Minor = Minor;
		this.Subminor = Subminor;
		initFieldOrder();
	}
	public static class ByReference extends CXVersion implements Structure.ByReference {
		
	};
	public static class ByValue extends CXVersion implements Structure.ByValue {
		
	};
}
