/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BaseDatos.BD;
import Clases.Alumno;
import Clases.Desempeño;
import Clases.Lista;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author MHC <miguel.hrc>
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    String id = "";
    int cc = 0;

    public FrmPrincipal(String ID, int c) {
        initComponents();
        id = ID;
        cc = c;
        this.setLocationRelativeTo(null);
        this.jLabel1.setVisible(false);
        this.JTxtTrabajo.setVisible(false);
        this.jBtnAgregar.setVisible(false);
        this.jBtnGuardar.setVisible(false);
        this.jBtnActualizar.setVisible(false);
    }

    public int uno;
    String Carrera;
    String Grupo;
    String Semestre;
    String Materia;    
    String Trabajo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMIModificar = new javax.swing.JMenuItem();
        jMiEliminar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblConsulta = new javax.swing.JTable();
        jBtnGuardar = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        JTxtTrabajo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnArchivo = new javax.swing.JMenu();
        JMItCargar = new javax.swing.JMenuItem();
        JMItCargar1 = new javax.swing.JMenuItem();
        MnAgregar = new javax.swing.JMenu();
        JMItListaA = new javax.swing.JMenuItem();
        JMItAlumnoA = new javax.swing.JMenuItem();
        JMItProductoA = new javax.swing.JMenuItem();
        JMItConocimientoA = new javax.swing.JMenuItem();
        JMItActitudA = new javax.swing.JMenuItem();
        JMItDesempeñoA = new javax.swing.JMenuItem();
        JMItEvalDA = new javax.swing.JMenuItem();
        MnConsultar = new javax.swing.JMenu();
        JMItListaC = new javax.swing.JMenuItem();
        JMItAlumnoC = new javax.swing.JMenuItem();
        JMItProductoC = new javax.swing.JMenuItem();
        JMItConocimientoC = new javax.swing.JMenuItem();
        JMItActitudC = new javax.swing.JMenuItem();
        JMItDesempeñoC = new javax.swing.JMenuItem();

        jMIModificar.setText("Modificar");
        jMIModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMIModificar);

        jMiEliminar.setText("Eliminar");
        jMiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMiEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setUndecorated(true);

        jTblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTblConsulta.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTblConsulta);

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Agregar trabajo:");

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "L.S'SOFT", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        MnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/folder.png"))); // NOI18N
        MnArchivo.setText("Archivo");
        MnArchivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JMItCargar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/csv.png"))); // NOI18N
        JMItCargar.setText("Cargar");
        JMItCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItCargarActionPerformed(evt);
            }
        });
        MnArchivo.add(JMItCargar);

        JMItCargar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItCargar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/icon.png"))); // NOI18N
        JMItCargar1.setText("Salir");
        JMItCargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItCargar1ActionPerformed(evt);
            }
        });
        MnArchivo.add(JMItCargar1);

        jMenuBar1.add(MnArchivo);

        MnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/add.png"))); // NOI18N
        MnAgregar.setText("Agregar");
        MnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JMItListaA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItListaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/add_page.png"))); // NOI18N
        JMItListaA.setText("Lista");
        JMItListaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItListaAActionPerformed(evt);
            }
        });
        MnAgregar.add(JMItListaA);

        JMItAlumnoA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItAlumnoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/user.png"))); // NOI18N
        JMItAlumnoA.setText("Alumno");
        JMItAlumnoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItAlumnoAActionPerformed(evt);
            }
        });
        MnAgregar.add(JMItAlumnoA);

        JMItProductoA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItProductoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/hombre-que-trabaja-en-monitor-plano-en-vista-lateral.png"))); // NOI18N
        JMItProductoA.setText("Producto");
        JMItProductoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItProductoAActionPerformed(evt);
            }
        });
        MnAgregar.add(JMItProductoA);

        JMItConocimientoA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItConocimientoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/conocimiento.png"))); // NOI18N
        JMItConocimientoA.setText("Conocimiento");
        MnAgregar.add(JMItConocimientoA);

        JMItActitudA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItActitudA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/atleta.png"))); // NOI18N
        JMItActitudA.setText("Actitud");
        MnAgregar.add(JMItActitudA);

        JMItDesempeñoA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItDesempeñoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/datos-sobre-recursos-humanos-del-desempeno-laboral.png"))); // NOI18N
        JMItDesempeñoA.setText("Desempeño");
        JMItDesempeñoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItDesempeñoAActionPerformed(evt);
            }
        });
        MnAgregar.add(JMItDesempeñoA);

        JMItEvalDA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItEvalDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/evaluacion.png"))); // NOI18N
        JMItEvalDA.setText("Evaluación diagnóstica");
        JMItEvalDA.setToolTipText("");
        MnAgregar.add(JMItEvalDA);

        jMenuBar1.add(MnAgregar);

        MnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/search.png"))); // NOI18N
        MnConsultar.setText("Consultar");
        MnConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JMItListaC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItListaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/search_page.png"))); // NOI18N
        JMItListaC.setText("Lista");
        JMItListaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItListaCActionPerformed(evt);
            }
        });
        MnConsultar.add(JMItListaC);

        JMItAlumnoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItAlumnoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/user.png"))); // NOI18N
        JMItAlumnoC.setText("Alumno");
        JMItAlumnoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMItAlumnoCMouseClicked(evt);
            }
        });
        JMItAlumnoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItAlumnoCActionPerformed(evt);
            }
        });
        MnConsultar.add(JMItAlumnoC);

        JMItProductoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItProductoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/hombre-que-trabaja-en-monitor-plano-en-vista-lateral.png"))); // NOI18N
        JMItProductoC.setText("Producto");
        MnConsultar.add(JMItProductoC);

        JMItConocimientoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItConocimientoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/conocimiento.png"))); // NOI18N
        JMItConocimientoC.setText("Conocimiento");
        MnConsultar.add(JMItConocimientoC);

        JMItActitudC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JMItActitudC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/atleta.png"))); // NOI18N
        JMItActitudC.setText("Actitud");
        MnConsultar.add(JMItActitudC);

        JMItDesempeñoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/datos-sobre-recursos-humanos-del-desempeno-laboral.png"))); // NOI18N
        JMItDesempeñoC.setText("Desempeño");
        JMItDesempeñoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItDesempeñoCActionPerformed(evt);
            }
        });
        MnConsultar.add(JMItDesempeñoC);

        jMenuBar1.add(MnConsultar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JTxtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAgregar)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnActualizar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTxtTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jBtnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnGuardar)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LLenarTabla() throws SQLException {
        BD mBD = new BD();
        List<Alumno> lista = mBD.consultarAlumno(Integer.parseInt(id));

        //Mostrar la consulta alumno
        Object[] encabezado = {"NC", "Nombre"};
        DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
        for (Alumno actual : lista) {
            Object[] fila = {actual.getNC(), actual.getNombre()};
            modelo.addRow(fila);
        }
        this.jTblConsulta.setModel(modelo);
    }

    public void LLenarTablaLista() throws SQLException {
        BD mBD = new BD();
        List<Lista> lista = mBD.consultarLista();

        Object[] encabezado = {"Lista", "Materia", "Grupo", "Semestre", "Carrera"};
        DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
        for (Lista actual : lista) {
            Object[] fila = {actual.getIdLista(), actual.getMateria(), actual.getGrupo(), actual.getSemestre(), actual.getCarrera()};
            modelo.addRow(fila);
        }
        this.jTblConsulta.setModel(modelo);
    }

    public void LlenarTablaDesempeno() throws SQLException {
        BD mBD = new BD();
        String Desem = "";
        
        List<Alumno> lista = mBD.consultarAlumno(Integer.parseInt(id));
        int cont = 1;

        Object[] encabezado = {"No", "NC", "Nombre"};

        DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
        for (Alumno actual1 : lista) {
            Object[] fila = {cont, actual1.getNC(), actual1.getNombre()};
            modelo.addRow(fila);
            cont++;
        }
        List<Desempeño> lista2 = mBD.consultarListaTrabajos(Integer.parseInt(id));
        int q = 3;
        int z = 0;
        for (Desempeño actual : lista2) {
            modelo.addColumn(String.valueOf(actual.getTrabajo()));
            List<Desempeño> lista3 = mBD.consultarDesempenoCal(String.valueOf(actual.getTrabajo()));
            for (Desempeño actual2 : lista3) {
                modelo.setValueAt(actual2.getCalificacion(), z, q);
                z++;
            }
            z = 0;
            q++;
        }
    }
    
    private void JMItCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItCargarActionPerformed
        // TODO add your handling code here:
        uno = 0;
        FrmBusquedaLista mFrmBusquedaLista = new FrmBusquedaLista(uno);
        mFrmBusquedaLista.setVisible(true);
    }//GEN-LAST:event_JMItCargarActionPerformed

    private void JMItProductoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItProductoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMItProductoAActionPerformed

    private void JMItAlumnoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMItAlumnoCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMItAlumnoCMouseClicked

    private void JMItAlumnoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItAlumnoCActionPerformed
        // TODO add your handling code here:
        uno = 1;
        FrmBusquedaLista mFrmBusquedaLista = new FrmBusquedaLista(uno);

        System.out.println(uno);
        mFrmBusquedaLista.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_JMItAlumnoCActionPerformed

    private void jMIModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIModificarActionPerformed
        // TODO add your handling code here:
        BD mBD = new BD();
        int fila = this.jTblConsulta.getSelectedRow();
        String ID = "";
        String Nombre = "";
        int NC = 0;

        String Materia = "";
        String Grupo = "";
        int SemestreL = 0;
        String Carrera = "";
        int Lista = 0;

        switch (cc) {
            case 0:
                try {
                    //Modificar Lista
                    if (fila >= 0) {
                        Lista = (int) jTblConsulta.getValueAt(fila, 0);
                        Materia = (String) jTblConsulta.getValueAt(fila, 1);
                        Grupo = (String) jTblConsulta.getValueAt(fila, 2);
                        SemestreL = (int) jTblConsulta.getValueAt(fila, 3);
                        Carrera = (String) jTblConsulta.getValueAt(fila, 4);
                        System.out.println(Materia);
                        System.out.println(Grupo);
                        System.out.println(SemestreL);
                        System.out.println(Carrera);

                        List<Lista> mLista = mBD.ConsultaIDLista(Materia, Grupo, SemestreL, Carrera);
                        for (Lista actual : mLista) {
                            ID = String.valueOf(actual.getIdLista());
                            System.out.println(ID);
                        }
                    }

                    FrmLista mFrmLista = new FrmLista(1, ID);
                    mFrmLista.TxtMateria.setText(Materia);
                    mFrmLista.TxtGrupo.setText(Grupo);
                    mFrmLista.TxtSemestre.setText(String.valueOf(SemestreL));
                    mFrmLista.TxtCarrera.setText(Carrera);
                    mFrmLista.setVisible(true);
                    this.LLenarTablaLista();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                //Modificar Alumno
                try {
                    if (fila >= 0) {
                        NC = (int) jTblConsulta.getValueAt(fila, 0);
                        Nombre = (String) jTblConsulta.getValueAt(fila, 1);
                        System.out.println(NC);
                        System.out.println(Nombre);

                        List<Alumno> mAlumno = mBD.ConsultaIDAlumno(NC, Nombre);
                        for (Alumno actual : mAlumno) {
                            ID = String.valueOf(actual.getIdAlumno());
                            System.out.println(ID);
                        }
                    }

                    FrmModificar mFrmModificar = new FrmModificar(id, ID);
                    mFrmModificar.TxtNombre.setText(Nombre);
                    mFrmModificar.TxtNC1.setText(String.valueOf(NC));
                    mFrmModificar.setVisible(true);
                    cc = 0;
                    this.LLenarTabla();

                } catch (SQLException ex) {
                    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                cc = 0;
                break;
        }
    }//GEN-LAST:event_jMIModificarActionPerformed

    private void jMiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiEliminarActionPerformed
        // TODO add your handling code here:
        BD mBD = new BD();
        int fila = this.jTblConsulta.getSelectedRow();
        switch (cc) {
            case 0:
                String ID = "";
                try {
                    //Eliminar lista
                    if (fila >= 0) {
                        String Materia = "";
                        String Grupo = "";
                        int SemestreL = 0;
                        String Carrera = "";
                        int Lista = 0;
                        Lista = (int) jTblConsulta.getValueAt(fila, 0);
                        Materia = (String) jTblConsulta.getValueAt(fila, 1);
                        Grupo = (String) jTblConsulta.getValueAt(fila, 2);
                        SemestreL = (int) jTblConsulta.getValueAt(fila, 3);
                        Carrera = (String) jTblConsulta.getValueAt(fila, 4);
                        System.out.println(Materia);
                        System.out.println(Grupo);
                        System.out.println(SemestreL);
                        System.out.println(Carrera);

                        List<Lista> mLista = mBD.ConsultaIDLista(Materia, Grupo, SemestreL, Carrera);
                        for (Lista actual : mLista) {
                            ID = String.valueOf(actual.getIdLista());
                            System.out.println(ID);
                        }

                        mBD.eliminarlista(Integer.parseInt(ID));
                        JOptionPane.showMessageDialog(null, "Lista Eliminada");
                        this.LLenarTablaLista();
                        cc = 0;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                ID = "";
                try {
                    if (fila >= 0) {
                        int NC = (int) jTblConsulta.getValueAt(fila, 0);
                        String Nombre = (String) jTblConsulta.getValueAt(fila, 1);
                        System.out.println(NC);
                        System.out.println(Nombre);

                        List<Alumno> mAlumno = mBD.ConsultaIDAlumno(NC, Nombre);
                        for (Alumno actual : mAlumno) {
                            ID = String.valueOf(actual.getIdAlumno());
                            System.out.println(ID);
                        }
                        mBD.eliminarAlumno(Integer.parseInt(ID));
                        JOptionPane.showMessageDialog(null, "Alumno eliminado.");
                        this.LLenarTabla();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }//GEN-LAST:event_jMiEliminarActionPerformed

    private void JMItAlumnoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItAlumnoAActionPerformed
        // TODO add your handling code here:
        FrmAgregar mFrmAgregar = new FrmAgregar();
        mFrmAgregar.setVisible(true);
    }//GEN-LAST:event_JMItAlumnoAActionPerformed

    private void JMItListaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItListaAActionPerformed
        // TODO add your handling code here:
        FrmLista mFrmLista = new FrmLista(0, "");
        mFrmLista.setVisible(true);
    }//GEN-LAST:event_JMItListaAActionPerformed

    private void JMItListaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItListaCActionPerformed
        // TODO add your handling code here:
        id = "";
        cc = 0;
        BD mBD = new BD();

        try {
            List<Lista> lista = mBD.consultarLista();

            Object[] encabezado = {"Lista", "Materia", "Grupo", "Semestre", "Carrera"};
            DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
            for (Lista actual : lista) {
                Object[] fila = {actual.getIdLista(), actual.getMateria(), actual.getGrupo(), actual.getSemestre(), actual.getCarrera()};
                modelo.addRow(fila);
            }
            this.jTblConsulta.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMItListaCActionPerformed

    private void JMItCargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItCargar1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JMItCargar1ActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        String Nombre;
        String NC;
        String Calificacion;
        String ID = "";
        BD mBD = new BD();
        try {
            for (int i = 0; i < jTblConsulta.getRowCount(); i++) {
                Nombre = jTblConsulta.getValueAt(i, 2).toString();
                NC = jTblConsulta.getValueAt(i, 1).toString();
                List<Alumno> mLista = mBD.ConsultaIDAlumno(Integer.parseInt(NC), Nombre);
                for (Alumno actual : mLista) {
                    ID = String.valueOf(actual.getIdAlumno());
                }
                Calificacion = jTblConsulta.getValueAt(i, 3).toString();
                Desempeño mDesempeño = new Desempeño();
                mDesempeño.setCalificacion(Integer.parseInt(Calificacion));
                mDesempeño.setTrabajo(Trabajo);
                mBD.agregarDesempeño(mDesempeño, Integer.parseInt(ID));
            }

            JOptionPane.showMessageDialog(this, "Desempeno guardado");
            this.jBtnAgregar.setEnabled(false);

        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class
                .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        // TODO add your handling code here:
        try {
            BD mBD = new BD();
            int calificacion;
            String Nombre;
            int NC;
            int IdD = 0;
            int IdA = 0;
            Desempeño mDesempeño = new Desempeño();

            for (int j = 3; j < 10; j++) {
                for (int i = 0; i < jTblConsulta.getRowCount(); i++) {
                    DefaultTableModel modelo = (DefaultTableModel) jTblConsulta.getModel();
                    JTableHeader th = jTblConsulta.getTableHeader();
                    TableColumnModel tcm = th.getColumnModel();
                    TableColumn tcmn = tcm.getColumn(j);
                    tcmn.getHeaderValue();

                    System.out.println(tcmn.getHeaderValue().toString());

                    calificacion = Integer.parseInt( jTblConsulta.getValueAt(i, j).toString());
                    Nombre = jTblConsulta.getValueAt(i, 2).toString();
                    NC = Integer.parseInt(jTblConsulta.getValueAt(i, 1).toString());

                    List<Alumno> mLista3 = mBD.ConsultaIDAlumno(NC, Nombre);
                    for(Alumno actual3 : mLista3){
                        IdA = actual3.getIdAlumno();
                    }

                    System.out.println(calificacion);
                    List<Desempeño> mLista2 = mBD.ConsultaIDDesempeño(tcmn.getHeaderValue().toString(), IdA);
                    for (Desempeño actual2 : mLista2) {
                        IdD = actual2.getIdDesempeño();
                    }

                    System.out.println(IdD);
                    mDesempeño.setCalificacion(calificacion);
                    mDesempeño.setTrabajo(tcmn.getHeaderValue().toString());
                    mDesempeño.setIdDesempeño(IdD);
                    mBD.modificarDesempeño(mDesempeño);

                }

            }
            this.jBtnActualizar.setEnabled(false);
            LlenarTablaDesempeno();

        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnActualizarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        Trabajo = this.JTxtTrabajo.getText();
        BD mBD = new BD();
        List<Alumno> lista;
        try {
            lista = mBD.consultarAlumno(Integer.parseInt(id));

            int cont = 1;
            //Mostrar la consulta alumno
            Object[] encabezado = {"No", "NC", "Nombre", Trabajo};
            DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
            for (Alumno actual : lista) {

                Object[] fila = {cont, actual.getNC(), actual.getNombre(), ""};
                modelo.addRow(fila);
                cont++;
            }
            this.jTblConsulta.setModel(modelo);

            this.jBtnAgregar.setEnabled(false);
            this.JTxtTrabajo.setEnabled(false);

        } catch (SQLException ex) {
            Logger.getLogger(FrmPrincipal.class
                .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void JMItDesempeñoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItDesempeñoCActionPerformed
        // TODO add your handling code here:
        int a = 3;
        FrmBusquedaLista mFrmBusquedaLista = new FrmBusquedaLista(a);
        mFrmBusquedaLista.setVisible(true);
    }//GEN-LAST:event_JMItDesempeñoCActionPerformed

    private void JMItDesempeñoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItDesempeñoAActionPerformed
        // TODO add your handling code here:
        int a = 2;
        FrmBusquedaLista mFrmBusquedaLista = new FrmBusquedaLista(a);
        mFrmBusquedaLista.setVisible(true);
    }//GEN-LAST:event_JMItDesempeñoAActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal("", 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMItActitudA;
    private javax.swing.JMenuItem JMItActitudC;
    private javax.swing.JMenuItem JMItAlumnoA;
    private javax.swing.JMenuItem JMItAlumnoC;
    private javax.swing.JMenuItem JMItCargar;
    private javax.swing.JMenuItem JMItCargar1;
    private javax.swing.JMenuItem JMItConocimientoA;
    private javax.swing.JMenuItem JMItConocimientoC;
    private javax.swing.JMenuItem JMItDesempeñoA;
    private javax.swing.JMenuItem JMItDesempeñoC;
    private javax.swing.JMenuItem JMItEvalDA;
    private javax.swing.JMenuItem JMItListaA;
    private javax.swing.JMenuItem JMItListaC;
    private javax.swing.JMenuItem JMItProductoA;
    private javax.swing.JMenuItem JMItProductoC;
    public javax.swing.JTextField JTxtTrabajo;
    private javax.swing.JMenu MnAgregar;
    private javax.swing.JMenu MnArchivo;
    private javax.swing.JMenu MnConsultar;
    public javax.swing.JButton jBtnActualizar;
    public javax.swing.JButton jBtnAgregar;
    public javax.swing.JButton jBtnGuardar;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMIModificar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMiEliminar;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTblConsulta;
    // End of variables declaration//GEN-END:variables
}
