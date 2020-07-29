package cn.huanzi.qch.baseadmin.sys.sysusermenu.mapper;

import cn.huanzi.qch.baseadmin.sys.sysusermenu.pojo.SysUserMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/7/29 17:09
 */
@Repository
@Mapper
public interface SysUserMenuMapper {
    List<SysUserMenu> findByUserId(String userId);
}
