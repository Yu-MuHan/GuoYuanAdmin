package cn.edu.glut.component.dao;

import cn.edu.glut.model.CommodityDetail;
import cn.edu.glut.model.CommodityDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityDetailMapper {
    int countByExample(CommodityDetailExample example);

    int deleteByExample(CommodityDetailExample example);

    int deleteByPrimaryKey(Long commodityDetaiId);

    int insert(CommodityDetail record);

    int insertSelective(CommodityDetail record);

    List<CommodityDetail> selectByExampleWithBLOBs(CommodityDetailExample example);

    List<CommodityDetail> selectByExample(CommodityDetailExample example);

    CommodityDetail selectByPrimaryKey(Long commodityDetaiId);

    int updateByExampleSelective(@Param("record") CommodityDetail record, @Param("example") CommodityDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") CommodityDetail record, @Param("example") CommodityDetailExample example);

    int updateByExample(@Param("record") CommodityDetail record, @Param("example") CommodityDetailExample example);

    int updateByPrimaryKeySelective(CommodityDetail record);

    int updateByPrimaryKeyWithBLOBs(CommodityDetail record);
}