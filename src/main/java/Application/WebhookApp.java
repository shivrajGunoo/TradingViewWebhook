package Application;

import java.util.Collections;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class WebhookApp {
	private static final Logger log = Logger.getLogger(WebhookApp.class.getName());

    public static void main(String[] args) {
    	String ipAddress = "155.133.23.59"; // Replace with your IP address
    	int port = 80; // Set the port number to 80
    	SpringApplication app = new SpringApplication(WebhookApp.class);
    	app.setDefaultProperties(Collections.singletonMap("server.address", ipAddress));
    	app.setDefaultProperties(Collections.singletonMap("server.port", port));
    	app.run(args);
    }

    @PostMapping("/TradingViewAlerts/alerts")
    public String receiveWebhook(@RequestBody String payload) {
        // Handle the payload here
    	System.out.println("Payload recevied");
    	System.out.println("Received payload: " + payload);
        return "Webhook received";
    }
}