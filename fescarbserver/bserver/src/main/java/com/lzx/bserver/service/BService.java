package com.lzx.bserver.service;

import com.lzx.aserver.api.vo.UserVO;
import com.lzx.bserver.api.vo.AccountVO;
import com.lzx.bserver.mapper.IAccountMapper;
import com.lzx.bserver.objectmapper.AccountObjectMapper;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BService {
    @Autowired
    private IAccountMapper accountMapper;
    @Autowired
    private AccountObjectMapper accountObjectMapper;

    public void test(UserVO userVO){
        AccountVO accountVO = new AccountVO();
        accountVO.setName(userVO.getName());
        accountVO.setUserId(userVO.getId());
        accountMapper.addAccount(accountObjectMapper.vo2po(accountVO));
        //throw new RuntimeException();
    }
}
