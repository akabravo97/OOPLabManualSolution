/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import java.awt.*;  
import java.awt.event.*;  
  
public class TestClass extends Frame implements ActionListener{  
TextField tf;  
TestClass(){  
  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
  
b.addActionListener(this);  
  
add(b);add(tf);  
  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
  
}  
  
public void actionPerformed(ActionEvent e){  
tf.setText("Welcome");  
}  
  
public static void main(String args[]){  
new TestClass();  
}  
}  
