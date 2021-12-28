import java.util.ArrayList;
import java.util.List;

public class StockService {
    int result;
    //ArrayList<StockRepo> stocklist = new ArrayList<>();
    StockRepo stockRepo = new StockRepo();
    public void buy(String companyName, int noOfShare, int balance) {
        if (stockRepo.isCompanyAvailable(companyName, noOfShare)) ;
        double sharePrice = Stock.getSharePrice();
        double amount = sharePrice * noOfShare;


        if (amount <= balance) {
            result = (int) (balance - noOfShare * sharePrice);
            System.out.println("The Share price of " + companyName + " company is " + sharePrice + " rupees ");
            System.out.println("You buy " + noOfShare + " shares of " + companyName + " company & ur available balance is "
                    + result);
            String operation = "Buy";
        } else {
            System.out.println("you don't have sufficient balance");
        }
    }

    {
//        {
//            System.out.println("Stock is not Available");
//        }

    }

    public void sell(String companyName, int noOfShare, int balance) {
        {
            if (stockRepo.isCompanyAvailable(companyName, noOfShare)) {
                double sharePrice = Stock.getSharePrice();
                result = (int) (result + noOfShare * sharePrice);
                System.out.println("The Share price of " + companyName + " company is " + sharePrice + "rupees");
                System.out.println("You sell " + noOfShare + " shares of " + companyName + " company & ur balance is "
                        + result);
                String operation = "Sell";
            } else {
                System.out.println("Stock not Available");
            }

        }

    }
}


