package EntityClass;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class TradeAlert {
    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("time")
    private LocalDateTime time;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("action")
    private String action;

    @JsonProperty("price")
    private double price;

    @JsonProperty("contracts")
    private double contracts;

    public TradeAlert() {}

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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
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
