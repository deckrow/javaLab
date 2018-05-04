package lab1;

public class Functions {
    private int first;
    private int second;

    public Functions (int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int plus() {
        return first + second;
    }

    public int minus() {
        return first - second;
    }

    public int multiply () {
        return first * second;
    }

    public int divide () {
        return first / second;
    }
}
