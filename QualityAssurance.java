/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.company;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class QualityAssurance extends JFrame implements ActionListener{
    
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel q1;
    private JRadioButton y1;
    private JRadioButton n1;
    private JLabel q2;
    private JRadioButton y2;
    private JRadioButton n2;
    private JLabel q3;
    private JRadioButton y3;
    private JRadioButton n3;
    private ButtonGroup gengp;
    private JLabel exp;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
 
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
 
    // constructor, to initialize the components
    // with default values.
    public QualityAssurance()
    {
        setTitle("Quality Assurance Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Quality Assurance Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(800, 30);
        title.setLocation(250, 20);
        c.add(title);
 
        name = new JLabel("Med.Name :");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(200, 20);
        name.setLocation(100, 80);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(220, 80);
        c.add(tname);
 
        q1 = new JLabel("Do your product dissolve in given ph in your body fluid? ");
        q1.setFont(new Font("Arial", Font.PLAIN, 20));
        q1.setSize(800, 20);
        q1.setLocation(100, 130);
        c.add(q1);
 
        y1 = new JRadioButton("YES");
        y1.setFont(new Font("Arial", Font.PLAIN, 15));
        y1.setSelected(true);
        y1.setSize(75, 20);
        y1.setLocation(200, 160);
        c.add(y1);
        
        n1 = new JRadioButton("NO");
        n1.setFont(new Font("Arial", Font.PLAIN, 15));
        n1.setSelected(true);
        n1.setSize(100, 20);
        n1.setLocation(300, 160);
        c.add(n1);
       
        q2 = new JLabel("Do your product disintegrate in the given fluid?");
        q2.setFont(new Font("Arial", Font.PLAIN, 20));
        q2.setSize(800, 20);
        q2.setLocation(100, 200);
        c.add(q2);
        
        y2 = new JRadioButton("YES");
        y2.setFont(new Font("Arial", Font.PLAIN, 15));
        y2.setSelected(true);
        y2.setSize(75, 20);
        y2.setLocation(200, 230);
        c.add(y2);
        
        n2 = new JRadioButton("NO");
        n2.setFont(new Font("Arial", Font.PLAIN, 15));
        n2.setSelected(true);
        n2.setSize(100, 20);
        n2.setLocation(300, 230);
        c.add(n2);
        
        y3 = new JRadioButton("YES");
        y3.setFont(new Font("Arial", Font.PLAIN, 15));
        y3.setSelected(true);
        y3.setSize(75, 20);
        y3.setLocation(200, 310);
        c.add(y3);
        
        n3 = new JRadioButton("NO");
        n3.setFont(new Font("Arial", Font.PLAIN, 15));
        n3.setSelected(true);
        n3.setSize(100, 20);
        n3.setLocation(300,310);
        c.add(n3);
        
        gengp = new ButtonGroup();
        gengp.add(y1);
        gengp.add(n1);
        
        gengp = new ButtonGroup();
        gengp.add(y2);
        gengp.add(n2);
        
        gengp = new ButtonGroup();
        gengp.add(y3);
        gengp.add(n3);
 
        q3 = new JLabel("Did your product test the durability of tablets?");
        q3.setFont(new Font("Arial", Font.PLAIN, 20));
        q3.setSize(800, 20);
        q3.setLocation(100, 270);
        c.add(q3);
        
        exp = new JLabel("Expiry");
        exp.setFont(new Font("Arial", Font.PLAIN, 20));
        exp.setSize(200, 20);
        exp.setLocation(100, 360);
        c.add(exp);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 360);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 360);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 360);
        c.add(year);
 
        term = new JCheckBox("Did this Approve from Quality Control Department");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(400, 20);
        term.setLocation(100, 400);
        c.add(term);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 440);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 440);
        reset.addActionListener(this);
        c.add(reset);
        
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(330, 250);
        tout.setLocation(530, 300);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(700, 25);
        res.setLocation(100,500);
        c.add(res);
 
//        resadd = new JTextArea();
//        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
//        resadd.setSize(250, 75);
//        resadd.setLocation(600, 200);
//        resadd.setLineWrap(true);
//        c.add(resadd);
        setVisible(true);
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1,data2,data3;
                String data = ("\n\tName : " + tname.getText() + "\n\n") ;
                if (y1.isSelected()){
                    data1 = "Ques 1 : YES" + "\n";
                    res.setText("Approved Successfully");
                }
                else{
                    data1 = "Ques 1 : NO" + "\n";
                    res.setText("Form Rejected");
                }
                if (y2.isSelected()){
                    data2 = "Ques 2 : YES" + "\n";
                    res.setText("Approved Successfully");
                }
                else{
                    data2 = "Ques 2 : NO" + "\n";
                    res.setText("Form Rejected");
                }
                if (y3.isSelected()){
                    data3 = "Ques 3 : YES" + "\n";
                    res.setText("Approved Successfully");
                }
                else{
                    data3 = "Ques 3 : NO" + "\n";
                    res.setText("Form Rejected");
                }
                String data4
                    = "Expiry : "
                      + (String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem()+ "/" + (String)year.getSelectedItem()+ "\t\n";
  
                tout.setText(data + data1 + data2 + data3 + data4);
                tout.setEditable(false); 
            }
            else {
                res.setText("Kindly First Approved this from Quality Control..");
                }
        }
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) throws Exception
    {
        QualityAssurance f = new QualityAssurance();
    }
}