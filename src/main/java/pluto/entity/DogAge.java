package pluto.entity;

public class DogAge {
    private Integer dogeageid;

    private String age;

    public Integer getDogeageid() {
        return dogeageid;
    }

    public void setDogeageid(Integer dogeageid) {
        this.dogeageid = dogeageid;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }
}