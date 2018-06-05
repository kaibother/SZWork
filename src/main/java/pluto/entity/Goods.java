package pluto.entity;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Integer goodstypeid;

    private Integer brandid;

    private Double weight;

    private String size;

    private String disease;

    private Integer dogsizeid;

    private Integer stock;

    private String type;

    private Double nowprice;

    private Double originalprice;

    private Double vipprice;

    private Integer countryid;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease == null ? null : disease.trim();
    }

    public Integer getDogsizeid() {
        return dogsizeid;
    }

    public void setDogsizeid(Integer dogsizeid) {
        this.dogsizeid = dogsizeid;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getNowprice() {
        return nowprice;
    }

    public void setNowprice(Double nowprice) {
        this.nowprice = nowprice;
    }

    public Double getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Double originalprice) {
        this.originalprice = originalprice;
    }

    public Double getVipprice() {
        return vipprice;
    }

    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }
}