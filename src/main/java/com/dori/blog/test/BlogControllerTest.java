package com.dori.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
스프링이 com.dori.blog 하위 패키지를 스캔하여 프로그램 실행에 필요한 객체를 스프링 컨테이너(메모리)에 싱글톤으로 생성해줌.
특정 어노테이션이 붙은 클래스 파일들만 컨테이너에 생성
 => IoC(제어의 역전) : 내가 new~~ 해서 객체를 생성하는 것이 아닌 스프링이 객체를 생성하고 관리함.
*/
@RestController
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello() {
        return "<h1>hello spring boot</h1>";
    }
}
