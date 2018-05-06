import java.util.Stack;
import java.util.function.BinaryOperator;

public class Record implements iRecord {

    Record () {  }

    @Override
    public void deleteRecord(Stack <Integer> stack) {

        stack.pop();

    }

    @Override
    public int sumRecord(Stack<Integer> stack) {

        int sum = 0;
        BinaryOperator <Integer> operation = (x, y) -> x + y;

        for (int el : stack) {

            sum = operation.apply(el, sum);

        }

        return sum;

    }
}
