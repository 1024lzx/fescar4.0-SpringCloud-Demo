package com.lzx.aserver.objectmapper;

import com.lzx.aserver.api.vo.UserVO;
import com.lzx.aserver.po.UserPO;
import com.lzx.fescarinfrustructor.common.IVPMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserObjectMapper {
    private final IMapper mapper;
    @Mapper
    public interface IMapper extends IVPMapper<UserVO,UserPO> {}

    UserObjectMapper(){
        mapper = Mappers.getMapper(IMapper.class);
    }

    public UserVO po2vo(UserPO userPO){
        return mapper.po2vo(userPO);
    }

    public UserPO vo2po(UserVO userVO){
        return mapper.vo2po(userVO);
    }

    public List<UserVO> pos2vos(List<UserPO> userPOS){
        return mapper.pos2vos(userPOS);
    }
}
