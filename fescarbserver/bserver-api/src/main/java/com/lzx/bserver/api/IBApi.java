package com.lzx.bserver.api;

import com.lzx.aserver.api.vo.UserVO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/b")
public interface IBApi {
    @PostMapping
    String test(@RequestBody UserVO userVO);
}
