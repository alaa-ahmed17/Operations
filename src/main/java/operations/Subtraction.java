package operations;

import java.util.LinkedList;

//class for subtract numbers
public class Subtraction  extends Operations  {
    public Subtraction(LinkedList<Float> numberValues) {
        super(numberValues); // Call the parent class constructor
    }
@Override
    public float calculate(){
        if (this.getTheNumbers().isEmpty()){
            return 0;
        }        result=2*this.getTheNumbers().get(0);
        for(float i : this.getTheNumbers()){
            result-=i;
        }
        return result;
    }

}
