package vista;

import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
import controlador.Controlador;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;

/**
 *
 * @author Marcos Perez
 */
public class Directorio extends javax.swing.JFrame {

    Controlador control;
    DefaultListModel modLisContactos;

    public Directorio() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.jlbllupa.setVisible(false);
        this.jSeparator1.setVisible(false);
        this.jtxfLocalizar.setVisible(false);
        this.jlblCorreo.setVisible(false);
        this.jlblDireccion.setVisible(false);
        this.jlblNombreCompleto.setVisible(false);
        this.jlblTelefono.setVisible(false);
        this.jtxfCorreo.setVisible(false);
        this.jtxfDireccion.setVisible(false);
        this.jtxfNombre.setVisible(false);
        this.jtxfTelefono.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jLabel7.setVisible(false);
        this.jLabel5.setVisible(false);
        this.jLabel6.setVisible(false);
        this.jSeparator2.setVisible(false);
        this.jSeparator3.setVisible(false);
        this.jSeparator4.setVisible(false);
        this.jSeparator5.setVisible(false);
        this.lblEliminar.setVisible(false);
        this.lblAgregar.setVisible(false);
        AnimationClass bienvenido = new AnimationClass();
        bienvenido.jLabelYDown(240, 320, 10, 5, jlblBienvenido);
        AnimationClass bienvenidol = new AnimationClass();
        bienvenidol.jLabelYDown(-150, 10, 10, 5, lblLogo);
        modLisContactos = new DefaultListModel();
        jbtnAgregar.setVisible(false);
        jbtnEliminar.setVisible(false);

    }

    public void actualizarList() {

        modLisContactos.clear();
        System.out.println(control.listaContacto().size());
        for (int i = 0; i < control.listaContacto().size(); i++) {
            //System.out.println(control.listaContacto().get(i));
            modLisContactos.addElement(control.listaContacto().get(i));
        }

        jListContactos.setModel(modLisContactos);

    }

    public void soloLetras(KeyEvent evt) {
        Character cadena = evt.getKeyChar();
        if (!Character.isLetter(cadena) && cadena != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }

    public void soloNumeros(KeyEvent evt) {
        Character cadena = evt.getKeyChar();
        if (Character.isLetter(cadena) || cadena == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }

    public void noEspacio(KeyEvent evt) {
        Character cadena = evt.getKeyChar();
        if (cadena == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }

    public void setControl(Controlador control) {
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListContactos = new javax.swing.JList<>();
        jlbllupa = new javax.swing.JLabel();
        jtxfLocalizar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblDatosEst = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblModoEstado = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        lblInsercion = new javax.swing.JLabel();
        jpnlModoBuscar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        lblAgregar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxfNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jtxfCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jtxfDireccion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jtxfTelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jlblNombreCompleto = new javax.swing.JLabel();
        jlblDireccion = new javax.swing.JLabel();
        jlblCorreo = new javax.swing.JLabel();
        jlblTelefono = new javax.swing.JLabel();
        jlblBienvenido = new javax.swing.JLabel();
        jbtnEliminar = new javax.swing.JButton();
        jbtnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/alt_contacts_7.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 170));

        jListContactos.setBackground(new java.awt.Color(204, 204, 204));
        jListContactos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contactos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        jListContactos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jListContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListContactos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 310));

        jlbllupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Search_32px.png"))); // NOI18N
        jPanel1.add(jlbllupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jtxfLocalizar.setBackground(new java.awt.Color(204, 204, 204));
        jtxfLocalizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxfLocalizar.setText("Nombre de Usuario a Localizar");
        jtxfLocalizar.setBorder(null);
        jtxfLocalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfLocalizarMouseClicked(evt);
            }
        });
        jtxfLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfLocalizarActionPerformed(evt);
            }
        });
        jtxfLocalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfLocalizarKeyReleased(evt);
            }
        });
        jPanel1.add(jtxfLocalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 570));

        jPanel2.setBackground(new java.awt.Color(66, 133, 244));
        jPanel2.setForeground(new java.awt.Color(66, 133, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/descargaffff.png"))); // NOI18N
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, -10, 30, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Directorio de Contacto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 320, 30));

        lblCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cerrar.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        lblDatosEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDatosEst.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/info.png"))); // NOI18N
        lblDatosEst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDatosEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDatosEstMouseClicked(evt);
            }
        });
        jPanel2.add(lblDatosEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModoEstado.setBackground(new java.awt.Color(255, 255, 255));
        lblModoEstado.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblModoEstado.setForeground(new java.awt.Color(102, 102, 255));
        jPanel3.add(lblModoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 30));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_Menu_32px_1.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        jPanel3.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, -1));

        lblBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        lblBusqueda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBusqueda.setForeground(new java.awt.Color(66, 133, 244));
        lblBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/modo buscar_opt.png"))); // NOI18N
        lblBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBusquedaMouseClicked(evt);
            }
        });
        jPanel3.add(lblBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 40, 30));

        lblInsercion.setBackground(new java.awt.Color(255, 255, 255));
        lblInsercion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInsercion.setForeground(new java.awt.Color(66, 133, 244));
        lblInsercion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/modo insertar_opt.png"))); // NOI18N
        lblInsercion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInsercion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInsercionMouseClicked(evt);
            }
        });
        jPanel3.add(lblInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 40, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 600, 50));

        jpnlModoBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jpnlModoBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jpnlModoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jpnlModoBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEliminar.setForeground(new java.awt.Color(102, 102, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/delete-userm.png"))); // NOI18N
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblEliminarMouseMoved(evt);
            }
        });
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });
        jpnlModoBuscar.add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, -1));

        lblAgregar.setForeground(new java.awt.Color(102, 102, 255));
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/add-userm.png"))); // NOI18N
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAgregarMouseMoved(evt);
            }
        });
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgregarMouseExited(evt);
            }
        });
        jpnlModoBuscar.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, 140));

        lblLogo.setForeground(new java.awt.Color(102, 102, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/IconoDirectorioContactos.png"))); // NOI18N
        lblLogo.setToolTipText("");
        jpnlModoBuscar.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -150, 120, 150));

        jLabel3.setText("Nombre:");
        jpnlModoBuscar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel5.setText("Dirección:");
        jpnlModoBuscar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel6.setText("Email:");
        jpnlModoBuscar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel7.setText("Telefono:");
        jpnlModoBuscar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        jtxfNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtxfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfNombre.setText("Nombre Completo");
        jtxfNombre.setToolTipText("");
        jtxfNombre.setBorder(null);
        jtxfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfNombreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfNombreMouseExited(evt);
            }
        });
        jtxfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfNombreActionPerformed(evt);
            }
        });
        jtxfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxfNombreKeyTyped(evt);
            }
        });
        jpnlModoBuscar.add(jtxfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 220, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpnlModoBuscar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 220, 10));

        jtxfCorreo.setBackground(new java.awt.Color(204, 204, 204));
        jtxfCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfCorreo.setText("Correo Electronico");
        jtxfCorreo.setBorder(null);
        jtxfCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfCorreoMouseClicked(evt);
            }
        });
        jtxfCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxfCorreoKeyTyped(evt);
            }
        });
        jpnlModoBuscar.add(jtxfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 220, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jpnlModoBuscar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 220, 10));

        jtxfDireccion.setBackground(new java.awt.Color(204, 204, 204));
        jtxfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfDireccion.setText("Direccion");
        jtxfDireccion.setBorder(null);
        jtxfDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfDireccionMouseClicked(evt);
            }
        });
        jtxfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfDireccionActionPerformed(evt);
            }
        });
        jpnlModoBuscar.add(jtxfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 220, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpnlModoBuscar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 220, 10));

        jtxfTelefono.setBackground(new java.awt.Color(204, 204, 204));
        jtxfTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxfTelefono.setText("7777777777");
        jtxfTelefono.setBorder(null);
        jtxfTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfTelefonoMouseClicked(evt);
            }
        });
        jtxfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxfTelefonoKeyTyped(evt);
            }
        });
        jpnlModoBuscar.add(jtxfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 220, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpnlModoBuscar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 220, 10));

        jlblNombreCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblNombreCompleto.setForeground(new java.awt.Color(153, 153, 153));
        jlblNombreCompleto.setText("Nombre Completo");
        jpnlModoBuscar.add(jlblNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 220, -1));

        jlblDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblDireccion.setForeground(new java.awt.Color(153, 153, 153));
        jlblDireccion.setText("Direccion");
        jpnlModoBuscar.add(jlblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 220, 20));

        jlblCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblCorreo.setForeground(new java.awt.Color(153, 153, 153));
        jlblCorreo.setText("Correo Electronico");
        jpnlModoBuscar.add(jlblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 220, 20));

        jlblTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblTelefono.setForeground(new java.awt.Color(153, 153, 153));
        jlblTelefono.setText("Telefono Movil o Fijo");
        jpnlModoBuscar.add(jlblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 220, 20));

        jlblBienvenido.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlblBienvenido.setForeground(new java.awt.Color(66, 133, 244));
        jlblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblBienvenido.setText("!!Bienvenido a Su Directorio Personal!!");
        jpnlModoBuscar.add(jlblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 510, 40));

        jbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setForeground(new java.awt.Color(153, 153, 255));
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseClicked(evt);
            }
        });
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jpnlModoBuscar.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 90, 20));

        jbtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setForeground(new java.awt.Color(153, 153, 255));
        jbtnAgregar.setText("AGREGAR");
        jbtnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAgregarMouseClicked(evt);
            }
        });
        jpnlModoBuscar.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 90, 20));

        getContentPane().add(jpnlModoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 600, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxfLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfLocalizarActionPerformed

    }//GEN-LAST:event_jtxfLocalizarActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked

        AnimationClass insercion = new AnimationClass();
        insercion.jLabelXLeft(600, 515, 10, 5, lblInsercion);
        AnimationClass busqueda = new AnimationClass();
        busqueda.jLabelXLeft(610, 465, 10, 5, lblBusqueda);
        //<---
        AnimationClass busquedas = new AnimationClass();
        busquedas.jLabelXRight(465, 610, 10, 5, lblBusqueda);
        AnimationClass insercions = new AnimationClass();
        insercions.jLabelXLeft(515, 600, 10, 5, lblInsercion);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBusquedaMouseClicked

        AnimationClass busqueda = new AnimationClass();
        busqueda.jLabelXRight(465, 610, 10, 5, lblBusqueda);
        AnimationClass insercion = new AnimationClass();
        insercion.jLabelXLeft(515, 600, 10, 5, lblInsercion);
        this.lblModoEstado.setText("Modo Busqueda");
        AnimationClass bienvenidol = new AnimationClass();
        bienvenidol.jLabelYUp(10, -150, 10, 5, lblLogo);
        this.lblEliminar.setVisible(true);
        this.lblAgregar.setVisible(false);
        this.jbtnEliminar.setVisible(true);
        this.jbtnAgregar.setVisible(false);
        this.jlbllupa.setVisible(true);
        this.jSeparator1.setVisible(true);
        this.jtxfLocalizar.setVisible(true);
        this.jlblBienvenido.setVisible(false);
        this.jtxfCorreo.setVisible(false);
        this.jtxfDireccion.setVisible(false);
        this.jtxfNombre.setVisible(false);
        this.jtxfTelefono.setVisible(false);
        this.jlblCorreo.setVisible(true);
        this.jlblDireccion.setVisible(true);
        this.jlblNombreCompleto.setVisible(true);
        this.jlblTelefono.setVisible(true);
        this.jLabel3.setVisible(true);
        this.jLabel7.setVisible(true);
        this.jLabel5.setVisible(true);
        this.jLabel6.setVisible(true);
        this.jSeparator2.setVisible(true);
        this.jSeparator3.setVisible(true);
        this.jSeparator4.setVisible(true);
        this.jSeparator5.setVisible(true);
        //fin detalles vista

        this.actualizarList();


    }//GEN-LAST:event_lblBusquedaMouseClicked

    private void lblInsercionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInsercionMouseClicked
        
        AnimationClass busqueda = new AnimationClass();
        busqueda.jLabelXRight(465, 610, 10, 5, lblBusqueda);
        AnimationClass insercion = new AnimationClass();
        insercion.jLabelXLeft(515, 600, 10, 5, lblInsercion);
        AnimationClass bienvenidol = new AnimationClass();
        bienvenidol.jLabelYUp(10, -150, 10, 5, lblLogo);
        this.lblModoEstado.setText("Modo Inserción");
        this.lblEliminar.setVisible(false);
        this.lblAgregar.setVisible(true);
        this.jbtnEliminar.setVisible(false);
        this.jbtnAgregar.setVisible(true);
        this.jlbllupa.setVisible(false);
        this.jSeparator1.setVisible(false);
        this.jtxfLocalizar.setVisible(false);
        this.jlblBienvenido.setVisible(false);
        this.jlblCorreo.setVisible(false);
        this.jlblDireccion.setVisible(false);
        this.jlblNombreCompleto.setVisible(false);
        this.jlblTelefono.setVisible(false);
        this.jtxfCorreo.setVisible(true);
        this.jtxfDireccion.setVisible(true);
        this.jtxfNombre.setVisible(true);
        this.jtxfTelefono.setVisible(true);
        this.jLabel3.setVisible(true);
        this.jLabel7.setVisible(true);
        this.jLabel5.setVisible(true);
        this.jLabel6.setVisible(true);
        this.jSeparator2.setVisible(true);
        this.jSeparator3.setVisible(true);
        this.jSeparator4.setVisible(true);
        this.jSeparator5.setVisible(true);
        this.actualizarList();

    }//GEN-LAST:event_lblInsercionMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked

        this.setState(Directorio.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked

        int result = JOptionPane.showConfirmDialog(this, "Saldra de Directorio, esta seguro? ", "Salir", JOptionPane.YES_NO_OPTION);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblDatosEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDatosEstMouseClicked
        control.datosEstadisticos();
    }//GEN-LAST:event_lblDatosEstMouseClicked

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited


    }//GEN-LAST:event_lblEliminarMouseExited

    private void lblEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseMoved

    }//GEN-LAST:event_lblEliminarMouseMoved

    private void jtxfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfDireccionActionPerformed

    }//GEN-LAST:event_jtxfDireccionActionPerformed

    private void lblAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseMoved

    }//GEN-LAST:event_lblAgregarMouseMoved

    private void lblAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseExited

    }//GEN-LAST:event_lblAgregarMouseExited

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked

    }//GEN-LAST:event_lblAgregarMouseClicked

    private void jListContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListContactosMouseClicked
        String[] datos = control.getInfo(jListContactos.getSelectedValue());
        jlblNombreCompleto.setText(datos[0]);
        jlblTelefono.setText(datos[1]);
        jlblDireccion.setText(datos[2]);
        jlblCorreo.setText(datos[3]);
    }//GEN-LAST:event_jListContactosMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked

    }//GEN-LAST:event_lblEliminarMouseClicked

    private void jbtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseClicked
        if (jListContactos.getSelectedIndex() >= 0) {
            String a=jListContactos.getSelectedValue();
            control.eliminarCont(a);
            this.actualizarList();
            control.notifica(a, false);//false para indicar que se está eliminando
            jtxfNombre.setText("");
            jtxfTelefono.setText("");
            jtxfDireccion.setText("");
            jtxfCorreo.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe selecionar un contacto de la lista", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnEliminarMouseClicked

    private void jtxfLocalizarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfLocalizarKeyReleased

        if ("".equals(jtxfLocalizar.getText())) {
            this.actualizarList();
        } else {
            String nombre = control.buscar(jtxfLocalizar.getText());
            if (nombre != null) {

                modLisContactos.clear();
                modLisContactos.addElement(nombre);

            }
        }
    }//GEN-LAST:event_jtxfLocalizarKeyReleased

    private void jbtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseClicked

        if (jtxfNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Por lo menos debes identificar con un nombre a tu contacto", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (null != control.buscar(jtxfNombre.getText())) {
            JOptionPane.showMessageDialog(this, "No puedes tener mas de un contacto con el mismo nombre", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double telefono=0;
            if(!jtxfTelefono.getText().isEmpty()){
               telefono = Double.parseDouble(jtxfTelefono.getText());
            }            
            control.agregarCont(jtxfNombre.getText(), telefono, jtxfDireccion.getText(), jtxfCorreo.getText());
            control.notifica(jtxfNombre.getText(), true);//true para indicar que se está agregando
            jtxfNombre.setText("Nombre Completo");
            jtxfTelefono.setText("7777777777");
            jtxfDireccion.setText("Direccion");
            jtxfCorreo.setText("Correo Electronico");
        }
        this.actualizarList();
    }//GEN-LAST:event_jbtnAgregarMouseClicked

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed

    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jtxfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfNombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtxfNombreActionPerformed

    private void jtxfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfNombreKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_jtxfNombreKeyTyped

    private void jtxfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfTelefonoKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_jtxfTelefonoKeyTyped

    private void jtxfCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfCorreoKeyTyped
        noEspacio(evt);
    }//GEN-LAST:event_jtxfCorreoKeyTyped

    private void jtxfNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfNombreMouseClicked
        // TODO add your handling code here:
        if (jtxfNombre.getText().equals("Nombre Completo")) {
            jtxfNombre.setText("");
        }
    }//GEN-LAST:event_jtxfNombreMouseClicked

    private void jtxfNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfNombreMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_jtxfNombreMouseExited

    private void jtxfLocalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfLocalizarMouseClicked
        if (jtxfLocalizar.getText().equals("Nombre de Usuario a Localizar")) {
            jtxfLocalizar.setText("");
        }
    }//GEN-LAST:event_jtxfLocalizarMouseClicked

    private void jtxfDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfDireccionMouseClicked
        if (jtxfDireccion.getText().equals("Direccion")) {
            jtxfDireccion.setText("");
        }
    }//GEN-LAST:event_jtxfDireccionMouseClicked

    private void jtxfCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfCorreoMouseClicked
        if (jtxfCorreo.getText().equals("Correo Electronico")) {
            jtxfCorreo.setText("");
        }
    }//GEN-LAST:event_jtxfCorreoMouseClicked

    private void jtxfTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfTelefonoMouseClicked
        if (jtxfTelefono.getText().equals("7777777777")) {
            jtxfTelefono.setText("");
        }
    }//GEN-LAST:event_jtxfTelefonoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListContactos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JLabel jlblCorreo;
    private javax.swing.JLabel jlblDireccion;
    private javax.swing.JLabel jlblNombreCompleto;
    private javax.swing.JLabel jlblTelefono;
    private javax.swing.JLabel jlbllupa;
    private javax.swing.JPanel jpnlModoBuscar;
    private javax.swing.JTextField jtxfCorreo;
    private javax.swing.JTextField jtxfDireccion;
    private javax.swing.JTextField jtxfLocalizar;
    private javax.swing.JTextField jtxfNombre;
    private javax.swing.JTextField jtxfTelefono;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDatosEst;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblInsercion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblModoEstado;
    // End of variables declaration//GEN-END:variables
}
