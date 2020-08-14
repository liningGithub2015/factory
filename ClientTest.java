package factory_imp;

import java.util.HashMap;
import java.util.Map;

public class ClientTest {
    public static void main(String[] args) {
        ClientTest client = new ClientTest();
        Course english = client.factory("English","Tom",false);
        english.startHomework();
    }

    public static final Map<String, TriFunction<String, String, Boolean, Course>> factoryMap = new HashMap<>();

    static {
        factoryMap.put("Computer", Computer::new);
        factoryMap.put("English", English::new);
        factoryMap.put("MathCourse", MathCource::new);
    }


    public Course factory(String name, String teacher, boolean needCommputer) {
        return factoryMap.get(name).apply(name, teacher, needCommputer);
    }
}
