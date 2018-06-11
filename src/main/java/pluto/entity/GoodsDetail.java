package pluto.entity;

public class GoodsDetail {
    private Integer goodsdetailid;

    private Integer buycount;

    private Double onegoodscountprice;

    private Order order;

    private Goods goods;

    @Override
    public String toString() {
        return "GoodsDetail{" +
                "goodsdetailid=" + goodsdetailid +
                ", buycount=" + buycount +
                ", onegoodscountprice=" + onegoodscountprice +
                ", order=" + order +
                ", goods=" + goods +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsDetail that = (GoodsDetail) o;

        if (goodsdetailid != null ? !goodsdetailid.equals(that.goodsdetailid) : that.goodsdetailid != null)
            return false;
        if (buycount != null ? !buycount.equals(that.buycount) : that.buycount != null) return false;
        if (onegoodscountprice != null ? !onegoodscountprice.equals(that.onegoodscountprice) : that.onegoodscountprice != null)
            return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        return goods != null ? goods.equals(that.goods) : that.goods == null;
    }

    @Override
    public int hashCode() {
        int result = goodsdetailid != null ? goodsdetailid.hashCode() : 0;
        result = 31 * result + (buycount != null ? buycount.hashCode() : 0);
        result = 31 * result + (onegoodscountprice != null ? onegoodscountprice.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + (goods != null ? goods.hashCode() : 0);
        return result;
    }

    public GoodsDetail(Integer goodsdetailid, Integer buycount, Double onegoodscountprice, Order order, Goods goods) {

        this.goodsdetailid = goodsdetailid;
        this.buycount = buycount;
        this.onegoodscountprice = onegoodscountprice;
        this.order = order;
        this.goods = goods;
    }

    public GoodsDetail(Integer buycount, Double onegoodscountprice, Order order, Goods goods) {

        this.buycount = buycount;
        this.onegoodscountprice = onegoodscountprice;
        this.order = order;
        this.goods = goods;
    }

    public GoodsDetail() {

    }
}