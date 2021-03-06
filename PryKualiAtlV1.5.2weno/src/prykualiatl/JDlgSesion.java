package prykualiatl;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;

public class JDlgSesion extends javax.swing.JDialog
{

    public JDlgSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
        this.jTextField1.setDocument(new JTextFieldLimit(10));
        this.jPasswordField1.setDocument(new JTextFieldLimit(10));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBtnAceptar = new javax.swing.JButton();
        JBtnCancelar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(prykualiatl.PryKualiAtlApp.class).getContext().getResourceMap(JDlgSesion.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setFont(resourceMap.getFont("Form.font")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        JBtnAceptar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnAceptar.setIcon(resourceMap.getIcon("JBtnAceptar.icon")); // NOI18N
        JBtnAceptar.setText(resourceMap.getString("JBtnAceptar.text")); // NOI18N
        JBtnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnAceptar.setName("JBtnAceptar"); // NOI18N
        JBtnAceptar.setNextFocusableComponent(JBtnCancelar);
        JBtnAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnAceptarActionPerformed(evt);
            }
        });

        JBtnCancelar.setFont(resourceMap.getFont("JBtnCancelar.font")); // NOI18N
        JBtnCancelar.setIcon(resourceMap.getIcon("JBtnCancelar.icon")); // NOI18N
        JBtnCancelar.setText(resourceMap.getString("JBtnCancelar.text")); // NOI18N
        JBtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBtnCancelar.setName("JBtnCancelar"); // NOI18N
        JBtnCancelar.setNextFocusableComponent(jTextField1);
        JBtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnCancelarActionPerformed(evt);
            }
        });

        jTextField1.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jPasswordField1.setText(resourceMap.getString("jPasswordField1.text")); // NOI18N
        jPasswordField1.setName("jPasswordField1"); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(JBtnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBtnCancelar)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtnAceptar)
                    .addComponent(JBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnCancelarActionPerformed

          JFrmMdi x =new JFrmMdi();
          x.setVisible(true);
          this.dispose();
         // x.getJMenuBar().getMenu(0).getItem(0).getModel().setEnabled(false);
    }//GEN-LAST:event_JBtnCancelarActionPerformed

    private void JBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnAceptarActionPerformed
           
               try
            {
            String b,p;
               bd_manager obj = new bd_manager();
               String sql;
               JFrmMdi m =new JFrmMdi();
               ResultSet rs;
               String contraseña;
               contraseña =jPasswordField1.getText();
              sql="select ClvUsuario,Usuario,Contraseña,Archivo,IniciarSesion,CerrarSesion,RegistroDeUsuario,SalirDeAplicacion,Clientes,RegistroDeClientes,Pagos,RegistroDePagos,EmisionesOrdenes,Reportes,ReporteDeIngresos,ReporteDePagos,ReporteDeOrdenes,Herramientas,Calculadora,RespaldarBd,RestaurarBd,Ayuda,MostrarAyuda,AcercaDe from tblusuario where Usuario='" + this.jTextField1.getText() + "' and Contraseña='" + contraseña + "'";
               rs= obj.consultar(sql);
               System.out.println("asdadasd:   "+ rs);
               b=jTextField1.getText();
               System.out.println("bbbbb:   "+ rs);
               //p=jTextField2.getText();
               p=contraseña;
               boolean encuentra=false;
               while (rs.next())
               {
                 if(b.equals(rs.getString(2))&& p.equals(rs.getString(3)))
                 {
                 
                   m.getJMenuBar().getMenu(0).getModel().setEnabled(rs.getBoolean(4));
                   m.getJMenuBar().getMenu(0).getItem(0).getModel().setEnabled(rs.getBoolean(5));
                  // m.getJMenuBar().getMenu(0).getItem(0).getModel().setEnabled(false);
                   m.getJMenuBar().getMenu(0).getItem(1).getModel().setEnabled(rs.getBoolean(6));
                   m.getJMenuBar().getMenu(0).getItem(2).getModel().setEnabled(rs.getBoolean(7));
                   m.getJMenuBar().getMenu(0).getItem(3).getModel().setEnabled(rs.getBoolean(8));

                   m.getJMenuBar().getMenu(1).getModel().setEnabled(rs.getBoolean(9));
                   m.getJMenuBar().getMenu(1).getItem(0).getModel().setEnabled(rs.getBoolean(10));

                   m.getJMenuBar().getMenu(2).getModel().setEnabled(rs.getBoolean(11));
                   m.getJMenuBar().getMenu(2).getItem(0).getModel().setEnabled(rs.getBoolean(12));
                   m.getJMenuBar().getMenu(2).getItem(1).getModel().setEnabled(rs.getBoolean(13));

                   m.getJMenuBar().getMenu(3).getModel().setEnabled(rs.getBoolean(14));
                   m.getJMenuBar().getMenu(3).getItem(0).getModel().setEnabled(rs.getBoolean(15));
                   m.getJMenuBar().getMenu(3).getItem(1).getModel().setEnabled(rs.getBoolean(16));
                   m.getJMenuBar().getMenu(3).getItem(2).getModel().setEnabled(rs.getBoolean(17));

                   m.getJMenuBar().getMenu(4).getModel().setEnabled(rs.getBoolean(18));
                   m.getJMenuBar().getMenu(4).getItem(0).getModel().setEnabled(rs.getBoolean(19));
                   m.getJMenuBar().getMenu(4).getItem(1).getModel().setEnabled(rs.getBoolean(20));
                   m.getJMenuBar().getMenu(4).getItem(2).getModel().setEnabled(rs.getBoolean(21));

                   m.getJMenuBar().getMenu(5).getModel().setEnabled(rs.getBoolean(22));
                   m.getJMenuBar().getMenu(5).getItem(0).getModel().setEnabled(rs.getBoolean(23));
                   m.getJMenuBar().getMenu(5).getItem(1).getModel().setEnabled(rs.getBoolean(24));

                  m.setVisible(true);
                  this.dispose();
                   encuentra=true;
                 }
               }
            if(encuentra==true)
                 {
                     JOptionPane.showMessageDialog( null, " BIENVENIDO,\nAHORA PUEDE HACER USO DEL SISTEMA", "KUALI ATL", JOptionPane.INFORMATION_MESSAGE);
                     //jTextField1.requestFocus();
                      m.getJMenuBar().getMenu(0).getItem(0).getModel().setEnabled(false);
                 }
               if(encuentra==false)
                 {
                     JOptionPane.showMessageDialog( null, "ERROR EN EL NOMBRE DE USUARIO O CONTRASEÑA", "VERIFICAR", JOptionPane.ERROR_MESSAGE);
                     jTextField1.requestFocus();
                 }
            }catch (Exception ex) {
                       
                    JOptionPane.showMessageDialog( null, "ERROR AL INTENTAR ABRIR LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
                  }
    }//GEN-LAST:event_JBtnAceptarActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
         char letra=  evt.getKeyChar();
      if(letra>='0' && letra<='9')
      {
          evt.consume();
      }
      if(letra==10)
      {
          this.jPasswordField1.requestFocus();
      }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        // TODO add your handling code here:
        char numlet=  evt.getKeyChar();
        if(numlet==10)
      {
          this.JBtnAceptar.requestFocus();
      }
    }//GEN-LAST:event_jPasswordField1KeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgSesion dialog = new JDlgSesion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
           dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnAceptar;
    private javax.swing.JButton JBtnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
