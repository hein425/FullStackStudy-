package org.jhi;
// 컴포넌트 스캔
// 새클래스 적을때마다 새 객체를 스프링 통에 적어야되는거 귀찮고 너무많음
// 그걸 해결하기 위한게 컴포넌트 스캔

// 어노테이션은 여러개가 잇음 @콘피그레이션 @빈
// 겟빈함수 쓰면 ioc컨테이너 안에 객체 가져오기

import org.jhi.conf.MyConf;
import org.jhi.conf.MyConf2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

// @componentScan 이 등장
public class Ex01 {

    public static void main(String[] args) {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MyConf2.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);


    }
}
