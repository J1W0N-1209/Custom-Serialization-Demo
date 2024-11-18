package com.kicc.easypos.tablet.model.database;

import java.io.Serializable;
import java.util.Date;

public class OrdTableOrder implements Serializable, Cloneable {
    private String accumFlag;
    private String anniversary;
    private String birthday;
    private String birthdayType;
    private String changeOrderFlag;
    private long currentPoint;
    private String custCardNo;
    private long custCnt;
    private String custName;
    private String custNo;
    private String custOrderPrintPort;
    private String deliveryAddr;
    private String deliveryId;
    private String deliveryStatus;
    private String deliveryZone;
    private String divSeq;
    private String employCode;
    private String employName;
    private boolean emptyOrderFg;
    private String groupCode;
    private String lastOrderDatetime;
    private long lastPoint;
    private String lastServeDatetime;
    private String levelCode;
    private Date logDatetime;
    private String note;
    private String orderDatetime;
    private String orderItem;
    private String orderItemName;
    private int orderSeq;
    private String orderTableGroupName;
    private String orderTableName;
    private int orderUniqueNo;
    private String paymentFlag;
    private int paymentGroupCode;
    private String pickup;
    private String posNo;
    private String prepaidSaleContents;
    private String reOrder;
    private String reasonCode;
    private String reasonComment;
    private String request;
    private String reserveTime;
    private String saleContents;
    private String saleDate;
    private String serveDatetime;
    private String tableCode;
    private String tableGroupCode;
    private String tableIndex;
    private double totalAmt;
    private double totalDcAmt;
    private long usePoint;
    private String usingFlag;
    private static final long serialVersionUID = 865473547385189186L;

    public String getAccumFlag() {
        return accumFlag;
    }

    public void setAccumFlag(String accumFlag) {
        this.accumFlag = accumFlag;
    }

    public String getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(String anniversary) {
        this.anniversary = anniversary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthdayType() {
        return birthdayType;
    }

    public void setBirthdayType(String birthdayType) {
        this.birthdayType = birthdayType;
    }

    public String getChangeOrderFlag() {
        return changeOrderFlag;
    }

    public void setChangeOrderFlag(String changeOrderFlag) {
        this.changeOrderFlag = changeOrderFlag;
    }

    public long getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(long currentPoint) {
        this.currentPoint = currentPoint;
    }

    public String getCustCardNo() {
        return custCardNo;
    }

    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    public long getCustCnt() {
        return custCnt;
    }

    public void setCustCnt(long custCnt) {
        this.custCnt = custCnt;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustOrderPrintPort() {
        return custOrderPrintPort;
    }

    public void setCustOrderPrintPort(String custOrderPrintPort) {
        this.custOrderPrintPort = custOrderPrintPort;
    }

    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(String deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public String getDivSeq() {
        return divSeq;
    }

    public void setDivSeq(String divSeq) {
        this.divSeq = divSeq;
    }

    public String getEmployCode() {
        return employCode;
    }

    public void setEmployCode(String employCode) {
        this.employCode = employCode;
    }

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }

    public boolean isEmptyOrderFg() {
        return emptyOrderFg;
    }

    public void setEmptyOrderFg(boolean emptyOrderFg) {
        this.emptyOrderFg = emptyOrderFg;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getLastOrderDatetime() {
        return lastOrderDatetime;
    }

    public void setLastOrderDatetime(String lastOrderDatetime) {
        this.lastOrderDatetime = lastOrderDatetime;
    }

    public long getLastPoint() {
        return lastPoint;
    }

    public void setLastPoint(long lastPoint) {
        this.lastPoint = lastPoint;
    }

    public String getLastServeDatetime() {
        return lastServeDatetime;
    }

    public void setLastServeDatetime(String lastServeDatetime) {
        this.lastServeDatetime = lastServeDatetime;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(String orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    public int getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(int orderSeq) {
        this.orderSeq = orderSeq;
    }

    public String getOrderTableGroupName() {
        return orderTableGroupName;
    }

    public void setOrderTableGroupName(String orderTableGroupName) {
        this.orderTableGroupName = orderTableGroupName;
    }

    public String getOrderTableName() {
        return orderTableName;
    }

    public void setOrderTableName(String orderTableName) {
        this.orderTableName = orderTableName;
    }

    public int getOrderUniqueNo() {
        return orderUniqueNo;
    }

    public void setOrderUniqueNo(int orderUniqueNo) {
        this.orderUniqueNo = orderUniqueNo;
    }

    public String getPaymentFlag() {
        return paymentFlag;
    }

    public void setPaymentFlag(String paymentFlag) {
        this.paymentFlag = paymentFlag;
    }

    public int getPaymentGroupCode() {
        return paymentGroupCode;
    }

    public void setPaymentGroupCode(int paymentGroupCode) {
        this.paymentGroupCode = paymentGroupCode;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getPrepaidSaleContents() {
        return prepaidSaleContents;
    }

    public void setPrepaidSaleContents(String prepaidSaleContents) {
        this.prepaidSaleContents = prepaidSaleContents;
    }

    public String getReOrder() {
        return reOrder;
    }

    public void setReOrder(String reOrder) {
        this.reOrder = reOrder;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonComment() {
        return reasonComment;
    }

    public void setReasonComment(String reasonComment) {
        this.reasonComment = reasonComment;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
    }

    public String getSaleContents() {
        return saleContents;
    }

    public void setSaleContents(String saleContents) {
        this.saleContents = saleContents;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getServeDatetime() {
        return serveDatetime;
    }

    public void setServeDatetime(String serveDatetime) {
        this.serveDatetime = serveDatetime;
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

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public double getTotalDcAmt() {
        return totalDcAmt;
    }

    public void setTotalDcAmt(double totalDcAmt) {
        this.totalDcAmt = totalDcAmt;
    }

    public long getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(long usePoint) {
        this.usePoint = usePoint;
    }

    public String getUsingFlag() {
        return usingFlag;
    }

    public void setUsingFlag(String usingFlag) {
        this.usingFlag = usingFlag;
    }
}

