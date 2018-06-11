package pluto.entity;

public class Brand {
    private Integer brandid;

    private String brandname;

    @Override
    public String toString() {
        return "Brand{" +
                "brandid=" + brandid +
                ", brandname='" + brandname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brand brand = (Brand) o;

        if (!brandid.equals(brand.brandid)) return false;
        return brandname.equals(brand.brandname);
    }

    @Override
    public int hashCode() {
        int result = brandid.hashCode();
        result = 31 * result + brandname.hashCode();
        return result;
    }

    public Brand(String brandname) {

        this.brandname = brandname;
    }

    public Brand(Integer brandid, String brandname) {

        this.brandid = brandid;
        this.brandname = brandname;
    }

    public Brand() {

    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }
}