package com.crui.gmall.user.service.impl;

import com.crui.gmall.user.mapper.UserMapper;
import com.crui.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * VM Args:
 *
 * @author crui
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
