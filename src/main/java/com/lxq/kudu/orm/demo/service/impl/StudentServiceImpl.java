package com.lxq.kudu.orm.demo.service.impl;

import com.lxq.kudu.orm.demo.dao.StudentDao;
import com.lxq.kudu.orm.demo.domain.Student;
import com.lxq.kudu.orm.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author lixq
 * @since 2019/12/8
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void add(Student student) {
        studentDao.add(student);
    }

    @Override
    public Student find(String sId) {
        return studentDao.find(sId);
    }

    @Override
    public void delete(String sId) {
        studentDao.delete(sId);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public void upsert(Student student) {
        studentDao.upsert(student);
    }
}
