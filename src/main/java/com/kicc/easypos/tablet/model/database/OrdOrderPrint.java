package com.kicc.easypos.tablet.model.database;

import java.io.Serial;
import java.io.Serializable;

public class OrdOrderPrint implements Serializable {
    @Serial
    private static final long serialVersionUID = 5757778994724569473L;
    private String createDatetime;
    private String index;
    private String orderPrint;
    private int orderSeq;
    private int orderUniqueNo;
    private String posNo;
    private String printDatetime;
    private String printFlag;
    private String printSeq;
    private String printerNo;
    private String saleDate;
    private String tableCode;
    private String tableGroupCode;

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getOrderPrint() {
        return orderPrint;
    }

    public void setOrderPrint(String orderPrint) {
        this.orderPrint = orderPrint;
    }

    public int getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(int orderSeq) {
        this.orderSeq = orderSeq;
    }

    public int getOrderUniqueNo() {
        return orderUniqueNo;
    }

    public void setOrderUniqueNo(int orderUniqueNo) {
        this.orderUniqueNo = orderUniqueNo;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getPrintDatetime() {
        return printDatetime;
    }

    public void setPrintDatetime(String printDatetime) {
        this.printDatetime = printDatetime;
    }

    public String getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag;
    }

    public String getPrintSeq() {
        return printSeq;
    }

    public void setPrintSeq(String printSeq) {
        this.printSeq = printSeq;
    }

    public String getPrinterNo() {
        return printerNo;
    }

    public void setPrinterNo(String printerNo) {
        this.printerNo = printerNo;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public String getTableGroupCode() {
        return tableGroupCode;
    }

    public void setTableGroupCode(String tableGroupCode) {
        this.tableGroupCode = tableGroupCode;
    }
}
