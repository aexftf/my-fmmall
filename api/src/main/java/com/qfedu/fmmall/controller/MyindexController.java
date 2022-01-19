package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.service.IndexImgService;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class MyindexController {


    @Autowired
   private IndexImgService indexImgService;



    @ApiOperation("dweded")
    @GetMapping("/indexImg")
    public ResultVO showImg(){

       return  indexImgService.listIndexImgs();

    }



}
