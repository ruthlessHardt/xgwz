package com.liwentao.service;

import com.liwentao.entity.XgStorageRecord;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liwentao
 */
@Component
public interface MaterialRecordService {
    List<XgStorageRecord> getMaterialRecord(XgStorageRecord xgStorageRecord);
}
