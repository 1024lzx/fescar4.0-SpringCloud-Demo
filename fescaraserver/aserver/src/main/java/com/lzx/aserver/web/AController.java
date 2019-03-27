package com.lzx.aserver.web;

import com.lzx.aserver.api.IAApi;
import com.lzx.aserver.api.vo.UserVO;
import com.lzx.aserver.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AController implements IAApi {
    @Autowired
    private AService aService;

    @Override
    public String test(UserVO userVO) {
        return aService.test(userVO);
    }

    @Override
    public List<UserVO> getUserList(){
        return aService.getUserList();
    }
}
