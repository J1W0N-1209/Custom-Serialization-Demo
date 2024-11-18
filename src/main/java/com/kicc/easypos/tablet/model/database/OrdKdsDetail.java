package com.kicc.easypos.tablet.model.database;

import java.io.Serial;
import java.io.Serializable;

public class OrdKdsDetail implements Serializable {
    @Serial
    private static final long serialVersionUID = -8730520912328270794L;
    private String changeItemNo;
    private long changeQty;
    private String cookDatetime;
    private String cookEndTime;
    private String cookOfferTime;
    private String cookStartTime;
    private String cookStatus;
    private long cookTime;
    private long custCnt;
    private String dcKind;
    private String detailSeq;
    private String divSeq;
    private String index;
    private String itemCode;
    private String itemName;
    private long itemQty;
    private String kdsNo;
    private String logDatetime;
    private String orderDatetime;
    private String orderEmpName;
    private String orderEmpNo;
    private String orderNotice;
    private int orderSeq;
    private String orderTag;
    private int orderUniqueNo;
    private String orderWaitNo;
    private long orgItemQty;
    private String parentItemCode;
    private String parentItemName;
    private double saleAmt;
    private String saleDate;
    private String sendFlag;
    private long subMenuCount;
    private String subMenuYn;
    private String submenuType;
    private String tableCode;
    private String tableGroupCode;
    private String tableGroupName;
    private String tableNm;
    private long timestamp;

    public String getChangeItemNo() {
        return changeItemNo;
    }

    public void setChangeItemNo(String changeItemNo) {
        this.changeItemNo = changeItemNo;
    }

    public long getChangeQty() {
        return changeQty;
    }

    public void setChangeQty(long changeQty) {
        this.changeQty = changeQty;
    }

    public String getCookDatetime() {
        return cookDatetime;
    }

    public void setCookDatetime(String cookDatetime) {
        this.cookDatetime = cookDatetime;
    }

    public String getCookEndTime() {
        return cookEndTime;
    }

    public void setCookEndTime(String cookEndTime) {
        this.cookEndTime = cookEndTime;
    }

    public String getCookOfferTime() {
        return cookOfferTime;
    }

    public void setCookOfferTime(String cookOfferTime) {
        this.cookOfferTime = cookOfferTime;
    }

    public String getCookStartTime() {
        return cookStartTime;
    }

    public void setCookStartTime(String cookStartTime) {
        this.cookStartTime = cookStartTime;
    }

    public String getCookStatus() {
        return cookStatus;
    }

    public void setCookStatus(String cookStatus) {
        this.cookStatus = cookStatus;
    }

    public long getCookTime() {
        return cookTime;
    }

    public void setCookTime(long cookTime) {
        this.cookTime = cookTime;
    }

    public long getCustCnt() {
        return custCnt;
    }

    public void setCustCnt(long custCnt) {
        this.custCnt = custCnt;
    }

    public String getDcKind() {
        return dcKind;
    }

    public void setDcKind(String dcKind) {
        this.dcKind = dcKind;
    }

    public String getDetailSeq() {
        return detailSeq;
    }

    public void setDetailSeq(String detailSeq) {
        this.detailSeq = detailSeq;
    }

    public String getDivSeq() {
        return divSeq;
    }

    public void setDivSeq(String divSeq) {
        this.divSeq = divSeq;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getItemQty() {
        return itemQty;
    }

    public void setItemQty(long itemQty) {
        this.itemQty = itemQty;
    }

    public String getKdsNo() {
        return kdsNo;
    }

    public void setKdsNo(String kdsNo) {
        this.kdsNo = kdsNo;
    }

    public String getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(String logDatetime) {
        this.logDatetime = logDatetime;
    }

    public String getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(String orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public String getOrderEmpName() {
        return orderEmpName;
    }

    public void setOrderEmpName(String orderEmpName) {
        this.orderEmpName = orderEmpName;
    }

    public String getOrderEmpNo() {
        return orderEmpNo;
    }

    public void setOrderEmpNo(String orderEmpNo) {
        this.orderEmpNo = orderEmpNo;
    }

    public String getOrderNotice() {
        return orderNotice;
    }

    public void setOrderNotice(String orderNotice) {
        this.orderNotice = orderNotice;
    }

    public int getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(int orderSeq) {
        this.orderSeq = orderSeq;
    }

    public String getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag;
    }

    public int getOrderUniqueNo() {
        return orderUniqueNo;
    }

    public void setOrderUniqueNo(int orderUniqueNo) {
        this.orderUniqueNo = orderUniqueNo;
    }

    public String getOrderWaitNo() {
        return orderWaitNo;
    }

    public void setOrderWaitNo(String orderWaitNo) {
        this.orderWaitNo = orderWaitNo;
    }

    public long getOrgItemQty() {
        return orgItemQty;
    }

    public void setOrgItemQty(long orgItemQty) {
        this.orgItemQty = orgItemQty;
    }

    public String getParentItemCode() {
        return parentItemCode;
    }

    public void setParentItemCode(String parentItemCode) {
        this.parentItemCode = parentItemCode;
    }

    public String getParentItemName() {
        return parentItemName;
    }

    public void setParentItemName(String parentItemName) {
        this.parentItemName = parentItemName;
    }

    public double getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(double saleAmt) {
        this.saleAmt = saleAmt;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag;
    }

    public long getSubMenuCount() {
        return subMenuCount;
    }

    public void setSubMenuCount(long subMenuCount) {
        this.subMenuCount = subMenuCount;
    }

    public String getSubMenuYn() {
        return subMenuYn;
    }

    public void setSubMenuYn(String subMenuYn) {
        this.subMenuYn = subMenuYn;
    }

    public String getSubmenuType() {
        return submenuType;
    }

    public void setSubmenuType(String submenuType) {
        this.submenuType = submenuType;
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

    public String getTableGroupName() {
        return tableGroupName;
    }

    public void setTableGroupName(String tableGroupName) {
        this.tableGroupName = tableGroupName;
    }

    public String getTableNm() {
        return tableNm;
    }

    public void setTableNm(String tableNm) {
        this.tableNm = tableNm;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
