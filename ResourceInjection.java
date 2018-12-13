
import java.io.File;
import java.util.ArrayList;

public class ResourceInjection {
    public static void main(String args[]) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add(args[0]);
        File f1 = new File(a1.get(0));
    }
}
