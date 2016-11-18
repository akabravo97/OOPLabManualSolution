/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
class counter{
int vowel=0;
int words=0;
int lines=0;
int cha=0;
String s;
Scanner sc=new Scanner(System.in);
    void input(){
        System.out.print("Enter the string : ");
        s=sc.nextLine();
        
    }
    void display(){
        System.out.println(s);
    }
    void calculate(){
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              vowel++;
          }
          if(ch==' '){
              words++;
          }
          if(ch=='.'){
              lines++;
          }
          cha++;
      }
      System.out.println("Vowels : "+vowel);
      System.out.println("Words : "+words);
      System.out.println("Lines : "+lines);
      System.out.println("Character : "+cha);
    }
}
public class chvowolicounter {
    public static void main(String args[]){
    counter cunt=new counter();
    cunt.input();
    cunt.display();
    cunt.calculate();
    
}
}