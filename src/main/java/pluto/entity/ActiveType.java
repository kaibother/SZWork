package pluto.entity;

public class ActiveType {
    private Integer activetypeid;

    private String activename;

    public Integer getActivetypeid() {
        return activetypeid;
    }

    public void setActivetypeid(Integer activetypeid) {
        this.activetypeid = activetypeid;
    }

    public String getActivename() {
        return activename;
    }

    public void setActivename(String activename) {
        this.activename = activename == null ? null : activename.trim();
    }
}