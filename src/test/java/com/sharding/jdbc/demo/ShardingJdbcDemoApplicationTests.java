package com.sharding.jdbc.demo;

import com.sharding.jdbc.demo.dao.DownLinkRecordDAO;
import com.sharding.jdbc.demo.entity.DownLinkRecord;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Resource
    private DownLinkRecordDAO downLinkRecordDAO;

    @Test
    void contextLoads() {
        DownLinkRecord downLinkRecord = new DownLinkRecord();
        downLinkRecord.setMassTaskId(1);
        downLinkRecord.setMerchantId(5);
        downLinkRecord.setMassTaskName("测试任务");
        downLinkRecord.setPhone("askdaodasdaskdfsdfodsuo");
        downLinkRecord.setErrorCode("");
        downLinkRecord.setStatus(1);
        downLinkRecordDAO.save(downLinkRecord);
    }

}
