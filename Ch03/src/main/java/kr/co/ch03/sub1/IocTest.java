package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 날짜 : 2021/02/09
 * 이름 : 박준우
 * 내용 : DI 어노테이션을 이용한 스프링 Ioc 실습
 * 
 * 어노테이션 종류
 *  - @Component
 *   - 스프링 컨테이너가 해당 어노테이션을 선언한 클래스를 생성, 등록 관리
 *   - @Controller, @Service, @Repository로 세분화
 *  - @Autowired
 *   - 참조변수(객체)에 객체를 주입하는 어노테이션
 *   - 스프링 전용 어노테이션
 *  - @inject
 *   - 참조변수(객체)에 객체를 주입하는 어노테이션
 *   - 자바 전용 어노테이션
 */
public class IocTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		Tv lgTv = (Tv) ctx.getBean("lgTv");
		Tv samsungTv = (Tv) ctx.getBean("samsungTv");
		
		lgTv.power();
		lgTv.chUp();
		lgTv.soundUp();
		
		samsungTv.power();
		samsungTv.chDown();
		samsungTv.soundDown();
	}

}
