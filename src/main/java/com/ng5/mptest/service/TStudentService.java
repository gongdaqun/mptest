package com.ng5.mptest.service;

import com.baomidou.mybatisplus.service.IService;
import com.ng5.mptest.entity.TStudent;

import java.util.Map;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/16
 */
public interface TStudentService extends IService<TStudent> {
    TStudent selectUserByMap(Map<String, Object> parameterMap) throws Exception;

    void deleteAll();
}
