package com.lian.Jvm.service;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Ted
 * @date 2020/6/18 18:19
 */
public interface MyHttpService {

    void doGetWithoutParam(String baseUrl, HttpServletResponse response);

    void doGetWithParam(String baseUrl,HttpServletResponse response);

    void doPostWithoutUrlParam(String baseUrl, HttpServletResponse response);

    void doPostWithUrlParam(String baseUrl,HttpServletResponse response);
}
