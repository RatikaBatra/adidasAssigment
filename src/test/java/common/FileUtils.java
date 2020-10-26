package common;

import javax.xml.bind.Binder;
import java.io.*;
import java.util.Properties;

public class FileUtils {

    public static Properties prop=null;

    /*static {
        try{
            prop=readFromPropertyFile("web");
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/

    public static String getValueFromProperty(String fileName, String propName) throws Exception {
        return readFromPropertyFile(fileName).getProperty(propName);
    }

    private static Properties readFromPropertyFile(String propID) throws Exception {
        Properties prop=new Properties();
        InputStream file= null;
        if(propID.equalsIgnoreCase("web"))
            file=new FileInputStream(getFEDetailsFile());
        else
            file=new FileInputStream(getBEDetailsFile());
        prop.load(file);
        file.close();
        return prop;
    }

    private static File getBEDetailsFile() {
        File file=new File(System.getProperty("user.dir")+"/src/test/resources/config/apiDetails.properties");
        return file;
    }

    private static File getFEDetailsFile() {
        File file=new File(System.getProperty("user.dir")+"/src/test/resources/config/webDetails.properties");
        return file;
    }

}
