import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap favouriteFruits = new HashMap();

//        no need to worry about order
//        nothing in a hashmap until you add stuff
//        MAY get a warning on compile "file uses unchecked/unsafe operations" as we haven't set the data type
//        this is very unusual in Java, but the default for a HashMap is <Object, Object> which allows everything
//        as everything in Java inherits from Object

        favouriteFruits.put("Robert", "Banana");
        favouriteFruits.put("Ross", "Apple");
        favouriteFruits.put("Colin", "Steak");

        System.out.println(favouriteFruits.get("Colin"));


//        setting data types gives extra security

        HashMap<String, String> favouriteMeats = new HashMap();

        favouriteMeats.put("Robert", "Banana");
        favouriteMeats.put("Ross", "Apple");
        favouriteMeats.put("Colin", "Steak");

        System.out.println(favouriteMeats.get("Ross"));

//        when you store something in a hashmap, it is stored as an object, not a primitive type

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Colin", 34);
        ages.put("Zsolt", 46);

        Integer colinAge = ages.get("Colin");

        String output = "Colin's age is " + colinAge.toString();

//        if you don't specify .toString(), if the left hand of a concatenation is a string then Java converts it for you
        System.out.println(output);

//        to change a value, just call .put(key, newvalue);
//        .size()
//        .clear()
//        .containsValue(value); - boolean
//        NB null is not falsy in java

    }


}
