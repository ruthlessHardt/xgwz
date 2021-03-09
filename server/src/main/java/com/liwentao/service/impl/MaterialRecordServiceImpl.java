package com.liwentao.service.impl;

import com.liwentao.entity.XgStorageRecord;
import com.liwentao.mapper.MaterialRecordMapper;
import com.liwentao.service.MaterialRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liwentao
 */
@Service
public class MaterialRecordServiceImpl implements MaterialRecordService {
    @Autowired
    private MaterialRecordMapper materialRecordMapper;
    @Override
    public List<XgStorageRecord> getMaterialRecord(XgStorageRecord xgStorageRecord) {
        return materialRecordMapper.getMaterialRecord(xgStorageRecord);
    }
}
