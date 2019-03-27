package com.lzx.aserver.api.vo;

import com.lzx.fescarinfrustructor.annotation.CodesafeModelAttribute;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@CodesafeModelAttribute
public class UserVO implements Serializable {
    private static final long serialVersionUID = -8717642657542950454L;

    private Long id;
    private String name;
    private Integer age;
}
