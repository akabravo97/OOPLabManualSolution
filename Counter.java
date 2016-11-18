/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class counterdemo extends Frame implements ActionListener{
    JTextField jtf;
    JFrame jf;
    int count=0;
    String s;
    counterdemo(){
        jtf=new JTextField();
        jf=new JFrame();
        jf.setSize(300,300);
        jtf.setBounds(125,25,100,30);
        JButton jb=new JButton("Count");
        jb.setBounds(140,155,70,50);
        jb.addActionListener(this);
        jf.add(jtf);
        jf.add(jb);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        count=count+6;
        //s.valueOf(count);
        jtf.setText(Integer.toString(count));
       
    }
}
public class Counter {
    public static void main(String args[]){
    counterdemo cd =new counterdemo();
}
}
