/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProfileManager;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author ayushighia
 */
public class CreateProfileJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    public CreateProfileJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        
        this.userProcessContainer= userProcessContainer;
        this.personDirectory = personDirectory;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btbBack = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        lblFirstNmae = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        HtxtStreetAddress = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        HtxtUnitNo = new javax.swing.JTextField();
        HtxtPhoneNo = new javax.swing.JTextField();
        HtxtState = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        HtxtCity = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        HtxtZip = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        WtxtStreetAddress1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        WtxtUnitNo1 = new javax.swing.JTextField();
        WtxtPhoneNo1 = new javax.swing.JTextField();
        WtxtState1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        WtxtCity2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        WtxtZip = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        btbBack.setText(">>> BACK");
        btbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbBackActionPerformed(evt);
            }
        });

        lblFirstNmae.setText("First Name ");

        lblLastName.setText("Last Name ");

        lblAge.setText("Age");

        lblGender.setText("Gender ");

        lblEmail.setText("Email");

        txtSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnActionPerformed(evt);
            }
        });

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("SSN");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Work Address\n"));

        jLabel26.setText("Street Address");

        jLabel28.setText("Unit no");

        jLabel29.setText("State");

        jLabel30.setText("Phone");

        HtxtUnitNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HtxtUnitNojTextField9ActionPerformed(evt);
            }
        });

        HtxtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HtxtPhoneNojTextField6ActionPerformed(evt);
            }
        });

        HtxtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HtxtStatejTextField8ActionPerformed(evt);
            }
        });

        jLabel31.setText("City");

        jLabel32.setText("Zip");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HtxtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HtxtUnitNo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HtxtState)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(HtxtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(HtxtCity)
                            .addComponent(HtxtZip))))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HtxtPhoneNo, HtxtStreetAddress, HtxtUnitNo});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HtxtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HtxtUnitNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(HtxtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HtxtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(HtxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(HtxtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Work Address\n"));

        jLabel33.setText("Street Address");

        jLabel35.setText("Unit no");

        jLabel36.setText("State");

        jLabel37.setText("Phone");

        WtxtUnitNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WtxtUnitNo1jTextField9ActionPerformed(evt);
            }
        });

        WtxtPhoneNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WtxtPhoneNo1jTextField6ActionPerformed(evt);
            }
        });

        WtxtState1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WtxtState1jTextField8ActionPerformed(evt);
            }
        });

        jLabel38.setText("City");

        jLabel39.setText("Zip");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(210, 210, 210))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WtxtStreetAddress1)
                            .addComponent(WtxtState1)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(WtxtPhoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(WtxtCity2)
                            .addComponent(WtxtZip)
                            .addComponent(WtxtUnitNo1))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WtxtStreetAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WtxtUnitNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(WtxtPhoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WtxtState1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(WtxtCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(WtxtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLastName)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFirstNmae)
                                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btbBack)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstNmae, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
        
                                           
    }//GEN-LAST:event_btbBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int balance;
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        int Ssn= Integer.parseInt(txtSsn.getText());
        double age = Double.parseDouble(txtAge.getText());
        String gender = txtGender.getText();
        String email= txtEmail.getText();
        String hStreet = HtxtStreetAddress.getText();
        String hUnitNum = HtxtUnitNo.getText();
        String hCity = HtxtCity.getText();
        String hState = HtxtState.getText();
        Long hZipCode = Long.parseLong(HtxtZip.getText());
        double hphone = Double.parseDouble(HtxtPhoneNo.getText());
        String wStreet = WtxtStreetAddress1.getText();
        String wUnitNo = WtxtUnitNo1.getText();
        double wPhone  = Double.parseDouble(WtxtPhoneNo1.getText());
        String wCity = WtxtCity2.getText();
        String WState = WtxtState1.getText();
        long wZipCode = Long.parseLong(WtxtZip.getText());
        
        
        
        
 

        if (firstName.isBlank() || lastName.isBlank() || age.isBlank() || gender.isBlank() ||  email.isBlank() || homeAddress.isBlank() || workAddress.isBlank() )
            {
                JOptionPane.showMessageDialog(this,"All fields are mandatory.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            
        
    
            }
        Person person = personDirectory.addPerson();
        Address address = personDirectory.addPerson();

        person.setFirstName(firstName);
        person.setLastName(lastName);    
        person.setAge(age);                   
        person.setGender(gender);   
        person.setEmail(email);
        
        

        JOptionPane.showMessageDialog(this, "Account Succesfullly Created", "Information", JOptionPane.INFORMATION_MESSAGE);

        txtFirstName.setText("");
        txtSsn.setText("");
        txtAge.setText("");
        txtGender.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void HtxtUnitNojTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HtxtUnitNojTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HtxtUnitNojTextField9ActionPerformed

    private void HtxtPhoneNojTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HtxtPhoneNojTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HtxtPhoneNojTextField6ActionPerformed

    private void HtxtStatejTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HtxtStatejTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HtxtStatejTextField8ActionPerformed

    private void WtxtUnitNo1jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WtxtUnitNo1jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WtxtUnitNo1jTextField9ActionPerformed

    private void WtxtPhoneNo1jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WtxtPhoneNo1jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WtxtPhoneNo1jTextField6ActionPerformed

    private void WtxtState1jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WtxtState1jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WtxtState1jTextField8ActionPerformed

    private void txtSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HtxtCity;
    private javax.swing.JTextField HtxtPhoneNo;
    private javax.swing.JTextField HtxtState;
    private javax.swing.JTextField HtxtStreetAddress;
    private javax.swing.JTextField HtxtUnitNo;
    private javax.swing.JTextField HtxtZip;
    private javax.swing.JTextField WtxtCity2;
    private javax.swing.JTextField WtxtPhoneNo1;
    private javax.swing.JTextField WtxtState1;
    private javax.swing.JTextField WtxtStreetAddress1;
    private javax.swing.JTextField WtxtUnitNo1;
    private javax.swing.JTextField WtxtZip;
    private javax.swing.JButton btbBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstNmae;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSsn;
    // End of variables declaration//GEN-END:variables

}
