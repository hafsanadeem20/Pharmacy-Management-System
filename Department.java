/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.company;

/**
 *
 * @author Admin
 */
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Department extends JFrame {
    
    
    
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldContactNo;
    private javax.swing.JTextField jTextFieldJoiningDate;
    private javax.swing.JTextField jTextFieldSalary;
    
    public Department() {
        super("Department Detail"); // Title
        setSize(900, 500);
        setLocation(500, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        
        JLabel welcome = new JLabel("Department Detail");
        welcome.setBounds(280, 20, 300, 60);
        welcome.setFont(new Font("Serif", Font.BOLD, 30));
        getContentPane().add(welcome);
        
        JLabel lab = new JLabel("HR Department : ");
        lab.setBounds(50, 70, 300, 60);
        lab.setFont(new Font("", Font.HANGING_BASELINE, 22));
        getContentPane().add(lab);
        
        JLabel name = new JLabel("Superisor : ");
        name.setBounds(90, 60,350,150);
        name.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(name);
        JLabel comp = new JLabel("Mr. Ahmed Sheikh ");
        comp.setBounds(200, 60,300,150);
        comp.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(comp);
        
        JLabel dep = new JLabel("Manufacturing Department : ");
        dep.setBounds(50, 150, 500, 60);
        dep.setFont(new Font("", Font.HANGING_BASELINE, 24));
        getContentPane().add(dep);
        
        JLabel md = new JLabel("Supervisor : ");
        md.setBounds(90, 140,150,150);
        md.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(md);
        
        JLabel fd = new JLabel("Mr. Haris Salma");
        fd.setBounds(200, 140,300,150);
        fd.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(fd);
        
        JLabel ab = new JLabel("Marketing Department : ");
        ab.setBounds(50, 210, 700, 100);
        ab.setFont(new Font("", Font.HANGING_BASELINE, 24));
        getContentPane().add(ab);
        
        JLabel add = new JLabel("Supervisor : ");
        add.setBounds(90, 250,300,100);
        add.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(add);
        
        JLabel ad = new JLabel("Mr. Shahid Aslam");
        ad.setBounds(200, 250,300,100);
        ad.setFont(new Font("Serif", Font.PLAIN, 20));
        getContentPane().add(ad);
 
    }
    
    public static void main(String[] args) { 
        Department frame = new Department();
        frame.setVisible(true);
    }
}
