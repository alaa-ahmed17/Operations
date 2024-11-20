
import operations.Operations;
import java.util.HashMap;
import java.util.LinkedList;

import static DataEntryWithCheck.NumberList.enterData;
import static DataEntryWithCheck.NumberList.enterOprator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Operations> operationsMap = new HashMap<>();
        LinkedList<Float> Nums=new LinkedList<Float>();
        Nums=enterData();
        Operations selectedOperation=enterOprator(operationsMap,Nums);
        float result=selectedOperation.calculate();
        System.out.println(result);
    }
}
