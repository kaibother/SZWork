package pluto.entity;

import java.util.Date;

public class Pet {
    private Integer petid;

    private String dogtype;

    private Date dogbirthday;

    private String dogname;

    private Integer userid;

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public String getDogtype() {
        return dogtype;
    }

    public void setDogtype(String dogtype) {
        this.dogtype = dogtype == null ? null : dogtype.trim();
    }

    public Date getDogbirthday() {
        return dogbirthday;
    }

    public void setDogbirthday(Date dogbirthday) {
        this.dogbirthday = dogbirthday;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname == null ? null : dogname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}