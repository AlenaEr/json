package json;

import java.util.List;

public interface TransformCar {
    public String sendToConsol(List<Car> cars);

    public List<Car> fromFile(String json);
}
