package cn.huanzi.qch.baseadmin.sys.syssetting.service;

import cn.huanzi.qch.baseadmin.common.service.*;
import cn.huanzi.qch.baseadmin.sys.syssetting.pojo.SysSetting;
import cn.huanzi.qch.baseadmin.sys.syssetting.vo.SysSettingVo;

import java.util.List;

public interface SysSettingService extends CommonService<SysSettingVo, SysSetting, String> {
    List<SysSettingVo> selectSysSetting();
}
