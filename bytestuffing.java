import java.util.*;


public class bytestuffing {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("enter the string for bytestuffing");
        String data = sc.nextLine();
        String  res = "";
        for(int i = 0;i<data.length();i++){
            char c = data.charAt(i);
            if(c=='F'&&i!=0){
                res = res+'E'+c; 
            }
           else if(c=='E'){
                res = res+'E'+c;
            }
            else{
                res = res+c;
            }
        }
        System.out.println('F'+res+'F');
    }
}
