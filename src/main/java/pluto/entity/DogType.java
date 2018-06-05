package pluto.entity;

public class DogType {
    private Integer digtypeid;

    private String type;

    public Integer getDigtypeid() {
        return digtypeid;
    }

    public void setDigtypeid(Integer digtypeid) {
        this.digtypeid = digtypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}