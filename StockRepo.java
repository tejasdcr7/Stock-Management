import java.util.ArrayList;

public class StockRepo {

    public ArrayList<Stock> list;

    {
        list = new ArrayList<>();
        list.add(new Stock(1, "Dmart", 10, 100));
        list.add(new Stock(1, "Flipcart", 15, 110));
        list.add(new Stock(1, "Wallmart", 20, 150));
    }

    public boolean isCompanyAvailable(String companyName, int noOfShare) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).companyName.equals(companyName)) {
                if (noOfShare <= list.get(i).noOfShare) {
                    return true;
                }
            }
        return false;
    }

    void companyName() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).companyName);
        }
    }

}
