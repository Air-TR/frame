package com.tr.business.controller;

import com.tr.frame.common.kit.UuidKit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@RestController
public class WebController {

    @GetMapping("/uuid")
    public String uuid() {
        return UuidKit.createUuid();
    }

}
