package configuration;

import greeters.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Greeter configureGreeter(){
        return new Greeter();
    }
}
