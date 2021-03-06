package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\u07fd\ufffd\ufffd\ufffd\ufffd\ufffd\u0237\ufffd\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:929</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcSettlementInfoConfirmField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcDateType */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ConfirmDate() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ConfirmTime() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcSettlementInfoConfirmField() {
		super();
	}
	public CThostFtdcSettlementInfoConfirmField(Pointer pointer) {
		super(pointer);
	}
}
