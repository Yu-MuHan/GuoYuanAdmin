package cn.edu.glut.model;

import java.util.Date;

public class OrderLogistics {
    private Integer orderlogisticsId;

    private Long orderId;

    private Long expressNo;

    private String logisticsName;

    private String orderlogisticsStatus;

    private Date logisticsCreateTime;

    private Date logisticsUpdateTime;

    private Date logisticsSettlementTime;

    public Integer getOrderlogisticsId() {
        return orderlogisticsId;
    }

    public void setOrderlogisticsId(Integer orderlogisticsId) {
        this.orderlogisticsId = orderlogisticsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(Long expressNo) {
        this.expressNo = expressNo;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName == null ? null : logisticsName.trim();
    }

    public String getOrderlogisticsStatus() {
        return orderlogisticsStatus;
    }

    public void setOrderlogisticsStatus(String orderlogisticsStatus) {
        this.orderlogisticsStatus = orderlogisticsStatus == null ? null : orderlogisticsStatus.trim();
    }

    public Date getLogisticsCreateTime() {
        return logisticsCreateTime;
    }

    public void setLogisticsCreateTime(Date logisticsCreateTime) {
        this.logisticsCreateTime = logisticsCreateTime;
    }

    public Date getLogisticsUpdateTime() {
        return logisticsUpdateTime;
    }

    public void setLogisticsUpdateTime(Date logisticsUpdateTime) {
        this.logisticsUpdateTime = logisticsUpdateTime;
    }

    public Date getLogisticsSettlementTime() {
        return logisticsSettlementTime;
    }

    public void setLogisticsSettlementTime(Date logisticsSettlementTime) {
        this.logisticsSettlementTime = logisticsSettlementTime;
    }
}