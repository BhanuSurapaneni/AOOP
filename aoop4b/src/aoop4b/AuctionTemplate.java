package aoop4b;

public abstract class AuctionTemplate {
    public final void conductAuction() {
        itemAvailable();
        biddingStart();
        biddingProcess();
        biddingEnd();
    }

    protected abstract void itemAvailable();
    protected abstract void biddingStart();
    protected abstract void biddingProcess();
    protected abstract void biddingEnd();
}
