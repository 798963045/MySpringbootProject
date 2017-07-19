package com.szu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hao on 2017/7/18.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

   @Autowired
   private  TestgirlProperties testgirlProperties;

   // @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid){
        return "id: "+myid;
        //return  testgirlProperties.getCupSize();
    }

}
