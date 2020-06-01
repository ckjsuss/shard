package com.zyzh.jdbc.sharding.mapper;

import com.zyzh.jdbc.sharding.entry.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 保存
     */
    void save(User user);

    /**
     * 查询
     * @param id
     * @return
     */
    User get(Long id);
}
