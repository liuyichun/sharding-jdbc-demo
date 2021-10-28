CREATE TABLE `smp_down_link_record` (
                                        `id` int(10) NOT NULL AUTO_INCREMENT,
                                        `merchant_id` int(10) not NULL COMMENT '商户ID',
                                        `mass_task_id` int(10) not NULL COMMENT '任务ID',
                                        `mass_task_name` varchar(128) not NULL '任务名称',
                                        `phone` varchar(128) not NULL '手机号码',
                                        `STATUS` TINYINT not NULL COMMENT '0. 待发送 1. 发送成功 2. 未知 3. 发送失败',
                                        `error_code` varchar(32) COMMENT '错误码',
                                        `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;