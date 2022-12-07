/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.company;

/**
 *
 * @author Admin
 */
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Company extends JFrame {
    
    
    
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldContactNo;
    private javax.swing.JTextField jTextFieldJoiningDate;
    private javax.swing.JTextField jTextFieldSalary;
    
    public Company() {
        super("Company Detail"); // Title
        setSize(900, 500);
        setLocation(500, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        
        JLabel welcome = new JLabel("Pharmaceutical Company");
        welcome.setBounds(280, 20, 300, 60);
        welcome.setFont(new Font("Serif", Font.BOLD, 24));
        getContentPane().add(welcome);
        
        JLabel name = new JLabel("Company : ");
        name.setBounds(50, 40,100,150);
        name.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(name);
        JLabel comp = new JLabel("HNRH Pharmaceutical Company ");
        comp.setBounds(150, 40,300,150);
        comp.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(comp);
        
        JLabel foun = new JLabel("Founder : ");
        foun.setBounds(50, 80,100,150);
        foun.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(foun);
        JLabel fd = new JLabel("Mr. Michel Fernandez");
        fd.setBounds(150, 80,300,150);
        fd.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(fd);
        
        JLabel add = new JLabel("Address : ");
        add.setBounds(50, 120,100,150);
        add.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(add);
        JLabel ad = new JLabel("Main Korangi Industrial Rd, Sector 27 Landhi Town, Karachi");
        ad.setBounds(150, 120,800,150);
        ad.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(ad);
        
        JLabel tel = new JLabel("Telephone : ");
        tel.setBounds(50, 160,100,150);
        tel.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(tel);
        JLabel t = new JLabel("(021)111 124 131");
        t.setBounds(150, 160,200,150);
        t.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(t);
        
        JLabel mail = new JLabel("E-mail : ");
        mail.setBounds(50, 200,100,150);
        mail.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(mail); 
        JLabel m = new JLabel("HNRH_pharma.235@gmail.com");
        m.setBounds(150, 200,400,150);
        m.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(m);  
    }
    
    public static void main(String[] args) { 
        Company frame = new Company();
        frame.setVisible(true);
    }    
}
