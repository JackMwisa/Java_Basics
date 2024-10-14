package Day20;

import java.util.Map;
import java.util.HashMap;

public class MapsExamples {
    public static void main(String[] args) {
        //Creating a map using a HashMAp

        Map<String, String> currency = new HashMap<>();

        //insert element to the Map
        currency.put("USD", "Dollar");
        currency.put("UGX", "Ugandan Shillings");
        //currency.put();

        //accessing keys of the Map
        System.out.println("Keys of the Map: " + currency.keySet());
        System.out.println("Values of Map: " + currency.values());

        //EnumMap



    }
}
