
import operations.Operations;
import operations.Subtraction;

import java.util.HashMap;
import java.util.LinkedList;

import static DataEntryWithCheck.NumberList.enterNumbers;
import static DataEntryWithCheck.NumberList.enterOperator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Operations> operationsMap = new HashMap<>();
        LinkedList<Float> Nums=new LinkedList<Float>();
        Nums=enterNumbers();
        Operations selectedOperation=enterOperator(operationsMap,Nums);
        float result=selectedOperation.calculate();
        System.out.println(result);
        Operations op=new Subtraction(Nums);

    }
}
