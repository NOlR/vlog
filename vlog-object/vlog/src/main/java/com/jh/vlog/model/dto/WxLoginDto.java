package com.jh.vlog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName WxLoginDto
 * @Description TODO
 * @Author apple
 * @Date 2020/12/8
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WxLoginDto {
    private String wxOpenId;
    private String nickname;
    private Integer gender;
    private String avatar;
}