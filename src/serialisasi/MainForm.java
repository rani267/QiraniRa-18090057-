package serialisasi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Revan
 */
public class MainForm extends javax.swing.JFrame {

    public static Product product;
    private final String path;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        product = new Product();
        path = System.getProperty("user.dir") + File.separator + "product.ser";
    }
    
    private void lihatHasilSerialization(){
        FileReader fileReader;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) !=null) {                
                stringBuilder.append(line).append("\r\n");
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
        }
        areaSerealization.setText(stringBuilder.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnEntriData = new javax.swing.JButton();
        btnDoSerialization = new javax.swing.JButton();
        btnDoDeserialization = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaSerealization = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDeserialization = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntriData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntriData.setText("1. Entri Data Produk");
        btnEntriData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntriDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntriData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 49));

        btnDoSerialization.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDoSerialization.setText("2. Lakukan Serialization");
        btnDoSerialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoSerializationActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoSerialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 0, 200, 49));

        btnDoDeserialization.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDoDeserialization.setText("3. Lakukan Deserialization");
        btnDoDeserialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoDeserializationActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoDeserialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 0, 200, 49));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL SEREALIZATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        areaSerealization.setColumns(20);
        areaSerealization.setRows(5);
        jScrollPane1.setViewportView(areaSerealization);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 312;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 18, 16);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 290, 370));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 10));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HASIL DESERIALIZATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        areaDeserialization.setColumns(20);
        areaDeserialization.setRows(5);
        jScrollPane2.setViewportView(areaDeserialization);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 302;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 18, 16);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntriDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntriDataActionPerformed
        AddProduct add = new AddProduct(this, true);
        add.setVisible(true);
    }//GEN-LAST:event_btnEntriDataActionPerformed

    private void btnDoDeserializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoDeserializationActionPerformed
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(new File(path));
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            Product k2 = (Product) obj;
            areaDeserialization.setText(k2.toString());
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoDeserializationActionPerformed

    private void btnDoSerializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoSerializationActionPerformed
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(new File(path));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
            lihatHasilSerialization();
        } catch (FileNotFoundException e) {
        } catch (IOException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoSerializationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException |
                InstantiationException | UnsupportedLookAndFeelException e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
                new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeserialization;
    private javax.swing.JTextArea areaSerealization;
    private javax.swing.JButton btnDoDeserialization;
    private javax.swing.JButton btnDoSerialization;
    private javax.swing.JButton btnEntriData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}