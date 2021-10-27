package com.sharding.jdbc.demo.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sharding.jdbc.demo.entity.DownLinkRecord;
import com.sharding.jdbc.demo.mapper.DownLinkRecordMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DownLinkRecordDAO extends ServiceImpl<DownLinkRecordMapper, DownLinkRecord> {
}
