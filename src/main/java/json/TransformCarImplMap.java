package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransformCarImplMap implements TransformCarMap {
    @Override
    public String saveToConsol(Map<String, Object> carsMap) {
        //JSONObject root = new JSONObject();
        Gson objGson = new GsonBuilder().setPrettyPrinting().create();
        // root.put("cars", carsMap);
        // return root.toString();

        return objGson.toJson(carsMap);
    }

    @Override
    public String fromFile(String json) {
        //   JSONObject root = new JSONObject();
        Gson objGson = new GsonBuilder().setPrettyPrinting().create();
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            car.setColor("color" + i);
            car.setModel("model" + i);
            car.setCost(i);
            carList.add(car);
        }
        Map<String, Object> carsMap = new HashMap<>();
        carsMap.put("1", carList);
        json = objGson.toJson(carsMap).toString();
        //   carsMap.put("name", carsMap);

//        jsonToMap.forEach((k, v) ->
//                System.out.println(k + "=" + v));
        return carsMap.toString();
    }
}
