package cn.edu.glut.component.dao;

import cn.edu.glut.model.AdminRoleFunction;
import cn.edu.glut.model.AdminRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleFunctionMapper {
    int countByExample(AdminRoleFunctionExample example);

    int deleteByExample(AdminRoleFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoleFunction record);

    int insertSelective(AdminRoleFunction record);

    List<AdminRoleFunction> selectByExample(AdminRoleFunctionExample example);

    AdminRoleFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRoleFunction record, @Param("example") AdminRoleFunctionExample example);

    int updateByExample(@Param("record") AdminRoleFunction record, @Param("example") AdminRoleFunctionExample example);

    int updateByPrimaryKeySelective(AdminRoleFunction record);

    int updateByPrimaryKey(AdminRoleFunction record);
}