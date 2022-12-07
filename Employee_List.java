/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.company;

/**
 *
 * @author Admin
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1BestCsharp
 */
public class Employee_List extends JFrame {
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JList jList;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldContactNo;
    private javax.swing.JTextField jTextFieldJoiningDate;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    
    /**
     * Creates new form Employee_List
     */
    public Employee_List() {
        super("Employee List"); // Title
        setSize(900, 500);
        setLocation(500, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        initComponents();
        ShowData();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldContactNo = new javax.swing.JTextField();
        jTextFieldJoiningDate = new javax.swing.JTextField();
        jTextFieldSalary = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        jlabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlabel1.setText("Employee name:");

        jlabel2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlabel2.setText("Contact No.:");

        jlabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlabel3.setText("Joining Date:");

        jlabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlabel4.setText("Salary :");
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        
        jScrollPane1.setViewportView(jTable1);

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    public void ShowData()
    {
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String[] cols = {"Employee Name","Contact No.","Joining Date","Salary"};
        String[][] data = { 
                            {"Haris Malik", "0332 6889129","18/3/2015","50,000"},
                            {"Bisma Shahid", "0331 3687687","15/2/2014","60,000"},
                            {"Aswad Rana", "0334 7374983","13/6/2015","50,000"},
                            {"Erum Sheikh", "0337 48798623","1/3/2012","70,000"},
                            {"Tayyab Ahmed", "0317 9847398","10/8/2018","45,00"},
                            {"Misbah Zulfiqar", "0318 4832609","1/1/2020","20,000"},
                            {"Romaisa Khan", "0313 4387658","12/5/2019","25,000"},
                            {"Hiba Arham", "0341 8726487","10/3/2021","15,000"},
                            {"Hira Aslam", "0321 4298798","18/4/2014","60,000"},
                            {"Kinza Salman", "0347 73298479","16/3/2017","40,000"}
                          };
        
        model.setDataVector(data, cols);
        
        
    }
    
      private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                          
       // get the model from the jtable
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

         // insert row to the model from jtextfields using addRow method
        model.addRow(new Object[]{jTextFieldName.getText(), jTextFieldContactNo.getText(),
                                  jTextFieldJoiningDate.getText(), jTextFieldSalary.getText()});

        
    }  
      
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {   
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           try{
           int SelectedRowIndex = jTable1.getSelectedRow();
           model.removeRow(SelectedRowIndex);
           }catch(Exception ex)
           {
               JOptionPane.showMessageDialog(null, ex);
           }                            
        
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_List().setVisible(true);
            }
        });
    }               
}

