package Chapter_12_Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args){
        // We can use these looping through collections all 3 set, list and queue
           setDemo();
//         listDemo();
//         queueDemo();
           mapDemo();
    }

     public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//        System.out.println(fruit.size()); // size = 4
//        System.out.println(fruit); // [banana, orange, apple, lemon]

        // First approach to loop through Collections - Since Set has Unordered items, Iterator() is used to loop through the items
         var i = fruit.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        // Second approach to loop through Collections - For loop is used to print items
       for (String item: fruit){
            System.out.println(item);
        }

        // Second approach to loop through Collections - Foreach loop is used to print items
        fruit.forEach(System.out::println);
    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

//        System.out.println(fruitCalories.size()); // size = 4
//        System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=17}
//
//        System.out.println(fruitCalories.get("lemon")); // 17 - Prints the current value - Overwrites with the current value
//        System.out.println(fruitCalories.entrySet()); // [banana=105, orange=45, apple=95, lemon=17]
//
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories); // {banana=105, apple=95, lemon=17}

        // First approach using enhanced For loop in Map
        for (var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        // Second approach using forEach loop in Map
        fruitCalories.forEach(
                (key, value) -> System.out.println("Fruit: " + key + ", Calories: " + value));
    }
}
