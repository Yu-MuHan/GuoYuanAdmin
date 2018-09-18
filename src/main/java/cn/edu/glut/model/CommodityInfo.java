package cn.edu.glut.model;

import java.math.BigDecimal;

public class CommodityInfo {
    private Long commodityId;

    private Long cid;

    private String commodityName;

    private Integer commodityTerm;

    private Integer commodityNum;

    private String commodityVideoUrl;

    private BigDecimal commodityPrice;

    private String commodityProduct;

    private Integer commodityStatus;

    private String commodityMainPho;

    private String commoditySubPho1;

    private String commoditySubPho2;

    private String commoditySubPho3;

    private String commoditySubPho4;

    private Integer commodityCurrnum;

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getCommodityTerm() {
        return commodityTerm;
    }

    public void setCommodityTerm(Integer commodityTerm) {
        this.commodityTerm = commodityTerm;
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getCommodityVideoUrl() {
        return commodityVideoUrl;
    }

    public void setCommodityVideoUrl(String commodityVideoUrl) {
        this.commodityVideoUrl = commodityVideoUrl == null ? null : commodityVideoUrl.trim();
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityProduct() {
        return commodityProduct;
    }

    public void setCommodityProduct(String commodityProduct) {
        this.commodityProduct = commodityProduct == null ? null : commodityProduct.trim();
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getCommodityMainPho() {
        return commodityMainPho;
    }

    public void setCommodityMainPho(String commodityMainPho) {
        this.commodityMainPho = commodityMainPho == null ? null : commodityMainPho.trim();
    }

    public String getCommoditySubPho1() {
        return commoditySubPho1;
    }

    public void setCommoditySubPho1(String commoditySubPho1) {
        this.commoditySubPho1 = commoditySubPho1 == null ? null : commoditySubPho1.trim();
    }

    public String getCommoditySubPho2() {
        return commoditySubPho2;
    }

    public void setCommoditySubPho2(String commoditySubPho2) {
        this.commoditySubPho2 = commoditySubPho2 == null ? null : commoditySubPho2.trim();
    }

    public String getCommoditySubPho3() {
        return commoditySubPho3;
    }

    public void setCommoditySubPho3(String commoditySubPho3) {
        this.commoditySubPho3 = commoditySubPho3 == null ? null : commoditySubPho3.trim();
    }

    public String getCommoditySubPho4() {
        return commoditySubPho4;
    }

    public void setCommoditySubPho4(String commoditySubPho4) {
        this.commoditySubPho4 = commoditySubPho4 == null ? null : commoditySubPho4.trim();
    }

    public Integer getCommodityCurrnum() {
        return commodityCurrnum;
    }

    public void setCommodityCurrnum(Integer commodityCurrnum) {
        this.commodityCurrnum = commodityCurrnum;
    }
}