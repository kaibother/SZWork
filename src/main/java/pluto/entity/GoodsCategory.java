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
}