package com.cqe.dao;

import com.cqe.entity.Resume;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface ResumeDao {
    public List<Resume> queryAllResume();
    public void insertResume(Resume resume);
    public void deleteResumeById(int id);
    public Resume queryResumeByName(String name);
    public void updateResumeById(Resume resume);
}
