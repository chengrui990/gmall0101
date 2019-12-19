package com.crui.gmall.user.service;

import com.crui.gmall.user.bean.UmsMember;
import com.crui.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface MemberService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId);
}
