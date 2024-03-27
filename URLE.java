import java.net.*;

public class URLE{
    public static void main(String[] args) {
        try {
            // Create a URL object for the specified URL
            @SuppressWarnings("deprecation")
            URL url = new URL("https://www.google.com");
            
            // Print various components of the URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
        } catch (MalformedURLException e) {
            System.err.println("Invalid URL");
        }
    }
}
