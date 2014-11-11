/**
 * Created by henryaj on 11/11/14.
 */
import static spark.Spark.*;
import spark.*;

public class HelloSpark {
    public static void main(String[] args) {
        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "hello!";
            }
        });
    }
}