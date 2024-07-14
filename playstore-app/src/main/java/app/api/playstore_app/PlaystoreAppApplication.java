package app.api.playstore_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PlaystoreAppApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(PlaystoreAppApplication.class, args);
	}

}
