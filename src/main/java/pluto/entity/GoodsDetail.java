package pluto.entity;

public class GoodsDetail {
    private Integer goodsdetailid;

    private Integer buycount;

    private Double onegoodscountprice;

    private Integer orderid;

    private Integer goodsid;

    public Integer getGoodsdetailid() {
        return goodsdetailid;
    }

    public void setGoodsdetailid(Integer goodsdetailid) {
        this.goodsdetailid = goodsdetailid;
    }

    public Integer getBuycount() {
        return buycount;
    }

    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }

    public Double getOnegoodscountprice() {
        return onegoodscountprice;
    }

    public void setOnegoodscountprice(Double onegoodscountprice) {
        this.onegoodscountprice = onegoodscountprice;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
}