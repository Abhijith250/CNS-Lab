import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class serverupd {
    public static void main(String[] args) throws Exception {
        byte[] senddata = new byte[1024];
        byte[] recvdata = new byte[1024];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket serversocket = new DatagramSocket(9874);
        while (true) {
            DatagramPacket recv = new DatagramPacket(recvdata, recvdata.length);
            serversocket.receive(recv);
            String msg = new String(recv.getData());
            InetAddress Ip = recv.getAddress();
            int port = recv.getPort();
            System.out.println("Enter mssg to send");
            String caps = br.readLine();
            recvdata = caps.getBytes();
            DatagramPacket sen = new DatagramPacket(recvdata, recvdata.length, Ip, port);
            serversocket.send(sen);
        }
    }
}