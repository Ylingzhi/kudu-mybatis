package com.lxq.kudu.orm.demo.dao;

import com.lxq.kudu.orm.demo.domain.Student;
import org.apache.ibatis.annotations.Param;

/**
 * <p></p>
 *
 * @author lixq
 * @since 2019/12/8
 */
public interface StudentDao {
    /**
     * 增加
     *
     * @param student
     */
    void add(@Param("entity") Student student);

    /**
     * 查
     *
     * @param sId
     * @return
     */
    Student find(@Param("sId") String sId);
}
