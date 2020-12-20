import java.util.Scanner;
import java.io.*;

class crc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter data bits");
        int m=sc.nextInt();
        int n=17;
        int g[]=new int[]{1,0,0,1,1,0,0,0,0,1,1,1,0,0,1,1,0};

        System.out.println("Enter data");
        int d[]=new int[m+n-1];

        for(int i=0;i<m;i++)
            d[i]=sc.nextInt();



        for(int i=0;i<n-1;i++)
            d[m+i]=0;

        int temp[]=new int[m+n-1];
        for (int y=0;y<m;y++)
            temp[y]=d[y];
        //division
        for(int i=0;i<m;i++) {
            if (d[i] == 1)
                for (int j = 0; j < n; j++)
                    d[i + j] ^= g[j];
        }
         //display

         for(int k=0;k<m;k++)
             d[k]=temp[k];
         for(int s=0;s<d.length;s++)
             System.out.println(d[s]);
         System.out.println("Enter received bits");
            int sd[]=new int[m+n];
            for(int ii=0;ii<d.length;ii++)
                sd[ii]=sc.nextInt();
            int count=0;
            for(int u=0;u<d.length;u++)
            {
                if(d[u]==sd[u])
                    count+=1;
                else
                    break;
            }
            if(count==n+m-1)
                System.out.println("No error");
            else
                System.out.println("Error");

        }

    }
