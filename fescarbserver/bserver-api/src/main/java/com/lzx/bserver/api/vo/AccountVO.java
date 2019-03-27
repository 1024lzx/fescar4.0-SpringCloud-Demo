package com.lzx.bserver.api.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountVO implements Serializable {
    private static final long serialVersionUID = -6658025277636188164L;

    private Long id;
    private Long userId;
    private String name;
}
