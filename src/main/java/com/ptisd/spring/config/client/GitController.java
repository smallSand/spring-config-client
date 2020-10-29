package com.ptisd.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GitController {

    @Autowired
    private GitConfig gitConfig;

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping(value = "show")
    @ResponseBody
    public Object show(){
        return gitConfig;
    }

    @GetMapping(value = "autoShow")
    @ResponseBody
    public Object autoShow(){
        return gitAutoRefreshConfig;
    }
}
