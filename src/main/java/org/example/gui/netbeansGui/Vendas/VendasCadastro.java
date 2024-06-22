/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.gui.netbeansGui.Vendas;

import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.example.interactions.SystemInteractions;
import org.example.tables.Produtos;
import org.example.tables.Vendas;

/**
 *
 * @author wesle
 */
public class VendasCadastro extends javax.swing.JFrame {

    SystemInteractions interactions = new SystemInteractions();

    /**
     * Creates new form VendasCadastro
     */
    public VendasCadastro() {
        initComponents();

        addRowToJTable();
    }

    public VendasCadastro(String cpf) {
        initComponents();

        addRowToJTable();

        cpfClient.setText(cpf);
        checkInputColor(cpfClient);
    }

    private void checkInputColor(JTextField textField) {
        Color grayColor = new Color(204, 204, 204);
        if (textField.getForeground().equals(grayColor)) {
            textField.setForeground(Color.BLACK);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cpfClient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valorUnitario = new javax.swing.JTextField();
        idProduct = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        qttSold = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        searchByName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo cadastro");
        setBackground(new java.awt.Color(0, 0, 0));
        setSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(109, 204, 214));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 800));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 800));

        jPanel3.setBackground(new java.awt.Color(235, 235, 235));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel3.setText("Valor unitário:");

        cpfClient.setForeground(new java.awt.Color(204, 204, 204));
        cpfClient.setText("000-000-000-00");
        cpfClient.setNextFocusableComponent(idProduct);
        cpfClient.setPreferredSize(new java.awt.Dimension(360, 22));
        cpfClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfClientFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfClientFocusLost(evt);
            }
        });
        cpfClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfClientKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel6.setText("CPF do cliente:");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel5.setText("ID do produto:");

        valorUnitario.setForeground(new java.awt.Color(204, 204, 204));
        valorUnitario.setText("0");
        valorUnitario.setNextFocusableComponent(qttSold);
        valorUnitario.setPreferredSize(new java.awt.Dimension(360, 22));
        valorUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valorUnitarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valorUnitarioFocusLost(evt);
            }
        });
        valorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valorUnitarioKeyReleased(evt);
            }
        });

        idProduct.setForeground(new java.awt.Color(204, 204, 204));
        idProduct.setText("0");
        idProduct.setNextFocusableComponent(valorUnitario);
        idProduct.setPreferredSize(new java.awt.Dimension(360, 22));
        idProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idProductFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idProductFocusLost(evt);
            }
        });
        idProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idProductKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel10.setText("Qtd. vendida:");

        qttSold.setForeground(new java.awt.Color(204, 204, 204));
        qttSold.setText("0");
        qttSold.setNextFocusableComponent(cpfClient);
        qttSold.setPreferredSize(new java.awt.Dimension(360, 22));
        qttSold.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qttSoldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qttSoldFocusLost(evt);
            }
        });
        qttSold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qttSoldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(valorUnitario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qttSold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(valorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(qttSold, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Quantidade", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(109, 172, 171));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setText("Lista de produtos:");

        jButton3.setBackground(new java.awt.Color(109, 172, 171));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Confirmar");
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("Efetuar registro de venda:");

        searchByName.setForeground(new java.awt.Color(204, 204, 204));
        searchByName.setText("Nome do produto");
        searchByName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchByNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchByNameFocusLost(evt);
            }
        });
        searchByName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByNameKeyReleased(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchIcon_resized.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Novo");

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Voltar");
        jButton4.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoPng.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cadastro");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cpf = cpfClient.getText();
        Integer id = null;
        Integer qtd = null;
        Double valorUnit = null;

        if (!idProduct.getText().trim().equals("0")) {
            id = Integer.valueOf(idProduct.getText());
        }

        if (!qttSold.getText().trim().equals("0")) {
            qtd = Integer.valueOf(qttSold.getText());
        }

        if (!valorUnitario.getText().trim().equals("0")) {
            valorUnit = Double.valueOf(valorUnitario.getText());
        }

        if (!cpf.trim().equals("000-000-000-00") && id != null && qtd != null && valorUnit != null) {
            try {
                if (qtd > 0) {
                    Vendas venda = new Vendas(cpf, id, valorUnit, qtd);

                    interactions.criarVenda(venda);

                    // Mensagem a ser exibida
                    String message = "Venda cadastrada com sucesso!";
                    String title = "Sucesso";

                    // Criar botões personalizados
                    Object[] options = {"Voltar", "Permanecer"};

                    // Exibir o JOptionPane com botões personalizados
                    int choice = JOptionPane.showOptionDialog(
                            rootPane, // Componente pai
                            message, // Mensagem
                            title, // Título
                            JOptionPane.YES_NO_OPTION, // Tipo de opção
                            JOptionPane.INFORMATION_MESSAGE, // Tipo de mensagem
                            null, // Ícone
                            options, // Botões personalizados
                            options[0] // Botão padrão
                    );

                    // Ação com base na escolha do usuário
                    if (choice == JOptionPane.YES_OPTION) {
                        // Ação para "Voltar à Tela"
                        VendasFrame vendasFrame = new VendasFrame();
                        vendasFrame.setVisible(true);
                        vendasFrame.pack();
                        vendasFrame.setLocationRelativeTo(null);
                        this.dispose();
                    }

                    addRowToJTable();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "A quantidade de produtos deve ser maior que 0.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(VendasCadastro.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar a venda: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Existem campos vazios.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VendasFrame vendasFrame = new VendasFrame();
        vendasFrame.setVisible(true);
        vendasFrame.pack();
        vendasFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        addSelectedRowToInputs();
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchByNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByNameKeyReleased
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        List<Produtos> produtos;

        if (searchByName.getText().equals("")) {
            produtos = interactions.visualizarProdutos();
        } else {
            produtos = interactions.visualizarProdutosPorNome(searchByName.getText());
        }

        Object rowData[] = new Object[5];

        for (Produtos produto : produtos) {
            rowData[0] = produto.getId();
            rowData[1] = produto.getNome();
            rowData[2] = produto.getValor();
            rowData[3] = produto.getQuantidade();
            rowData[4] = produto.getDescricao();

            model.addRow(rowData);
        }
    }//GEN-LAST:event_searchByNameKeyReleased

    private void searchByNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchByNameFocusGained
        if (searchByName.getText().equals("Nome do produto")) {
            searchByName.setText("");
            searchByName.setForeground(Color.black);
        }
    }//GEN-LAST:event_searchByNameFocusGained

    private void searchByNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchByNameFocusLost
        if (searchByName.getText().equals("")) {
            searchByName.setText("Nome do produto");
            searchByName.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_searchByNameFocusLost

    private void cpfClientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfClientKeyReleased
        String input = cpfClient.getText();

        // Remover todos os caracteres não numéricos
        input = input.replaceAll("[^\\d]", "");

        StringBuilder formattedInput = new StringBuilder(input);

        // Adicionar '-' nos locais corretos do CPF
        if (formattedInput.length() > 3) {
            formattedInput.insert(3, "-");
        }
        if (formattedInput.length() > 7) {
            formattedInput.insert(7, "-");
        }
        if (formattedInput.length() > 11) {
            formattedInput.insert(11, "-");
        }
        // Limitar a 14 caracteres no máximo (000-000-000-00)
        if (formattedInput.length() > 14) {
            formattedInput.setLength(14);
        }

        // Atualizar o conteúdo do jTextField2
        cpfClient.setText(formattedInput.toString());

        // Validar o CPF
        if (formattedInput.length() == 14) {
            // Realizar a validação específica do CPF aqui
            // Você pode usar bibliotecas de validação de CPF ou implementar a validação manualmente
        }

    }//GEN-LAST:event_cpfClientKeyReleased

    private void cpfClientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfClientFocusGained
        if (cpfClient.getText().equals("000-000-000-00")) {
            cpfClient.setText("");
            cpfClient.setForeground(Color.black);
        }
    }//GEN-LAST:event_cpfClientFocusGained

    private void cpfClientFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfClientFocusLost
        if (cpfClient.getText().equals("")) {
            cpfClient.setText("000-000-000-00");
            cpfClient.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_cpfClientFocusLost

    private void idProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idProductFocusGained
        if (idProduct.getText().equals("0")) {
            idProduct.setText("");
            idProduct.setForeground(Color.black);
        }
    }//GEN-LAST:event_idProductFocusGained

    private void idProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idProductFocusLost
        if (idProduct.getText().equals("")) {
            idProduct.setText("0");
            idProduct.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_idProductFocusLost

    private void valorUnitarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorUnitarioFocusGained
        if (valorUnitario.getText().equals("0")) {
            valorUnitario.setText("");
            valorUnitario.setForeground(Color.black);
        }
    }//GEN-LAST:event_valorUnitarioFocusGained

    private void valorUnitarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorUnitarioFocusLost
        if (valorUnitario.getText().equals("")) {
            valorUnitario.setText("0");
            valorUnitario.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_valorUnitarioFocusLost

    private void qttSoldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qttSoldFocusGained
        if (qttSold.getText().equals("0")) {
            qttSold.setText("");
            qttSold.setForeground(Color.black);
        }
    }//GEN-LAST:event_qttSoldFocusGained

    private void qttSoldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qttSoldFocusLost
        if (qttSold.getText().equals("")) {
            qttSold.setText("0");
            qttSold.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_qttSoldFocusLost

    private void idProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idProductKeyReleased
        String input = idProduct.getText();

        // Remover todos os caracteres não numéricos
        input = input.replaceAll("[^\\d]", "");
        idProduct.setText(input);
    }//GEN-LAST:event_idProductKeyReleased

    private void valorUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorUnitarioKeyReleased
        String input = valorUnitario.getText();

        // Remover todos os caracteres não numéricos
        input = input.replaceAll("[^\\d]", "");
        valorUnitario.setText(input);
    }//GEN-LAST:event_valorUnitarioKeyReleased

    private void qttSoldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qttSoldKeyReleased
        String input = qttSold.getText();

        // Remover todos os caracteres não numéricos
        input = input.replaceAll("[^\\d]", "");
        qttSold.setText(input);
    }//GEN-LAST:event_qttSoldKeyReleased

    public void addRowToJTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        List<Produtos> produtos = interactions.visualizarProdutos();

        Object rowData[] = new Object[5];

        for (Produtos produto : produtos) {
            rowData[0] = produto.getId();
            rowData[1] = produto.getNome();
            rowData[2] = produto.getValor();
            rowData[3] = produto.getQuantidade();
            rowData[4] = produto.getDescricao();

            model.addRow(rowData);
        }
    }

    public void addSelectedRowToInputs() {
        int row = jTable1.getSelectedRow();

        if (row != -1) {
            idProduct.setText(jTable1.getModel().getValueAt(row, 0).toString());
            valorUnitario.setText(jTable1.getModel().getValueAt(row, 2).toString());
            
            checkInputColor(idProduct);
            checkInputColor(valorUnitario);
        }
    }

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
            java.util.logging.Logger.getLogger(VendasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfClient;
    private javax.swing.JTextField idProduct;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField qttSold;
    private javax.swing.JTextField searchByName;
    private javax.swing.JTextField valorUnitario;
    // End of variables declaration//GEN-END:variables
}
