package com.example.jwtsecutity.config.auth;

import com.example.jwtsecutity.config.auth.jwt.JwtAuthService;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Resource
    private MyUserDetailsServiceMapper myUserDetailsServiceMapper;
    @Resource
    JwtAuthService jwtAuthService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //加载基础用户信息
        MyUserDetails myUserDetails = jwtAuthService.findByUserName(username);
        //加载用户角色列表
        System.out.println("myUserDetails-password:"+myUserDetails.password);
        List<String> roleCodes = jwtAuthService.findRoleByUserName(username);
        String urls = "";
        if(!roleCodes.isEmpty()&&roleCodes.size()>=1)
        {
            urls=  roleCodes.get(0);
        }


//        System.out.println("roleCodes:"+roleCodes+"          username:"+username);
//        for (String s : roleCodes) {
//            urls += "'" + s + "',";
//        }
//        if (urls.charAt(urls.length() - 1) == ',') {
//            urls = urls.substring(0, urls.length() - 1);
//        }
        //通过用户角色列表加载用户的资源权限列表

        List<String> authorties = jwtAuthService.findAuthorityByRoleCodes(urls);
        System.out.println("authorties:"+authorties+"   urls:"+urls);
        //角色是一个特殊的权限，ROLE_前缀
        roleCodes = roleCodes.stream()
                .map(rc -> "ROLE_" + rc)
                .collect(Collectors.toList());
        authorties.addAll(roleCodes);

        myUserDetails.setAuthorities(
                AuthorityUtils.commaSeparatedStringToAuthorityList(
                        String.join(",", authorties)
                )
        );

        return myUserDetails;
    }
}
