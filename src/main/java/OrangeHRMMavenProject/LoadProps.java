package OrangeHRMMavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProps {
    // creating an object of properties
    public static Properties props;
    // creating an object of fileinputstream
    public static FileInputStream inputStream;

    public String getProperty(String key){
        props = new Properties();
        try {
            inputStream = new FileInputStream("src\\test\\Resources\\TestData\\TestDataConfig.properties");
            props.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(key);
    }
}
