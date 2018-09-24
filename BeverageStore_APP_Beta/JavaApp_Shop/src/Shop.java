
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FH
 */
public class Shop extends javax.swing.JFrame {

    static String MemberID = "";

    /**
     * Creates new form Shop
     */
    public Shop() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        BlackTea = new javax.swing.JRadioButton();
        GreenTea = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        size = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sugar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        num = new javax.swing.JSpinner();
        onChecked = new javax.swing.JButton();
        onBacked = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        show = new javax.swing.JTextArea();
        onPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabel1.setText("飲品:");

        buttonGroup1.add(BlackTea);
        BlackTea.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        BlackTea.setSelected(true);
        BlackTea.setText("紅茶");

        buttonGroup1.add(GreenTea);
        GreenTea.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        GreenTea.setText("綠茶");

        jLabel2.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabel2.setText("杯量:");

        size.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "大杯", "中杯", "小杯" }));

        jLabel3.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabel3.setText("甜度:");

        sugar.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        sugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "全糖", "少糖", "半糖", "微糖", "無糖", " " }));

        jLabel4.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabel4.setText("杯數:");

        num.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        num.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        onChecked.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        onChecked.setText("確定");
        onChecked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCheckedActionPerformed(evt);
            }
        });

        onBacked.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        onBacked.setText("返回");
        onBacked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBackedActionPerformed(evt);
            }
        });

        show.setColumns(20);
        show.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        show.setRows(5);
        show.setWrapStyleWord(true);
        jScrollPane1.setViewportView(show);

        onPrint.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        onPrint.setText("列印");
        onPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(onChecked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(onBacked))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(num))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(sugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(BlackTea)
                        .addGap(18, 18, 18)
                        .addComponent(GreenTea))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BlackTea)
                    .addComponent(GreenTea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onChecked)
                    .addComponent(onBacked)
                    .addComponent(onPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onCheckedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCheckedActionPerformed
        // TODO add your handling code here:
        ///確定寫入資料庫

        String type = "";
        String sizes = "";
        String sugars = "";
        int cup_number = 0;

        if (BlackTea.isSelected()) {
            type = "紅茶";
        }
        if (GreenTea.isSelected()) {
            type = "綠茶";
        }
        sizes = (String) size.getSelectedItem();
        sugars = (String) sugar.getSelectedItem();
        cup_number = (int) num.getValue();
        show.setText(type + "," + sizes + "," + sugars + "," + cup_number + "杯。");

        /////
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root", passwd = "Your Database Password";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwd);
            if (con != null && !con.isClosed()) {
                Statement st = con.createStatement();
                String s = "INSERT INTO shop(id,type,size,sugar,num) VALUES(?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(s);
                ps.setString(1, MemberID);
                ps.setNString(2, type);
                ps.setNString(3, sizes);//傳Unicode的中文字到中文資料庫，以避免發生亂碼。
                ps.setNString(4, sugars);
                ps.setInt(5, cup_number);
                int m = JOptionPane.showConfirmDialog(null, "確定訂購?");
                if (m == 0) {
                    ps.execute();
                } else {
                    show.setText("");
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_onCheckedActionPerformed

    private void onPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onPrintActionPerformed
        try {
            // TODO add your handling code here:

            show.print();//列印訂單標籤
        } catch (PrinterException ex) {
            Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_onPrintActionPerformed

    private void onBackedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBackedActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_onBackedActionPerformed

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
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        MemberID = args[0];

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BlackTea;
    private javax.swing.JRadioButton GreenTea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner num;
    private javax.swing.JButton onBacked;
    private javax.swing.JButton onChecked;
    private javax.swing.JButton onPrint;
    private javax.swing.JTextArea show;
    private javax.swing.JComboBox<String> size;
    private javax.swing.JComboBox<String> sugar;
    // End of variables declaration//GEN-END:variables
}