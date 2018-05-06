import java.util.Stack;

public class Program {

    public static void main (String[] args) {

        Stack <Integer> stack = new Stack<Integer>();

        Record record = new Record();

        for (int i = 1; i <= 5; i++) {

            record.addRecord(stack, i);

        }

        System.out.print("arr = " + stack + ", totalSum = ");
        System.out.println(record.sumRecord(stack));

        record.deleteRecord(stack);

        System.out.print("arr = " + stack + ", totalSum = ");
        System.out.println(record.sumRecord(stack));

    }

}
