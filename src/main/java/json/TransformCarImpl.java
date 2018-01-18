package json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TransformCarImpl implements TransformCar {
    public String sendToConsol(List<Car> cars) {
        JSONObject root = new JSONObject();
        root.put("car", cars);
        return root.toString();
    }

    public List<Car> fromFile(String json) {
        JSONObject root = new JSONObject(json);
        JSONArray cars = root.getJSONArray("cars");
        List<Car> carsList = new ArrayList();
        for (int i=0;i<cars.length();i++){
            JSONObject ob=cars.getJSONObject(i);
            String model=ob.getString("model");
            String color = ob.getString("color");
            int cost=ob.getInt("cost");
            Car car=new Car();
            car.setModel(model);
            car.setColor(color);
            car.setCost(cost);
        }
        return carsList;
    }
}
