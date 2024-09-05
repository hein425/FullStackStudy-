package org.jhi.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jhi.components")
// ㄴ 괄호 안의 디렉토리를 읽어서 객체 DI(조립) 해라
// @Component 해주는거만 챙겨옴
public class MyConf2 {
}
