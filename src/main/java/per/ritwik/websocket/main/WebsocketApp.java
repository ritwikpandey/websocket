package per.ritwik.websocket.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"per.ritwik.websocket"})
public class WebsocketApp {

	public static void main(String args[]) {
		SpringApplication.run(WebsocketApp.class, args);
	}
}