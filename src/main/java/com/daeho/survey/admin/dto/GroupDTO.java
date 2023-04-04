package com.daeho.survey.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class GroupDTO {

    @ApiModelProperty(example = "", notes = "idx")
    private Integer idx;

    @ApiModelProperty(example = "개발팀", notes = "그룹명", required = true)
    private String group_name;

    @ApiModelProperty(example = "2023-04-20", notes = "시작날짜", required = true)
    private String start_date;

    @ApiModelProperty(example = "2023-04-28", notes = "종료날짜", required = true)
    private String end_date;

    @ApiModelProperty(hidden = true)
    private String createdate;

    @ApiModelProperty(hidden = true)
    private String updatedate;

}
