package com.ng5.mptest.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ng5.mptest.entity.TStudent;

import java.util.Map;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/16
 */

public interface TStudentMapper extends BaseMapper<TStudent> {
    /**
     *
     * @Title: selectUserByMap
     * @Description: 多条件组合查找用户
     * @return
     * @throws Exception
     */
    TStudent selectUserByMap(Map<String, Object> parameterMap) throws Exception;

    void deleteAll();

}
