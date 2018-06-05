package pluto.entity;

public class Town {
    private Integer townid;

    private String townname;

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