/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
class search{
    String s;
    Scanner sc=new Scanner(System.in);
    void ip_op(){
    System.out.println("Enter the mother string : ");
     s=sc.nextLine();
    System.out.println("Your string:->");
    System.out.println(s);
}
    void srch(){
        int i=0;
        System.out.println("Enter the substring");
        String sr=sc.nextLine();
        i=s.indexOf(sr);
        if(i==0) System.out.println("Value not fount");
        else System.out.println("Value found at index : "+i);
        System.out.println("Do you want to replace? 1.Yes 2.No");
        int choice=sc.nextInt();
        if(choice==1){
           s=s.substring(0, i)+"hello"+s.substring(i+sr.length(),s.length());
           System.out.println(s);
        }
        else System.out.println("Sleep");
    }
}
public class searchstring {
    public static void main(String args[]){
    search sh=new search();
    sh.ip_op();
    sh.srch();
}
}
