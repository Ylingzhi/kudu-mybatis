package com.lxq.kudu.orm.demo.domain;

/**
 * <p></p>
 *
 * @author lixq
 * @since 2019/12/8
 */
public class Student {
    private String sId;

    private String sName;

    private Integer sAge;

    private Integer sSex;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public Integer getsSex() {
        return sSex;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }
}
