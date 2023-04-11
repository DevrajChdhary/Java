import java.io.*;

public class FriendlyPair{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter 2 numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum1 = 0;
        for(int i=1; i<=a; i++){
            if(a%i==0)
                sum1+=i;
        }
        int sum2 = 0;
        for(int i=1; i<=b; i++){
            if(b%i==0)
                sum2+=i;
        }
        float firstr = (float)sum1/a;
        float seconr = (float)sum2/b;
        if(firstr == seconr)
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
}

