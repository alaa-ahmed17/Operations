package operations;

import java.util.LinkedList;

//class for divide numbers
public class Division extends Operations {
    public Division(LinkedList<Float> numberValues) {
        super(numberValues); // Call the parent class constructor
    }

    @Override
    public float calculate() {
        if (this.getTheNumbers().isEmpty()) throw new ArithmeticException("Cannot divide an empty set of numbers.");
        if (this.getTheNumbers().size()==1) throw new ArithmeticException("Cannot make operation on one number");

        result = this.getTheNumbers().getFirst(); // Start with the first number

        for (Float i : this.getTheNumbers()) {
            if (i == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            result /= i;
        }

        return result;
    }
}
