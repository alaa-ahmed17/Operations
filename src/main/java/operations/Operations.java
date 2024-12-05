package operations;

import java.util.LinkedList;

//this is general for all operation
public abstract class Operations {
    private LinkedList<Float> numberValues;
    float result=0;
    public  Operations(LinkedList<Float> numberValues){
        setTheNumbers(numberValues);
    }
    //abstract must be implemented on subclasses
    public abstract float calculate();

    public  void setTheNumbers(LinkedList<Float> numberValues) {
        this.numberValues = numberValues;
    }
    public  LinkedList<Float> getTheNumbers() {
        return numberValues;
    }
}


