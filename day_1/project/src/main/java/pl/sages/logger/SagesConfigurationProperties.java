package pl.sages.logger;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("pl.sagesacademy")
@Getter
@Setter
class SagesConfigurationProperties {

    private String example;
    private String another;
}
