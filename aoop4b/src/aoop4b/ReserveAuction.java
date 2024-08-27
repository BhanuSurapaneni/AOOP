package aoop4b;

public class ReserveAuction extends AuctionTemplate {
    private Auction auction;

    public ReserveAuction(Auction auction) {
        this.auction = auction;
    }

    @Override
    protected void itemAvailable() {
        auction.itemAvailable();
    }

    @Override
    protected void biddingStart() {
        auction.startAuction();
    }

    @Override
    protected void biddingProcess() {
        // Simulate bidding process with reserve price
        System.out.println("Bidding in progress with a reserve price...");
    }

    @Override
    protected void biddingEnd() {
        auction.endAuction();
    }
}
