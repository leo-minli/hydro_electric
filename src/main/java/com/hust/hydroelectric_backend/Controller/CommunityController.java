package com.hust.hydroelectric_backend.Controller;

import com.hust.hydroelectric_backend.Entity.Community;
import com.hust.hydroelectric_backend.Service.CommunityService;
import com.hust.hydroelectric_backend.utils.ResponseHandler;
import com.hust.hydroelectric_backend.utils.result.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: suxinyu
 * @DateTme: 2019/11/19 16:34
 * 小区相关操作
 */
@RestController
public class CommunityController {

    @Autowired
    CommunityService communityService;

    @GetMapping("/community")
    public ResultData getCommunity(@RequestParam(value = "cId", defaultValue = "-1") int id){
        return ResponseHandler.doHandle(() -> communityService.getCommunity(id));
    }

    @PostMapping("/community")
    public ResultData addCommunity(@RequestBody Community community){
        return ResponseHandler.doHandle(() -> communityService.addCommunity(community));
    }

    @DeleteMapping("/community")
    public ResultData delCommunity(@RequestParam(value = "cId", defaultValue = "-1") int id){
        return ResponseHandler.doHandle(() -> communityService.delCommunity(id));
    }

    @PutMapping("/community")
    public ResultData uptCommunity(@RequestBody Community community){
        return ResponseHandler.doHandle(() -> communityService.uptCommunity(community));
    }
}