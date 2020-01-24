package com.lxq.kudu.orm.demo.service;

import com.lxq.kudu.orm.demo.domain.Student;

/**
 * <p></p>
 *
 * @author lixq
 * @since 2019/12/8
 */
public interface IStudentService {
    /**
     * 增加
     *
     * @param student
     */
    void add(Student student);

    /**
     * 查
     *
     * @param sId
     * @return
     */
    Student find(String sId);
}
