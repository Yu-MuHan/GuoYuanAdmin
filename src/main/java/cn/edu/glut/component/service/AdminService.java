package cn.edu.glut.component.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.glut.component.dao.AdminMapper;
import cn.edu.glut.model.Admin;
import cn.edu.glut.model.AdminExample;
@Service
public class AdminService {

	@Resource
	AdminMapper adminmapper;
	
	public Admin getAdminByAccount(String account) {
		AdminExample example=new AdminExample();
		example.createCriteria().andAccountEqualTo(account);
		List<Admin> admins=adminmapper.selectByExample(example);
		
		return admins.size()>0 ? admins.get(0) : null;
	}

}
