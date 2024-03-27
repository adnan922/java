import java.net.*;

public class InetAddressE{
    public static void main(String[] args) {
        try {
            // Get the InetAddress object for the specified host name
            InetAddress address = InetAddress.getByName("www.google.com");
            
            // Print the host name and IP address
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());
        } 
        catch (UnknownHostException e) {
            System.err.println("Unable to find address for specified host");
        }
    }
}
