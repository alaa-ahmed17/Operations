package operations;

import java.util.LinkedList;

//class for add numbers
public class Addition  extends Operations {
    public Addition(LinkedList<Float> numberValues) {
        super(numberValues); // Call the parent class constructor
    }

    @Override
    public float calculate(){
// add all number that user will enter them
        for(float i : this.getTheNumbers()){
            result+=i;
        }
        return result;
    }

}
