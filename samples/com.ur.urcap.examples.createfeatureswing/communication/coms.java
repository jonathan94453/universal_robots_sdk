import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress; 

public class coms {

private final String IP; 
private final Int port; 


public coms(String IP, Int port) {
    this.IP = IP; 
    this.port = port; 
}



private String sendMessage(String message) {
    try {
        InetAddress address = InetAddress.getByName(IP)
        Socket s = new Socket(address, Port)
        OutputStream outputStream = s.getOutputStream() 
        PrintWriter writer = new PrintWriter(outputStream, true) 
        
        writer.println(message); 
        
    }
}
    



}
