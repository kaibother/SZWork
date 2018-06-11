package pluto.entity;

public class District {
    private Integer districtid;

    private String districtname;

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname == null ? null : districtname.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district = (District) o;

        if (!districtid.equals(district.districtid)) return false;
        return districtname.equals(district.districtname);
    }

    @Override
    public int hashCode() {
        int result = districtid.hashCode();
        result = 31 * result + districtname.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtid=" + districtid +
                ", districtname='" + districtname + '\'' +
                '}';
    }

    public District(String districtname) {
        this.districtname = districtname;
    }

    public District(Integer districtid, String districtname) {

        this.districtid = districtid;
        this.districtname = districtname;
    }

    public District() {

    }
}