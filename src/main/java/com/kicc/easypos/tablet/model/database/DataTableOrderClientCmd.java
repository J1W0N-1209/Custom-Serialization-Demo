package com.kicc.easypos.tablet.model.database;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DataTableOrderClientCmd implements Serializable {
    private String commitDatetime;
    private String commitFlag;
    private String createDatetime;
    private String divSeq;
    private int orderUniqueNo;
    private String posNo;
    private String procFlag;
    private String saleDate;
    private String tableCode;
    private String tableGroupCode;
    private String tableIndex;
    private static final long serialVersionUID = 986206577653719151L;

    public String getCommitDatetime() {
        return commitDatetime;
    }

    public void setCommitDatetime(String commitDatetime) {
        this.commitDatetime = commitDatetime;
    }

    public String getCommitFlag() {
        return commitFlag;
    }

    public void setCommitFlag(String commitFlag) {
        this.commitFlag = commitFlag;
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getDivSeq() {
        return divSeq;
    }

    public void setDivSeq(String divSeq) {
        this.divSeq = divSeq;
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

    public String getProcFlag() {
        return procFlag;
    }

    public void setProcFlag(String procFlag) {
        this.procFlag = procFlag;
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

    public String getTableIndex() {
        return tableIndex;
    }

    public void setTableIndex(String tableIndex) {
        this.tableIndex = tableIndex;
    }
}