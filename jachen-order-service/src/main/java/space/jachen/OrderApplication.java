package space.jachen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ${end}
 *
 * @author JaChen
 * @date ${DATE} ${TIME}
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }

    /**
     * 远程调用
     * @return RestTemplate对象
     */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}