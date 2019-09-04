package com.ship.security.annotation;

import com.ship.security.component.AbstractWebResponseExceptionTranslator;
import com.ship.security.component.ResourceServerAutoConfiguration;
import com.ship.security.component.SecurityBeanDefinitionRegistrar;
import com.ship.security.handler.AbstractAuthenticationFailureEvenHandler;
import com.ship.security.handler.AbstractAuthenticationSuccessEventHandler;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.lang.annotation.*;

/**
 * @see AbstractWebResponseExceptionTranslator 异常处理
 * @see AbstractAuthenticationFailureEvenHandler 认证失败处理
 * @see AbstractAuthenticationSuccessEventHandler 认证成功处理
 * 资源服务注解
 */
@Documented
@Inherited
@EnableResourceServer
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({ResourceServerAutoConfiguration.class, SecurityBeanDefinitionRegistrar.class})
public @interface EnableShipResourceServer {

}
