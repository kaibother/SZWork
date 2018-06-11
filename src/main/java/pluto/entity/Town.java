package pluto.entity;

public class Town {
    private Integer townid;

    private String townname;

    @Override
    public String toString() {
        return "Town{" +
                "townid=" + townid +
                ", townname='" + townname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Town town = (Town) o;

        if (!townid.equals(town.townid)) return false;
        return townname.equals(town.townname);
    }

    @Override
    public int hashCode() {
        int result = townid.hashCode();
        result = 31 * result + townname.hashCode();
        return result;
    }

    public Town(Integer townid, String townname) {

        this.townid = townid;
        this.townname = townname;
    }

    public Town(String townname) {

        this.townname = townname;
    }

    public Town() {

    }

    public Integer getTownid() {
        return townid;
    }

    public void setTownid(Integer townid) {
        this.townid = townid;
    }

    public String getTownname() {
        return townname;
    }

    public void setTownname(String townname) {
        this.townname = townname == null ? null : townname.trim();
    }
}