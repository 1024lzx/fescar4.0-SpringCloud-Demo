package com.lzx.bserver.mapper;

import com.lzx.bserver.po.AccountPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAccountMapper {
    Long addAccount(AccountPO accountPO);
}
