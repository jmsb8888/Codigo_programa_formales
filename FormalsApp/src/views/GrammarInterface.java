package views;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Gramar;
import models.Manager;
import models.TreeGeneralDerivation;

/**
 *
 * @author Andrés Ramírez - José Salamanca - Julián Ramírez - Laura Vela
 */
public class GrammarInterface extends javax.swing.JFrame {

    private ArrayList<String> snt;
    private ArrayList<String> st;
    private ArrayList<String> prd1;
    private ArrayList<String> prd2;
    private String si;
    private String pc;

    private DefaultTableModel defaultTableModelSNT;
    private DefaultTableModel defaultTableModelST;
    private DefaultTableModel defaultTableModelPRD;

    private Manager manager;
    private Gramar gramar;

    public GrammarInterface() {
        this.initializeData();
        this.gramar = new Gramar();
        this.manager = new Manager();
        manager.setGramar(gramar);
        initComponents();

        this.setLocationRelativeTo(null);

        this.initializeSNTTable();
        this.initializeSTTable();
        this.initializePRDTable();

        this.setVisible(true);
    }

    private void initializeData() {
        snt = new ArrayList<>();
        st = new ArrayList<>();
        prd1 = new ArrayList<>();
        prd2 = new ArrayList<>();
        si = "";
        pc = "";
    }

