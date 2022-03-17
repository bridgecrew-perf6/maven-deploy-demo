package rxcats.mavendeploydemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration(proxyBeanMethods = false)
public class MavenDeployConfig {

    @Bean
    public HelloProperties helloProperties() {
        return new HelloProperties("hello");
    }

}
