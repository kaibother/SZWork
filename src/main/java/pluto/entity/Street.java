package pluto.entity;

public class Street {
    private Integer streetid;

    private String streetname;

    @Override
    public String toString() {
        return "Street{" +
                "streetid=" + streetid +
                ", streetname='" + streetname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Street street = (Street) o;

        if (!streetid.equals(street.streetid)) return false;
        return streetname.equals(street.streetname);
    }

    @Override
    public int hashCode() {
        int result = streetid.hashCode();
        result = 31 * result + streetname.hashCode();
        return result;
    }

    public Street(Integer streetid, String streetname) {

        this.streetid = streetid;
        this.streetname = streetname;
    }

    public Street(String streetname) {

        this.streetname = streetname;
    }

    public Street() {

    }

    public Integer getStreetid() {
        return streetid;
    }

    public void setStreetid(Integer streetid) {
        this.streetid = streetid;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname == null ? null : streetname.trim();
    }
}