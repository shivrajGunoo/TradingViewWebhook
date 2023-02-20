package EntityClass;

public class TradingViewAlertsEntity {

	private double close;
	private String time;
	private String plot_0;
	private String ticker;
	private String action;
	private double price;
	private String orderId;
	private String marketPosition;
	private double contracts;

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPlot_0() {
		return plot_0;
	}

	public void setPlot_0(String plot_0) {
		this.plot_0 = plot_0;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMarketPosition() {
		return marketPosition;
	}

	public void setMarketPosition(String marketPosition) {
		this.marketPosition = marketPosition;
	}

	public double getContracts() {
		return contracts;
	}

	public void setContracts(double contracts) {
		this.contracts = contracts;
	}

	// Add getter and setter methods for each field

}
