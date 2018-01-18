package json;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainCar {
    public static void main(String[] args) {
        JSONObject root = new JSONObject();
        Map<String, String> carinfo = new HashMap<>();
        carinfo.put("BMV X6","black");
        carinfo.put("MAZDA CX9","red");
        root.put(String.valueOf(carinfo),2000);
        System.out.println(root);

        System.out.println("--------------------JsonByMap------------------");


    }
}
