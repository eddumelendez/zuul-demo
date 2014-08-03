package net.eddumelendez.zuul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-zuul-config.xml" })
public class ZuulConfigTest {

	@Value("${myproperty}")
	private String myProperty;

	@Test
	public void testZuul() {
		System.out.println(myProperty);
	}

}
