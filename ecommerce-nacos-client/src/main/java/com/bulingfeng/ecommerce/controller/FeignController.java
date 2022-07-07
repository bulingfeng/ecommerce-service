package com.bulingfeng.ecommerce.controller;

import com.bulingfeng.ecommerce.service.communication.AuthorityFeignService;
import com.bulingfeng.ecommerce.vo.JwtToken;
import com.bulingfeng.ecommerce.vo.UsernameAndPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private AuthorityFeignService authorityFeignService;

    @PostMapping("/getJwtToken")
    public JwtToken getJwtToken(@RequestBody UsernameAndPassword usernameAndPassword){
        return authorityFeignService.getTokenByFeign(usernameAndPassword);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
