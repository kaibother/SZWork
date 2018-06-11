package pluto.entity;

public class Province {
    private Integer provinceid;

    private String provincename;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }

    @Override
    public String toString() {
        return "Province{" +
                "provinceid=" + provinceid +
                ", provincename='" + provincename + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Province province = (Province) o;

        if (!provinceid.equals(province.provinceid)) return false;
        return provincename.equals(province.provincename);
    }

    @Override
    public int hashCode() {
        int result = provinceid.hashCode();
        result = 31 * result + provincename.hashCode();
        return result;
    }

    public Province(Integer provinceid, String provincename) {

        this.provinceid = provinceid;
        this.provincename = provincename;
    }

    public Province(String provincename) {

        this.provincename = provincename;
    }

    public Province() {

    }
}