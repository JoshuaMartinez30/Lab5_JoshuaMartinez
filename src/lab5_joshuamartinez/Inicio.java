package lab5_joshuamartinez;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Inicio extends javax.swing.JFrame {

    ArrayList miembros = new ArrayList();

    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_Escuadron = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        tf_NombreE = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_Lugar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        rb_SuperH = new javax.swing.JRadioButton();
        rb_villano = new javax.swing.JRadioButton();
        btnAgregarE = new javax.swing.JButton();
        JD_SuperHeroes = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        tf_Poder = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_Debilidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_Fuerza = new javax.swing.JTextField();
        tf_AgilidaF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_AgilidadM = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        cbo_Super = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        JD_Villanos = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        tf_Nombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_Poder1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_Debilidad1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_Fuerza1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_AgilidaF1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_AgilidadM1 = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cboVillanos = new javax.swing.JComboBox<>();
        bg_personaje = new javax.swing.ButtonGroup();
        JD_VisualizarH = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_SuperH = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        JD_VisualizarVillanos = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_Villanos = new javax.swing.JList<>();
        btnEliminar1 = new javax.swing.JButton();
        btnMoficar1 = new javax.swing.JButton();
        JD_VualizarArbol = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Escuadrones = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_Escuadron = new javax.swing.JMenuItem();
        jmi_SuperH = new javax.swing.JMenuItem();
        jmi_Villanos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_Super = new javax.swing.JMenuItem();
        jmi_villano = new javax.swing.JMenuItem();
        jmi_arbol = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_Salir = new javax.swing.JMenuItem();

        jLabel14.setText("Nombre");

        jLabel15.setText("Lugar de la base ");

        jLabel16.setText("Tipo");

        bg_personaje.add(rb_SuperH);
        rb_SuperH.setText("Super Heroe");

        bg_personaje.add(rb_villano);
        rb_villano.setText("Villano");

        btnAgregarE.setText("Agregar");
        btnAgregarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_EscuadronLayout = new javax.swing.GroupLayout(JD_Escuadron.getContentPane());
        JD_Escuadron.getContentPane().setLayout(JD_EscuadronLayout);
        JD_EscuadronLayout.setHorizontalGroup(
            JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EscuadronLayout.createSequentialGroup()
                .addGroup(JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_EscuadronLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_NombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JD_EscuadronLayout.createSequentialGroup()
                                .addComponent(rb_SuperH)
                                .addGap(18, 18, 18)
                                .addComponent(rb_villano))))
                    .addGroup(JD_EscuadronLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnAgregarE, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        JD_EscuadronLayout.setVerticalGroup(
            JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EscuadronLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_NombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(rb_SuperH)
                    .addComponent(rb_villano))
                .addGap(30, 30, 30)
                .addGroup(JD_EscuadronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnAgregarE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        JD_SuperHeroes.setAutoRequestFocus(false);

        jLabel1.setText("Nombre");

        jLabel2.setText("Poder");

        jLabel3.setText("Debilidad");

        jLabel4.setText("Fuerza");

        jLabel5.setText("Agilidad fisica ");

        jLabel6.setText("Agilidad mental");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel13.setText("Nombre del escuadron");

        javax.swing.GroupLayout JD_SuperHeroesLayout = new javax.swing.GroupLayout(JD_SuperHeroes.getContentPane());
        JD_SuperHeroes.getContentPane().setLayout(JD_SuperHeroesLayout);
        JD_SuperHeroesLayout.setHorizontalGroup(
            JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_SuperHeroesLayout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(JD_SuperHeroesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addGap(39, 39, 39)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_Super, 0, 170, Short.MAX_VALUE)
                    .addComponent(tf_Nombre)
                    .addComponent(tf_Debilidad)
                    .addComponent(tf_AgilidaF))
                .addGap(58, 58, 58)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_Poder)
                    .addComponent(tf_Fuerza)
                    .addComponent(tf_AgilidadM, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JD_SuperHeroesLayout.setVerticalGroup(
            JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_SuperHeroesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Debilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_AgilidaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(tf_AgilidadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(JD_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel7.setText("Nombre");

        jLabel8.setText("Poder");

        jLabel9.setText("Debilidad");

        jLabel10.setText("Fuerza");

        jLabel11.setText("Agilidad fisica ");

        jLabel12.setText("Agilidad mental");

        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Nombre del escuadron");

        javax.swing.GroupLayout JD_VillanosLayout = new javax.swing.GroupLayout(JD_Villanos.getContentPane());
        JD_Villanos.getContentPane().setLayout(JD_VillanosLayout);
        JD_VillanosLayout.setHorizontalGroup(
            JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_VillanosLayout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(JD_VillanosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_Nombre1)
                    .addComponent(tf_Debilidad1)
                    .addComponent(tf_AgilidaF1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(cboVillanos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_Poder1)
                    .addComponent(tf_Fuerza1)
                    .addComponent(tf_AgilidadM1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JD_VillanosLayout.setVerticalGroup(
            JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_VillanosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(tf_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Poder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_Debilidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tf_Fuerza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_AgilidaF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(tf_AgilidadM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(JD_VillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(cboVillanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jl_SuperH.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jl_SuperH);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        javax.swing.GroupLayout JD_VisualizarHLayout = new javax.swing.GroupLayout(JD_VisualizarH.getContentPane());
        JD_VisualizarH.getContentPane().setLayout(JD_VisualizarHLayout);
        JD_VisualizarHLayout.setHorizontalGroup(
            JD_VisualizarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_VisualizarHLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(JD_VisualizarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JD_VisualizarHLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        JD_VisualizarHLayout.setVerticalGroup(
            JD_VisualizarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_VisualizarHLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(JD_VisualizarHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jl_Villanos.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_Villanos);

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnMoficar1.setText("Modificar");

        javax.swing.GroupLayout JD_VisualizarVillanosLayout = new javax.swing.GroupLayout(JD_VisualizarVillanos.getContentPane());
        JD_VisualizarVillanos.getContentPane().setLayout(JD_VisualizarVillanosLayout);
        JD_VisualizarVillanosLayout.setHorizontalGroup(
            JD_VisualizarVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_VisualizarVillanosLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(JD_VisualizarVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_VisualizarVillanosLayout.createSequentialGroup()
                        .addComponent(btnEliminar1)
                        .addGap(48, 48, 48)
                        .addComponent(btnMoficar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        JD_VisualizarVillanosLayout.setVerticalGroup(
            JD_VisualizarVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_VisualizarVillanosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(JD_VisualizarVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnMoficar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Escuadrones");
        jt_Escuadrones.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jt_Escuadrones);

        javax.swing.GroupLayout JD_VualizarArbolLayout = new javax.swing.GroupLayout(JD_VualizarArbol.getContentPane());
        JD_VualizarArbol.getContentPane().setLayout(JD_VualizarArbolLayout);
        JD_VualizarArbolLayout.setHorizontalGroup(
            JD_VualizarArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_VualizarArbolLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        JD_VualizarArbolLayout.setVerticalGroup(
            JD_VualizarArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_VualizarArbolLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Marvel");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmi_Escuadron.setText("Escuadron");
        jmi_Escuadron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EscuadronActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Escuadron);

        jmi_SuperH.setText("Super heroes");
        jmi_SuperH.setEnabled(false);
        jmi_SuperH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_SuperHActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_SuperH);

        jmi_Villanos.setText("Villanos");
        jmi_Villanos.setEnabled(false);
        jmi_Villanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_VillanosActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Villanos);

        jMenu2.setText("Visualizar");

        jmi_Super.setText("Super heroes");
        jmi_Super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_SuperActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_Super);

        jmi_villano.setText("Villanos");
        jmi_villano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_villanoActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_villano);

        jmi_arbol.setText("Arbol");
        jmi_arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_arbolActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_arbol);

        jMenu1.add(jMenu2);
        jMenu1.add(jSeparator1);

        jmi_Salir.setText("Salir");
        jMenu1.add(jmi_Salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEActionPerformed
        // TODO add your handling code here:
        String tipo, lider = "";
        if (rb_SuperH.isSelected()) {
            tipo = "Super Heroe";
            jmi_SuperH.setEnabled(true);
        } else {
            tipo = "Villano";
            jmi_Villanos.setEnabled(true);
        }
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo_Super.getModel();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cboVillanos.getModel();
        DefaultTreeModel m = (DefaultTreeModel) jt_Escuadrones.getModel();
        DefaultMutableTreeNode raiz
                = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_Escuadrones;
        Escuadron p = new Escuadron(tf_Nombre.getText(), tf_Lugar.getText(), tipo);
        nodo_Escuadrones
                = new DefaultMutableTreeNode(
                        new Escuadron(tf_NombreE.getText(), tf_Lugar.getText(), tipo));

        DefaultMutableTreeNode escuadron;
        
        escuadron = new DefaultMutableTreeNode(
                tipo
        );
        escuadron.add(nodo_Escuadrones);
        raiz.add(escuadron);
        if (tipo.equalsIgnoreCase("super heroe")) {
            model.addElement(nodo_Escuadrones);
            cbo_Super.setModel(model);
        }else{
            modelo.addElement(nodo_Escuadrones);
            cboVillanos.setModel(modelo);
        }
        
        m.reload();
        tf_NombreE.setText("");
        tf_Lugar.setText("");
        rb_SuperH.setSelected(true);
        rb_villano.setSelected(false);
        

    }//GEN-LAST:event_btnAgregarEActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmi_EscuadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EscuadronActionPerformed
        // TODO add your handling code here:
        JD_Escuadron.setModal(true);
        JD_Escuadron.pack();
        JD_Escuadron.setLocationRelativeTo(null);
        JD_Escuadron.setVisible(true);
    }//GEN-LAST:event_jmi_EscuadronActionPerformed

    private void jmi_SuperHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_SuperHActionPerformed
        // TODO add your handling code here:
        JD_SuperHeroes.setModal(true);
        JD_SuperHeroes.pack();
        JD_SuperHeroes.setLocationRelativeTo(null);
        JD_SuperHeroes.setVisible(true);
    }//GEN-LAST:event_jmi_SuperHActionPerformed

    private void jmi_VillanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_VillanosActionPerformed
        // TODO add your handling code here:
        JD_Villanos.setModal(true);
        JD_Villanos.pack();
        JD_Villanos.setLocationRelativeTo(null);
        JD_Villanos.setVisible(true);
    }//GEN-LAST:event_jmi_VillanosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int fuerza, agilidadF, agilidadM, suma;
        fuerza = Integer.parseInt(tf_Fuerza.getText());
        agilidadF = Integer.parseInt(tf_AgilidaF.getText());
        agilidadM = Integer.parseInt(tf_AgilidadM.getText());
        suma = fuerza+agilidadF+agilidadM;
        if (suma==100) {
            DefaultListModel modelo
                = (DefaultListModel) jl_SuperH.getModel();
        modelo.addElement(new Super_heroe(tf_Nombre.getText(), tf_Poder.getText(), tf_Debilidad.getText(), cbo_Super.getSelectedItem().toString(), fuerza, agilidadF, agilidadM));
        tf_Nombre.setText("");
        tf_Poder.setText("");
        tf_Debilidad.setText("");
        tf_AgilidaF.setText("");
        tf_AgilidadM.setText("");
        tf_Fuerza.setText("");
        cbo_Super.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(JD_SuperHeroes, "No tiene lo suficiente para ser un super heroe");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        // TODO add your handling code here:
        int fuerza, agilidadF, agilidadM, suma;
        fuerza = Integer.parseInt(tf_Fuerza1.getText());
        agilidadF = Integer.parseInt(tf_AgilidaF1.getText());
        agilidadM = Integer.parseInt(tf_AgilidadM1.getText());
        suma = fuerza+agilidadF+agilidadM;
        if (suma==100) {
            DefaultListModel modelo
                = (DefaultListModel) jl_Villanos.getModel();
        modelo.addElement(new Super_heroe(tf_Nombre1.getText(), tf_Poder1.getText(), tf_Debilidad1.getText(), cboVillanos.getSelectedItem().toString(), fuerza, agilidadF, agilidadM));
        
        tf_Nombre1.setText("");
        tf_Poder1.setText("");
        tf_Debilidad1.setText("");
        tf_AgilidaF1.setText("");
        tf_AgilidadM1.setText("");
        tf_Fuerza1.setText("");
        cboVillanos.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(JD_SuperHeroes, "No tiene lo suficiente para ser un super heroe");
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int eli = jl_SuperH.getSelectedIndex();
        DefaultListModel modelo
                = (DefaultListModel) jl_SuperH.getModel();
        modelo.remove(eli);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jmi_SuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_SuperActionPerformed
        // TODO add your handling code here:
        JD_VisualizarH.setModal(true);
        JD_VisualizarH.pack();
        JD_VisualizarH.setLocationRelativeTo(null);
        JD_VisualizarH.setVisible(true);
    }//GEN-LAST:event_jmi_SuperActionPerformed

    private void jmi_villanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_villanoActionPerformed
        // TODO add your handling code here:
        JD_VisualizarVillanos.setModal(true);
        JD_VisualizarVillanos.pack();
        JD_VisualizarVillanos.setLocationRelativeTo(null);
        JD_VisualizarVillanos.setVisible(true);
    }//GEN-LAST:event_jmi_villanoActionPerformed

    private void jmi_arbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_arbolActionPerformed
        // TODO add your handling code here:
        JD_VualizarArbol.setModal(true);
        JD_VualizarArbol.pack();
        JD_VualizarArbol.setLocationRelativeTo(null);
        JD_VualizarArbol.setVisible(true);
    }//GEN-LAST:event_jmi_arbolActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
        int eli = jl_Villanos.getSelectedIndex();
        DefaultListModel modelo
                = (DefaultListModel) jl_Villanos.getModel();
        modelo.remove(eli);
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JD_Escuadron;
    private javax.swing.JDialog JD_SuperHeroes;
    private javax.swing.JDialog JD_Villanos;
    private javax.swing.JDialog JD_VisualizarH;
    private javax.swing.JDialog JD_VisualizarVillanos;
    private javax.swing.JDialog JD_VualizarArbol;
    private javax.swing.ButtonGroup bg_personaje;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregarE;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMoficar1;
    private javax.swing.JComboBox<String> cboVillanos;
    private javax.swing.JComboBox<String> cbo_Super;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> jl_SuperH;
    private javax.swing.JList<String> jl_Villanos;
    private javax.swing.JMenuItem jmi_Escuadron;
    private javax.swing.JMenuItem jmi_Salir;
    private javax.swing.JMenuItem jmi_Super;
    private javax.swing.JMenuItem jmi_SuperH;
    private javax.swing.JMenuItem jmi_Villanos;
    private javax.swing.JMenuItem jmi_arbol;
    private javax.swing.JMenuItem jmi_villano;
    private javax.swing.JTree jt_Escuadrones;
    private javax.swing.JRadioButton rb_SuperH;
    private javax.swing.JRadioButton rb_villano;
    private javax.swing.JTextField tf_AgilidaF;
    private javax.swing.JTextField tf_AgilidaF1;
    private javax.swing.JTextField tf_AgilidadM;
    private javax.swing.JTextField tf_AgilidadM1;
    private javax.swing.JTextField tf_Debilidad;
    private javax.swing.JTextField tf_Debilidad1;
    private javax.swing.JTextField tf_Fuerza;
    private javax.swing.JTextField tf_Fuerza1;
    private javax.swing.JTextField tf_Lugar;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Nombre1;
    private javax.swing.JTextField tf_NombreE;
    private javax.swing.JTextField tf_Poder;
    private javax.swing.JTextField tf_Poder1;
    // End of variables declaration//GEN-END:variables
    DefaultMutableTreeNode nodo_seleccionado;
    Escuadron escuadron_seleccionado;
    Super_heroe Super_Seleccionado;
    Villano villano_seleccionado;
}
