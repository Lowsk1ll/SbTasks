package tasks.task7;

import java.math.BigInteger;
import java.util.*;

public class MyInteger {

    int number;

    public MyInteger(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        ArrayList<MyInteger> example = new ArrayList<>();
        example.add(new MyInteger(138));
        example.add(new MyInteger(6));
        example.add(new MyInteger(2));
        example.add(new MyInteger(66));
        example.sort(new MyComparator());
        for (MyInteger number:example) {
            System.out.println(number.getNumber());
        }
    }

    public static int countSimpleNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (0 == (n % i))
                if(BigInteger.valueOf(i).isProbablePrime(64)){
                    count++;
                }
        }
        return count;
    }
}
class MyComparator implements Comparator<MyInteger>{

    @Override
    public int compare(MyInteger o1, MyInteger o2) {
        if(MyInteger.countSimpleNumbers(o1.getNumber())>MyInteger.countSimpleNumbers(o2.getNumber())){
            return 1;
        }
        if(MyInteger.countSimpleNumbers(o1.getNumber())<MyInteger.countSimpleNumbers(o2.getNumber())){
            return -1;
        }
        else return 0;
    }
}