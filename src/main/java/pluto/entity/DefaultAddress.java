package pluto.entity;

public class DefaultAddress {
    private Integer defaultaddressid;

    private Country country;

    private Province province;

    private City city;

    private District district;

    private Street street;

    private User user;

    @Override
    public String toString() {
        return "DefaultAddress{" +
                "defaultaddressid=" + defaultaddressid +
                ", country=" + country +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", street=" + street +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefaultAddress that = (DefaultAddress) o;

        if (defaultaddressid != null ? !defaultaddressid.equals(that.defaultaddressid) : that.defaultaddressid != null)
            return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = defaultaddressid != null ? defaultaddressid.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    public Integer getDefaultaddressid() {

        return defaultaddressid;
    }

    public void setDefaultaddressid(Integer defaultaddressid) {
        this.defaultaddressid = defaultaddressid;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DefaultAddress(Country country, Province province, City city, District district, Street street, User user) {

        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.user = user;
    }

    public DefaultAddress(Integer defaultaddressid, Country country, Province province, City city, District district, Street street, User user) {

        this.defaultaddressid = defaultaddressid;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.user = user;
    }

    public DefaultAddress() {

    }
}