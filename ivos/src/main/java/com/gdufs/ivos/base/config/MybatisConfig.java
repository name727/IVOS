
package com.gdufs.ivos.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.gdufs.ivos.*.mapper")
public class MybatisConfig {
}
