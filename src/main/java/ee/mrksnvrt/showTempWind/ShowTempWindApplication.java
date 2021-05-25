package ee.mrksnvrt.showTempWind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ShowTempWindApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowTempWindApplication.class, args);
	}

	@Bean
	public RestTemplate restTempale(){
		return new RestTemplate();
	}

}
