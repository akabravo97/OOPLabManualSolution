/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
class repeat{
    Scanner sc=new Scanner(System.in);
    String s;
    char ch1,ch2;
    void input(){
        System.out.print("Enter the string : ");
        s=sc.nextLine();
    }
    void display(){
        System.out.println("You have entered :->");
        System.out.println(s);
    }
    void delete(){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
            ch1=s.charAt(i);
            ch2=s.charAt(j);
            if(ch1==ch2){
                System.out.println("Duplicate found at : "+i+" and "+j);
                System.out.println("Deleting duplicate");
                s=s.substring(0, j)+s.substring(j+1, s.length());
                System.out.print("Final String : ");
                System.out.println(s);
            }
            
        }
    }
}
}

public class repchar {
    public static void main(String args[]){
        repeat r=new repeat();
        r.input();
        r.display();
        r.delete();
    }
}
