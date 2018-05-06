import java.util.Stack;

public interface iRecord {

    default void addRecord (Stack <Integer> stack, int n) {

        stack.add(n);

    }

    void deleteRecord (Stack <Integer> stack);

    int sumRecord (Stack <Integer> stack);

}
