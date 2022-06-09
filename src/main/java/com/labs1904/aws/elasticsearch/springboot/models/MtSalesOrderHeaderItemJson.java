package com.labs1904.aws.elasticsearch.springboot.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MtSalesOrderHeaderItemJson {
	
	@JsonProperty("ERROR") 
	public String ERROR="";
	
	@JsonProperty("GE_SALES_ORDER") 
	public String GE_SALES_ORDER="";
	
	@JsonProperty("CUSTOMER_PO")
	public String CUSTOMER_PO="";
	
	@JsonProperty("DATE_ORDER_PLACED")
	public String DATE_ORDER_PLACED="";
	
	@JsonProperty("ORDER_UPDATED_DATE")
	public String ORDER_UPDATED_DATE="";
	
	@JsonProperty("PO_DATE")
	public String PO_DATE="";
	
	@JsonProperty("CREATED_BY")
	public String CREATED_BY="";
	
	@JsonProperty("SOLD_TO")
	public String SOLD_TO="";
	
	@JsonProperty("SOLD_TO_ADDRESS")
	public String SOLD_TO_ADDRESS="";
	
	@JsonProperty("END_CUST_ADDRESS")
	public String END_CUST_ADDRESS="";
	
	@JsonProperty("AUART")
	public String AUART="";
	
	@JsonProperty("VKORG")
	public String VKORG="";
	
	@JsonProperty("VTWEG")
	public String VTWEG="";
	
	@JsonProperty("SPART")
	public String SPART="";
	
	@JsonProperty("SHIPPING_METHOD")
	public String SHIPPING_METHOD="";
	
	@JsonProperty("REQ_SHIP_DATE")
	public String REQ_SHIP_DATE="";
	
	@JsonProperty("SHIPPING_ADDRESS")
	public String SHIPPING_ADDRESS="";
	
	@JsonProperty("NET_PRICE")
	public Double NET_PRICE;
	
	@JsonProperty("CURRENCY")
	public String CURRENCY="";
	
	@JsonProperty("ZTERM")
	public String ZTERM="";
	
	@JsonProperty("INCOTERM")
	public String INCOTERM="";
	
	@JsonProperty("SALES_AREA")
	public String SALES_AREA="";
	
	@JsonProperty("BLK_ID")
	public String BLK_ID="";
	
	@JsonProperty("BLK_TXT")
	public String BLK_TXT="";
	
	@JsonProperty("ORDER_STAT")
	public String ORDER_STAT="";

	public String getERROR() {
		return ERROR;
	}

	public void setERROR(String eRROR) {
		ERROR = eRROR;
	}

	public String getGE_SALES_ORDER() {
		return GE_SALES_ORDER;
	}

	public void setGE_SALES_ORDER(String gE_SALES_ORDER) {
		GE_SALES_ORDER = gE_SALES_ORDER;
	}

	public String getCUSTOMER_PO() {
		return CUSTOMER_PO;
	}

	public void setCUSTOMER_PO(String cUSTOMER_PO) {
		CUSTOMER_PO = cUSTOMER_PO;
	}

	public String getDATE_ORDER_PLACED() {
		return DATE_ORDER_PLACED;
	}

	public void setDATE_ORDER_PLACED(String dATE_ORDER_PLACED) {
		DATE_ORDER_PLACED = dATE_ORDER_PLACED;
	}

	public String getORDER_UPDATED_DATE() {
		return ORDER_UPDATED_DATE;
	}

	public void setORDER_UPDATED_DATE(String oRDER_UPDATED_DATE) {
		ORDER_UPDATED_DATE = oRDER_UPDATED_DATE;
	}

	public String getPO_DATE() {
		return PO_DATE;
	}

	public void setPO_DATE(String pO_DATE) {
		PO_DATE = pO_DATE;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public String getSOLD_TO() {
		return SOLD_TO;
	}

	public void setSOLD_TO(String sOLD_TO) {
		SOLD_TO = sOLD_TO;
	}

	public String getSOLD_TO_ADDRESS() {
		return SOLD_TO_ADDRESS;
	}

	public void setSOLD_TO_ADDRESS(String sOLD_TO_ADDRESS) {
		SOLD_TO_ADDRESS = sOLD_TO_ADDRESS;
	}

	public String getEND_CUST_ADDRESS() {
		return END_CUST_ADDRESS;
	}

	public void setEND_CUST_ADDRESS(String eND_CUST_ADDRESS) {
		END_CUST_ADDRESS = eND_CUST_ADDRESS;
	}

	public String getAUART() {
		return AUART;
	}

	public void setAUART(String aUART) {
		AUART = aUART;
	}

	public String getVKORG() {
		return VKORG;
	}

	public void setVKORG(String vKORG) {
		VKORG = vKORG;
	}

	public String getVTWEG() {
		return VTWEG;
	}

	public void setVTWEG(String vTWEG) {
		VTWEG = vTWEG;
	}

	public String getSPART() {
		return SPART;
	}

	public void setSPART(String sPART) {
		SPART = sPART;
	}

	public String getSHIPPING_METHOD() {
		return SHIPPING_METHOD;
	}

	public void setSHIPPING_METHOD(String sHIPPING_METHOD) {
		SHIPPING_METHOD = sHIPPING_METHOD;
	}

	public String getREQ_SHIP_DATE() {
		return REQ_SHIP_DATE;
	}

	public void setREQ_SHIP_DATE(String rEQ_SHIP_DATE) {
		REQ_SHIP_DATE = rEQ_SHIP_DATE;
	}

	public String getSHIPPING_ADDRESS() {
		return SHIPPING_ADDRESS;
	}

	public void setSHIPPING_ADDRESS(String sHIPPING_ADDRESS) {
		SHIPPING_ADDRESS = sHIPPING_ADDRESS;
	}

	public Double getNET_PRICE() {
		return NET_PRICE;
	}

	public void setNET_PRICE(Double nET_PRICE) {
		NET_PRICE = nET_PRICE;
	}

	public String getCURRENCY() {
		return CURRENCY;
	}

	public void setCURRENCY(String cURRENCY) {
		CURRENCY = cURRENCY;
	}

	public String getZTERM() {
		return ZTERM;
	}

	public void setZTERM(String zTERM) {
		ZTERM = zTERM;
	}

	public String getINCOTERM() {
		return INCOTERM;
	}

	public void setINCOTERM(String iNCOTERM) {
		INCOTERM = iNCOTERM;
	}

	public String getSALES_AREA() {
		return SALES_AREA;
	}

	public void setSALES_AREA(String sALES_AREA) {
		SALES_AREA = sALES_AREA;
	}

	public String getBLK_ID() {
		return BLK_ID;
	}

	public void setBLK_ID(String bLK_ID) {
		BLK_ID = bLK_ID;
	}

	public String getBLK_TXT() {
		return BLK_TXT;
	}

	public void setBLK_TXT(String bLK_TXT) {
		BLK_TXT = bLK_TXT;
	}

	public String getORDER_STAT() {
		return ORDER_STAT;
	}

	public void setORDER_STAT(String oRDER_STAT) {
		ORDER_STAT = oRDER_STAT;
	}

	


}
