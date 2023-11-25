package springboot.autoconfig.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

public class MyAutoConfigurationTest {

    private final ApplicationContextRunner contextRunner =
            new ApplicationContextRunner().withConfiguration(AutoConfigurations.of(MyAutoConfiguration.class));

    @Test
    void testCase() {
        this.contextRunner
                .withPropertyValues("my-starter-properties.test-property=42")
                .run((context) -> {
                    MyClientStarterProperties myClientStarterProperties = context.getBean(MyClientStarterProperties.class);
                    System.out.println(1);
                });
    }

}
