//UDPClient.java
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
//UDPServer.java
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
public class UDPServer
{
public static void main(String args[])
{
try
{
Date date;
String strDate;
DatagramSocket ds=new DatagramSocket(4444);
int i=0;
while(true)
{
date=new Date();
strDate=date.toString();
byte dbyte[]=strDate.getBytes();
InetAddress address=InetAddress.getByName("localhost");
DatagramPacket packate=new DatagramPacket(dbyte,dbyte.length,address,5555);
ds.send(packate);
System.out.println((++i)+"packate sent");
Thread.sleep(1000);
}
}

