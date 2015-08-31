
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class UDPClient
{
public static void main(String args[])
{
try{
String strDate;
DatagramSocket ds=new DatagramSocket(5555);
byte rdata[]=new byte[64];
DatagramPacket packate=new DatagramPacket(rdata,rdata.length);
while(true)
{
ds.receive(packate);
strDate=new String(packate.getData());
System.out.println("server date and time is :"+strDate);
}
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}

