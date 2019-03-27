package com.lzx.aserver.feign;

import com.lzx.bserver.api.IBApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("fescar-bserver")
public interface IBService extends IBApi {
}
