package com.sharding.jdbc.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("smp_down_link_record")
public class DownLinkRecord {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer merchantId;

    private Integer massTaskId;

    private String massTaskName;

    private String phone;

    private Integer status;

    private String errorCode;

    private Date createTime;
}
