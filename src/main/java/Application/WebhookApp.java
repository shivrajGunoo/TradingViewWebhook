package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import EntityClass.TradeAlert;


@SpringBootApplication
@RestController
public class WebhookApp {
	
	private static final Logger log = Logger.getLogger(WebhookApp.class.getName());
	private static TradeAlert tradeAlert = new TradeAlert();
	private Gson gson;
	private static ArrayList<TradeAlert> trades  = new ArrayList<>();
	private static String marketPositionIndicator = null;
	
    public static void main(String[] args) {
    	String ipAddress = "192.168.100.36"; // Replace with your IP address
    	int port = 8080; // Set the port number to 80
    	SpringApplication app = new SpringApplication(WebhookApp.class);
    	app.setDefaultProperties(Collections.singletonMap("server.address", ipAddress));
    	app.setDefaultProperties(Collections.singletonMap("server.port", port));
    	app.run(args);
    }

    @RequestMapping(path = "/TradingViewAlerts/alerts", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE, produces = "text/plain")
    public String receiveWebhook(@RequestBody String payload) {
        // Handle the payload here
    	//System.out.println("Payload recevied");
    	//System.out.println("Received payload: " + payload);
    	
    	gson = new Gson();
    	System.out.println(payload);
        TradeAlert tradeAlert = gson.fromJson(payload, TradeAlert.class);
        checkAlert(tradeAlert);
        System.out.println(tradeAlert.getContracts());
        
        return "Webhook received";
    }
    
    // The function parameter should change to an object of Trade
    public static void checkAlert(TradeAlert order) {
    	
    	if(marketPositionIndicator == null) {
    		marketPositionIndicator = order.getOrderId().substring(0,1);
    	}
    	
    	if(order.getOrderId().substring(0,1).equals("L") || order.getOrderId().substring(0,1).equals("S") ) {
    		// Check if there is a change in the direction
    		if(marketPositionIndicator.equals(order.getOrderId().substring(0,1))) {
    			//Open new Trade 
    			openTrade(order);
    			
    			// Add new trade in list of trades
    			trades.add(order);
    			
    		}
    		else {
    			// Change in Direction of market changing the Market Position Indicator
    			marketPositionIndicator = order.getOrderId().substring(0,1);
    					
    			// Close All corresponding trade as there is a change in direction of market
    			for(TradeAlert trade: trades) {
    				// Close Trade
    				closeTrade(order);
    			}
    			
    			// Clear list of trade as this is the first Trade in opposite direction
    			trades.clear();
    			    			
    			// Add new order as first element in the Trade list
    			trades.add(order);
    			
//    			// Remove Trade From existing Active Trade List
//    			trades.remove(0);

    			// Open new Trade
    			openTrade(order);
    			
    		}
    	}
    	else {
    		// Close Trade - Take profit recevided (TP)
    		closeTrade(order);
    		
    		// Remove in Trade list in order of entry
    		trades.remove(0);
    	}
    }
    
    public static void closeTrade(TradeAlert trade) {
    	log.info("Closing: " + trade.getOrderId());
    }
    
    public static void openTrade(TradeAlert trade) {
    	log.info("Opening: " + trade.getOrderId());
    }
    
}