package com.crui.gmall.user.controller;

import com.crui.gmall.user.bean.UmsMember;
import com.crui.gmall.user.bean.UmsMemberReceiveAddress;
import com.crui.gmall.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Controller
@RequestMapping("/user")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello, user";
    }

    @RequestMapping("getAll")
    @ResponseBody
    public List<UmsMember> getAllMember(){
        return memberService.getAllUser();

    }

    @RequestMapping("getReceiveAddressById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestParam Integer memberId){

        return memberService.getReceiveAddressByMemberId(memberId);

    }
}
