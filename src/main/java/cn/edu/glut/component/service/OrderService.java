package cn.edu.glut.component.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.glut.component.dao.OrderLogisticsMapper;
import cn.edu.glut.model.OrderLogistics;

@Service
public class OrderService {
	
	@Resource
	OrderLogisticsMapper orderLogisticsMapper;

	/**
	 * 发货
	 * @param orderLogistics
	 * @return
	 */
	public boolean deliver(OrderLogistics orderLogistics) {
		int result=orderLogisticsMapper.insert(orderLogistics);
		if(result==1) return true;
		return false;
	}

}
