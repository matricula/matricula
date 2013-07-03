
import conexion.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class FrameListar extends javax.swing.JFrame {
private DefaultTableModel modelo;
    /**
     * Creates new form FrameListar
     */
    public FrameListar() {
        initComponents();
        cargarDatos(); //por si el boton listar datos no funciona bien probar este metodo
    }
    //metodo para que se vean los datos en la tabla
   private void cargarDatos()
     {
       
        String[] Titulos={"Idalumno" , "Nombre1", "Nombre2", "Apellido1","Apellido2", "Fecha", "Genero"};
         String[] registro = new String[7];
         // Un modelo contenedor para los datos que sean leidos
         modelo = new DefaultTableModel(null,Titulos);
         // Conectar con la base de datos 
         ConexionMySQL mysql= new ConexionMySQL();
         java.sql.Connection cn= mysql.Conectar();
         // La consulta de selección de datos
         String sSQL="SELECT idalumno, nombre1, nombre2, apellido1, apellido2, fecha, genero FROM alumnos ORDER BY 'apellido1'" ;
          // Ejecute la consulta
        try {
            java.sql.Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            // Llene la tabla con los datos de registro y pasar estos datos a un elemento jTable1 del formulario 
            while (rs.next())
            {
                registro[0]=rs.getString("idalumno");
                registro[1]=rs.getString("nombre1");
                registro[2]=rs.getString("nombre2");
                registro[3]=rs.getString("apellido1");
                registro[4]=rs.getString("apellido2");
                registro[5]=rs.getString("fecha");
                registro[6]=rs.getString("genero");
                modelo.addRow(registro);
            }
            jTable1.setModel(modelo);
            // En caso de error puede llenar el mensaje de error
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Mensaje de Error de lectura de datos"); 
            }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_MostrarDatos = new javax.swing.JButton();
        jButton_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "listar curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 102, 102)));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Idalumno", "Nombre1", "Nombre2", "Apellido1", "Apellido2", "Fecha", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_MostrarDatos.setForeground(new java.awt.Color(0, 102, 102));
        jButton_MostrarDatos.setText("Mostrar Datos");
        jButton_MostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarDatosActionPerformed(evt);
            }
        });

        jButton_volver.setForeground(new java.awt.Color(0, 102, 102));
        jButton_volver.setText("Volver");
        jButton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton_MostrarDatos)
                        .addGap(0, 220, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_MostrarDatos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton_volver)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(520, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarDatosActionPerformed
        // TODO add your handling code here:
    /**     String[] Titulos={"Idalumno" , "Nombre1", "Nombre2", "Apellido1","Apellido2", "Edad"};
      *   String[] registro = new String[7];
         // Un modelo contenedor para los datos que sean leidos
         modelo = new DefaultTableModel(null,Titulos);
         // Conectar con la base de datos 
         ConexionMySQL mysql= new ConexionMySQL();
         java.sql.Connection cn= mysql.Conectar();
         // La consulta de selección de datos
         String sSQL="SELECT idalumno, nombre1, nombre2, apellido1, apellido2, edad FROM alumnos" ;
          // Ejecute la consulta
        try {
            java.sql.Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            // Llene la tabla con los datos de registro y pasar estos datos a un elemento jTable1 del formulario 
            while (rs.next())
            {
                registro[0]=rs.getString("idalumno");
                registro[1]=rs.getString("nombre1");
                registro[2]=rs.getString("nombre2");
                registro[3]=rs.getString("apellido1");
                registro[4]=rs.getString("apellido2");
                registro[5]=rs.getString("edad");
                modelo.addRow(registro);
            }
            jTable1.setModel(modelo);
            // En caso de error puede llenar el mensaje de error
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Mensaje de Error de lectura de datos"); 
            }*/
    }//GEN-LAST:event_jButton_MostrarDatosActionPerformed

    private void jButton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_volverActionPerformed
        // TODO add your handling code here:
        FrameListar.this.setVisible(false);
        new Mantenedor().setVisible(true);
    }//GEN-LAST:event_jButton_volverActionPerformed

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
            java.util.logging.Logger.getLogger(FrameListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameListar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_MostrarDatos;
    private javax.swing.JButton jButton_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
