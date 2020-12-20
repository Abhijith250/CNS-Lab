import java.util.*;
import java.io.*;
import java.math.*;


class rsa {
    BigInteger p,q,e,d,phi,n;
    String msg,emsg="",dmsg="";

    public  rsa() throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter mssg to encrypt");
        msg=br.readLine();
       System.out.println("Enter P value");
        p=new BigInteger(br.readLine());
        System.out.println("Enter Q value");
        q=new BigInteger(br.readLine());
        n=p.multiply(q);
        phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        System.out.println("Enter Public Key value");
        e=new BigInteger(br.readLine());


        d=e.modInverse(phi);
        System.out.println("Public key is"+e);
        System.out.println("Private key is"+d);
    }
    void encrypt(){
        for(int i=0;i<msg.length();i++){
            BigInteger m=BigInteger.valueOf((int) msg.charAt(i));
            BigInteger c=m.modPow(e,n);
            emsg+=(char)c.intValue();
        }
    }
    void decrypt(){
        for(int i=0;i<msg.length();i++){
            BigInteger m=BigInteger.valueOf((int) emsg.charAt(i));
            BigInteger c=m.modPow(d,n);
            dmsg+=(char) c.intValue();
        }
    }
    void show(){
        System.out.println("Original msg"+msg);
        System.out.println("decrypted msg"+ dmsg);
        System.out.println("Encrypted msg"+ emsg);
    }
    public static void main(String[] args) throws Exception{
        rsa obj=new rsa();
        obj.encrypt();
        obj.decrypt();
        obj.show();

        ;


    }


}
