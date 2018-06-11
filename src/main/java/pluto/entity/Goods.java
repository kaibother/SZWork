package pluto.entity;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private GoodsCategory goodscategory;

    private Brand brand;

    private Double weight;

    private String size;

    private String disease;

    private DogSize dogsize;

    private Integer stock;

    private String type;

    private Double nowprice;

    private Double originalprice;

    private Double vipprice;

    private Country country;

    public Goods() {
    }

    public String getGoodsname() {
        return goodsname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (goodsid != null ? !goodsid.equals(goods.goodsid) : goods.goodsid != null) return false;
        if (goodsname != null ? !goodsname.equals(goods.goodsname) : goods.goodsname != null) return false;
        if (goodscategory != null ? !goodscategory.equals(goods.goodscategory) : goods.goodscategory != null)
            return false;
        if (brand != null ? !brand.equals(goods.brand) : goods.brand != null) return false;
        if (weight != null ? !weight.equals(goods.weight) : goods.weight != null) return false;
        if (size != null ? !size.equals(goods.size) : goods.size != null) return false;
        if (disease != null ? !disease.equals(goods.disease) : goods.disease != null) return false;
        if (dogsize != null ? !dogsize.equals(goods.dogsize) : goods.dogsize != null) return false;
        if (stock != null ? !stock.equals(goods.stock) : goods.stock != null) return false;
        if (type != null ? !type.equals(goods.type) : goods.type != null) return false;
        if (nowprice != null ? !nowprice.equals(goods.nowprice) : goods.nowprice != null) return false;
        if (originalprice != null ? !originalprice.equals(goods.originalprice) : goods.originalprice != null)
            return false;
        if (vipprice != null ? !vipprice.equals(goods.vipprice) : goods.vipprice != null) return false;
        return country != null ? country.equals(goods.country) : goods.country == null;
    }

    @Override
    public int hashCode() {
        int result = goodsid != null ? goodsid.hashCode() : 0;
        result = 31 * result + (goodsname != null ? goodsname.hashCode() : 0);
        result = 31 * result + (goodscategory != null ? goodscategory.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (disease != null ? disease.hashCode() : 0);
        result = 31 * result + (dogsize != null ? dogsize.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (nowprice != null ? nowprice.hashCode() : 0);
        result = 31 * result + (originalprice != null ? originalprice.hashCode() : 0);
        result = 31 * result + (vipprice != null ? vipprice.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodscategory=" + goodscategory +
                ", brand=" + brand +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                ", disease='" + disease + '\'' +
                ", dogsize=" + dogsize +
                ", stock=" + stock +
                ", type='" + type + '\'' +
                ", nowprice=" + nowprice +
                ", originalprice=" + originalprice +
                ", vipprice=" + vipprice +
                ", country=" + country +
                '}';
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public GoodsCategory getGoodscategory() {
        return goodscategory;
    }

    public void setGoodscategory(GoodsCategory goodscategory) {
        this.goodscategory = goodscategory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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
        this.size = size;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public DogSize getDogsize() {
        return dogsize;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setDogsize(DogSize dogsize) {

        this.dogsize = dogsize;
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
        this.type = type;
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

    public Country getCountry() {
        return country;
    }



    public Integer getGoodsid() {

        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Goods(String goodsname, GoodsCategory goodscategory, Brand brand, Double weight, String size, String disease, DogSize dogsize, Integer stock, String type, Double nowprice, Double originalprice, Double vipprice, Country country) {
        this.goodsname = goodsname;
        this.goodscategory = goodscategory;
        this.brand = brand;
        this.weight = weight;
        this.size = size;
        this.disease = disease;
        this.dogsize = dogsize;
        this.stock = stock;
        this.type = type;
        this.nowprice = nowprice;
        this.originalprice = originalprice;
        this.vipprice = vipprice;
        this.country = country;
    }

    public Goods(Integer goodsid, String goodsname, GoodsCategory goodscategory, Brand brand, Double weight, String size, String disease, DogSize dogsize, Integer stock, String type, Double nowprice, Double originalprice, Double vipprice, Country country) {

        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.goodscategory = goodscategory;
        this.brand = brand;
        this.weight = weight;
        this.size = size;
        this.disease = disease;
        this.dogsize = dogsize;
        this.stock = stock;
        this.type = type;
        this.nowprice = nowprice;
        this.originalprice = originalprice;
        this.vipprice = vipprice;
        this.country = country;
    }
}