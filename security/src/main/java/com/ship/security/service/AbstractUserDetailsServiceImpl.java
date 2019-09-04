package com.ship.security.service;

import com.ship.security.constant.CacheConstants;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public abstract class AbstractUserDetailsServiceImpl implements UserDetailsService {

    /**
     * 用户密码登录
     * @param username 用户名
     */
    @Override
    @SneakyThrows
    @Cacheable(value = CacheConstants.USER_DETAILS, key = "#username", unless = "#result == null")
    public UserDetails loadUserByUsername(String username) {
        return getUserDetails(username);
    }


    public abstract UserDetails getUserDetails(String username);
}
