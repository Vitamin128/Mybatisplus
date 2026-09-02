package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper
        extends BaseMapper<User> {
    User SelectUserById(@Param("id") int id);
    List<User> SelectUserByStatus(String status);

}
