package Application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;
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
	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static Date date = new Date();
	
    public static void main(String[] args) {
    	
    	df.setTimeZone(TimeZone.getTimeZone("GMT+4"));
    	
    	String ipAddress = "155.133.23.59"; // Replace with your IP address
    	int port = 80; // Set the port number to 80
    	SpringApplication app = new SpringApplication(WebhookApp.class);
    	app.setDefaultProperties(Collections.singletonMap("server.address", ipAddress));
    	app.setDefaultProperties(Collections.singletonMap("server.port", port));
    	app.run(args);
    }

    @PostMapping("/TradingViewAlerts/alerts")
    public String receiveWebhook(@RequestBody String payload) {

    	log.info("\n");
    	log.info("Time: " + df.format(date));
    	log.info("Received payload: " + payload);
        return "Webhook received";
    }
}