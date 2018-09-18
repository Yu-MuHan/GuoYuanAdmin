package cn.edu.glut.component.dao;

import cn.edu.glut.model.CommodityInfo;
import cn.edu.glut.model.CommodityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityInfoMapper {
    int countByExample(CommodityInfoExample example);

    int deleteByExample(CommodityInfoExample example);

    int deleteByPrimaryKey(Long commodityId);

    int insert(CommodityInfo record);

    int insertSelective(CommodityInfo record);

    List<CommodityInfo> selectByExample(CommodityInfoExample example);

    CommodityInfo selectByPrimaryKey(Long commodityId);

    int updateByExampleSelective(@Param("record") CommodityInfo record, @Param("example") CommodityInfoExample example);

    int updateByExample(@Param("record") CommodityInfo record, @Param("example") CommodityInfoExample example);

    int updateByPrimaryKeySelective(CommodityInfo record);

    int updateByPrimaryKey(CommodityInfo record);
}