package com.baoge.service;

import com.baoge.entity.Account;

public interface AccountService {
    public Account findByUsername(String username);
}
