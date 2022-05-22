import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

    public static void main(String[] args) throws IOException {

        Properties property = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\María\\workspaceQA\\TestNGTutorial\\src\\data.properties");
        property.load(fis);
        System.out.println(property.getProperty("browser"));
        System.out.println(property.getProperty("url"));
        property.setProperty("browser", "Firefox");
        System.out.println(property.getProperty("browser"));
        FileOutputStream fos = new FileOutputStream("C:\\Users\\María\\workspaceQA\\TestNGTutorial\\src\\data.properties");
        property.store(fos, null);
    }
}
