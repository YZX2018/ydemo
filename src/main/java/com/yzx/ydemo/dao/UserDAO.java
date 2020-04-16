package com.yzx.ydemo.dao;

import com.yzx.ydemo.bo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: yezhaoxin
 * @description: www.yezhaoxinjy.com
 * @since: 2020/4/16
 */
@Mapper
public interface UserDAO {
    User selectAll();
    User selectMap();
}
