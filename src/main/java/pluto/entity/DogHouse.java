package pluto.entity;

public class DogHouse {
    private Integer doghouseid;

    private String doghousename;

    private Integer doghousegradeid;

    private Integer dogsizeid;

    public Integer getDoghouseid() {
        return doghouseid;
    }

    public void setDoghouseid(Integer doghouseid) {
        this.doghouseid = doghouseid;
    }

    public String getDoghousename() {
        return doghousename;
    }

    public void setDoghousename(String doghousename) {
        this.doghousename = doghousename == null ? null : doghousename.trim();
    }

    public Integer getDoghousegradeid() {
        return doghousegradeid;
    }

    public void setDoghousegradeid(Integer doghousegradeid) {
        this.doghousegradeid = doghousegradeid;
    }

    public Integer getDogsizeid() {
        return dogsizeid;
    }

    public void setDogsizeid(Integer dogsizeid) {
        this.dogsizeid = dogsizeid;
    }
}