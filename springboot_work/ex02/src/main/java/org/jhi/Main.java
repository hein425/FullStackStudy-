package org.jhi;

import org.jhi.components.AA;
import org.jhi.conf.MyConf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //객체를 하나 가지고 메모리 낭비가 줄어든다
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConf.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));


        AA aa1 = applicationContext.getBean(AA.class);
        AA aa2 = applicationContext.getBean(AA.class);

        AA aa3 = new AA();
        AA aa4 = new AA();

        System.out.println("aa1 = " + aa1);
        System.out.println("aa2 = " + aa2);
        System.out.println("aa3 = " + aa3);
        System.out.println("aa4 = " + aa4);

        aa1.setName("스프링통안에 있는 객체");

        System.out.println();
        System.out.println("aa1 = " + aa1);
        System.out.println("aa2 = " + aa2);
        System.out.println("aa3 = " + aa3);
        System.out.println("aa4 = " + aa4);
    }
}

// 객체 담는 통이 Spring IOC

// @콘피그레이션: IOC 컨테이너 생성 객체 정의
// @빈: ioc 컨테이너 안에 객체 넣기
// 겟 빈 함수: ioc 컨테이너 안에 객체 가져오기

// @컴포넌트 스캔 (디렉토리 지정)
// @컴포넌트 어노테이션을 읽어서 ioc 컨테이너 생성
// @Controller @ REst컨트롤로
// @service @repository : DI 객체주입

//@오토위어드: 자동으로 가져오기 (맣ㄴ이씀)
//프라이빗 파이널 변수선언 @리콰이어Args컨스트럭터: 자동으로 가져오기 (권장함)