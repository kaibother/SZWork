package pluto.entity;

public class DogSize {
    private Integer dogsizeid;

    private String size;

    public Integer getDogsizeid() {
        return dogsizeid;
    }

    public void setDogsizeid(Integer dogsizeid) {
        this.dogsizeid = dogsizeid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }
}