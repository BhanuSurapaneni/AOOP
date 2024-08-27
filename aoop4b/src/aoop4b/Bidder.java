package aoop4b;

public class Bidder implements Observer {
	private String name;

    public Bidder(String name) {
        this.name = name;
    }

	@Override
	public void update(AuctionEvent event, String message) {
		System.out.println(name + " received notification: " + event + " - " + message);
    }
}