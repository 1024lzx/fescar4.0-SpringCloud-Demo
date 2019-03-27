package com.lzx.bserver.objectmapper;

import com.lzx.bserver.api.vo.AccountVO;
import com.lzx.bserver.po.AccountPO;
import com.lzx.fescarinfrustructor.common.IVPMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class AccountObjectMapper {
    private final IMapper mapper;

    AccountObjectMapper(){
        mapper = Mappers.getMapper(IMapper.class);
    }

    @Mapper
    public interface IMapper extends IVPMapper<AccountVO,AccountPO>{}

    public AccountPO vo2po(AccountVO accountVO){
        return mapper.vo2po(accountVO);
    }

    public AccountVO po2vo(AccountPO accountPO){
        return mapper.po2vo(accountPO);
    }
}
