package com.lzx.aserver.api;

import com.lzx.aserver.api.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/a")
public interface IAApi {
    @GetMapping
    String test(@ModelAttribute UserVO userVO);

    @GetMapping("/list")
    List<UserVO> getUserList();
}
