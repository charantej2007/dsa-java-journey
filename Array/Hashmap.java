package Array;
import java.util.*;

public class Hashmap{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap();
        map.put(1,204);
        map.put(2,247);
        map.put(3,205);
        map.put(4,221);

        System.out.println(map.get(1));

        if (map.containsKey(2)){
            System.out.println("Key : 2 is found \nAnd it's value is "+map.get(2));
        }
        else{
            System.out.println("Key NOT Found");
        }
    }
}