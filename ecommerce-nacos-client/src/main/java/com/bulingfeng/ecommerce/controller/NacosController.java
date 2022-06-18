package com.bulingfeng.ecommerce.controller;

import com.bulingfeng.ecommerce.service.NacosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class NacosController {
    @Autowired
    private NacosService nacosService;

    @GetMapping("/nacos")
    public void getNacosInstance(){
        List<ServiceInstance> discoveryClients
                = nacosService.getDiscoveryClients("e-commerce-nacos-client");
        System.out.println(discoveryClients);
    }
}
