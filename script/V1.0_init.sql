CREATE TABLE `smp_down_link_record` (
                                        `id` int(10) NOT NULL AUTO_INCREMENT,
                                        `merchant_id` int(10) NOT NULL,
                                        `mass_task_id` int(10) NOT NULL,
                                        `mass_task_name` varchar(128) NOT NULL,
                                        `phone` varchar(128) NOT NULL,
                                        `STATUS` tinyint(4) NOT NULL COMMENT '0. 待发送 1. 发送成功 2. 未知 3. 发送失败',
                                        `error_code` varchar(32) DEFAULT NULL COMMENT '错误码',
                                        `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE `smp_down_link_record_0` (
                                        `id` int(10) NOT NULL AUTO_INCREMENT,
                                        `merchant_id` int(10) NOT NULL,
                                        `mass_task_id` int(10) NOT NULL,
                                        `mass_task_name` varchar(128) NOT NULL,
                                        `phone` varchar(128) NOT NULL,
                                        `STATUS` tinyint(4) NOT NULL COMMENT '0. 待发送 1. 发送成功 2. 未知 3. 发送失败',
                                        `error_code` varchar(32) DEFAULT NULL COMMENT '错误码',
                                        `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE `smp_down_link_record_1` (
                                        `id` int(10) NOT NULL AUTO_INCREMENT,
                                        `merchant_id` int(10) NOT NULL,
                                        `mass_task_id` int(10) NOT NULL,
                                        `mass_task_name` varchar(128) NOT NULL,
                                        `phone` varchar(128) NOT NULL,
                                        `STATUS` tinyint(4) NOT NULL COMMENT '0. 待发送 1. 发送成功 2. 未知 3. 发送失败',
                                        `error_code` varchar(32) DEFAULT NULL COMMENT '错误码',
                                        `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;