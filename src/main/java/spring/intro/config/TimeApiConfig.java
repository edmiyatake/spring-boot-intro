package spring.intro.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "api")
public class TimeApiConfig {
    private String endpoint;
    private String continent;

    public String getEndpoint() {
        return endpoint;
    }

    public String getContinent() {
        return continent;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
