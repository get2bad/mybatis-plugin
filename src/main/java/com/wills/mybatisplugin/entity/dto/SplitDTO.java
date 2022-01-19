package com.wills.mybatisplugin.entity.dto;

import lombok.Data;

/**
 * @ClassName SplitDTO
 * @Date 2022/1/19 15:57
 * @Author 王帅
 * @Version 1.0
 * @Description
 */
@Data
public class SplitDTO {

    private Integer page;

    private Integer pageSize;

    private Integer tenantId;
}
