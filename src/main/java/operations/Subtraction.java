package operations;

import java.util.LinkedList;

//class for subtract numbers
public class Subtraction  extends Operations {
    public Subtraction(LinkedList<Float> numberValues) {
        super(numberValues); // Call the parent class constructor
    }
@Override
    public float calculate(){
        if (numberValues.isEmpty()){
            return 0;
        }        result=2*numberValues.get(0);
        for(float i : numberValues){
            result-=i;
        }
        return result;
    }
}
