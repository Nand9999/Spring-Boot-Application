package iocode.web.app.IocodeBookProjects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BookConfig {


@Bean
 public PlatformTransactionManager platformTransactionManager(){ 
    return new JtaTransactionManager();
}
}
