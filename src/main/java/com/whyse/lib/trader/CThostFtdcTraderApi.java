package com.whyse.lib.trader;
import com.whyse.lib.trader.TraderLibrary.THOST_TE_RESUME_TYPE;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:476</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Trader") 
public class CThostFtdcTraderApi extends CPPObject {
	static {
		BridJ.register();
	}
	/**
	 * Original signature : <code>CThostFtdcTraderApi* CreateFtdcTraderApi(const char*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:322</i>
	 */
	public static Pointer<CThostFtdcTraderApi > CreateFtdcTraderApi(Pointer<Byte > pszFlowPath) {
		return (Pointer)Pointer.pointerToAddress(CreateFtdcTraderApi(Pointer.getPeer(pszFlowPath)), CThostFtdcTraderApi.class);
	}
	@Ptr 
	protected native static long CreateFtdcTraderApi(@Ptr long pszFlowPath);
	/**
	 * Original signature : <code>void Release()</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:324</i>
	 */
	@Virtual(0) 
	public native void Release();
	/**
	 * Original signature : <code>void Init()</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:326</i>
	 */
	@Virtual(1) 
	public native void Init();
	/**
	 * Original signature : <code>int Join()</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:328</i>
	 */
	@Virtual(2) 
	public native int Join();
	/**
	 * Original signature : <code>char* GetTradingDay()</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:330</i>
	 */
	@Virtual(3) 
	public Pointer<Byte > GetTradingDay() {
		return (Pointer)Pointer.pointerToAddress(GetTradingDay$2(), Byte.class);
	}
	@Ptr 
	@Name("GetTradingDay") 
	@Virtual(3) 
	protected native long GetTradingDay$2();
	/**
	 * Original signature : <code>void RegisterFront(char*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:332</i>
	 */
	@Virtual(4) 
	public void RegisterFront(Pointer<Byte > pszFrontAddress) {
		RegisterFront(Pointer.getPeer(pszFrontAddress));
	}
	@Virtual(4) 
	protected native void RegisterFront(@Ptr long pszFrontAddress);
	/**
	 * Original signature : <code>void RegisterNameServer(char*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:334</i>
	 */
	@Virtual(5) 
	public void RegisterNameServer(Pointer<Byte > pszNsAddress) {
		RegisterNameServer(Pointer.getPeer(pszNsAddress));
	}
	@Virtual(5) 
	protected native void RegisterNameServer(@Ptr long pszNsAddress);
	/**
	 * Original signature : <code>void RegisterFensUserInfo(CThostFtdcFensUserInfoField*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:336</i>
	 */
	@Virtual(6) 
	public void RegisterFensUserInfo(Pointer<CThostFtdcFensUserInfoField > pFensUserInfo) {
		RegisterFensUserInfo(Pointer.getPeer(pFensUserInfo));
	}
	@Virtual(6) 
	protected native void RegisterFensUserInfo(@Ptr long pFensUserInfo);
	/**
	 * Original signature : <code>void RegisterSpi(CThostFtdcTraderSpi*)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:338</i>
	 */
	@Virtual(7) 
	public void RegisterSpi(Pointer<CThostFtdcTraderSpi > pSpi) {
		RegisterSpi(Pointer.getPeer(pSpi));
	}
	@Virtual(7) 
	protected native void RegisterSpi(@Ptr long pSpi);
	/**
	 * Original signature : <code>void SubscribePrivateTopic(THOST_TE_RESUME_TYPE)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:340</i>
	 */
	@Virtual(8) 
	public void SubscribePrivateTopic(IntValuedEnum<THOST_TE_RESUME_TYPE > nResumeType) {
		SubscribePrivateTopic((int)nResumeType.value());
	}
	@Virtual(8) 
	protected native void SubscribePrivateTopic(int nResumeType);
	/**
	 * Original signature : <code>void SubscribePublicTopic(THOST_TE_RESUME_TYPE)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:342</i>
	 */
	@Virtual(9) 
	public void SubscribePublicTopic(IntValuedEnum<THOST_TE_RESUME_TYPE > nResumeType) {
		SubscribePublicTopic((int)nResumeType.value());
	}
	@Virtual(9) 
	protected native void SubscribePublicTopic(int nResumeType);
	/**
	 * Original signature : <code>int ReqAuthenticate(CThostFtdcReqAuthenticateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:344</i>
	 */
	@Virtual(10) 
	public int ReqAuthenticate(Pointer<CThostFtdcReqAuthenticateField > pReqAuthenticateField, int nRequestID) {
		return ReqAuthenticate(Pointer.getPeer(pReqAuthenticateField), nRequestID);
	}
	@Virtual(10) 
	protected native int ReqAuthenticate(@Ptr long pReqAuthenticateField, int nRequestID);
	/**
	 * Original signature : <code>int ReqUserLogin(CThostFtdcReqUserLoginField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:346</i>
	 */
	@Virtual(11) 
	public int ReqUserLogin(Pointer<CThostFtdcReqUserLoginField > pReqUserLoginField, int nRequestID) {
		return ReqUserLogin(Pointer.getPeer(pReqUserLoginField), nRequestID);
	}
	@Virtual(11) 
	protected native int ReqUserLogin(@Ptr long pReqUserLoginField, int nRequestID);
	/**
	 * Original signature : <code>int ReqUserLogout(CThostFtdcUserLogoutField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:348</i>
	 */
	@Virtual(12) 
	public int ReqUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, int nRequestID) {
		return ReqUserLogout(Pointer.getPeer(pUserLogout), nRequestID);
	}
	@Virtual(12) 
	protected native int ReqUserLogout(@Ptr long pUserLogout, int nRequestID);
	/**
	 * Original signature : <code>int ReqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:350</i>
	 */
	@Virtual(13) 
	public int ReqUserPasswordUpdate(Pointer<CThostFtdcUserPasswordUpdateField > pUserPasswordUpdate, int nRequestID) {
		return ReqUserPasswordUpdate(Pointer.getPeer(pUserPasswordUpdate), nRequestID);
	}
	@Virtual(13) 
	protected native int ReqUserPasswordUpdate(@Ptr long pUserPasswordUpdate, int nRequestID);
	/**
	 * Original signature : <code>int ReqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:352</i>
	 */
	@Virtual(14) 
	public int ReqTradingAccountPasswordUpdate(Pointer<CThostFtdcTradingAccountPasswordUpdateField > pTradingAccountPasswordUpdate, int nRequestID) {
		return ReqTradingAccountPasswordUpdate(Pointer.getPeer(pTradingAccountPasswordUpdate), nRequestID);
	}
	@Virtual(14) 
	protected native int ReqTradingAccountPasswordUpdate(@Ptr long pTradingAccountPasswordUpdate, int nRequestID);
	/**
	 * Original signature : <code>int ReqOrderInsert(CThostFtdcInputOrderField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:354</i>
	 */
	@Virtual(15) 
	public int ReqOrderInsert(Pointer<CThostFtdcInputOrderField > pInputOrder, int nRequestID) {
		return ReqOrderInsert(Pointer.getPeer(pInputOrder), nRequestID);
	}
	@Virtual(15) 
	protected native int ReqOrderInsert(@Ptr long pInputOrder, int nRequestID);
	/**
	 * Original signature : <code>int ReqParkedOrderInsert(CThostFtdcParkedOrderField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:356</i>
	 */
	@Virtual(16) 
	public int ReqParkedOrderInsert(Pointer<CThostFtdcParkedOrderField > pParkedOrder, int nRequestID) {
		return ReqParkedOrderInsert(Pointer.getPeer(pParkedOrder), nRequestID);
	}
	@Virtual(16) 
	protected native int ReqParkedOrderInsert(@Ptr long pParkedOrder, int nRequestID);
	/**
	 * Original signature : <code>int ReqParkedOrderAction(CThostFtdcParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:358</i>
	 */
	@Virtual(17) 
	public int ReqParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField > pParkedOrderAction, int nRequestID) {
		return ReqParkedOrderAction(Pointer.getPeer(pParkedOrderAction), nRequestID);
	}
	@Virtual(17) 
	protected native int ReqParkedOrderAction(@Ptr long pParkedOrderAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqOrderAction(CThostFtdcInputOrderActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:360</i>
	 */
	@Virtual(18) 
	public int ReqOrderAction(Pointer<CThostFtdcInputOrderActionField > pInputOrderAction, int nRequestID) {
		return ReqOrderAction(Pointer.getPeer(pInputOrderAction), nRequestID);
	}
	@Virtual(18) 
	protected native int ReqOrderAction(@Ptr long pInputOrderAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:362</i>
	 */
	@Virtual(19) 
	public int ReqQueryMaxOrderVolume(Pointer<CThostFtdcQueryMaxOrderVolumeField > pQueryMaxOrderVolume, int nRequestID) {
		return ReqQueryMaxOrderVolume(Pointer.getPeer(pQueryMaxOrderVolume), nRequestID);
	}
	@Virtual(19) 
	protected native int ReqQueryMaxOrderVolume(@Ptr long pQueryMaxOrderVolume, int nRequestID);
	/**
	 * Original signature : <code>int ReqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:364</i>
	 */
	@Virtual(20) 
	public int ReqSettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField > pSettlementInfoConfirm, int nRequestID) {
		return ReqSettlementInfoConfirm(Pointer.getPeer(pSettlementInfoConfirm), nRequestID);
	}
	@Virtual(20) 
	protected native int ReqSettlementInfoConfirm(@Ptr long pSettlementInfoConfirm, int nRequestID);
	/**
	 * Original signature : <code>int ReqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:366</i>
	 */
	@Virtual(21) 
	public int ReqRemoveParkedOrder(Pointer<CThostFtdcRemoveParkedOrderField > pRemoveParkedOrder, int nRequestID) {
		return ReqRemoveParkedOrder(Pointer.getPeer(pRemoveParkedOrder), nRequestID);
	}
	@Virtual(21) 
	protected native int ReqRemoveParkedOrder(@Ptr long pRemoveParkedOrder, int nRequestID);
	/**
	 * Original signature : <code>int ReqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:368</i>
	 */
	@Virtual(22) 
	public int ReqRemoveParkedOrderAction(Pointer<CThostFtdcRemoveParkedOrderActionField > pRemoveParkedOrderAction, int nRequestID) {
		return ReqRemoveParkedOrderAction(Pointer.getPeer(pRemoveParkedOrderAction), nRequestID);
	}
	@Virtual(22) 
	protected native int ReqRemoveParkedOrderAction(@Ptr long pRemoveParkedOrderAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqExecOrderInsert(CThostFtdcInputExecOrderField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:370</i>
	 */
	@Virtual(23) 
	public int ReqExecOrderInsert(Pointer<CThostFtdcInputExecOrderField > pInputExecOrder, int nRequestID) {
		return ReqExecOrderInsert(Pointer.getPeer(pInputExecOrder), nRequestID);
	}
	@Virtual(23) 
	protected native int ReqExecOrderInsert(@Ptr long pInputExecOrder, int nRequestID);
	/**
	 * Original signature : <code>int ReqExecOrderAction(CThostFtdcInputExecOrderActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:372</i>
	 */
	@Virtual(24) 
	public int ReqExecOrderAction(Pointer<CThostFtdcInputExecOrderActionField > pInputExecOrderAction, int nRequestID) {
		return ReqExecOrderAction(Pointer.getPeer(pInputExecOrderAction), nRequestID);
	}
	@Virtual(24) 
	protected native int ReqExecOrderAction(@Ptr long pInputExecOrderAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqForQuoteInsert(CThostFtdcInputForQuoteField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:374</i>
	 */
	@Virtual(25) 
	public int ReqForQuoteInsert(Pointer<CThostFtdcInputForQuoteField > pInputForQuote, int nRequestID) {
		return ReqForQuoteInsert(Pointer.getPeer(pInputForQuote), nRequestID);
	}
	@Virtual(25) 
	protected native int ReqForQuoteInsert(@Ptr long pInputForQuote, int nRequestID);
	/**
	 * Original signature : <code>int ReqQuoteInsert(CThostFtdcInputQuoteField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:376</i>
	 */
	@Virtual(26) 
	public int ReqQuoteInsert(Pointer<CThostFtdcInputQuoteField > pInputQuote, int nRequestID) {
		return ReqQuoteInsert(Pointer.getPeer(pInputQuote), nRequestID);
	}
	@Virtual(26) 
	protected native int ReqQuoteInsert(@Ptr long pInputQuote, int nRequestID);
	/**
	 * Original signature : <code>int ReqQuoteAction(CThostFtdcInputQuoteActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:378</i>
	 */
	@Virtual(27) 
	public int ReqQuoteAction(Pointer<CThostFtdcInputQuoteActionField > pInputQuoteAction, int nRequestID) {
		return ReqQuoteAction(Pointer.getPeer(pInputQuoteAction), nRequestID);
	}
	@Virtual(27) 
	protected native int ReqQuoteAction(@Ptr long pInputQuoteAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqCombActionInsert(CThostFtdcInputCombActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:380</i>
	 */
	@Virtual(28) 
	public int ReqCombActionInsert(Pointer<CThostFtdcInputCombActionField > pInputCombAction, int nRequestID) {
		return ReqCombActionInsert(Pointer.getPeer(pInputCombAction), nRequestID);
	}
	@Virtual(28) 
	protected native int ReqCombActionInsert(@Ptr long pInputCombAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryOrder(CThostFtdcQryOrderField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:382</i>
	 */
	@Virtual(29) 
	public int ReqQryOrder(Pointer<CThostFtdcQryOrderField > pQryOrder, int nRequestID) {
		return ReqQryOrder(Pointer.getPeer(pQryOrder), nRequestID);
	}
	@Virtual(29) 
	protected native int ReqQryOrder(@Ptr long pQryOrder, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryTrade(CThostFtdcQryTradeField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:384</i>
	 */
	@Virtual(30) 
	public int ReqQryTrade(Pointer<CThostFtdcQryTradeField > pQryTrade, int nRequestID) {
		return ReqQryTrade(Pointer.getPeer(pQryTrade), nRequestID);
	}
	@Virtual(30) 
	protected native int ReqQryTrade(@Ptr long pQryTrade, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInvestorPosition(CThostFtdcQryInvestorPositionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:386</i>
	 */
	@Virtual(31) 
	public int ReqQryInvestorPosition(Pointer<CThostFtdcQryInvestorPositionField > pQryInvestorPosition, int nRequestID) {
		return ReqQryInvestorPosition(Pointer.getPeer(pQryInvestorPosition), nRequestID);
	}
	@Virtual(31) 
	protected native int ReqQryInvestorPosition(@Ptr long pQryInvestorPosition, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryTradingAccount(CThostFtdcQryTradingAccountField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:388</i>
	 */
	@Virtual(32) 
	public int ReqQryTradingAccount(Pointer<CThostFtdcQryTradingAccountField > pQryTradingAccount, int nRequestID) {
		return ReqQryTradingAccount(Pointer.getPeer(pQryTradingAccount), nRequestID);
	}
	@Virtual(32) 
	protected native int ReqQryTradingAccount(@Ptr long pQryTradingAccount, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInvestor(CThostFtdcQryInvestorField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:390</i>
	 */
	@Virtual(33) 
	public int ReqQryInvestor(Pointer<CThostFtdcQryInvestorField > pQryInvestor, int nRequestID) {
		return ReqQryInvestor(Pointer.getPeer(pQryInvestor), nRequestID);
	}
	@Virtual(33) 
	protected native int ReqQryInvestor(@Ptr long pQryInvestor, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryTradingCode(CThostFtdcQryTradingCodeField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:392</i>
	 */
	@Virtual(34) 
	public int ReqQryTradingCode(Pointer<CThostFtdcQryTradingCodeField > pQryTradingCode, int nRequestID) {
		return ReqQryTradingCode(Pointer.getPeer(pQryTradingCode), nRequestID);
	}
	@Virtual(34) 
	protected native int ReqQryTradingCode(@Ptr long pQryTradingCode, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:394</i>
	 */
	@Virtual(35) 
	public int ReqQryInstrumentMarginRate(Pointer<CThostFtdcQryInstrumentMarginRateField > pQryInstrumentMarginRate, int nRequestID) {
		return ReqQryInstrumentMarginRate(Pointer.getPeer(pQryInstrumentMarginRate), nRequestID);
	}
	@Virtual(35) 
	protected native int ReqQryInstrumentMarginRate(@Ptr long pQryInstrumentMarginRate, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:396</i>
	 */
	@Virtual(36) 
	public int ReqQryInstrumentCommissionRate(Pointer<CThostFtdcQryInstrumentCommissionRateField > pQryInstrumentCommissionRate, int nRequestID) {
		return ReqQryInstrumentCommissionRate(Pointer.getPeer(pQryInstrumentCommissionRate), nRequestID);
	}
	@Virtual(36) 
	protected native int ReqQryInstrumentCommissionRate(@Ptr long pQryInstrumentCommissionRate, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryExchange(CThostFtdcQryExchangeField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:398</i>
	 */
	@Virtual(37) 
	public int ReqQryExchange(Pointer<CThostFtdcQryExchangeField > pQryExchange, int nRequestID) {
		return ReqQryExchange(Pointer.getPeer(pQryExchange), nRequestID);
	}
	@Virtual(37) 
	protected native int ReqQryExchange(@Ptr long pQryExchange, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryProduct(CThostFtdcQryProductField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:400</i>
	 */
	@Virtual(38) 
	public int ReqQryProduct(Pointer<CThostFtdcQryProductField > pQryProduct, int nRequestID) {
		return ReqQryProduct(Pointer.getPeer(pQryProduct), nRequestID);
	}
	@Virtual(38) 
	protected native int ReqQryProduct(@Ptr long pQryProduct, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInstrument(CThostFtdcQryInstrumentField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:402</i>
	 */
	@Virtual(39) 
	public int ReqQryInstrument(Pointer<CThostFtdcQryInstrumentField > pQryInstrument, int nRequestID) {
		return ReqQryInstrument(Pointer.getPeer(pQryInstrument), nRequestID);
	}
	@Virtual(39) 
	protected native int ReqQryInstrument(@Ptr long pQryInstrument, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryDepthMarketData(CThostFtdcQryDepthMarketDataField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:404</i>
	 */
	@Virtual(40) 
	public int ReqQryDepthMarketData(Pointer<CThostFtdcQryDepthMarketDataField > pQryDepthMarketData, int nRequestID) {
		return ReqQryDepthMarketData(Pointer.getPeer(pQryDepthMarketData), nRequestID);
	}
	@Virtual(40) 
	protected native int ReqQryDepthMarketData(@Ptr long pQryDepthMarketData, int nRequestID);
	/**
	 * Original signature : <code>int ReqQrySettlementInfo(CThostFtdcQrySettlementInfoField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:406</i>
	 */
	@Virtual(41) 
	public int ReqQrySettlementInfo(Pointer<CThostFtdcQrySettlementInfoField > pQrySettlementInfo, int nRequestID) {
		return ReqQrySettlementInfo(Pointer.getPeer(pQrySettlementInfo), nRequestID);
	}
	@Virtual(41) 
	protected native int ReqQrySettlementInfo(@Ptr long pQrySettlementInfo, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryTransferBank(CThostFtdcQryTransferBankField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:408</i>
	 */
	@Virtual(42) 
	public int ReqQryTransferBank(Pointer<CThostFtdcQryTransferBankField > pQryTransferBank, int nRequestID) {
		return ReqQryTransferBank(Pointer.getPeer(pQryTransferBank), nRequestID);
	}
	@Virtual(42) 
	protected native int ReqQryTransferBank(@Ptr long pQryTransferBank, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:410</i>
	 */
	@Virtual(43) 
	public int ReqQryInvestorPositionDetail(Pointer<CThostFtdcQryInvestorPositionDetailField > pQryInvestorPositionDetail, int nRequestID) {
		return ReqQryInvestorPositionDetail(Pointer.getPeer(pQryInvestorPositionDetail), nRequestID);
	}
	@Virtual(43) 
	protected native int ReqQryInvestorPositionDetail(@Ptr long pQryInvestorPositionDetail, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryNotice(CThostFtdcQryNoticeField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:412</i>
	 */
	@Virtual(44) 
	public int ReqQryNotice(Pointer<CThostFtdcQryNoticeField > pQryNotice, int nRequestID) {
		return ReqQryNotice(Pointer.getPeer(pQryNotice), nRequestID);
	}
	@Virtual(44) 
	protected native int ReqQryNotice(@Ptr long pQryNotice, int nRequestID);
	/**
	 * Original signature : <code>int ReqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:414</i>
	 */
	@Virtual(45) 
	public int ReqQrySettlementInfoConfirm(Pointer<CThostFtdcQrySettlementInfoConfirmField > pQrySettlementInfoConfirm, int nRequestID) {
		return ReqQrySettlementInfoConfirm(Pointer.getPeer(pQrySettlementInfoConfirm), nRequestID);
	}
	@Virtual(45) 
	protected native int ReqQrySettlementInfoConfirm(@Ptr long pQrySettlementInfoConfirm, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:416</i>
	 */
	@Virtual(46) 
	public int ReqQryInvestorPositionCombineDetail(Pointer<CThostFtdcQryInvestorPositionCombineDetailField > pQryInvestorPositionCombineDetail, int nRequestID) {
		return ReqQryInvestorPositionCombineDetail(Pointer.getPeer(pQryInvestorPositionCombineDetail), nRequestID);
	}
	@Virtual(46) 
	protected native int ReqQryInvestorPositionCombineDetail(@Ptr long pQryInvestorPositionCombineDetail, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:418</i>
	 */
	@Virtual(47) 
	public int ReqQryCFMMCTradingAccountKey(Pointer<CThostFtdcQryCFMMCTradingAccountKeyField > pQryCFMMCTradingAccountKey, int nRequestID) {
		return ReqQryCFMMCTradingAccountKey(Pointer.getPeer(pQryCFMMCTradingAccountKey), nRequestID);
	}
	@Virtual(47) 
	protected native int ReqQryCFMMCTradingAccountKey(@Ptr long pQryCFMMCTradingAccountKey, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:420</i>
	 */
	@Virtual(48) 
	public int ReqQryEWarrantOffset(Pointer<CThostFtdcQryEWarrantOffsetField > pQryEWarrantOffset, int nRequestID) {
		return ReqQryEWarrantOffset(Pointer.getPeer(pQryEWarrantOffset), nRequestID);
	}
	@Virtual(48) 
	protected native int ReqQryEWarrantOffset(@Ptr long pQryEWarrantOffset, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInvestorProductGroupMargin(CThostFtdcQryInvestorProductGroupMarginField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:422</i>
	 */
	@Virtual(49) 
	public int ReqQryInvestorProductGroupMargin(Pointer<CThostFtdcQryInvestorProductGroupMarginField > pQryInvestorProductGroupMargin, int nRequestID) {
		return ReqQryInvestorProductGroupMargin(Pointer.getPeer(pQryInvestorProductGroupMargin), nRequestID);
	}
	@Virtual(49) 
	protected native int ReqQryInvestorProductGroupMargin(@Ptr long pQryInvestorProductGroupMargin, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryExchangeMarginRate(CThostFtdcQryExchangeMarginRateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:424</i>
	 */
	@Virtual(50) 
	public int ReqQryExchangeMarginRate(Pointer<CThostFtdcQryExchangeMarginRateField > pQryExchangeMarginRate, int nRequestID) {
		return ReqQryExchangeMarginRate(Pointer.getPeer(pQryExchangeMarginRate), nRequestID);
	}
	@Virtual(50) 
	protected native int ReqQryExchangeMarginRate(@Ptr long pQryExchangeMarginRate, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryExchangeMarginRateAdjust(CThostFtdcQryExchangeMarginRateAdjustField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:426</i>
	 */
	@Virtual(51) 
	public int ReqQryExchangeMarginRateAdjust(Pointer<CThostFtdcQryExchangeMarginRateAdjustField > pQryExchangeMarginRateAdjust, int nRequestID) {
		return ReqQryExchangeMarginRateAdjust(Pointer.getPeer(pQryExchangeMarginRateAdjust), nRequestID);
	}
	@Virtual(51) 
	protected native int ReqQryExchangeMarginRateAdjust(@Ptr long pQryExchangeMarginRateAdjust, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryExchangeRate(CThostFtdcQryExchangeRateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:428</i>
	 */
	@Virtual(52) 
	public int ReqQryExchangeRate(Pointer<CThostFtdcQryExchangeRateField > pQryExchangeRate, int nRequestID) {
		return ReqQryExchangeRate(Pointer.getPeer(pQryExchangeRate), nRequestID);
	}
	@Virtual(52) 
	protected native int ReqQryExchangeRate(@Ptr long pQryExchangeRate, int nRequestID);
	/**
	 * Original signature : <code>int ReqQrySecAgentACIDMap(CThostFtdcQrySecAgentACIDMapField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:430</i>
	 */
	@Virtual(53) 
	public int ReqQrySecAgentACIDMap(Pointer<CThostFtdcQrySecAgentACIDMapField > pQrySecAgentACIDMap, int nRequestID) {
		return ReqQrySecAgentACIDMap(Pointer.getPeer(pQrySecAgentACIDMap), nRequestID);
	}
	@Virtual(53) 
	protected native int ReqQrySecAgentACIDMap(@Ptr long pQrySecAgentACIDMap, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryProductGroup(CThostFtdcQryProductGroupField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:432</i>
	 */
	@Virtual(54) 
	public int ReqQryProductGroup(Pointer<CThostFtdcQryProductGroupField > pQryProductGroup, int nRequestID) {
		return ReqQryProductGroup(Pointer.getPeer(pQryProductGroup), nRequestID);
	}
	@Virtual(54) 
	protected native int ReqQryProductGroup(@Ptr long pQryProductGroup, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryInstrumentOrderCommRate(CThostFtdcQryInstrumentOrderCommRateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:434</i>
	 */
	@Virtual(55) 
	public int ReqQryInstrumentOrderCommRate(Pointer<CThostFtdcQryInstrumentOrderCommRateField > pQryInstrumentOrderCommRate, int nRequestID) {
		return ReqQryInstrumentOrderCommRate(Pointer.getPeer(pQryInstrumentOrderCommRate), nRequestID);
	}
	@Virtual(55) 
	protected native int ReqQryInstrumentOrderCommRate(@Ptr long pQryInstrumentOrderCommRate, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryOptionInstrTradeCost(CThostFtdcQryOptionInstrTradeCostField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:436</i>
	 */
	@Virtual(56) 
	public int ReqQryOptionInstrTradeCost(Pointer<CThostFtdcQryOptionInstrTradeCostField > pQryOptionInstrTradeCost, int nRequestID) {
		return ReqQryOptionInstrTradeCost(Pointer.getPeer(pQryOptionInstrTradeCost), nRequestID);
	}
	@Virtual(56) 
	protected native int ReqQryOptionInstrTradeCost(@Ptr long pQryOptionInstrTradeCost, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryOptionInstrCommRate(CThostFtdcQryOptionInstrCommRateField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:438</i>
	 */
	@Virtual(57) 
	public int ReqQryOptionInstrCommRate(Pointer<CThostFtdcQryOptionInstrCommRateField > pQryOptionInstrCommRate, int nRequestID) {
		return ReqQryOptionInstrCommRate(Pointer.getPeer(pQryOptionInstrCommRate), nRequestID);
	}
	@Virtual(57) 
	protected native int ReqQryOptionInstrCommRate(@Ptr long pQryOptionInstrCommRate, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryExecOrder(CThostFtdcQryExecOrderField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:440</i>
	 */
	@Virtual(58) 
	public int ReqQryExecOrder(Pointer<CThostFtdcQryExecOrderField > pQryExecOrder, int nRequestID) {
		return ReqQryExecOrder(Pointer.getPeer(pQryExecOrder), nRequestID);
	}
	@Virtual(58) 
	protected native int ReqQryExecOrder(@Ptr long pQryExecOrder, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryForQuote(CThostFtdcQryForQuoteField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:442</i>
	 */
	@Virtual(59) 
	public int ReqQryForQuote(Pointer<CThostFtdcQryForQuoteField > pQryForQuote, int nRequestID) {
		return ReqQryForQuote(Pointer.getPeer(pQryForQuote), nRequestID);
	}
	@Virtual(59) 
	protected native int ReqQryForQuote(@Ptr long pQryForQuote, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryQuote(CThostFtdcQryQuoteField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:444</i>
	 */
	@Virtual(60) 
	public int ReqQryQuote(Pointer<CThostFtdcQryQuoteField > pQryQuote, int nRequestID) {
		return ReqQryQuote(Pointer.getPeer(pQryQuote), nRequestID);
	}
	@Virtual(60) 
	protected native int ReqQryQuote(@Ptr long pQryQuote, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryCombInstrumentGuard(CThostFtdcQryCombInstrumentGuardField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:446</i>
	 */
	@Virtual(61) 
	public int ReqQryCombInstrumentGuard(Pointer<CThostFtdcQryCombInstrumentGuardField > pQryCombInstrumentGuard, int nRequestID) {
		return ReqQryCombInstrumentGuard(Pointer.getPeer(pQryCombInstrumentGuard), nRequestID);
	}
	@Virtual(61) 
	protected native int ReqQryCombInstrumentGuard(@Ptr long pQryCombInstrumentGuard, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryCombAction(CThostFtdcQryCombActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:448</i>
	 */
	@Virtual(62) 
	public int ReqQryCombAction(Pointer<CThostFtdcQryCombActionField > pQryCombAction, int nRequestID) {
		return ReqQryCombAction(Pointer.getPeer(pQryCombAction), nRequestID);
	}
	@Virtual(62) 
	protected native int ReqQryCombAction(@Ptr long pQryCombAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryTransferSerial(CThostFtdcQryTransferSerialField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:450</i>
	 */
	@Virtual(63) 
	public int ReqQryTransferSerial(Pointer<CThostFtdcQryTransferSerialField > pQryTransferSerial, int nRequestID) {
		return ReqQryTransferSerial(Pointer.getPeer(pQryTransferSerial), nRequestID);
	}
	@Virtual(63) 
	protected native int ReqQryTransferSerial(@Ptr long pQryTransferSerial, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryAccountregister(CThostFtdcQryAccountregisterField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:452</i>
	 */
	@Virtual(64) 
	public int ReqQryAccountregister(Pointer<CThostFtdcQryAccountregisterField > pQryAccountregister, int nRequestID) {
		return ReqQryAccountregister(Pointer.getPeer(pQryAccountregister), nRequestID);
	}
	@Virtual(64) 
	protected native int ReqQryAccountregister(@Ptr long pQryAccountregister, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryContractBank(CThostFtdcQryContractBankField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:454</i>
	 */
	@Virtual(65) 
	public int ReqQryContractBank(Pointer<CThostFtdcQryContractBankField > pQryContractBank, int nRequestID) {
		return ReqQryContractBank(Pointer.getPeer(pQryContractBank), nRequestID);
	}
	@Virtual(65) 
	protected native int ReqQryContractBank(@Ptr long pQryContractBank, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryParkedOrder(CThostFtdcQryParkedOrderField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:456</i>
	 */
	@Virtual(66) 
	public int ReqQryParkedOrder(Pointer<CThostFtdcQryParkedOrderField > pQryParkedOrder, int nRequestID) {
		return ReqQryParkedOrder(Pointer.getPeer(pQryParkedOrder), nRequestID);
	}
	@Virtual(66) 
	protected native int ReqQryParkedOrder(@Ptr long pQryParkedOrder, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:458</i>
	 */
	@Virtual(67) 
	public int ReqQryParkedOrderAction(Pointer<CThostFtdcQryParkedOrderActionField > pQryParkedOrderAction, int nRequestID) {
		return ReqQryParkedOrderAction(Pointer.getPeer(pQryParkedOrderAction), nRequestID);
	}
	@Virtual(67) 
	protected native int ReqQryParkedOrderAction(@Ptr long pQryParkedOrderAction, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryTradingNotice(CThostFtdcQryTradingNoticeField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:460</i>
	 */
	@Virtual(68) 
	public int ReqQryTradingNotice(Pointer<CThostFtdcQryTradingNoticeField > pQryTradingNotice, int nRequestID) {
		return ReqQryTradingNotice(Pointer.getPeer(pQryTradingNotice), nRequestID);
	}
	@Virtual(68) 
	protected native int ReqQryTradingNotice(@Ptr long pQryTradingNotice, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:462</i>
	 */
	@Virtual(69) 
	public int ReqQryBrokerTradingParams(Pointer<CThostFtdcQryBrokerTradingParamsField > pQryBrokerTradingParams, int nRequestID) {
		return ReqQryBrokerTradingParams(Pointer.getPeer(pQryBrokerTradingParams), nRequestID);
	}
	@Virtual(69) 
	protected native int ReqQryBrokerTradingParams(@Ptr long pQryBrokerTradingParams, int nRequestID);
	/**
	 * Original signature : <code>int ReqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:464</i>
	 */
	@Virtual(70) 
	public int ReqQryBrokerTradingAlgos(Pointer<CThostFtdcQryBrokerTradingAlgosField > pQryBrokerTradingAlgos, int nRequestID) {
		return ReqQryBrokerTradingAlgos(Pointer.getPeer(pQryBrokerTradingAlgos), nRequestID);
	}
	@Virtual(70) 
	protected native int ReqQryBrokerTradingAlgos(@Ptr long pQryBrokerTradingAlgos, int nRequestID);
	/**
	 * Original signature : <code>int ReqQueryCFMMCTradingAccountToken(CThostFtdcQueryCFMMCTradingAccountTokenField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:466</i>
	 */
	@Virtual(71) 
	public int ReqQueryCFMMCTradingAccountToken(Pointer<CThostFtdcQueryCFMMCTradingAccountTokenField > pQueryCFMMCTradingAccountToken, int nRequestID) {
		return ReqQueryCFMMCTradingAccountToken(Pointer.getPeer(pQueryCFMMCTradingAccountToken), nRequestID);
	}
	@Virtual(71) 
	protected native int ReqQueryCFMMCTradingAccountToken(@Ptr long pQueryCFMMCTradingAccountToken, int nRequestID);
	/**
	 * Original signature : <code>int ReqFromBankToFutureByFuture(CThostFtdcReqTransferField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:468</i>
	 */
	@Virtual(72) 
	public int ReqFromBankToFutureByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, int nRequestID) {
		return ReqFromBankToFutureByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
	}
	@Virtual(72) 
	protected native int ReqFromBankToFutureByFuture(@Ptr long pReqTransfer, int nRequestID);
	/**
	 * Original signature : <code>int ReqFromFutureToBankByFuture(CThostFtdcReqTransferField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:470</i>
	 */
	@Virtual(73) 
	public int ReqFromFutureToBankByFuture(Pointer<CThostFtdcReqTransferField > pReqTransfer, int nRequestID) {
		return ReqFromFutureToBankByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
	}
	@Virtual(73) 
	protected native int ReqFromFutureToBankByFuture(@Ptr long pReqTransfer, int nRequestID);
	/**
	 * Original signature : <code>int ReqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField*, int)</code><br>
	 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcTraderApi.h:472</i>
	 */
	@Virtual(74) 
	public int ReqQueryBankAccountMoneyByFuture(Pointer<CThostFtdcReqQueryAccountField > pReqQueryAccount, int nRequestID) {
		return ReqQueryBankAccountMoneyByFuture(Pointer.getPeer(pReqQueryAccount), nRequestID);
	}
	@Virtual(74) 
	protected native int ReqQueryBankAccountMoneyByFuture(@Ptr long pReqQueryAccount, int nRequestID);
	public CThostFtdcTraderApi() {
		super();
	}
	public CThostFtdcTraderApi(Pointer pointer) {
		super(pointer);
	}
}
