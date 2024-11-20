package operations;

import java.util.LinkedList;

//this is general for all operation
public abstract class Operations {
    LinkedList<Float> numberValues;
    float result=0;
    public  Operations(LinkedList<Float> numberValues){
        this.numberValues=numberValues;
    }
    //abstract must be implemented on subclasses
    public abstract float calculate();
}


