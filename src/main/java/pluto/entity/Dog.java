package pluto.entity;

public class Dog {
    private Integer dogid;

    private String dogname;

    private Integer dogsizeid;

    private Integer dogtypeid;

    private Integer areaid;

    public Integer getDogid() {
        return dogid;
    }

    public void setDogid(Integer dogid) {
        this.dogid = dogid;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname == null ? null : dogname.trim();
    }

    public Integer getDogsizeid() {
        return dogsizeid;
    }

    public void setDogsizeid(Integer dogsizeid) {
        this.dogsizeid = dogsizeid;
    }

    public Integer getDogtypeid() {
        return dogtypeid;
    }

    public void setDogtypeid(Integer dogtypeid) {
        this.dogtypeid = dogtypeid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }
}