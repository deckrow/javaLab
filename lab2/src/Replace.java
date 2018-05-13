import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;

public class Replace {

    Replace () {  }

    public void replace (Stack <Integer> stack1, Stack <Integer> stack2)  {

        Iterator<Integer> i = stack1.iterator();
        Iterator<Integer> i2 = stack2.iterator();

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        while(i.hasNext()) {
            list.add(i.next());
        }

        while(i2.hasNext()) {
            list2.add(i2.next());
        }

        stack1.clear();

        for(int j = 0; j < list2.size(); j++) {
            stack1.push(list2.get(j));
        }

        stack2.clear();

        for(int j = 0; j < list.size(); j++) {
            stack2.push(list.get(j));
        }

    }

}
