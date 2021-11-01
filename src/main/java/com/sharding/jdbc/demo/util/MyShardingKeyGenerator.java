package com.sharding.jdbc.demo.util;

import lombok.Data;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;


@Data
public class MyShardingKeyGenerator implements ShardingKeyGenerator {

    private AtomicLong atomicLong = new AtomicLong(0);
    private Properties properties = new Properties();

    @Override
    public Comparable<?> generateKey() {
        // 单机版本的，分布式的可以用Redis自增等等
        return atomicLong.incrementAndGet();
    }

    @Override
    public String getType() {

        //声明类型
        return "MyAtomicLong";
    }

}
