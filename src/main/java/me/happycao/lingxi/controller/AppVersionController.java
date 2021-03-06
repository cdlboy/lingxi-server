package me.happycao.lingxi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.happycao.lingxi.result.Result;
import me.happycao.lingxi.service.AppVersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : happyc
 * e-mail : bafs.jy@live.com
 * time   : 2018/04/28
 * desc   : app版本
 * version: 1.0
 */
@Api(tags = "06-app-version", value = "AppApi", description = "Android App版本接口")
@RestController
@RequestMapping("/app/version")
public class AppVersionController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppVersionService appVersionService;

    @ApiOperation(value = "最新app版本", notes = "获取最新app版本接口")
    @RequestMapping(value = "/latest", method = RequestMethod.POST)
    @ResponseBody
    public Result latestVersion() {
        return appVersionService.latestVersion();
    }

}
