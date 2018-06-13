package pluto.entity;

import java.util.Date;

public class ActiveType {
    private Integer activetypeid;

    private String activename;

    private String activetypepic;

    private Date createtime;

    private Date declinetime;

    private String admin;

    public ActiveType(String activename, String activetypepic, Date createtime, Date declinetime, String admin) {
        this.activename = activename;
        this.activetypepic = activetypepic;
        this.createtime = createtime;
        this.declinetime = declinetime;
        this.admin = admin;
    }

    public ActiveType(Integer activetypeid, String activename, String activetypepic, Date createtime, Date declinetime, String admin) {

        this.activetypeid = activetypeid;
        this.activename = activename;
        this.activetypepic = activetypepic;
        this.createtime = createtime;
        this.declinetime = declinetime;
        this.admin = admin;
    }

    public ActiveType() {

    }

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
        this.activename = activename;
    }

    public String getActivetypepic() {
        return activetypepic;
    }

    public void setActivetypepic(String activetypepic) {
        this.activetypepic = activetypepic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDeclinetime() {
        return declinetime;
    }

    public void setDeclinetime(Date declinetime) {
        this.declinetime = declinetime;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActiveType that = (ActiveType) o;

        if (activetypeid != null ? !activetypeid.equals(that.activetypeid) : that.activetypeid != null) return false;
        if (activename != null ? !activename.equals(that.activename) : that.activename != null) return false;
        if (activetypepic != null ? !activetypepic.equals(that.activetypepic) : that.activetypepic != null)
            return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (declinetime != null ? !declinetime.equals(that.declinetime) : that.declinetime != null) return false;
        return admin != null ? admin.equals(that.admin) : that.admin == null;
    }

    @Override
    public int hashCode() {
        int result = activetypeid != null ? activetypeid.hashCode() : 0;
        result = 31 * result + (activename != null ? activename.hashCode() : 0);
        result = 31 * result + (activetypepic != null ? activetypepic.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (declinetime != null ? declinetime.hashCode() : 0);
        result = 31 * result + (admin != null ? admin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ActiveType{" +
                "activetypeid=" + activetypeid +
                ", activename='" + activename + '\'' +
                ", activetypepic='" + activetypepic + '\'' +
                ", createtime=" + createtime +
                ", declinetime=" + declinetime +
                ", admin='" + admin + '\'' +
                '}';
    }
}