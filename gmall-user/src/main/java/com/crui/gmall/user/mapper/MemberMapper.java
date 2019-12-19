package com.crui.gmall.user.mapper;

import com.crui.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Component
public interface MemberMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
