package com.crui.gmall.user.service.impl;

import com.crui.gmall.user.bean.UmsMember;
import com.crui.gmall.user.bean.UmsMemberReceiveAddress;
import com.crui.gmall.user.mapper.MemberMapper;
import com.crui.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.crui.gmall.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = memberMapper.selectAll();
//        return userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("memberId", memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddressList;
    }
}
