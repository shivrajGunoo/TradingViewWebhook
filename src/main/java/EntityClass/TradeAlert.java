package EntityClass;

public class TradeAlert {
	private String type;
	private String title;
	private Body body;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public static class Body {
		private String contract;
		private String price;
		private String type;
		private OpeningTrade openingTrade;
		private ClosingTrade closingTrade;
		private String marketPosition;
		private String quantityBought;

		public String getContract() {
			return contract;
		}

		public void setContract(String contract) {
			this.contract = contract;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public OpeningTrade getOpeningTrade() {
			return openingTrade;
		}

		public void setOpeningTrade(OpeningTrade openingTrade) {
			this.openingTrade = openingTrade;
		}

		public ClosingTrade getClosingTrade() {
			return closingTrade;
		}

		public void setClosingTrade(ClosingTrade closingTrade) {
			this.closingTrade = closingTrade;
		}

		public String getMarketPosition() {
			return marketPosition;
		}

		public void setMarketPosition(String marketPosition) {
			this.marketPosition = marketPosition;
		}

		public String getQuantityBought() {
			return quantityBought;
		}

		public void setQuantityBought(String quantityBought) {
			this.quantityBought = quantityBought;
		}
	}

	public static class OpeningTrade {
		private String price;
		private String quantityBought;
		private String orderId;

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getQuantityBought() {
			return quantityBought;
		}

		public void setQuantityBought(String quantityBought) {
			this.quantityBought = quantityBought;
		}

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
	}

	public static class ClosingTrade {
		private String price;
		private String quantityBought;
		private String orderId;

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getQuantityBought() {
			return quantityBought;
		}

		public void setQuantityBought(String quantityBought) {
			this.quantityBought = quantityBought;
		}

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
	}
}