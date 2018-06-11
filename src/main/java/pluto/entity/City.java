package pluto.entity;

public class City {
    private Integer cityid;

    private String cityname;

    @Override
    public String toString() {
        return "City{" +
                "cityid=" + cityid +
                ", cityname='" + cityname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (!cityid.equals(city.cityid)) return false;
        return cityname.equals(city.cityname);
    }

    @Override
    public int hashCode() {
        int result = cityid.hashCode();
        result = 31 * result + cityname.hashCode();
        return result;
    }

    public City(String cityname) {

        this.cityname = cityname;
    }

    public City(Integer cityid, String cityname) {

        this.cityid = cityid;
        this.cityname = cityname;
    }

    public City() {

    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }
}
