package in.ies.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties
@EnableConfigurationProperties
@Data
@Component
public class AppProperties {
}
