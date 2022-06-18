package com.bulingfeng.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NacosService {
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * @param serviceId 也就是应用名
     */
    public List<ServiceInstance> getDiscoveryClients(String serviceId){
        return discoveryClient.getInstances(serviceId);
    }
}
