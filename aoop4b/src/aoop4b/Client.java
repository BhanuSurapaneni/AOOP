package aoop4b;

public class Client {
    public static void main(String[] args) {
        // Create auction
        Auction auction = new Auction("Antique Vase");

        // Create bidders
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        // Subscribe bidders
        auction.subscribe(bidder1);
        auction.subscribe(bidder2);

        // Conduct a standard auction
        AuctionTemplate standardAuction = new StandardAuction(auction);
        standardAuction.conductAuction();

        // Conduct a reserve auction
        AuctionTemplate reserveAuction = new ReserveAuction(auction);
        reserveAuction.conductAuction();
    }
}
