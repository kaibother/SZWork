package pluto.entity;

public class Cart {
    private Integer cartid;

    private Double carttotalprice;

    private Integer userid;

    private Integer goodsdetailid;

    private Integer servicedetailid;

    private Integer fosterdetailid;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Double getCarttotalprice() {
        return carttotalprice;
    }

    public void setCarttotalprice(Double carttotalprice) {
        this.carttotalprice = carttotalprice;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsdetailid() {
        return goodsdetailid;
    }

    public void setGoodsdetailid(Integer goodsdetailid) {
        this.goodsdetailid = goodsdetailid;
    }

    public Integer getServicedetailid() {
        return servicedetailid;
    }

    public void setServicedetailid(Integer servicedetailid) {
        this.servicedetailid = servicedetailid;
    }

    public Integer getFosterdetailid() {
        return fosterdetailid;
    }

    public void setFosterdetailid(Integer fosterdetailid) {
        this.fosterdetailid = fosterdetailid;
    }
}