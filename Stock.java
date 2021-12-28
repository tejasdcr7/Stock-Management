
public class Stock {

    public String companyName;
    public int noOfShare;
    public static double sharePrice;
    public int companyNo;


    public Stock(int companyNo, String name, int noOfShare, double sharePrice) {
        super();
        this.companyName = name;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
        this.companyNo = companyNo;
    }
    public static double getSharePrice() {
        return sharePrice;
    }

}


