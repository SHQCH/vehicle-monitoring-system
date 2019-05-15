
package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableBinding(Source.class)

public class FleetLocationIngestApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FleetLocationIngestApplication.class);
    }

}
