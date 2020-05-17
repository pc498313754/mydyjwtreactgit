package com.example.jwtsecutity.config;

import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
@Component
public class CsrfSecurityRequestMatcher implements RequestMatcher {

    private Pattern allowedMethods = Pattern.compile("^(GET|HEAD|POST|TRACE|OPTIONS|DELETE)$");

    @Override
    public boolean matches(HttpServletRequest request) {
        List<String> execludeUrls = new ArrayList<>();
        execludeUrls.add("/api/*");//允许post请求的url路径，这只是简单测试，具体要怎么设计这个csrf处理，看个人爱好
      //  execludeUrls.add("farm");//允许post请求的url路径，这只是简单测试，具体要怎么设计这个csrf处理，看个人爱好
        if (execludeUrls != null && execludeUrls.size() > 0) {
            String servletPath = request.getServletPath();
            request.getParameter("");
            for (String url : execludeUrls) {
                if (servletPath.contains(url)) {
                    System.out.println("111111");
                    return false;
                }
            }
        }
        System.out.println("eeeeeee");
        return !allowedMethods.matcher(request.getMethod()).matches();

    }
}