    private void initializeSNTTable() {
        defaultTableModelSNT = new DefaultTableModel();
        defaultTableModelSNT.setColumnIdentifiers(new String[]{"SNT"});
        tblSNT.setModel(defaultTableModelSNT);

        if (tblSNT.getColumnModel().getColumnCount() > 0) {
            tblSNT.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        tblSNT.getTableHeader().setFont(new Font("SansSerif", 0, 14));

        DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
        defaultTableCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tblSNT.getColumnModel().getColumn(0).setCellRenderer(defaultTableCellRenderer);

        this.repaint();
    }

    private void initializeSTTable() {
        defaultTableModelST = new DefaultTableModel();
        defaultTableModelST.setColumnIdentifiers(new String[]{"ST"});
        tblST.setModel(defaultTableModelST);

        if (tblST.getColumnModel().getColumnCount() > 0) {
            tblST.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        tblST.getTableHeader().setFont(new Font("SansSerif", 0, 14));

        DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
        defaultTableCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tblST.getColumnModel().getColumn(0).setCellRenderer(defaultTableCellRenderer);

        this.repaint();
    }

    private void initializePRDTable() {
        defaultTableModelPRD = new DefaultTableModel();
        defaultTableModelPRD.setColumnIdentifiers(new String[]{"PRD"});
        tblPRD.setModel(defaultTableModelPRD);

        if (tblPRD.getColumnModel().getColumnCount() > 0) {
            tblPRD.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        tblPRD.getTableHeader().setFont(new Font("SansSerif", 0, 14));

        DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
        defaultTableCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tblPRD.getColumnModel().getColumn(0).setCellRenderer(defaultTableCellRenderer);

        this.repaint();
    }

    private void clean() {
        txtSNT.setText("");
        txtST.setText("");
        txtPRD1.setText("");
        txtPRD2.setText("");
        txtSI.setText("");
        txtPC.setText("");

        txtSI.setEditable(true);

        tblSNT.setModel(new DefaultTableModel());
        tblST.setModel(new DefaultTableModel());
        tblPRD.setModel(new DefaultTableModel());

        this.initializeSNTTable();
        this.initializeSTTable();
        this.initializePRDTable();

        this.initializeData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSNT = new javax.swing.JLabel();
        txtSNT = new javax.swing.JTextField();
        btnSNT = new javax.swing.JButton();
        lblST = new javax.swing.JLabel();
        txtST = new javax.swing.JTextField();
        btnST = new javax.swing.JButton();
        lblPRD = new javax.swing.JLabel();
        txtPRD1 = new javax.swing.JTextField();
        txtPRD2 = new javax.swing.JTextField();
        btnPRD = new javax.swing.JButton();
        lblSI = new javax.swing.JLabel();
        txtSI = new javax.swing.JTextField();
        btnSI = new javax.swing.JButton();
        scrSNT = new javax.swing.JScrollPane();
        tblSNT = new javax.swing.JTable();
        scrST = new javax.swing.JScrollPane();
        tblST = new javax.swing.JTable();
        scrPRD = new javax.swing.JScrollPane();
        tblPRD = new javax.swing.JTable();
        lblPC = new javax.swing.JLabel();
        txtPC = new javax.swing.JTextField();
        btnPC = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FormalsApp");
        setResizable(false);

        pnlBackground.setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LENGUAJES FORMALES");

        lblSNT.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSNT.setText("Símbolo no terminal:");

        txtSNT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSNT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNTActionPerformed(evt);
            }
        });
        txtSNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSNTKeyTyped(evt);
            }
        });

        btnSNT.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSNT.setText("Agregar símbolo no terminal");
        btnSNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSNTActionPerformed(evt);
            }
        });

        lblST.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblST.setText("Símbolo terminal:");

        txtST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtST.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtST.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSTKeyTyped(evt);
            }
        });

        btnST.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnST.setText("Agregar símbolo terminal");
        btnST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTActionPerformed(evt);
            }
        });

        lblPRD.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPRD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPRD.setText("Producción:");

        txtPRD1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPRD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPRD1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPRD1KeyTyped(evt);
            }
        });

        txtPRD2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPRD2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPRD2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPRD2KeyTyped(evt);
            }
        });

        btnPRD.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPRD.setText("Agregar producción");
        btnPRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRDActionPerformed(evt);
            }
        });

        lblSI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSI.setText("Símbolo inicial:");

        txtSI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSIKeyTyped(evt);
            }
        });

        btnSI.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSI.setText("Agregar símbolo inicial");
        btnSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIActionPerformed(evt);
            }
        });

        tblSNT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrSNT.setViewportView(tblSNT);

        tblST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ST"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrST.setViewportView(tblST);

        tblPRD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrPRD.setViewportView(tblPRD);

        lblPC.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPC.setText("Palabra a comprobar:");

        txtPC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPCKeyTyped(evt);
            }
        });

        btnPC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPC.setText("Comprobar palabra");
        btnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPCActionPerformed(evt);
            }
        });

        btnClean.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(673, 673, 673))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPRD, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addComponent(lblPRD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPRD1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPRD2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addComponent(lblST, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtST, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnST, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrST, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrPRD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblSI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSI, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPC, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)))
                        .addGap(26, 26, 26))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtST, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblST, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnST, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPRD1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPRD2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPRD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPRD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrSNT, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrST, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrPRD, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblPC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSNTActionPerformed
        if (!txtSNT.getText().equals("")) {
            if (!snt.contains(txtSNT.getText())) {
                defaultTableModelSNT.addRow(new Object[]{txtSNT.getText()});
                snt.add(txtSNT.getText());
            } else {
                JOptionPane.showMessageDialog(null,
                        "El símbolo no terminal que desea agregar ya existe",
                        "ERROR AL AGREGAR", JOptionPane.ERROR_MESSAGE);
            }
            txtSNT.setText("");
        }
    }//GEN-LAST:event_btnSNTActionPerformed

    private void btnSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTActionPerformed
        if (!txtST.getText().equals("")) {
            if (!st.contains(txtST.getText())) {
                defaultTableModelST.addRow(new Object[]{txtST.getText()});
                st.add(txtST.getText());
            } else {
                JOptionPane.showMessageDialog(null,
                        "El símbolo terminal que desea agregar ya existe",
                        "ERROR AL AGREGAR", JOptionPane.ERROR_MESSAGE);
            }
            txtST.setText("");
        }
    }//GEN-LAST:event_btnSTActionPerformed

    private void btnPRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRDActionPerformed
        if (!txtPRD1.getText().equals("")) {
            if (snt.contains(txtPRD1.getText())) {
                String prd2Text = "λ";
                if (!txtPRD2.getText().equals("")) {
                    prd2Text = txtPRD2.getText();
                }
                if (!((prd1.contains(txtPRD1.getText())) && (prd2.contains(prd2Text)))) {
                    if ((prd2Text.charAt(0) >= 97 && prd2Text.charAt(0) <= 122) || prd2Text.equals("λ")) {
                        defaultTableModelPRD.addRow(new Object[]{(txtPRD1.getText() + " --> " + prd2Text)});
                        prd1.add(txtPRD1.getText());
                        prd2.add(prd2Text);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "El segundo parámetro de la producción debe ser vacío o\n"
                                + "            empezar con un simbolo terminal existente",
                                "ERROR AL AGREGAR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "La producción que desea agregar ya existe",
                            "ERROR AL AGREGAR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "El primer parámetro de la producción no hace parte de \n"
                        + "             los símbolos no terminales existentes",
                        "ERROR AL AGREGAR", JOptionPane.ERROR_MESSAGE);
            }
            txtPRD1.setText("");
            txtPRD2.setText("");
        }
    }//GEN-LAST:event_btnPRDActionPerformed

    private void btnSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIActionPerformed
        if (!txtSI.getText().equals("")) {
            if (snt.contains(txtSI.getText())) {
                si = txtSI.getText();
                txtSI.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null,
                        "El símbolo inicial no hace parte de los símbolos no terminales existentes",
                        "ERROR AL DEFINIR", JOptionPane.ERROR_MESSAGE);
                txtSI.setText("");
            }
        }
    }//GEN-LAST:event_btnSIActionPerformed

    private void btnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPCActionPerformed
        if (!txtPC.getText().equals("")) {
            if (snt.size() >= 3 && st.size() >= 2 && prd1.size() >= 3) {
                if (!si.equals("")) {
                    this.pc = txtPC.getText();
                    manager.getGramar().setStartSymbol(si);
                    manager.getDerivationWord().getGramar().setStartSymbol(si);
                    manager.getGramar().setSymbolNoTerminal(snt);
                    manager.getDerivationWord().getGramar().setSymbolNoTerminal(snt);
                    manager.getGramar().setSymbolTerminal(st);
                    manager.getDerivationWord().getGramar().setSymbolTerminal(st);
                    for (int i = 0; i < prd1.size(); i++) {
                        manager.getGramar().addProduction(prd1.get(i), prd2.get(i));
                        manager.getDerivationWord().getGramar().addProduction(prd1.get(i), prd2.get(i));
                    }
                    manager.getTreeGeneralDerivation().runBuild();
                    String generalTree = printTree(manager.getTreeGeneralDerivation());
                    Results results = new Results();
                    results.setGeneralTree(generalTree);
                    if (manager.getDerivationWord().IsValidateWord(pc)) {
                        results.setParticularTree("");
                        results.setResult("");
                        results.setResult(("La palabra " + pc + " SI es valida para la gramática definida"));
                        String first = manager.getDerivationWord().getHorizontalDerivation();
                        String particularTree = first.substring(0, first.length() - 1); 
                        results.setParticularTree(particularTree);
                    } else {
                        results.setResult(("La palabra " + pc + " NO es valida para la gramática definida"));
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Se debe definir un símbolo inicial para poder comprobar una palabra",
                            "ERROR AL COMPROBAR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Se deben insertar mínimo dos símbolos terminales, tres no terminales \n"
                        + "           y tres producciones, para poder comprobar una palabra",
                        "ERROR AL COMPROBAR", JOptionPane.ERROR_MESSAGE);
            }
            txtPC.setText("");
        }
    }//GEN-LAST:event_btnPCActionPerformed

    private String printTree(TreeGeneralDerivation tree) {
        ArrayList<String> treePrint = new ArrayList<>();
        treePrint.add(tree.getRoot().getValue());
        String generalTree = "";
        for (int i = 0; i < tree.getRoot().getChildren().size(); i++) {
            treePrint.add("\n-- : " + tree.getRoot().getChildren().get(i).getValue());
            for (int j = 0; j < tree.getRoot().getChildren().get(i).getChildren().size(); j++) {
                treePrint.add("\n------- : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getValue());
                for (int k = 0; k < tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().size(); k++) {
                    treePrint.add("\n------------- : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getValue());
                    for (int g = 0; g < tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getChildren().size(); g++) {
                        treePrint.add("\n------------------ : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getChildren().get(g).getValue());
                    }
                }
            }
        }
        for (String part : treePrint) {
            generalTree += part;
        }
        return generalTree;
    }

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        this.initializeData();
        this.clean();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void txtSNTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSNTKeyTyped
        int key = evt.getKeyChar();

        boolean characters = key >= 65 && key <= 90;

        if (!characters) {
            evt.consume();
        }

        if (txtSNT.getText().trim().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSNTKeyTyped

    private void txtSTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSTKeyTyped
        int key = evt.getKeyChar();

        boolean characters = key >= 97 && key <= 122;

        if (!characters) {
            evt.consume();
        }

        if (txtST.getText().trim().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSTKeyTyped

    private void txtPRD1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPRD1KeyTyped
        int key = evt.getKeyChar();

        boolean characters = key >= 65 && key <= 90;

        if (!characters) {
            evt.consume();
        }

        if (txtPRD1.getText().trim().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPRD1KeyTyped

    private void txtPRD2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPRD2KeyTyped
        int key = evt.getKeyChar();

        boolean characters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122);

        if (!characters) {
            evt.consume();
        }

        if (txtPRD2.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPRD2KeyTyped

    private void txtSIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSIKeyTyped
        int key = evt.getKeyChar();

        boolean characters = key >= 65 && key <= 90;

        if (!characters) {
            evt.consume();
        }

        if (txtSI.getText().trim().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSIKeyTyped

    private void txtPCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPCKeyTyped
        int key = evt.getKeyChar();

        boolean characters = key >= 97 && key <= 122;

        if (!characters) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPCKeyTyped

    private void txtSNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnPC;
    private javax.swing.JButton btnPRD;
    private javax.swing.JButton btnSI;
    private javax.swing.JButton btnSNT;
    private javax.swing.JButton btnST;
    private javax.swing.JLabel lblPC;
    private javax.swing.JLabel lblPRD;
    private javax.swing.JLabel lblSI;
    private javax.swing.JLabel lblSNT;
    private javax.swing.JLabel lblST;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JScrollPane scrPRD;
    private javax.swing.JScrollPane scrSNT;
    private javax.swing.JScrollPane scrST;
    private javax.swing.JTable tblPRD;
    private javax.swing.JTable tblSNT;
    private javax.swing.JTable tblST;
    private javax.swing.JTextField txtPC;
    private javax.swing.JTextField txtPRD1;
    private javax.swing.JTextField txtPRD2;
    private javax.swing.JTextField txtSI;
    private javax.swing.JTextField txtSNT;
    private javax.swing.JTextField txtST;
    // End of variables declaration//GEN-END:variables
}
