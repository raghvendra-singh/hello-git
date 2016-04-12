import java.util.ArrayList;
import java.util.List;

/**
 * Created by raghvendra.s on 4/12/16.
 */
public class HelloWord implements TestInterface {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> mylist = new ArrayList<String>();
        mylist.add("First Entry");

    }
    public String getName() {
        return "Test";
    }
}
