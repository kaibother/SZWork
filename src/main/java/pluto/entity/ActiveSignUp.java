package pluto.entity;

import java.util.Date;

public class ActiveSignUp {
    private Integer signupid;

    private Integer userid;

    private Date activedate;

    private Integer activetypeid;

    private Integer activegradeid;

    public Integer getSignupid() {
        return signupid;
    }

    public void setSignupid(Integer signupid) {
        this.signupid = signupid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getActivedate() {
        return activedate;
    }

    public void setActivedate(Date activedate) {
        this.activedate = activedate;
    }

    public Integer getActivetypeid() {
        return activetypeid;
    }

    public void setActivetypeid(Integer activetypeid) {
        this.activetypeid = activetypeid;
    }

    public Integer getActivegradeid() {
        return activegradeid;
    }

    public void setActivegradeid(Integer activegradeid) {
        this.activegradeid = activegradeid;
    }
}