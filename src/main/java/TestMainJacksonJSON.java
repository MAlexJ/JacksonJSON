import java.io.IOException;

/**
 * Created by Alex on 05.05.2015.
 */
public class TestMainJacksonJSON {

    public static void main(String[] args) throws IOException {

        User user = new User(1, "User 1", "066-00-99-098", "UP");

        //add User to JSON
//        Converter.toJSON(user);


        // read User from JSON
//        User user_1 = Converter.toJavaObject();
//        System.out.println(user_1);
    }

}
