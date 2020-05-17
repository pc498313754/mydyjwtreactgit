package com.example.jwtsecutity.config.auth.jwt;

import com.example.jwtsecutity.config.auth.MyUserDetails;
import com.example.jwtsecutity.config.auth.MyUserDetailsServiceMapper;
import com.example.jwtsecutity.config.exception.CustomException;
import com.example.jwtsecutity.config.exception.CustomExceptionType;
import com.example.jwtsecutity.config.redis.RedisConstant;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Configuration
@EnableCaching
public class JwtAuthService {

    @Resource
    AuthenticationManager authenticationManager;

    @Resource
    UserDetailsService userDetailsService;

    @Resource
    JwtTokenUtil jwtTokenUtil;
    @Resource
    private MyUserDetailsServiceMapper myUserDetailsServiceMapper;

    /**
     * 登录认证换取JWT令牌
     * @return JWT
     */
    public String login(String username,String password) throws CustomException {
        try {
            UsernamePasswordAuthenticationToken upToken =
                    new UsernamePasswordAuthenticationToken(username, password);
            System.out.println("kaishirenzh ");
            Authentication authentication = authenticationManager.authenticate(upToken);
            System.out.println("kaishirenzh 1223243");
            SecurityContextHolder.getContext().setAuthentication(authentication);

        }catch (AuthenticationException e){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR
                            ,e.getMessage());
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        return jwtTokenUtil.generateToken(userDetails);
    }


    public String refreshToken(String oldToken){
        if(!jwtTokenUtil.isTokenExpired(oldToken)){
            return jwtTokenUtil.refreshToken(oldToken);
        }
        return null;
    }

    public String logut(String username,String password) throws CustomException {
        try {
            UsernamePasswordAuthenticationToken upToken =
                    new UsernamePasswordAuthenticationToken(username, password);
            Authentication authentication = authenticationManager.authenticate(upToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);

        }catch (AuthenticationException e){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR
                    ,"校验用户名密码生产JWT令牌");
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        return jwtTokenUtil.generateToken(userDetails);
    }

//    @Cacheable(value = RedisConstant.USER, key = "#username")

    public MyUserDetails findByUserName(String username)
    {
        System.out.println("findByUserName:"+username);
        return   myUserDetailsServiceMapper.findByUserName(username);
    }
  //  @Cacheable(/*cacheNames = {"user"}*/)
//  @Cacheable(value =RedisConstant.USER, key ="#userId"+"role_url_")


//  @Cacheable(keyGenerator="myKeyGenerator",value="#userId")
    public  List<String>  findRoleByUserName(String userId)
    {
        System.out.println("userId:"+userId);
        List<String> ll= myUserDetailsServiceMapper.findRoleByUserName(userId);
        return  ll;
    }

   //@Cacheable(value =  RedisConstant.USER, key = "#username"+"role_url_")
  // @Cacheable(keyGenerator="myKeyGenerator",value="#userId")
    public List<String> findAuthorityByRoleCodes(String roleCodes)
    {
        return   myUserDetailsServiceMapper.findAuthorityByRoleCodes(  roleCodes);
    }


}
