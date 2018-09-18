package cn.edu.glut.component.dao;

import cn.edu.glut.model.Myfruitseed;
import cn.edu.glut.model.MyfruitseedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyfruitseedMapper {
    int countByExample(MyfruitseedExample example);

    int deleteByExample(MyfruitseedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Myfruitseed record);

    int insertSelective(Myfruitseed record);

    List<Myfruitseed> selectByExample(MyfruitseedExample example);

    Myfruitseed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Myfruitseed record, @Param("example") MyfruitseedExample example);

    int updateByExample(@Param("record") Myfruitseed record, @Param("example") MyfruitseedExample example);

    int updateByPrimaryKeySelective(Myfruitseed record);

    int updateByPrimaryKey(Myfruitseed record);
}