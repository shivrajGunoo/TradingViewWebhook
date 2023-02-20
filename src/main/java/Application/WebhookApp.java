package Application;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebhookApp {

    public static void main(String[] args) {
        String ipAddress = "192.168.8.103"; // Replace with your IP address
        SpringApplication app = new SpringApplication(WebhookApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.address", ipAddress));
        app.run(args);
    }

    @PostMapping("/TradingViewAlerts/alerts")
    public String receiveWebhook(@RequestBody String payload) {
        // Handle the payload here
        System.out.println("Received payload: " + payload);
        return "Webhook received";
    }
}