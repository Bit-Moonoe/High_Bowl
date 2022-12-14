package com.bowlcome.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

//import com.bowlcome.demo.Entity.UserEntity;


@RestController
@RequestMapping("test")
public class UserController {
	
	
//    @GetMapping("/{id}")
//    public String pathVariableTest(@RequestParam
//            Map<String, String> maptest, @PathVariable("id") String id) {
//        //type : member, id : 1
//        return "아이디: \n"+ id + "\n\r"+
//        	   "파라미터 키: "+ maptest.keySet() + "\n"+
//        	   "파라미터 값: "+ maptest.values() + "\n";
//    }
	
  @GetMapping("/{id}")
  public String pathVariableTest(@RequestParam
          Map<String, String> maptest, @PathVariable String id) {
      //type : member, id : 1
      return "아이디: \n"+ id + "\n\r"+
      	   "파라미터 키: "+ maptest.keySet() + "\n"+
      	   "파라미터 값: "+ maptest.values() + "\n";
  }
	
	
	
}
