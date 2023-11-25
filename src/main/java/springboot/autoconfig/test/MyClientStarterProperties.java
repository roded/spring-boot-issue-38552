package springboot.autoconfig.test;

import jakarta.validation.constraints.Positive;
import org.jetbrains.annotations.Nullable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "my-starter-properties")
public class MyClientStarterProperties {

    private final @Positive @Nullable Integer testProperty;

    public MyClientStarterProperties(@Nullable Integer testProperty) {
        this.testProperty = testProperty;
    }

    public @Nullable Integer getTestProperty() {
        return testProperty;
    }

}
