package com.cqe.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/13.
 */
public class Apply {//应聘管理
    private Integer id;//应聘序号
    private String name;//应聘者
    private Date deliver;//投递时间
    private String state;//面试状态

    public Apply() {
    }

    public Apply(Integer id, String name, Date deliver, String state) {
        this.id = id;
        this.name = name;
        this.deliver = deliver;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeliver() {
        return deliver;
    }

    public void setDeliver(Date deliver) {
        this.deliver = deliver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deliver=" + deliver +
                ", state='" + state + '\'' +
                '}';
    }
}
