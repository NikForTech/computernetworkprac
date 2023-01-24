import java.util.*;

public class lrc {
  public static void main(String [] args)
    {
        String s = " ";
        Scanner sc = new Scanner(System.in); 
     System.out.println("enter the bits");
     String fi = sc.nextLine();
     System.out.println("enter the second bit");
     String se = sc.nextLine();
     System.out.println("enter the third bit");
     String th  = sc.nextLine();
     System.out.println("enter bits are\n"+fi+"\n"+se+"\n"+th);
    int a1  = fi.charAt(0);
    int a2  = se.charAt(0);
    int a3  = th.charAt(0); 
    int a4 = a1+a2+a3;
    int b1  = fi.charAt(1);
    int b2  = se.charAt(1);
    int b3  = th.charAt(1); 
    int b4 = b1+b2+b3;
    int c1  = fi.charAt(2);
    int c2  = se.charAt(2);
    int c3  = th.charAt(2); 
    int c4 = c1+c2+c3;
    int d1  = fi.charAt(3);
    int d2  = se.charAt(3);
    int d3  = th.charAt(3); 
    int d4 = d1+d2+d3;
    int e1  = fi.charAt(4);
    int e2  = se.charAt(4);
    int e3  = th.charAt(4); 
    int e4 = e1+e2+e3;
    int f1  = fi.charAt(5);
    int f2  = se.charAt(5);
    int f3  = th.charAt(5); 
    int f4 = f1+f2+f3;
    int g1  = fi.charAt(6);
    int g2  = se.charAt(6);
    int g3  = th.charAt(6); 
    int g4 = g1+g2+g3;
    int h1  = fi.charAt(7);
    int h2  = se.charAt(7);
    int h3  = th.charAt(7); 
    int h4 = h1+h2+h3;
    if(a4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }
    if(b4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }
    if(c4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }
    if(d4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }
    if(e4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }
    if(f4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }
    if(g4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }
    if(h4%2==0){
        s = s+'0';
    }
    else{
        s=s+'1';
    }

    
    System.out.println("lrc bit are"+s);
    System.out.println("message :" +s+"|"+fi+"|"+se+"|"+th+"|");
    
}
}
