package Array;
import java.util.* ;
public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet();

        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(-3);
        set.add(5);

        System.out.println(set);
        System.out.println(set.contains(3));

    }
} 