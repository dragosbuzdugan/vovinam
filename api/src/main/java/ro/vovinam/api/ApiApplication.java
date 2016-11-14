package ro.vovinam.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import ro.vovinam.logic.CommonSettingsConfig;
import ro.vovinam.logic.StorageConfig;

@SpringBootApplication
@PropertySource("classpath:api.properties")
@Import({CommonSettingsConfig.class, StorageConfig.class})
public class ApiApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
