/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class PostgraduateStudentMain extends javax.swing.JFrame {

    /**
     * Creates new form PostgraduateStudentMain
     */
    public PostgraduateStudentMain() {
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

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        studentPersonal = new javax.swing.JButton();
        subjectDetails = new javax.swing.JButton();
        resultPersonal = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        back.setForeground(new java.awt.Color(40, 162, 226));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        studentPersonal.setBackground(new java.awt.Color(40, 162, 226));
        studentPersonal.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        studentPersonal.setForeground(new java.awt.Color(255, 255, 255));
        studentPersonal.setText("Student Personal Details");
        studentPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentPersonalActionPerformed(evt);
            }
        });

        subjectDetails.setBackground(new java.awt.Color(40, 162, 226));
        subjectDetails.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        subjectDetails.setForeground(new java.awt.Color(255, 255, 255));
        subjectDetails.setText("Subject Personal Details");
        subjectDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectDetailsActionPerformed(evt);
            }
        });

        resultPersonal.setBackground(new java.awt.Color(40, 162, 226));
        resultPersonal.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        resultPersonal.setForeground(new java.awt.Color(255, 255, 255));
        resultPersonal.setText("Result Personal Details");
        resultPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultPersonalActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(40, 162, 226));
        jButton1.setFont(new java.awt.Font("Lato", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Semester Fees Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentPersonal)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultPersonal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subjectDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(back)
                .addGap(51, 51, 51)
                .addComponent(studentPersonal)
                .addGap(27, 27, 27)
                .addComponent(subjectDetails)
                .addGap(28, 28, 28)
                .addComponent(resultPersonal)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.hide();
        StudentSelection student = new StudentSelection();
        student.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void studentPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPersonalActionPerformed
        this.hide();
        PostgraduateStudentDetails student = new PostgraduateStudentDetails();
        student.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_studentPersonalActionPerformed

    private void subjectDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectDetailsActionPerformed
        this.hide();
        PostgraduateSubjectDetails subject = new PostgraduateSubjectDetails();
        subject.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_subjectDetailsActionPerformed

    private void resultPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultPersonalActionPerformed
        this.hide();
        PostgraduateResultsMain result = new PostgraduateResultsMain();
        result.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_resultPersonalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        PostgraduateSemester us= new PostgraduateSemester();
        us.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PostgraduateStudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgraduateStudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgraduateStudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgraduateStudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgraduateStudentMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resultPersonal;
    private javax.swing.JButton studentPersonal;
    private javax.swing.JButton subjectDetails;
    // End of variables declaration//GEN-END:variables
}