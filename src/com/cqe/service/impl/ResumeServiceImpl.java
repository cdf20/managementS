package com.cqe.service.impl;

import com.cqe.dao.ResumeDao;
import com.cqe.entity.Resume;
import com.cqe.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService{
    @Autowired
    private ResumeDao resumeDao;

    @Override
    public List<Resume> queryAllResume() {
        return resumeDao.queryAllResume();
    }

    @Override
    public void insertResume(Resume resume) {
        resumeDao.insertResume(resume);
    }

    @Override
    public void deleteResumeById(int id) {
        resumeDao.deleteResumeById(id);
    }

    @Override
    public Resume queryResumeByName(String name) {
        return resumeDao.queryResumeByName(name);
    }

    @Override
    public void updateResumeById(Resume resume) {
        resumeDao.updateResumeById(resume);
    }
}
