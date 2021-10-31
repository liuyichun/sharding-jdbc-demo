package com.sharding.jdbc.demo;

import com.sharding.jdbc.demo.dao.DownLinkRecordDAO;
import com.sharding.jdbc.demo.entity.DownLinkRecord;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.concurrent.*;

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

    @Test
    public void test() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        final CountDownLatch countDownLatch = new CountDownLatch(1);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(60 * 1000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }
        });

        try {
            countDownLatch.await(59, TimeUnit.SECONDS);
            executorService.shutdown();

            if(countDownLatch.getCount()> 0){
                System.out.println("线程执行超时。。。");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
