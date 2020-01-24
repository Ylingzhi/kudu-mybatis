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

    /**
     * 删除
     *
     * @param sId
     */
    void delete(String sId);

    /**
     * 更新
     *
     * @param student
     */
    void update(Student student);

    /**
     * 插入 主键冲突时更新
     *
     * @param student
     */
    void upsert(Student student);
}
