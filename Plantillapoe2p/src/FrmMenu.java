
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        obtenerNombrejugador = new javax.swing.JTextField();
        obtenerNumerojugador = new javax.swing.JTextField();
        obtenerPesojugador = new javax.swing.JTextField();
        obtenerNombredeporte = new javax.swing.JTextField();
        obtenerEquipo = new javax.swing.JTextField();
        obtenerCantidad = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        DEPORTE = new javax.swing.JMenu();
        AGREGAR = new javax.swing.JMenuItem();
        MOSTRAR = new javax.swing.JMenuItem();
        ELIMINAR = new javax.swing.JMenuItem();
        BUSCAR = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre jugador");

        jLabel2.setText("Cantidad");

        jLabel3.setText("Numero de jugador");

        jLabel4.setText("Peso jugador");

        jLabel5.setText("Nombre Equipo");

        jLabel6.setText("Nombre deporte");

        obtenerNombrejugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerNombrejugadorActionPerformed(evt);
            }
        });

        obtenerNumerojugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                obtenerNumerojugadorKeyTyped(evt);
            }
        });

        DEPORTE.setText("DEPORTES");

        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });
        DEPORTE.add(AGREGAR);

        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });
        DEPORTE.add(MOSTRAR);

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        DEPORTE.add(ELIMINAR);

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });
        DEPORTE.add(BUSCAR);

        jMenuBar2.add(DEPORTE);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(obtenerNombrejugador, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(obtenerNumerojugador)
                    .addComponent(obtenerPesojugador)
                    .addComponent(obtenerNombredeporte)
                    .addComponent(obtenerEquipo)
                    .addComponent(obtenerCantidad))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(obtenerNombrejugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(obtenerNumerojugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(obtenerPesojugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(obtenerNombredeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obtenerEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(obtenerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
ListaJugador listaJ = new ListaJugador();
    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        int c=Integer.parseInt(obtenerCantidad.getText());
        int nj=Integer.parseInt(obtenerNumerojugador.getText());
        float pj=Float.parseFloat(obtenerPesojugador.getText());
        listaJ.Agregar(obtenerNombrejugador.getText(), nj, pj,obtenerNombredeporte.getText(),obtenerEquipo.getText(),c);
        
        
    }//GEN-LAST:event_AGREGARActionPerformed

    private void obtenerNombrejugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerNombrejugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obtenerNombrejugadorActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
       listaJ.recorrerLista();
       JOptionPane.showMessageDialog(this, listaJ.recorrerLista());
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
     String a = JOptionPane.showInputDialog(null, "Ingresa el nombre a eliminar");
     if(listaJ.eliminar(a)){
         JOptionPane.showMessageDialog(null, "Se elimino");
     }else{
          JOptionPane.showMessageDialog(null, "No se elimino");
     }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
    String a = JOptionPane.showInputDialog(null, "Ingresa el nombre a buscar");
    JOptionPane.showMessageDialog(null, listaJ.buscar(a));
    }//GEN-LAST:event_BUSCARActionPerformed

    private void obtenerNumerojugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_obtenerNumerojugadorKeyTyped
        // TODO add your handling code here:
        int tamano = 3;
        char caracter = evt.getKeyChar();
        //jlbMsg.setVisible(false);
        if(!Character.isDigit(caracter)){
                getToolkit().beep(); // Emitir sonido de alerta
                evt.consume(); //Evita que el caracter se muestre
                //jlbMsg.setVisible(true);
                //jlbMsg.setText("Solo capturar numeros");
        }
        if(obtenerNumerojugador.getText().length() >= tamano){
                getToolkit().beep(); // Emitir sonido de alerta
                evt.consume(); //Evita que el caracter se muestre
                //jlbMsg.setVisible(true);
                //jlbMsg.setText("Maximo 8 digitos");
        }
    }//GEN-LAST:event_obtenerNumerojugadorKeyTyped

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AGREGAR;
    private javax.swing.JMenuItem BUSCAR;
    private javax.swing.JMenu DEPORTE;
    private javax.swing.JMenuItem ELIMINAR;
    private javax.swing.JMenuItem MOSTRAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JTextField obtenerCantidad;
    private javax.swing.JTextField obtenerEquipo;
    private javax.swing.JTextField obtenerNombredeporte;
    private javax.swing.JTextField obtenerNombrejugador;
    private javax.swing.JTextField obtenerNumerojugador;
    private javax.swing.JTextField obtenerPesojugador;
    // End of variables declaration//GEN-END:variables
}
