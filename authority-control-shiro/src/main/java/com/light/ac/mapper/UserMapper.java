package com.light.ac.mapper;

import com.light.ac.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;
@Repository
public interface UserMapper extends Mapper<User>{

	User getUserByUserName(String userName);

	void deleteBatchByIds(@Param("ids") String[] idsStr);

	void deleteUserRoleByUserId(int userId);

	void saveUserRole(@Param("list") List<Map<String, Integer>> params);

}
