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

    /**
     * 删除
     *
     * @param sId
     */
    void delete(@Param("sId") String sId);

    /**
     * 更新
     *
     * @param student
     */
    void update(@Param("entity") Student student);

    /**
     * 插入 主键冲突时更新
     *
     * @param student
     */
    void upsert(@Param("entity") Student student);
}
