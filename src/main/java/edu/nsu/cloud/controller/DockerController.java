package edu.nsu.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/6.
 */
@RestController
public class DockerController {
    @RequestMapping("/")
    public String index(){
        return "Hello Docker";
    }
}
