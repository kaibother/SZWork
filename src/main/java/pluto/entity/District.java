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
}