package com.open.iot.client.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.iot.client.commons.CommonStant;

/**
 * 
* @ClassName: DefaultHystrixController 
* @Description: 默认降级处理
* @author huy
* @date 2019年7月28日 下午1:13:37 
*
 */
@RestController
public class DefaultHystrixController {

    @RequestMapping("/defaultfallback")
    public Map<String,Object> defaultfallback(){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put(CommonStant.RESULT_CODE,HttpStatus.INTERNAL_SERVER_ERROR);
        map.put(CommonStant.RESULT_MSG,"请稍后重试");
        return map;
    }
}