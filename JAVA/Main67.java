package JAVA;

import java.util.HashMap;
import java.util.Scanner;

public class Main67{
    public static void main(String[] args){

        // HashMap = A data structure that stores key-value pairs.
        //           Keys are unique but Values can be duplicated.
        //           Does not maintain any order, but is memory efficient.
        //           HashMap<Key, Value>

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("banana", 0.75);
        map.put("orange", 0.75);
        map.put("coconut", 1.00);

        System.out.println(map);

        // map.remove("apple");

        // System.out.println(map.get("coconut")); => prints the Value
        // System.out.println(map.containsKey("pineapple"));

        // if (map.containsKey(("apple"))){
        //     System.out.println(map.get("apple"));
        // }
        // else{
        //     System.out.println("Key not found");  
        // }

        // System.out.println(map.containsValue(1.00));
        // System.out.println(map.size());

        // for (String key : map.keySet()){
        //     System.out.println(key + " : $" + map.get(key));
        // }

        scanner.close();
    }
}