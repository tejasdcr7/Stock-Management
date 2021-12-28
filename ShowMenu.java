
import java.util.Scanner;

public class ShowMenu {
Scanner scanner = new Scanner(System.in);

public void Menu(){
    StockRepo stockRepo = new StockRepo();
    StockService stockService = new StockService();

    while (true){

        System.out.println("Enter Choice\n 1.Buy Stock\n 2.Sell Stock\n 3.Print Stock\n 4.Exit");
        int choice= scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter how much money u want to invest ");
                int balance = scanner.nextInt();

                System.out.println("Enter which company share u want buy ");
                stockRepo.companyName();
                String companyName = scanner.next();

                System.out.println("How many share u want to buy");
                int noOfShares = scanner.nextInt();

                stockService.buy(companyName,noOfShares,balance);
                break;
            case 2:
                System.out.println("Enter which company share u want to sell ");
                stockRepo.companyName();
                String companyName1 = scanner.next();

                System.out.println("How many share u want to sell");
                int noOfShares1 = scanner.nextInt();

                //stockService.sell(companyName1,noOfShares1);
                break;
            case 3:


        }
    }
}


}
