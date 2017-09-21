package webpipipi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "webpipipi")


public class MyBeanConfig {

	@Bean

	public MyBean mybean() {

		return new MyBean();

	}




}
