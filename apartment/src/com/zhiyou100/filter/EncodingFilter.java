package com.zhiyou100.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class EncodingFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 强制转换为处理http请求和响应的对象
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp =  (HttpServletResponse)response;
			
		// 编码格式设置
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		// 放行
		chain.doFilter(req, resp);
	}

	@Override
	public void destroy() {
		
	}

}
