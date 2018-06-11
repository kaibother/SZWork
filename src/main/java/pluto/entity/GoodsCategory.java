package pluto.entity;

public class GoodsCategory {
    private Integer goodscategoryid;

    private String categoryname;

    public Integer getGoodscategoryid() {
        return goodscategoryid;
    }

    public void setGoodscategoryid(Integer goodscategoryid) {
        this.goodscategoryid = goodscategoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    @Override
    public String toString() {
        return "GoodsCategory{" +
                "goodscategoryid=" + goodscategoryid +
                ", categoryname='" + categoryname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsCategory that = (GoodsCategory) o;

        if (goodscategoryid != null ? !goodscategoryid.equals(that.goodscategoryid) : that.goodscategoryid != null)
            return false;
        return categoryname != null ? categoryname.equals(that.categoryname) : that.categoryname == null;
    }

    @Override
    public int hashCode() {
        int result = goodscategoryid != null ? goodscategoryid.hashCode() : 0;
        result = 31 * result + (categoryname != null ? categoryname.hashCode() : 0);
        return result;
    }

    public GoodsCategory(Integer goodscategoryid, String categoryname) {

        this.goodscategoryid = goodscategoryid;
        this.categoryname = categoryname;
    }

    public GoodsCategory(String categoryname) {

        this.categoryname = categoryname;
    }

    public GoodsCategory() {

    }
}