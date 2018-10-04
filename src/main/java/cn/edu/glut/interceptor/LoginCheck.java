package cn.edu.glut.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.glut.model.Admin;

/**
 * 拦截器类 用作请求之前判断是否已经登录
 * @author 于金彪
 *
 */
public class LoginCheck implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("拦截器:"+request.getServletPath());
		Admin user=(Admin) request.getSession().getAttribute("admin");
		if(user==null) {
			//未登录 返回登录页面
			System.out.println();
			request.getRequestDispatcher("login.action").forward(request, response);
			return false;
		}else {
			return true;
		}
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
