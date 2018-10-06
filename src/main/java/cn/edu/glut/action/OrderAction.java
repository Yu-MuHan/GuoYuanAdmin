package cn.edu.glut.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import cn.edu.glut.component.service.OrderService;
import cn.edu.glut.model.OrderLogistics;

/**
 * 订单管理
 * @author jones
 *
 */
@Controller
public class OrderAction {
	
	@Resource
	private OrderService orderService;
	/**
	 * 发货功能
	 * @param orderLogistics 订单物流
	 * @param response
	 * @return
	 */
	public String deliverGoods(OrderLogistics orderLogistics,HttpServletResponse response) {
		
		boolean result=orderService.deliver(orderLogistics);
		return null;
	}
}
