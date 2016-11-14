package ro.vovinam.logic;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
public class CommonSettingsConfig {
    public static final String DEFAULT = "default";
    public static final String PRODUCTION = "production";
    public static final String INTEGRATION_TEST = "integration-test";

    @Configuration
    @Profile(PRODUCTION)
    @PropertySources({
            @PropertySource(value = "classpath:common-default.properties", ignoreResourceNotFound = true),
            @PropertySource(value = "classpath:storage.properties", ignoreResourceNotFound = true),
    })
    static class ProductionConfiguration{

    }

    @Configuration
    @Profile(DEFAULT)
    @PropertySources({
            @PropertySource(value = "classpath:storage.properties"),
            @PropertySource(value = "classpath:common-default.properties", ignoreResourceNotFound = true)
    })
    static class DefaultConfiguration {

    }

}
