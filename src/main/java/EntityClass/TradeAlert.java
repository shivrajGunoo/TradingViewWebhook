package EntityClass;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class TradeAlert {
    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("time")
    private OffsetDateTime time;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("action")
    private String action;

    @JsonProperty("price")
    private double price;

    @JsonProperty("contracts")
    private double contracts;

    public TradeAlert() {}

    public TradeAlert(String orderId, String side, OffsetDateTime time, String symbol, String action, double price, double contracts) {
        this.orderId = orderId;
        this.side = side;
        this.time = time;
        this.symbol = symbol;
        this.action = action;
        this.price = price;
        this.contracts = contracts;
    }

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public OffsetDateTime getTime() {
		return time;
	}

	public void setTime(OffsetDateTime time) {
		this.time = time;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getContracts() {
		return contracts;
	}

	public void setContracts(double contracts) {
		this.contracts = contracts;
	}

    
}