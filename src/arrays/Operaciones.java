package arrays;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Operaciones extends javax.swing.JFrame {

    public Operaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
    int V[];
    Vector obj = new Vector();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Txt_n = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Combo_1 = new javax.swing.JComboBox<>();
        Txt_buscar = new javax.swing.JTextField();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        Txt_encontrado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_vector = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tbl_vector1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Txt_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 223, -1));

        jLabel1.setText("Terminos: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton2.setText("Generar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 98, -1));

        jButton3.setText("Ordenar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 98, -1));

        Combo_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenamiento de burbuja", "Ordenamiento de burbuja bidireccional", "Ordenamiento por inserción", "Ordenamiento por selección", "Ordenamiento Shell", "Ordenamiento rápido (QuickSort)" }));
        jPanel1.add(Combo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 283, -1));
        jPanel1.add(Txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 399, -1));

        buttonGroup1.add(Radio1);
        Radio1.setText("Busqueda secuencial");
        Radio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Radio1.setName(""); // NOI18N
        jPanel1.add(Radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        Radio1.getAccessibleContext().setAccessibleParent(this);

        buttonGroup1.add(Radio2);
        Radio2.setText("Busqueda binaria");
        Radio2.setName(""); // NOI18N
        jPanel1.add(Radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));
        Radio2.getAccessibleContext().setAccessibleParent(this);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 98, -1));

        Txt_encontrado.setEditable(false);
        jPanel1.add(Txt_encontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 399, -1));

        Tbl_vector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_vector);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 399, 50));

        Tbl_vector1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tbl_vector1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 399, 50));

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jButton6.setText("Borrar todo");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n = Integer.parseInt(Txt_n.getText());

        V = new int[n];
        obj.Generar(V);
        obj.Mostrar(V, Tbl_vector);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int elemento = Integer.parseInt(Txt_buscar.getText());
        
        if(Radio1.isSelected()){
            obj.BusquedaSecuencial(V, elemento, Txt_encontrado);
        }else if(Radio2.isSelected()){
            obj.QuickSort(V, 0, V.length-1);
            obj.Mostrar(V, Tbl_vector1);
            obj.BusquedaBinaria(V, elemento, Txt_encontrado);
        }else{
            JOptionPane.showMessageDialog(null,"Elije una opcion");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        switch (Combo_1.getSelectedIndex() + 1) {
            case 1 -> {
                obj.Bubblesort(V);
            }
            case 2 -> {
                obj.CocktailSort(V);
            }
            case 3 -> {
                obj.InsertionSort(V);
            }
            case 4 -> {
                obj.SelectionSort(V);
            }
            case 5 -> {
                obj.Shell(V);
            }
            case 6 -> {
                obj.QuickSort(V, 0, V.length-1);
            }
        }
        obj.Mostrar(V, Tbl_vector1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_1;
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JTable Tbl_vector;
    private javax.swing.JTable Tbl_vector1;
    private javax.swing.JTextField Txt_buscar;
    private javax.swing.JTextField Txt_encontrado;
    private javax.swing.JTextField Txt_n;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
