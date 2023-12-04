package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Nivel2v11 extends javax.swing.JFrame {
FondoPanel fondo= new FondoPanel();  
    public int seleccion1 = 0;
    public int seleccion2 = 0;
public int numpar=12,partotal=24,gana=11;
    public int num[] = new int[numpar];
    public boolean[] verdadero = new boolean[partotal];
    int ing, gan;

    public int cod[] = new int[24];

    public int voltear;
    public int[] auxiliar = new int[2];
    String select;

    public Nivel2v11() {
        this.setContentPane(fondo);
        initComponents(); 
        this.setLocationRelativeTo(null);
        this.setTitle("Nivel 2: Funciones");
        ocultar(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new FondoPanel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        icon5 = new javax.swing.JLabel();
        icon6 = new javax.swing.JLabel();
        icon7 = new javax.swing.JLabel();
        icon8 = new javax.swing.JLabel();
        jBIniciar = new javax.swing.JButton();
        item = new javax.swing.JComboBox<>();
        txt = new javax.swing.JLabel();
        icon9 = new javax.swing.JLabel();
        icon10 = new javax.swing.JLabel();
        icon11 = new javax.swing.JLabel();
        icon12 = new javax.swing.JLabel();
        icon13 = new javax.swing.JLabel();
        icon14 = new javax.swing.JLabel();
        icon15 = new javax.swing.JLabel();
        icon16 = new javax.swing.JLabel();
        icon17 = new javax.swing.JLabel();
        icon18 = new javax.swing.JLabel();
        icon19 = new javax.swing.JLabel();
        icon20 = new javax.swing.JLabel();
        icon21 = new javax.swing.JLabel();
        icon22 = new javax.swing.JLabel();
        icon23 = new javax.swing.JLabel();
        icon24 = new javax.swing.JLabel();
        nivel = new javax.swing.JComboBox<>();
        btn1_memo = new javax.swing.JButton();
        jLganar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(51, 102, 255));
        panel.setPreferredSize(new java.awt.Dimension(762, 514));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon1MouseClicked(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon2MouseClicked(evt);
            }
        });

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon3MouseClicked(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon4MouseClicked(evt);
            }
        });

        icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon5MouseClicked(evt);
            }
        });

        icon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon6MouseClicked(evt);
            }
        });

        icon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon7MouseClicked(evt);
            }
        });

        icon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon8MouseClicked(evt);
            }
        });

        jBIniciar.setBackground(new java.awt.Color(0, 0, 0));
        jBIniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBIniciar.setForeground(new java.awt.Color(51, 204, 0));
        jBIniciar.setText("INICIAR");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        item.setBackground(new java.awt.Color(51, 51, 51));
        item.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        item.setForeground(new java.awt.Color(255, 0, 0));
        item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funciones" }));

        icon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon9MouseClicked(evt);
            }
        });

        icon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon10MouseClicked(evt);
            }
        });

        icon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon11MouseClicked(evt);
            }
        });

        icon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon12MouseClicked(evt);
            }
        });

        icon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon13MouseClicked(evt);
            }
        });

        icon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon14MouseClicked(evt);
            }
        });

        icon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon15MouseClicked(evt);
            }
        });

        icon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon16MouseClicked(evt);
            }
        });

        icon17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon17MouseClicked(evt);
            }
        });

        icon18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon18MouseClicked(evt);
            }
        });

        icon19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon19MouseClicked(evt);
            }
        });

        icon20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon20MouseClicked(evt);
            }
        });

        icon21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon21MouseClicked(evt);
            }
        });

        icon22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon22MouseClicked(evt);
            }
        });

        icon23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon23MouseClicked(evt);
            }
        });

        icon24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0.jpg"))); // NOI18N
        icon24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        icon24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon24MouseClicked(evt);
            }
        });

        nivel.setBackground(new java.awt.Color(204, 204, 255));
        nivel.setEditable(true);
        nivel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nivel.setForeground(new java.awt.Color(255, 0, 0));

        btn1_memo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn1_memo.setText("FINALIZAR");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jBIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(icon13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(icon9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(icon6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(icon7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(icon8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(icon23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(icon19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(icon20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(icon21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(icon22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(icon17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1_memo)
                                .addGap(24, 24, 24))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btn1_memo)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icon21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icon22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icon23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icon24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(43, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);
        getContentPane().add(jLganar, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setResizable(boolean resizable) {
     
      super.setResizable(resizable);
        
    }

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
        ocultar();
        select = item.getSelectedItem().toString();
        niveles(nivel.getSelectedItem().toString());
       limpiar();
       iniciar();
            
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void icon8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon8MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 8;

        icon8.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[7] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon8MouseClicked

    private void icon7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon7MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 7;

        icon7.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[6] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon7MouseClicked

    private void icon6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon6MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 6;

        icon6.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[5] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon6MouseClicked

    private void icon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 5;

        icon5.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[4] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon5MouseClicked

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 4;

        icon4.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[3] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon4MouseClicked

    private void icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 3;

        icon3.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[2] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon3MouseClicked

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 2;

        icon2.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[1] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon2MouseClicked

    private void icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 1;

        icon1.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[0] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon1MouseClicked

    private void icon11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon11MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 11;

        icon11.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[10] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon11MouseClicked

    private void icon9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon9MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 9;

        icon9.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[8] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon9MouseClicked

    private void icon21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon21MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 21;

        icon21.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[20] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon21MouseClicked

    private void icon18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon18MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 18;

        icon18.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[17] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon18MouseClicked

    private void icon10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon10MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 10;

        icon10.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[9] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon10MouseClicked

    private void icon19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon19MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 19;

        icon19.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[18] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon19MouseClicked

    private void icon20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon20MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 20;

        icon20.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[19] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon20MouseClicked

    private void icon16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon16MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 16;

        icon16.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[15] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon16MouseClicked

    private void icon13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon13MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 13;

        icon13.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[12] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon13MouseClicked

    private void icon15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon15MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 15;

        icon15.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[14] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon15MouseClicked

    private void icon12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon12MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 12;

        icon12.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[11] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon12MouseClicked

    private void icon17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon17MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 17;

        icon17.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[16] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon17MouseClicked

    private void icon22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon22MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 22;

        icon22.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[21] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon22MouseClicked

    private void icon14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon14MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 14;

        icon14.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[13] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon14MouseClicked

    private void icon24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon24MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 24;

        icon24.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[23] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon24MouseClicked
    private void icon23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon23MouseClicked
        if (voltear == 2) {
            comprobacion();
        }
        voltear++;
        auxiliar[voltear - 1] = 23;

        icon23.setIcon(new ImageIcon(getClass().getResource("/" + select + "/" + cod[22] + ".jpg")));
        ganar();
    }//GEN-LAST:event_icon23MouseClicked
    public void iniciar() {
        jBIniciar.setVisible(false);
        btn1_memo.setVisible(false);
        for (int i = 0; i < numpar; i++) {
            num[i] =0;

        }
        for (int i = 0; i < partotal; i++) {
            verdadero[i] = true;
        }
        aleatorio();
         voltear = 0;
         gan = 0;
    }

    public void comprobacion() {
        if (cod[auxiliar[0] - 1] == cod[auxiliar[1] - 1]) {
            verdadero[auxiliar[0] - 1] = false;
            verdadero[auxiliar[1] - 1] = false;
            voltear = 0;
            gan++;
        } else {
            voltear = 0;
            voltear(auxiliar[0]);
            voltear(auxiliar[1]);
        }

    }

    public void aleatorio() {
        Random r = new Random();

        for (int i = 0; i < partotal; i++) {
            ing = r.nextInt(numpar);
            if (num[ing] < 2) {
                num[ing]++;
                cod[i] = ing + 1;
            } else {
                i--;
            }

        }
    }

    public void voltear(int z) {
        switch (z) {
            case 1:
                icon1.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 2:
                icon2.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 3:
                icon3.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 4:
                icon4.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 5:
                icon5.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 6:
                icon6.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 7:
                icon7.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 8:
                icon8.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 9:
                icon9.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 10:
                icon10.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 11:
                icon11.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 12:
                icon12.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 13:
                icon13.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 14:
                icon14.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 15:
                icon15.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 16:
                icon16.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 17:
                icon17.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 18:
                icon18.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 19:
                icon19.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 20:
                icon20.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 21:
                icon21.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 22:
                icon22.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 23:
                icon23.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
            case 24:
                icon24.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
                break;
        }
    }
   

    private void ganar() {

        if ((voltear == 2) && (gan == gana)) {
            
            if (nivel.getSelectedItem().toString().equals("Nivel_1")) {
                nivel.removeAllItems();
                jBIniciar.setVisible(true);
                nivel.addItem("Nivel_2");
            }else{
                
                if (nivel.getSelectedItem().toString().equals("Nivel_2")) {
                nivel.removeAllItems();
                jBIniciar.setVisible(true);
                nivel.addItem("Nivel_3");
                }else{
                    
                    if (nivel.getSelectedItem().toString().equals("Nivel_3")) {
                        btn1_memo.setVisible(true);
            
                    }
                    
                }
                
            }
            
            
            
            
            
            
        }
    }

    public void limpiar() {
        icon1.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon2.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon3.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon4.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon5.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon6.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon7.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon8.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon9.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon10.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon11.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon12.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon13.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon14.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon15.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon16.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon17.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon18.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon19.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon20.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon21.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon22.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon23.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        icon24.setIcon(new ImageIcon(getClass().getResource("/imagenes/0.jpg")));
        txt.setText("");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel2v11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1_memo;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon10;
    private javax.swing.JLabel icon11;
    private javax.swing.JLabel icon12;
    private javax.swing.JLabel icon13;
    private javax.swing.JLabel icon14;
    private javax.swing.JLabel icon15;
    private javax.swing.JLabel icon16;
    private javax.swing.JLabel icon17;
    private javax.swing.JLabel icon18;
    private javax.swing.JLabel icon19;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon20;
    private javax.swing.JLabel icon21;
    private javax.swing.JLabel icon22;
    private javax.swing.JLabel icon23;
    private javax.swing.JLabel icon24;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel icon7;
    private javax.swing.JLabel icon8;
    private javax.swing.JLabel icon9;
    private javax.swing.JComboBox<String> item;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JLabel jLganar;
    public javax.swing.JComboBox<String> nivel;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen=new ImageIcon(getClass().getResource("/Nivel1/fondoniv1.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    public void ocultar() {

     icon1.setVisible(false); icon5.setVisible(false);        
     icon2.setVisible(false); icon6.setVisible(false);           
     icon3.setVisible(false); icon7.setVisible(false);           
     icon4.setVisible(false); icon8.setVisible(false);
     icon9.setVisible(false); icon13.setVisible(false);        
     icon10.setVisible(false); icon14.setVisible(false);           
     icon11.setVisible(false); icon15.setVisible(false);           
     icon12.setVisible(false); icon16.setVisible(false);          
     icon17.setVisible(false); icon18.setVisible(false);       
     icon19.setVisible(false); icon20.setVisible(false);       
     icon21.setVisible(false); icon22.setVisible(false);   
     icon23.setVisible(false); icon24.setVisible(false);
    }
public void niveles(String ocu)
{
if (ocu=="Nivel_1"){
    
     icon1.setVisible(true); icon5.setVisible(true);        
     icon2.setVisible(true); icon6.setVisible(true);           
     icon3.setVisible(true); icon7.setVisible(true);           
     icon4.setVisible(true); icon8.setVisible(true);
     numpar=4;
     partotal=8;
     gana=3;
     panel.setBackground(Color.red);
   
}
if(ocu=="Nivel_2"){ 
      icon1.setVisible(true); icon5.setVisible(true);        
     icon2.setVisible(true); icon6.setVisible(true);           
     icon3.setVisible(true); icon7.setVisible(true);           
     icon4.setVisible(true); icon8.setVisible(true);
     icon9.setVisible(true); icon13.setVisible(true);        
     icon10.setVisible(true); icon14.setVisible(true);           
     icon11.setVisible(true); icon15.setVisible(true);           
     icon12.setVisible(true); icon16.setVisible(true);
     numpar=8;
     partotal=16;
     gana=7;
     panel.setBackground(Color.green);

}
     if(ocu=="Nivel_3"){
      icon1.setVisible(true); icon5.setVisible(true);        
     icon2.setVisible(true); icon6.setVisible(true);           
     icon3.setVisible(true); icon7.setVisible(true);           
     icon4.setVisible(true); icon8.setVisible(true);
     icon9.setVisible(true); icon13.setVisible(true);        
     icon10.setVisible(true); icon14.setVisible(true);           
     icon11.setVisible(true); icon15.setVisible(true);           
     icon12.setVisible(true); icon16.setVisible(true);
    icon17.setVisible(true); icon18.setVisible(true);       
     icon19.setVisible(true); icon20.setVisible(true);       
     icon21.setVisible(true); icon22.setVisible(true);   
     icon23.setVisible(true); icon24.setVisible(true);
     numpar=12;
     partotal=24;
     gana=11;
     panel.setBackground(Color.CYAN);
            
     }}}
