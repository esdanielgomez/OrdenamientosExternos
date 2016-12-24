/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos;

import com.csvreader.CsvReader;
import intercalacion.balanceada.OrdenamientoBalanceado;
import intercalacion.directa.OrdenamientoDirecto;
import intercalacion.natural.OrdenamientoNatural;
import intercalacion.poliface.OrdenamientoPolifase;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniel
 */
public class Aplicacion extends javax.swing.JFrame {

    int tiempoTotal = 5;
    
    String cabecera = null;
    
    public Aplicacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        new Tiempo();
        this.TiempoEmpleado.setVisible(false);
        this.tiempo.setVisible(false);
        
        this.boxInformacion.setVisible(false);
        this.boxMetodo.setVisible(false);
        this.boxTiempo.setVisible(false);
        
    }
    
    
    public class Tiempo
    {
        public Tiempo(){
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(timerTask, 0,1000);
        }
        
        TimerTask timerTask = new TimerTask()
        {
            public void run() 
            {
                tiempoTotal++;   
            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        directorio = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        salidas = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        directa = new javax.swing.JRadioButton();
        natural = new javax.swing.JRadioButton();
        balanceada = new javax.swing.JRadioButton();
        polifase = new javax.swing.JRadioButton();
        cascada = new javax.swing.JRadioButton();
        salidas1 = new javax.swing.JLabel();
        numerico = new javax.swing.JRadioButton();
        texto = new javax.swing.JRadioButton();
        booleano = new javax.swing.JRadioButton();
        fecha = new javax.swing.JRadioButton();
        Procesar = new javax.swing.JButton();
        boxInformacion = new javax.swing.JPanel();
        peso = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        salidas2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numeroReg = new javax.swing.JLabel();
        boxMetodo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        metodo = new javax.swing.JLabel();
        boxTiempo = new javax.swing.JPanel();
        TiempoEmpleado = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion principal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORDENAMIENTOS EXTERNOS SOBRE ARCHIVOS");

        jLabel3.setText("Archivo de entada:");

        directorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorioActionPerformed(evt);
            }
        });
        directorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                directorioKeyPressed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        salidas.setText("Seleccione el metodo por el cual desea realizar el ordenamiento:");

        jButton2.setText("Cerrar la aplicacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        directa.setText("Intercalación directa");
        directa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directaActionPerformed(evt);
            }
        });

        natural.setText("Intercalación natural");
        natural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naturalActionPerformed(evt);
            }
        });

        balanceada.setText("Intercalación balanceada");
        balanceada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceadaActionPerformed(evt);
            }
        });

        polifase.setText("Intercalación polifase");
        polifase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polifaseActionPerformed(evt);
            }
        });

        cascada.setText("Intercalación en cascada");
        cascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cascadaActionPerformed(evt);
            }
        });

        salidas1.setText("Seleccione el campo para el factor de ordenamiento:");

        numerico.setText("Campo numerico");
        numerico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numericoActionPerformed(evt);
            }
        });

        texto.setText("Campo de texto");
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        booleano.setText("Campo booleano");
        booleano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booleanoActionPerformed(evt);
            }
        });

        fecha.setText("Campo de fecha");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        Procesar.setText("Procesar ordenamiento");
        Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarActionPerformed(evt);
            }
        });

        peso.setText("jLabel8");

        jLabel5.setText("Peso:");

        jLabel1.setText("Nombre:");

        nombre.setText("null");

        salidas2.setText("Informacion del archivo CSV");

        jLabel6.setText("Numero de registros: ");

        numeroReg.setText("jLabel9");

        javax.swing.GroupLayout boxInformacionLayout = new javax.swing.GroupLayout(boxInformacion);
        boxInformacion.setLayout(boxInformacionLayout);
        boxInformacionLayout.setHorizontalGroup(
            boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salidas2)
                    .addGroup(boxInformacionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boxInformacionLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(boxInformacionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(boxInformacionLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        boxInformacionLayout.setVerticalGroup(
            boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxInformacionLayout.createSequentialGroup()
                .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxInformacionLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(peso)))
                    .addGroup(boxInformacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salidas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numeroReg))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("METODO");

        metodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        metodo.setText("INTERCALACION xxx");

        javax.swing.GroupLayout boxMetodoLayout = new javax.swing.GroupLayout(boxMetodo);
        boxMetodo.setLayout(boxMetodoLayout);
        boxMetodoLayout.setHorizontalGroup(
            boxMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxMetodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(metodo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        boxMetodoLayout.setVerticalGroup(
            boxMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxMetodoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxTiempoMouseClicked(evt);
            }
        });

        TiempoEmpleado.setText("Tiempo empleado en la realizacion del ordenamiento: ");

        tiempo.setText("00h:00m:00s");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intercalacion/puntero.png"))); // NOI18N

        javax.swing.GroupLayout boxTiempoLayout = new javax.swing.GroupLayout(boxTiempo);
        boxTiempo.setLayout(boxTiempoLayout);
        boxTiempoLayout.setHorizontalGroup(
            boxTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TiempoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        boxTiempoLayout.setVerticalGroup(
            boxTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxTiempoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boxTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(boxTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(TiempoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(directorio))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salidas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxTiempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(balanceada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(polifase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cascada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numerico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(booleano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boxInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Procesar, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(boxMetodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(salidas, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(directa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(natural, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addGap(65, 65, 65)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(salidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directa)
                    .addComponent(natural))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceada)
                    .addComponent(polifase)
                    .addComponent(cascada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salidas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerico)
                    .addComponent(texto)
                    .addComponent(booleano)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Procesar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxMetodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(boxInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boxTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        JFileChooser ventanaBusqueda = new JFileChooser();//Objeto ventana de busqueda
        ventanaBusqueda.setFileSelectionMode(JFileChooser.FILES_ONLY);//Tipo de busqueda
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos CSV...", "csv");
        ventanaBusqueda.setFileFilter(filter);//Extenciones
        ventanaBusqueda.setMultiSelectionEnabled(true);//Seleccionar varios archivos
        int returnVal = ventanaBusqueda.showOpenDialog(null);//Condicional de aceptacion seleccion
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            File archivo = ventanaBusqueda.getSelectedFile();
            directorio.setText(archivo.getPath());
            this.directorio.setText(archivo.getAbsolutePath());
            
            if(!new File(this.directorio.getText()).exists())
            {
                this.boxInformacion.setVisible(false);
            }
            else
            {
                File arch = new File(this.directorio.getText());
                this.nombre.setText(arch.getName());
                this.peso.setText(""+arch.length() + " bytes");
                this.boxInformacion.setVisible(true);
                
                int rango=0;
                try {
                    CsvReader leer = new CsvReader(this.directorio.getText());
                    while (leer.readRecord()) rango++; leer.close();
                }catch (FileNotFoundException ex) {} catch (IOException ex) {}
                this.numeroReg.setText("" + rango + " en total");
            }
            this.TiempoEmpleado.setVisible(false);
            
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void naturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naturalActionPerformed
        if (this.directa.isSelected() || this.balanceada.isSelected() || this.polifase.isSelected() || this.cascada.isSelected())
        {
            this.directa.setSelected(false);
            this.balanceada.setSelected(false);
            this.polifase.setSelected(false);
            this.cascada.setSelected(false);
        }
        
        this.metodo.setText("INTERLACION NATURAL");
        this.boxMetodo.setVisible(true);
        this.boxTiempo.setVisible(false);
    }//GEN-LAST:event_naturalActionPerformed

    private void numericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numericoActionPerformed
        if (this.texto.isSelected() || this.booleano.isSelected() || this.fecha.isSelected())
        {
            this.texto.setSelected(false);
            this.booleano.setSelected(false);
            this.fecha.setSelected(false);
        }
    }//GEN-LAST:event_numericoActionPerformed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        if (this.numerico.isSelected() || this.booleano.isSelected() || this.fecha.isSelected())
        {
            this.numerico.setSelected(false);
            this.booleano.setSelected(false);
            this.fecha.setSelected(false);
        }
    }//GEN-LAST:event_textoActionPerformed

    private void booleanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booleanoActionPerformed
        if (this.texto.isSelected() || this.numerico.isSelected() || this.fecha.isSelected())
        {
            this.texto.setSelected(false);
            this.numerico.setSelected(false);
            this.fecha.setSelected(false);
        }
    }//GEN-LAST:event_booleanoActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        if (this.texto.isSelected() || this.booleano.isSelected() || this.numerico.isSelected())
        {
            this.texto.setSelected(false);
            this.booleano.setSelected(false);
            this.numerico.setSelected(false);
        }
    }//GEN-LAST:event_fechaActionPerformed

    private void directaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directaActionPerformed
        if (this.natural.isSelected() || this.balanceada.isSelected() || this.polifase.isSelected() || this.cascada.isSelected())
        {
            this.natural.setSelected(false);
            this.balanceada.setSelected(false);
            this.polifase.setSelected(false);
            this.cascada.setSelected(false);
        }
        this.metodo.setText("INTERLACION DIRECTA");
        this.boxMetodo.setVisible(true);
        this.boxTiempo.setVisible(false);
    }//GEN-LAST:event_directaActionPerformed

    private void balanceadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceadaActionPerformed
        if (this.natural.isSelected() || this.directa.isSelected() || this.polifase.isSelected() || this.cascada.isSelected())
        {
            this.natural.setSelected(false);
            this.directa.setSelected(false);
            this.polifase.setSelected(false);
            this.cascada.setSelected(false);
        }
        this.metodo.setText("INTERLACION BALANCEADA");
        this.boxMetodo.setVisible(true);
        this.boxTiempo.setVisible(false);
    }//GEN-LAST:event_balanceadaActionPerformed

    private void polifaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polifaseActionPerformed
        if (this.natural.isSelected() || this.balanceada.isSelected() || this.directa.isSelected() || this.cascada.isSelected())
        {
            this.natural.setSelected(false);
            this.balanceada.setSelected(false);
            this.directa.setSelected(false);
            this.cascada.setSelected(false);
        }
        
        this.metodo.setText("INTERLACION POLIFASE");
        this.boxMetodo.setVisible(true);
        this.boxTiempo.setVisible(false);
    }//GEN-LAST:event_polifaseActionPerformed

    private void cascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cascadaActionPerformed
        if (this.natural.isSelected() || this.balanceada.isSelected() || this.polifase.isSelected() || this.directa.isSelected())
        {
            this.natural.setSelected(false);
            this.balanceada.setSelected(false);
            this.polifase.setSelected(false);
            this.directa.setSelected(false);
        }
        
        this.metodo.setText("INTERLACION CASCADA");
        this.boxMetodo.setVisible(true);
        this.boxTiempo.setVisible(false);
    }//GEN-LAST:event_cascadaActionPerformed

    public String getTiempo(int segundos)
    {
        int horas =segundos/3600;
        int minutos =(segundos-(3600*horas))/60;
        int seg = segundos-((horas*3600)+(minutos*60));
        
        return String.format("%02d",horas) + "h:" + String.format("%02d",minutos) + "m:" + String.format("%02d",seg) + "s";
        
    }
    
    
    
    private void ManejoCabecerasSCV(int caso, File file) throws FileNotFoundException, IOException
    {
        if(caso ==0)
        {
            file.renameTo(new File(file.getParent() + "\\" + "copA111341520.csv"));
            
            PrintWriter archS = new PrintWriter(new File(file.getParent() + "\\" + file.getName()));
            CsvReader lect = new CsvReader(file.getParent() + "\\" + "copA111341520.csv");
            
            if(lect.readHeaders())
                this.cabecera = lect.getRawRecord();
            
            if(this.cabecera.indexOf("campo1")!=-1&&this.cabecera.indexOf("campo2")!=-1&&this.cabecera.indexOf("campo3")!=-1&&this.cabecera.indexOf("campo4")!=-1){}
            else
            {
                this.cabecera = null;
                archS.println(lect.getRawRecord());
            } 
                
            while(lect.readRecord()){
                archS.println(lect.getRawRecord());
            }
            archS.close();
            lect.close();
            new File(file.getParent() + "\\" + "copA111341520.csv").delete();
        }   
        
    }
    
    private void ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarActionPerformed
        
        if(!new File(this.directorio.getText()).exists())
        {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el archivo especificado no existe.", "Error al procesar", JOptionPane.ERROR_MESSAGE);
            this.boxInformacion.setVisible(false);
            return;
        }
        else
        {
            
            //Poner la informacion del archivo
            File arch = new File(this.directorio.getText());
            this.nombre.setText(arch.getName());
            this.peso.setText(""+arch.length() + " bytes");
            this.boxInformacion.setVisible(true);
            this.boxTiempo.setVisible(false);
            
            int rango=0;
            try {
                CsvReader leer = new CsvReader(this.directorio.getText());
                while (leer.readRecord()) rango++; leer.close();
            }catch (FileNotFoundException ex) {} catch (IOException ex) {}
            this.numeroReg.setText("" + rango + " en total");
        }
        File file = new File(this.directorio.getText());
        
        int campo = -1;
        if(this.numerico.isSelected())
            campo = 0;
        else if(this.texto.isSelected())
            campo = 1;
        else if(this.booleano.isSelected())
            campo = 2;
        else if(this.fecha.isSelected())
            campo = 3;
        else
        {
            JOptionPane.showMessageDialog(null, "Error, seleccione el campo sobre el cual se va a hacer\nel ordenamiento.", "Error al procesar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try 
        {
            tiempoTotal = 0;
            this.TiempoEmpleado.setVisible(false);
            this.tiempo.setVisible(false);
            
            
            if(this.directa.isSelected())
            {
                this.ManejoCabecerasSCV(0, file);
                OrdenamientoDirecto.Procesar(campo, file);
            }
            else if(this.natural.isSelected())
            {
                this.ManejoCabecerasSCV(0, file);
                OrdenamientoNatural.Procesar(campo, file);
            }
            else if(this.balanceada.isSelected())
            {
                this.ManejoCabecerasSCV(0, file);
                OrdenamientoBalanceado.Procesar(campo, file);
            }
            else if(this.polifase.isSelected())
            {
                this.ManejoCabecerasSCV(0, file);
                new OrdenamientoPolifase().Procesar(campo, file.toString());
            }
            else if(this.cascada.isSelected())
            {
                this.ManejoCabecerasSCV(0, file);
                OrdenamientoDirecto.Procesar(campo, file);
            }
            else
                JOptionPane.showMessageDialog(null, "Error, por favor seleccione el algoritmo sobre el cual se\n va a realizar el ordenamiento.", "Error al procesar", JOptionPane.ERROR_MESSAGE);

            tiempo.setText("" + getTiempo(this.tiempoTotal));
            this.TiempoEmpleado.setVisible(true);
            this.tiempo.setVisible(true);
            this.boxTiempo.setVisible(true);

        } 
        catch (IOException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ProcesarActionPerformed

    private void directorioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_directorioKeyPressed
        if(!new File(this.directorio.getText()).exists())
            this.boxInformacion.setVisible(false);
        else
        {
            File arch = new File(this.directorio.getText());
            this.nombre.setText(arch.getName());
            this.peso.setText(""+arch.length() + " bytes");
            this.boxInformacion.setVisible(true);

            int rango=0;
            try {
                CsvReader leer = new CsvReader(this.directorio.getText());
                while (leer.readRecord()) rango++; leer.close();
            }catch (FileNotFoundException ex) {} catch (IOException ex) {}
            this.numeroReg.setText("" + rango + " en total");
            
        }this.boxTiempo.setVisible(false);
    }//GEN-LAST:event_directorioKeyPressed

    private void directorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorioActionPerformed

    private void boxTiempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTiempoMouseClicked
        if(!new File(this.directorio.getText()).exists()) return;      
        try {
                File path = new File (this.directorio.getText());
                Desktop.getDesktop().open(path);
           }catch (IOException ex) {}
    }//GEN-LAST:event_boxTiempoMouseClicked

    
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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Procesar;
    private javax.swing.JLabel TiempoEmpleado;
    private javax.swing.JRadioButton balanceada;
    private javax.swing.JRadioButton booleano;
    private javax.swing.JPanel boxInformacion;
    private javax.swing.JPanel boxMetodo;
    private javax.swing.JPanel boxTiempo;
    private javax.swing.JButton buscar;
    private javax.swing.JRadioButton cascada;
    private javax.swing.JRadioButton directa;
    private javax.swing.JTextField directorio;
    private javax.swing.JRadioButton fecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel metodo;
    private javax.swing.JRadioButton natural;
    private javax.swing.JLabel nombre;
    private javax.swing.JRadioButton numerico;
    private javax.swing.JLabel numeroReg;
    private javax.swing.JLabel peso;
    private javax.swing.JRadioButton polifase;
    private javax.swing.JLabel salidas;
    private javax.swing.JLabel salidas1;
    private javax.swing.JLabel salidas2;
    private javax.swing.JRadioButton texto;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
