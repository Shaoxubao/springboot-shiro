package com.baoge.service.impl;

import com.baoge.entity.Account;
import com.baoge.mapper.AccountMapper;
import com.baoge.service.AccountService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findByUsername(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", username);
        return accountMapper.selectOne(wrapper);
    }
}
