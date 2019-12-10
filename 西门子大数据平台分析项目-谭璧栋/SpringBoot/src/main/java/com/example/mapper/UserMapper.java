package com.example.mapper;

import com.example.entity.User;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Mapper:映射
 * 
 * @Repository:它用于将数据访问层 (DAO 层 ),实现 的自动扫描功能..
 */

@Repository
public interface UserMapper {
//对应xml，service  User：类当做List类型
	public List<User> Sel();
}