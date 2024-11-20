package operations;

import java.util.LinkedList;

//class for add numbers
public class Addition  extends Operations {
    public Addition(LinkedList<Float> numberValues) {
        super(numberValues); // Call the parent class constructor
    }

    @Override
    public float calculate(){

        for(float i : numberValues){
            result+=i;
        }
        return result;
    }

}
