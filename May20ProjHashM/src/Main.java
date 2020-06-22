
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Canada", "Ottawa");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Argentina", "Aries");

        System.out.println(capitalCities);

       for (String k: capitalCities.keySet()){
           System.out.println(k);
       }
        for (String v: capitalCities.values()){
            System.out.println(v);
        }
        for (String k: capitalCities.keySet()){
            System.out.println("Key:"+k+", value:" +capitalCities.get(k));
        }
        //Curiosity
        ArrayList<String> t = new ArrayList<>(capitalCities.keySet());
        Collections.sort(t);
        System.out.println(t);
        for (String k: t){
            System.out.println("key:"+k+",value:" +capitalCities.get(k));
        }


    }
}
