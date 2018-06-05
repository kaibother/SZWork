package pluto.entity;

public class Country {
    private Integer countryid;

    private String counryname;

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public String getCounryname() {
        return counryname;
    }

    public void setCounryname(String counryname) {
        this.counryname = counryname == null ? null : counryname.trim();
    }
}