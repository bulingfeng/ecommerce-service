package com.bulingfeng.ecommerce.service.communication;

import com.bulingfeng.ecommerce.vo.JwtToken;
import com.bulingfeng.ecommerce.vo.UsernameAndPassword;
import okhttp3.MediaType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 对授权的服务调用的类
 * contextId为唯一标识符号，以前是serviceId
 * value是服务的名称
 */
@FeignClient(contextId = "AuthorityFeignService",value = "e-commerce-authority-center")
public interface AuthorityFeignService {

    @RequestMapping(value = "/ecommerce-authority-center/authority/token",method = RequestMethod.POST,
                consumes = "application/json",
                produces = "application/json"
    )
    JwtToken getTokenByFeign(@RequestBody UsernameAndPassword usernameAndPassword);
}
