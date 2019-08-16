package com.ng5.mptest.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ng5.mptest.dao.TStudentMapper;
import com.ng5.mptest.entity.TStudent;
import com.ng5.mptest.service.TStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/16
 */

@Service
public class TStudentServiceImpl extends ServiceImpl<TStudentMapper, TStudent> implements TStudentService {
    /**
     * 用户数据访问接口
     */
    @Autowired
    private TStudentMapper tstudentMapper;

    @Override
    public TStudent selectUserByMap(Map<String, Object> parameterMap) throws Exception {
        // TODO Auto-generated method stub
//        return tstudentMapper.selectUserByMap(parameterMap);
        return tstudentMapper.selectById(1);
    }

    @Override
    public void deleteAll() {
        tstudentMapper.deleteAll();
    }
}
