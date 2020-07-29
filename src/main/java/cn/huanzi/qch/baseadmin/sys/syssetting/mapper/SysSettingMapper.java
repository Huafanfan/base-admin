package cn.huanzi.qch.baseadmin.sys.syssetting.mapper;

import cn.huanzi.qch.baseadmin.sys.syssetting.vo.SysSettingVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/7/28 16:35
 */
@Mapper
@Repository
public interface SysSettingMapper {
    List<SysSettingVo> selectSysSetting();
}
