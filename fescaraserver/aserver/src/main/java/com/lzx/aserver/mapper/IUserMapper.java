package com.lzx.aserver.mapper;

import com.lzx.aserver.api.vo.UserVO;
import com.lzx.aserver.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {
    Long addUser(UserPO userPO);
    List<UserPO> getUserList();
}
