package aoop4b;

public class StandardAuction extends AuctionTemplate {
    private Auction auction;

    public StandardAuction(Auction auction) {
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
        // Simulate bidding process
        System.out.println("Bidding in progress...");
    }

    @Override
    protected void biddingEnd() {
        auction.endAuction();
    }
}
