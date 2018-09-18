package cn.edu.glut.model;

public class CommodityDetail {
    private Long commodityDetaiId;

    private String commodityDesc;

    public Long getCommodityDetaiId() {
        return commodityDetaiId;
    }

    public void setCommodityDetaiId(Long commodityDetaiId) {
        this.commodityDetaiId = commodityDetaiId;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc == null ? null : commodityDesc.trim();
    }
}