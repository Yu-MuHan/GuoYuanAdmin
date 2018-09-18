package cn.edu.glut.component.dao;

import cn.edu.glut.model.OrderLogistics;
import cn.edu.glut.model.OrderLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLogisticsMapper {
    int countByExample(OrderLogisticsExample example);

    int deleteByExample(OrderLogisticsExample example);

    int deleteByPrimaryKey(Integer orderlogisticsId);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    List<OrderLogistics> selectByExample(OrderLogisticsExample example);

    OrderLogistics selectByPrimaryKey(Integer orderlogisticsId);

    int updateByExampleSelective(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByExample(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);
}