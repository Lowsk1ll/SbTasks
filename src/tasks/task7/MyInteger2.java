package tasks.task7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MyInteger2 {
    int Number;

    public MyInteger2(int number) {
        Number = number;
    }

    public int getNumber() {
        return Number;
    }

    public static void main(String[] args) {
        ArrayList<MyInteger2> example = new ArrayList<>();
        example.add(new MyInteger2(1234));
        example.add(new MyInteger2(3333));
        example.add(new MyInteger2(4433));
        example.add(new MyInteger2(3341));
        example.sort(new MyComparator2());
        for (MyInteger2 number:example) {
            System.out.println(number.getNumber());
        }
    }
    public static int countDifferentNumber(int number){
        Set<Integer> digits = new  HashSet<>();
        while (!(number/10==0)){
            digits.add(number%10);
            number/=10;
        }
        digits.add(number);
        return digits.size();
    }
}
class MyComparator2 implements Comparator<MyInteger2> {

    @Override
    public int compare(MyInteger2 o1, MyInteger2 o2) {
        if(MyInteger2.countDifferentNumber(o1.getNumber())>MyInteger2.countDifferentNumber(o2.getNumber())){
            return 1;
        }
        if(MyInteger2.countDifferentNumber(o1.getNumber())<MyInteger2.countDifferentNumber(o2.getNumber())){
            return -1;
        }
        else return 0;
    }
}
