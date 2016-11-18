package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\u01f0\ufffd\ufffd\u05f4\u032c<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:1210</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcQryFrontStatusField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(0) 
	public int FrontID() {
		return this.io.getIntField(this, 0);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(0) 
	public CThostFtdcQryFrontStatusField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}
	public CThostFtdcQryFrontStatusField() {
		super();
	}
	public CThostFtdcQryFrontStatusField(Pointer pointer) {
		super(pointer);
	}
}