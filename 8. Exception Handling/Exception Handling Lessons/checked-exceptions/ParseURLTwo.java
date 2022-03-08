import java.net.MalformedURLException;
import java.net.URL;

public class ParseURLTwo {
    public static void main(String[] args) {
        try {  //Java forces you to try-catch checked exceptions 
            parseURL("https://www.google.com/images");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void parseURL(String link) throws MalformedURLException {
            URL url = new URL(link);
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
    }    
}
