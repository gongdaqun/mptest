package com.ng5.mptest.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/16
 */
@TableName("t_student")
public class TStudent implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;
    private String sname;
    private String sex;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TStudent{" +
                ", sid=" + sid +
                ", sname=" + sname +
                ", sex=" + sex +
                "}";
    }

}
