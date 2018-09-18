package cn.edu.glut.component.dao;

import cn.edu.glut.model.UserGrant;
import cn.edu.glut.model.UserGrantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGrantMapper {
    int countByExample(UserGrantExample example);

    int deleteByExample(UserGrantExample example);

    int deleteByPrimaryKey(Integer userGrantId);

    int insert(UserGrant record);

    int insertSelective(UserGrant record);

    List<UserGrant> selectByExample(UserGrantExample example);

    UserGrant selectByPrimaryKey(Integer userGrantId);

    int updateByExampleSelective(@Param("record") UserGrant record, @Param("example") UserGrantExample example);

    int updateByExample(@Param("record") UserGrant record, @Param("example") UserGrantExample example);

    int updateByPrimaryKeySelective(UserGrant record);

    int updateByPrimaryKey(UserGrant record);
}