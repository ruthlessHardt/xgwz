package com.liwentao.mapper;

import com.liwentao.entity.XgStorageRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liwentao
 */
@Mapper
@Repository
public interface MaterialRecordMapper {
    List<XgStorageRecord> getMaterialRecord(XgStorageRecord xgStorageRecord);
}
