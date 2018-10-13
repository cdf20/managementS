package com.cqe.entity;

/**
 * Created by Administrator on 2018/10/12.
 */
public class Job {
    private Integer id;
    private String name;//职位
    private Integer dId;//部门ID；

    public Job() {
    }

    public Job(Integer id, String name, Integer dId) {
        this.id = id;
        this.name = name;
        this.dId = dId;
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

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dId=" + dId +
                '}';
    }
}
