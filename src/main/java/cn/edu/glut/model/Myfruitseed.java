package cn.edu.glut.model;

import java.util.Date;

public class Myfruitseed {
    private Integer id;

    private Integer userId;

    private Integer areaId;

    private String commodityName;

    private Integer commodityNum;

    private String status;

    private Date plantingTime;

    private Integer realFruitWeight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getPlantingTime() {
        return plantingTime;
    }

    public void setPlantingTime(Date plantingTime) {
        this.plantingTime = plantingTime;
    }

    public Integer getRealFruitWeight() {
        return realFruitWeight;
    }

    public void setRealFruitWeight(Integer realFruitWeight) {
        this.realFruitWeight = realFruitWeight;
    }
}