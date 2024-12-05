package operations;

import java.util.LinkedList;

//class for multiply numbers
public class Multiplication  extends Operations {
    public Multiplication(LinkedList<Float> numberValues) {
        super(numberValues); // Call the parent class constructor
    }
@Override
    public float calculate(){
            result =1;
            if (this.getTheNumbers().isEmpty()){
                return 0;
            }

            for(float i : this.getTheNumbers()){
                result*=i;
            }
            return result;
        }

    }

