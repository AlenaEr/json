package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCar {
    public static void main(String[] args) {
        JSONObject root = new JSONObject();
        root.put("BMV X6", "black");
        root.put("MAZDA CX9", "red");
        System.out.println(root);
TransformCar transformCar = new TransformCarImpl();

List<Car>carList=new ArrayList<>();
for (int i=0;i<3;i++){
  Car car=new Car();
  car.setColor("color"+i);
  car.setModel("model"+i);
  car.setCost(i);
  carList.add(car);
}
String js=transformCar.sendToConsol(carList);
        System.out.println("js = "+js);
        System.out.println(transformCar.fromFile(js));
        List<Car> resCar = transformCar.fromFile(js);
        for(Car cr: resCar){
            System.out.println(cr);
        }
        System.out.println("------------------------------------------");
    // Gson objGson = new GsonBuilder().setPrettyPrinting().create();
    TransformCarMap transformCarMap = new TransformCarImplMap();
    Map<String, Object> carinfo2 = new HashMap<>();
        carinfo2.put("10101001",new

    Cars("BMV X6",100,"white"));
        carinfo2.put("20202002",new

    Cars("MAZDA CX9",100,"#005425676"));
    String json2 = transformCarMap.saveToConsol(carinfo2);
        transformCarMap.fromFile(json2);
        System.out.println("--------------to json--------------------------");
        System.out.println(transformCarMap.saveToConsol(carinfo2));
        System.out.println("--------------from json------------------------");
        System.out.println(transformCarMap.fromFile(json2));
}
}
