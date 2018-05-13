import java.util.Stack;

public class Program {

    public static void main (String[] args) {

        // first task
        Stack <Integer> stack = new Stack<Integer>();

        Record record = new Record();

        for (int i = 1; i <= 5; i++) {

            record.addRecord(stack, i);

        }

        System.out.print("arr = " + stack + ", totalSum = ");
        System.out.println(record.sumRecord(stack));

        record.deleteRecord(stack);

        System.out.print("arr = " + stack + ", totalSum = ");
        System.out.println(record.sumRecord(stack) + "\n");


        //second(personal) task
        Stack <Integer> stack1 = new Stack<Integer>();
        Stack <Integer> stack2 = new Stack<Integer>();

        Replace replace = new Replace();

        stack1.push(10);
        stack1.push(20);

        stack2.push(30);
        stack2.push(40);

        System.out.println("First stack before " + stack1);
        System.out.println("Second stack before " + stack2  + "\n");

        replace.replace(stack1, stack2);

        System.out.println("First stack after " + stack1);
        System.out.println("Second stack after " + stack2);

    }

}
