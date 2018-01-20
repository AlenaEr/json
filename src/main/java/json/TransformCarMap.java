package json;

import java.util.Map;

public interface TransformCarMap {
    public String saveToConsol(Map<String, Object> carsMap);

    public String fromFile(String json);
}
