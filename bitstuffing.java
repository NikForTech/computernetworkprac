import java.util.*;
public class bitstuffing{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("ente the string");
        String data = sc.nextLine();
         
        int count = 0;
        String s = "";
        for(int i=0;i<data.length();i++){
            char c = data.charAt(i);
            if(c=='1'){
                count++;
                if(count==5){
                    s = s+c+'0';

                    count =0;
                }

                else{
                    s=s+c;

                }
            }
            else{
                s = s+c;
            }
        }
        System.out.println("bitstuffig :" +s);
    }

}