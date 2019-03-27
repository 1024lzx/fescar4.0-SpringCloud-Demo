package com.lzx.bserver.web;

import com.lzx.aserver.api.vo.UserVO;
import com.lzx.bserver.api.IBApi;
import com.lzx.bserver.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController implements IBApi {
    @Autowired
    private BService bService;

    @Override
    public String test(@RequestBody UserVO userVO) {
        bService.test(userVO);
        return "success";
    }
}
