package com.cqe.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/12.
 */
public class Resume implements Serializable{
    private Integer id;	//应聘人员编号
    private String name;//应聘人员姓名
    private String sex;	//性别
    private Integer age;//年龄
    private String job;	//职位
    private String specialty;//所学专业
    private String experience;//工作经验
    private String studyeffort;//学历
    private String school;	//毕业学校
    private String tel;		//电话号码
    private String email;	//Email地址

    public Resume() {
    }

    public Resume(Integer id, String name, String sex, Integer age, String job, String specialty, String experience, String studyeffort, String school, String tel, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.job = job;
        this.specialty = specialty;
        this.experience = experience;
        this.studyeffort = studyeffort;
        this.school = school;
        this.tel = tel;
        this.email = email;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStudyeffort() {
        return studyeffort;
    }

    public void setStudyeffort(String studyeffort) {
        this.studyeffort = studyeffort;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ResumeDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experience='" + experience + '\'' +
                ", studyeffort='" + studyeffort + '\'' +
                ", school='" + school + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
