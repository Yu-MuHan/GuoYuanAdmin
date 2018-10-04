package cn.edu.glut.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.glut.component.service.AdminService;
import cn.edu.glut.model.Admin;
import cn.edu.glut.util.ResponseCode;

@Controller
public class Common {
	
	@Resource
	AdminService adminService;
	/**
	 * 登录验证
	 * @param admin
	 * @param session
	 * @param response
	 * @return
	 */
	@RequestMapping("/admin/login")
	public String login(Admin admin,HttpSession session,HttpServletResponse response) {
		
		Admin adminFromDB=adminService.getAdminByAccount(admin.getAccount());
		
		try {
			if(admin.equals(adminFromDB)) {
				session.setAttribute("admin", adminFromDB);
				response.getWriter().println(ResponseCode.SUCCESS);
				
			}else {
				response.getWriter().println(ResponseCode.ERROR);
			}
		}catch (Exception e) {
			
			System.out.println("error:"+this.getClass().getName()+" Line:" +e.getStackTrace()[0].getLineNumber());
		}
		return null;
	}
}
