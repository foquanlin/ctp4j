package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:1300</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcQryExchangeRateField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > FromCurrencyID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4}) 
	@Field(2) 
	public Pointer<Byte > ToCurrencyID() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcQryExchangeRateField() {
		super();
	}
	public CThostFtdcQryExchangeRateField(Pointer pointer) {
		super(pointer);
	}
}
