package aoop4b;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> bidders = new ArrayList<>();
    private String item;

    public Auction(String item) {
        this.item = item;
    }

    @Override
    public void subscribe(Observer observer) {
        bidders.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        bidders.remove(observer);
    }

    @Override
    public void notifyObservers(AuctionEvent event, String message) {
        for (Observer bidder : bidders) {
            bidder.update(event, message);
        }
    }

    public void startAuction() {
        notifyObservers(AuctionEvent.BIDDING_START, "Bidding for " + item + " has started!");
    }

    public void endAuction() {
        notifyObservers(AuctionEvent.BIDDING_END, "Bidding for " + item + " has ended!");
    }

    public void itemAvailable() {
        notifyObservers(AuctionEvent.ITEM_AVAILABLE, item + " is now available for bidding!");
    }
}
