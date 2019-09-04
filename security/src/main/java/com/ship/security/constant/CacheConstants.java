package com.ship.security.constant;

import static com.ship.security.constant.SecurityConstants.OAUTH_PREFIX;
import static com.ship.security.constant.SecurityConstants.PROJECT_PREFIX;

public interface CacheConstants {

    /**
     * oauth 客户端信息
     */
    String CLIENT_DETAILS_KEY = PROJECT_PREFIX + OAUTH_PREFIX + "client:details";

    /**
     * oauth 客户端信息
     */
    String USER_DETAILS = "user_details";

}
