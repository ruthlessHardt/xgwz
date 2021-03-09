package com.liwentao.controller.material;
import com.liwentao.entity.XgMaterialFrom;
import com.liwentao.entity.XgMaterialInfo;
import com.liwentao.entity.XgStorageRecord;
import com.liwentao.http.ResponseResult;
import com.liwentao.service.MaterialFromService;
import com.liwentao.service.MaterialInfoService;
import com.liwentao.service.MaterialRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liwentao
 * 入库操作
 *   -资料数据
 *   -来源数据
 *   -库存更新
 */
@CrossOrigin
@RestController
@RequestMapping("/materialIn")
public class MaterialInController {
    @Autowired
    private MaterialInfoService materialInfoService;
    @Autowired
    private MaterialFromService materialFromService;
    @Autowired
    private MaterialRecordService materialRecordService;

    @GetMapping("/materialRecord")
    public ResponseResult getMaterialRecord(XgStorageRecord xgStorageRecord){
        return ResponseResult.ok(materialRecordService.getMaterialRecord(xgStorageRecord));
    }

    @GetMapping("/checkInfo")
    public ResponseResult checkInfo(XgMaterialInfo xgMaterialInfo){
        XgMaterialInfo info = new XgMaterialInfo();
        info.setMaterialName(xgMaterialInfo.getMaterialName());
        /**
         * 判断库中有没有该物资资料
         * 没有就添加
         */
        List<XgMaterialInfo> infos = materialInfoService.getInfo(info);
        if(infos==null||infos.size()==0){
            Integer code = materialInfoService.addInfo(xgMaterialInfo);
            if(code==1){
                return ResponseResult.invalid_request().setMsg("资料添加成功");
            }else if(code==0){
                return ResponseResult.invalid_request().setMsg("资料添加失败,请稍后重试");
            }
        }
        return  ResponseResult.invalid_request().setMsg("资料库中已存在,请进行下一步");
    }

    @GetMapping("/materialFrom")
    public ResponseResult materialFrom(XgMaterialFrom xgMaterialFrom){
            Integer code = materialFromService.addFrom(xgMaterialFrom);
            if(code==1){
                return  ResponseResult.invalid_request().setMsg("添加来源成功");
            }else{
                return  ResponseResult.invalid_request().setMsg("添加来源失败,请稍后重试");
            }
    }


}
