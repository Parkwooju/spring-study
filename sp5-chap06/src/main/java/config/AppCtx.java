package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import spring.*;

@Configuration
public class AppCtx {

    @Bean
    @Scope("prototype")
    public Client client() {
        Client client = new Client();
        client.setHost("host");
        return client;
    }

    @Bean(destroyMethod = "close")
    @Scope("singleton")
    public Client2 client2() {
        Client2 client2 = new Client2();
        client2.setHost("host");
        client2.connect();
        return client2;
    }
}
