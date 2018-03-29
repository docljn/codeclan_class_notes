import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class HashMapTask {

    public static void main(String[] args) {
        HashMap<String, Integer> populations = new HashMap<>();

        populations.put("UK", 64100000);
        populations.put("Germany", 80620000);
        populations.put("France", 66030000);
        populations.put("Japan", 127300000);
        populations.replace("UK", 21);
//        .replace will replace the value for a given key (won't add if the key isn't there already).

        Integer ukPop = populations.get("UK");
        String ukPopOutput = "The population of the UK is " + ukPop.toString() + ".";
        System.out.println(ukPopOutput);

        Collection<Integer> allPopulations = populations.values();

        for (Integer population: allPopulations){
            System.out.println(population.toString());
        }
        System.out.println(populations.values().toString());

    }
}

/*
Create a HashMap of keys and values for the populations of some countries.
Here is some sample data (don't forget to think about the types of your keys and values!):
UK: 64,100,000
Germany: 80,620,000
France: 66,030,000
Japan: 127,300,000
Output some values from the HashMap using .get(key) and system.out.println().
Investigate the use of the .values() and .keySet() methods on HashMap.
*/
