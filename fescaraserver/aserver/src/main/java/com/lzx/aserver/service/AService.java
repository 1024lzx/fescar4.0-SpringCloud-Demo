package com.lzx.aserver.service;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.github.pagehelper.PageHelper;
import com.lzx.aserver.api.vo.UserVO;
import com.lzx.aserver.feign.IBService;
import com.lzx.aserver.mapper.IUserMapper;
import com.lzx.aserver.objectmapper.UserObjectMapper;
import com.lzx.aserver.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AService {
    @Autowired
    private IBService bService;
    @Autowired
    private IUserMapper userMapper;
    @Autowired
    private UserObjectMapper userObjectMapper;


    @GlobalTransactional(timeoutMills = 300000, name = "fescar-test-tx")
    public String test(UserVO userVO){
        userVO.setId(userMapper.addUser(userObjectMapper.vo2po(userVO)));
        String result = bService.test(userVO);
        if("lzx".equals(userVO.getName())){
            throw new RuntimeException();
        }
        return result;
    }

    public List<UserVO> getUserList(){
        PageHelper.startPage(1,10);
        List<UserPO> userPOS = userMapper.getUserList();
        return userObjectMapper.pos2vos(userPOS);
    }
}
