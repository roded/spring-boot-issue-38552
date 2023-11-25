package springboot.autoconfig.test;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@AutoConfiguration
@EnableConfigurationProperties(MyClientStarterProperties.class)
public class MyAutoConfiguration {

}
