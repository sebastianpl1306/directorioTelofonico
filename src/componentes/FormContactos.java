/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package componentes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.ConnectionDB;

/**
 *
 * @author sebas
 */
public class FormContactos extends javax.swing.JFrame {
    //Generar el objeto cx de la calse Conexion
    ConnectionDB cx = new ConnectionDB();
    
    /**
     * Creates new form FormContactos
     */
    public FormContactos() {
        initComponents();
        cargarTabla();
        this.setLocationRelativeTo(null);
        btnEditarContacto.setVisible(false);
        btnEliminarContacto.setVisible(false);
    }
    
    public static String documento = "";
    public static String nombre = "";
    public static String direccion = "";
    public static String barrio = "";
    public static String ciudad = "";
    public static String codigoPais = "";
    public static String genero = "";
    public static String fechaNaci = "";
    public static String ciudadNaci = "";
    public static String paisNaci = "";
    public static String telefono = "";
    public static String telefonoEmer = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCrearContacto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableContactos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEditarContacto = new javax.swing.JButton();
        btnEliminarContacto = new javax.swing.JButton();
        txtDocumento = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JLabel();
        txtGenero = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JLabel();
        txtCiudadNacimiento = new javax.swing.JLabel();
        txtPaisNacimiento = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        txtCodigoPais = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTelefonoEmergencia = new javax.swing.JLabel();
        btnImportar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrarSesion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Directorio Télefonico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnCrearContacto.setBackground(new java.awt.Color(51, 255, 51));
        btnCrearContacto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearContacto.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearContacto.setText("Crear nuevo Contacto +");
        btnCrearContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearContactoActionPerformed(evt);
            }
        });

        tableContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "documento", "nombre", "dirección", "telefono"
            }
        ));
        tableContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableContactos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Información del contacto");

        jLabel2.setText("Documento: ");

        jLabel3.setText("Nombre Completo:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Ciudad:");

        jLabel6.setText("Barrio:");

        jLabel7.setText("Genero:");

        jLabel8.setText("Fecha Nacimiento:");

        jLabel9.setText("Ciudad Nacimiento:");

        jLabel10.setText("Pais Nacimiento: ");

        jLabel11.setText("Télefono:");

        jLabel12.setText("Codigo del pais: ");

        btnEditarContacto.setBackground(new java.awt.Color(51, 255, 51));
        btnEditarContacto.setText("Editar Contacto");
        btnEditarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarContactoActionPerformed(evt);
            }
        });

        btnEliminarContacto.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarContacto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarContacto.setText("Eliminar Contacto");
        btnEliminarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContactoActionPerformed(evt);
            }
        });

        jLabel13.setText("Télefono Emergencia:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDocumento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCiudad))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBarrio))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGenero))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaNacimiento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCiudadNacimiento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPaisNacimiento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoPais))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoEmergencia)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(btnEditarContacto)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarContacto)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(74, 74, 74))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCiudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addComponent(txtBarrio)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtGenero))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(txtFechaNacimiento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(txtCiudadNacimiento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(txtPaisNacimiento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(txtTelefono))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(txtCodigoPais))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(txtTelefonoEmergencia))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtDocumento))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(txtNombre))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txtDireccion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarContacto)
                    .addComponent(btnEliminarContacto))
                .addGap(24, 24, 24))
        );

        btnImportar.setText("Importar");

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImportar)
                        .addGap(5, 5, 5)
                        .addComponent(btnExportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearContacto)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearContacto)
                    .addComponent(btnImportar)
                    .addComponent(btnExportar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea cerrar Sesión?");
        if(confirm == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCrearContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearContactoActionPerformed
        FormDirectorio formularioRegistro = new FormDirectorio();
        formularioRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearContactoActionPerformed

    private void btnEliminarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContactoActionPerformed
        // boton de guardar 
        int documento = Integer.parseInt(txtDocumento.getText());

        // se crea un try catch para  
        // se conecta a la tabla alumnos de la base de datos sql server
        //preparedstatment se insertan dichos datos a la base de datos 
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el registro?");
            if(confirm == 0){
                Connection con = cx.cadena_conexion();
                PreparedStatement ps = con.prepareStatement("UPDATE datosPersonales SET activo=0 WHERE documento=?");

                ps.setInt(1, documento);

                // ps.execute udate // se guardan
                ps.executeUpdate();

                // se guarda el registro de todo los datos en la intefaz
                // y se agrega el metodo limpiar para borrar todo al precionarlo
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                // se agrega el metodo para cargar la tabla
                cargarTabla();
                limpiar();
            }
        } catch (SQLException e) {
            // si no se cumplen todos los datos ingresados dara una excepcion con sqlException
            // y un mensaje por pantalla 

            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnEliminarContactoActionPerformed

    private void tableContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableContactosMouseClicked
        try {
            // dectetacra fila que el usuario esta selecionando 
            int fila = tableContactos.getSelectedRow();  // getselectrow me muestra lo que el usuario seleciona con el mause
            String id = tableContactos.getValueAt(fila, 0).toString();  // parseo  para las filas
            PreparedStatement ps;
            ResultSet rs;
            Connection con = cx.cadena_conexion();
            
            // llamamos de nuevo la tabla alumnos 
            // selecionamos los datos  para mostralos en la interzas
            ps = con.prepareStatement("SELECT documento,nombreCompleto,direccion,ciudad,barrio,genero,fechaNacimiento,ciudadNacimiento,paisNacimiento,telefono,telefonoEmergencia,codPais FROM datosPersonales WHERE documento =?");
            // guardar
            // rellena datos en la columna
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtDocumento.setText(rs.getString("documento"));
                txtNombre.setText(rs.getString("nombreCompleto"));
                txtDireccion.setText(rs.getString("direccion"));
                txtCiudad.setText(rs.getString("ciudad"));
                txtBarrio.setText(rs.getString("barrio"));
                txtGenero.setText(rs.getString("genero"));
                txtFechaNacimiento.setText(rs.getString("fechaNacimiento"));
                txtCiudadNacimiento.setText(rs.getString("ciudadNacimiento"));
                txtPaisNacimiento.setText(rs.getString("paisNacimiento"));
                txtTelefono.setText(rs.getString("telefono"));
                txtCodigoPais.setText(rs.getString("codPais"));
                txtTelefonoEmergencia.setText(rs.getString("telefonoEmergencia"));
            }
            
            btnEditarContacto.setVisible(true);
            btnEliminarContacto.setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_tableContactosMouseClicked

    private void btnEditarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarContactoActionPerformed
        documento = txtDocumento.getText();
        nombre = txtNombre.getText();
        direccion = txtDireccion.getText();
        barrio = txtBarrio.getText();
        ciudad = txtCiudad.getText();
        codigoPais = txtCodigoPais.getText();
        genero = txtGenero.getText();
        fechaNaci = txtFechaNacimiento.getText();
        ciudadNaci = txtCiudadNacimiento.getText();
        paisNaci = txtPaisNacimiento.getText();
        telefono = txtTelefono.getText();
        telefonoEmer = txtTelefonoEmergencia.getText();
        FormDirectorio formularioRegistro = new FormDirectorio();
        formularioRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarContactoActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        
        String documento, nombreCompleto, direccion, ciudad, barrio, genero,ciudadNacimiento, pais, fechaNacimiento,telefono, codigo, telefonoEmergencia;
        
        documento = "";
        nombreCompleto = "";
        direccion = "";
        ciudad = "";
        barrio  = "";
        genero  = "";
        ciudadNacimiento  = "";
        pais = "";
        fechaNacimiento= "";
        telefono="";
        codigo="";
        telefonoEmergencia= "";
        
        archivo = new File("usuario.txt");
        
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                documento = txtDocumento.getText();
                nombreCompleto = txtNombre.getText();
                genero = txtGenero.getText();
                direccion = txtDireccion.getText();
                ciudad = txtCiudad.getText();
                barrio = txtBarrio.getText();
                ciudadNacimiento = txtCiudadNacimiento.getText();
                pais = txtPaisNacimiento.getText();
                fechaNacimiento = txtFechaNacimiento.getText();
                telefono = txtTelefono.getText();
                codigo = txtCodigoPais.getText();
                telefonoEmergencia = txtTelefonoEmergencia.getText();
                
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //
                linea.println(documento);
                linea.println(nombreCompleto);
                linea.println(direccion);
                linea.println(ciudad);
                linea.println(barrio);
                linea.println(genero);
                linea.println(ciudadNacimiento);
                linea.println(pais);
                linea.println(fechaNacimiento);
                linea.println(telefono);
                linea.println(codigo);
                linea.println(telefonoEmergencia);
                linea.close();
                escribir.close();
                JOptionPane.showMessageDialog(null,"Registro Exitoso");
               
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
        }  
        }else {
            try {
                archivo.createNewFile();
                documento = txtDocumento.getText();
                nombreCompleto = txtNombre.getText();
                genero = txtGenero.getText();
                direccion = txtDireccion.getText();
                ciudad = txtCiudad.getText();
                barrio = txtBarrio.getText();
                ciudadNacimiento = txtCiudadNacimiento.getText();
                pais = txtPaisNacimiento.getText();
                fechaNacimiento = txtFechaNacimiento.getText();
                telefono = txtTelefono.getText();
                codigo = txtCodigoPais.getText();
                telefonoEmergencia = txtTelefonoEmergencia.getText();
                
             
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //
                linea.println("Documento: "+documento);
                linea.println("Nombres: "+nombreCompleto);
                linea.println("Direcciòn: "+direccion);
                linea.println("Ciudad: "+ciudad);
                linea.println("Barrio: "+barrio);
                linea.println("Ciudad de Nacimiento: "+ciudadNacimiento);
                linea.println("Paìs: "+pais);
                linea.println("Fecha de Nacimiento: "+fechaNacimiento);
                linea.println("Telefono: "+telefono);
                linea.println("Codigo Pais: "+codigo);
                linea.println("Telefono de Emergencia: "+telefonoEmergencia);
                
                linea.close();
                escribir.close();
                JOptionPane.showMessageDialog(null,"Registro Exitoso");
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
        }   }               
    }//GEN-LAST:event_btnExportarActionPerformed

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
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormContactos().setVisible(true);
            }
        });
    }
    
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tableContactos.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        int[] ancho = {10, 50, 100, 30, 100};
        // con siclo for es para que vaya asignando a cada columna el tamaño
        for (int j = 0; j < tableContactos.getColumnCount(); j++) {
            tableContactos.getColumnModel().getColumn(j).setPreferredWidth(ancho[j]);
        }
        
        try{
            //codigo
            Connection con = cx.cadena_conexion();
            
            ps = con.prepareStatement("SELECT documento, nombreCompleto, direccion, telefono FROM datosPersonales WHERE activo=1");
            
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice=0; indice < columnas; indice++){
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void limpiar(){
        txtDocumento.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtBarrio.setText("");
        txtCiudad.setText("");
        txtCodigoPais.setText("");
        txtGenero.setText("");
        txtFechaNacimiento.setText("");
        txtCiudadNacimiento.setText("");
        txtPaisNacimiento.setText("");
        txtTelefono.setText("");
        txtTelefonoEmergencia.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearContacto;
    private javax.swing.JButton btnEditarContacto;
    private javax.swing.JButton btnEliminarContacto;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableContactos;
    private javax.swing.JLabel txtBarrio;
    private javax.swing.JLabel txtCiudad;
    private javax.swing.JLabel txtCiudadNacimiento;
    private javax.swing.JLabel txtCodigoPais;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtDocumento;
    private javax.swing.JLabel txtFechaNacimiento;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPaisNacimiento;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txtTelefonoEmergencia;
    // End of variables declaration//GEN-END:variables
}
