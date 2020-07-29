package cn.huanzi.qch.baseadmin.sys.sysuser.mapper;

import cn.huanzi.qch.baseadmin.common.pojo.Result;
import cn.huanzi.qch.baseadmin.sys.sysuser.pojo.SysUser;
import cn.huanzi.qch.baseadmin.sys.sysuser.vo.SysUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/7/29 14:23
 */

@Mapper
@Repository
public interface SysUserMapper {
    SysUser findByLoginName(String username);
}
