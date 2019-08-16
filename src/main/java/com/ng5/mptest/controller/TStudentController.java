package com.ng5.mptest.controller;

import com.baomidou.mybatisplus.activerecord.Model;
import com.ng5.mptest.entity.TStudent;
import com.ng5.mptest.service.TStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/16
 */
@Controller
@RequestMapping("/tStudent")
public class TStudentController {

    @Autowired
    private TStudentService service;

    @GetMapping("/get/{id}")
    @ResponseBody
    public TStudent get(@PathVariable String id) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sid", id);
        TStudent student = this.service.selectUserByMap(map);
        return student;
    }

    @GetMapping("/deleteAll")
    @ResponseBody
    public boolean deleteAll() throws Exception {
        this.service.deleteAll();
        return true;
    }
}
