import java.util.*;
import java.util.*;

public class parity{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the bits");
        String data = sc.nextLine();
        int count = 0;
       int bount =0;
        for(int i=0;i<data.length();i++){
            char c = data.charAt(i);
            if (c=='1'){
                count++;
            }
            else if(c=='0'){
                bount++;
            }
            else{
                System.out.println("invalid input");
            }

        }
        if(count%2==0&&bount%2==0 ){
            System.out.println("even PARITY");
        }
        else if(count%2==0&&bount%2!=0){
            System.out.println("evenparity");
        }
        else if (count%2!=0&&bount%2==0){
          System.out.println("odd parity");
       
        }
        else if(count%2!=0&&bount%2!=0){
            System.out.println("odd parity");
        }
        else{
            System.out.println("unable to found parity");
        }
    }
}