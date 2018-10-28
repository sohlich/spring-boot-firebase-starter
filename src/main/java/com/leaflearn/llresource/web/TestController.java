package com.leaflearn.llresource.web;

import com.google.common.collect.Maps;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Radomir Sohlich on 27/10/2018.
 */
@RestController
@RequestMapping("/api")
public class TestController {



    @GetMapping("/open")
    private Object getIdentity(){
        Authentication auth =
                SecurityContextHolder.getContext().getAuthentication();
        return auth.getPrincipal();
    }

    @GetMapping("/client")
    private Map getIdentityClose(){
        Authentication auth =
                SecurityContextHolder.getContext().getAuthentication();
        Map<String,Object> m =  Maps.newHashMap();
        m.put("user",
                auth.getPrincipal());
        return m;
    }
}
