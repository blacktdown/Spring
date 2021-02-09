package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * ��¥ : 2021/02/09
 * �̸� : ���ؿ�
 * ���� : DI ������̼��� �̿��� ������ Ioc �ǽ�
 * 
 * ������̼� ����
 *  - @Component
 *   - ������ �����̳ʰ� �ش� ������̼��� ������ Ŭ������ ����, ��� ����
 *   - @Controller, @Service, @Repository�� ����ȭ
 *  - @Autowired
 *   - ��������(��ü)�� ��ü�� �����ϴ� ������̼�
 *   - ������ ���� ������̼�
 *  - @inject
 *   - ��������(��ü)�� ��ü�� �����ϴ� ������̼�
 *   - �ڹ� ���� ������̼�
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
