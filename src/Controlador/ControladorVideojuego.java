/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Jesus
 */
import Modelo.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.applet.AudioClip;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import Modelo.Alumno;
import Modelo.AlumnoDAO;
import Modelo.CincoCalificacionDAO;
import Modelo.CuatroCalificacionDAO;
import Modelo.CuatroEjercicioDosDAO;
import Modelo.CuatroEjercicioFinalDAO;
import Modelo.CuatroEjercicioTresDAO;
import Modelo.CuatroEjercicioUnoDAO;
import Modelo.DosCalificacionDAO;
import Modelo.PromedioDAO;
import Modelo.TresCalificacionDAO;
import Modelo.TresEjercicioDosDAO;
import Modelo.TresEjercicioFinalDAO;
import Modelo.TresEjercicioTresDAO;
import Modelo.TresEjercicioUnoDAO;
import Modelo.UnoCalificacionDAO;
import Modelo.UnoEjercicioDosDAO;
import Modelo.UnoEjercicioFinalDAO;
import Modelo.UnoEjercicioTresDAO;
import Modelo.UnoEjercicioUnoDAO;
import Vista.Acercade;
import Vista.Créditos;
import Vista.Inicio;
import Vista.Menu;
import Vista.Nivel1;
import Vista.Nivel1v1;
import Vista.Nivel1v2;
import Vista.Nivel1v3;
import Vista.Nivel1v4;
import Vista.Nivel1v5;
import Vista.Nivel1v6;
import Vista.Nivel1v7;
import Vista.Nivel1v8;
import Vista.Nivel1v9;
import Vista.Nivel1v10;
import Vista.Nivel1v11;
import Vista.Nivel1v12;
import Vista.Nivel1v13;
import Vista.Nivel1v14;
import Vista.Nivel2v1;
import Vista.Nivel2v2;
import Vista.Nivel2v3;
import Vista.Nivel2v4;
import Vista.Nivel2v5;
import Vista.Nivel2v6;
import Vista.Nivel2v7;
import Vista.Nivel2v8;
import Vista.Nivel2v9;
import Vista.Nivel2v10;
import Vista.Nivel2v11;
import Vista.Nivel2v12;
import Vista.Nivel3;
import Vista.Nivel3v1;
import Vista.Nivel3v10;
import Vista.Nivel3v11;
import Vista.Nivel3v12;
import Vista.Nivel3v13;
import Vista.Nivel3v14;
import Vista.Nivel3v15;
import Vista.Nivel3v2;
import Vista.Nivel3v3;
import Vista.Nivel3v4;
import Vista.Nivel3v5;
import Vista.Nivel3v6;
import Vista.Nivel3v7;
import Vista.Nivel3v8;
import Vista.Nivel3v9;
import Vista.Nivel4;
import Vista.Nivel4v1;
import Vista.Nivel4v2;
import Vista.Nivel4v3;
import Vista.Nivel4v4;
import Vista.Nivel4v5;
import Vista.Nivel4v6;
import Vista.Nivel4v7;
import Vista.Nivel4v8;
import Vista.Nivel4v9;
import Vista.Nivel4v10;
import Vista.Nivel4v11;
import Vista.Nivel4v12;
import Vista.Nivel4v13;
import Vista.Nivel4v14;
import Vista.Nivel4v15;
import Vista.Nivel4v16;
import Vista.Nivel5;
import Vista.Nivel5v1;
import Vista.Nivel5v2;
import Vista.Nivel5v3;
import Vista.Nivel5v4;
import Vista.Nivel5v5;
import Vista.Nivel5v6;
import Vista.Nivel5v7;
import Vista.Nivel5v8;
import Vista.Nivel5v9;
import Vista.Nivel5v10;
import Vista.Nivel5v11;
import Vista.Nivel5v12;
import Vista.Nivel5v13;
import Vista.Nivel5v14;
import Vista.Nivel5v15;
import Vista.Nivel5v16;
import Vista.Registro;



public class ControladorVideojuego implements ActionListener{
    private Inicio vistaini;
    private Menu vistamenu;
    private Nivel1 vistanivel1;
    private Nivel1v1 vistanivel1ini;
    private Nivel1v2 vistanivel1ini2;
    private Nivel1v3 vistanivel1v3;
    private Nivel1v4 vistanivel1v4;
    private Nivel1v5 vistanivel1v5;
    private Nivel1v6 vistanivel1v6;
    private Nivel1v7 vistanivel1v7;
    private Nivel1v8 vistanivel1v8;
    private Nivel1v9 vistanivel1v9;
    private Nivel1v10 vistanivel1v10;
    private Nivel1v11 vistanivel1v11;
    private Nivel1v12 vistanivel1v12;
    private Nivel1v13 vistanivel1v13;
    private Nivel1v14 vistanivel1v14;
    private Nivel2v1 vistanivel2v1;
    private Nivel2v2 vistanivel2v2;
    private Nivel2v3 vistanivel2v3;
    private Nivel2v4 vistanivel2v4;
    private Nivel2v5 vistanivel2v5;
    private Nivel2v6 vistanivel2v6;
    private Nivel2v7 vistanivel2v7;
    private Nivel2v8 vistanivel2v8;
    private Nivel2v9 vistanivel2v9;
    private Nivel2v10 vistanivel2v10;
    private Nivel2v11 vistanivel2v11;
    private Nivel2v12 vistanivel2v12;
    private Nivel3 vistanivel3;
    private Nivel3v1 vistanivel3v1;
    private Nivel3v2 vistanivel3v2;
    private Nivel3v3 vistanivel3v3;
    private Nivel3v4 vistanivel3v4;
    private Nivel3v5 vistanivel3v5;
    private Nivel3v6 vistanivel3v6;
    private Nivel3v7 vistanivel3v7;
    private Nivel3v8 vistanivel3v8;
    private Nivel3v9 vistanivel3v9;
    private Nivel3v10 vistanivel3v10;
    private Nivel3v11 vistanivel3v11;
    private Nivel3v12 vistanivel3v12;
    private Nivel3v13 vistanivel3v13;
    private Nivel3v14 vistanivel3v14;
    private Nivel3v15 vistanivel3v15;
    private Nivel4 vistanivel4;
    private Nivel4v1 vistanivel4v1;
    private Nivel4v2 vistanivel4v2;
    private Nivel4v3 vistanivel4v3;
    private Nivel4v4 vistanivel4v4;
    private Nivel4v5 vistanivel4v5;
    private Nivel4v6 vistanivel4v6;
    private Nivel4v7 vistanivel4v7;
    private Nivel4v8 vistanivel4v8;
    private Nivel4v9 vistanivel4v9;
    private Nivel4v10 vistanivel4v10;
    private Nivel4v11 vistanivel4v11;
    private Nivel4v12 vistanivel4v12;
    private Nivel4v13 vistanivel4v13;
    private Nivel4v14 vistanivel4v14;
    private Nivel4v15 vistanivel4v15;
    private Nivel4v16 vistanivel4v16;
    private Nivel5 vistanivel5;
    private Nivel5v1 vistanivel5v1;
    private Nivel5v2 vistanivel5v2;
    private Nivel5v3 vistanivel5v3;
    private Nivel5v4 vistanivel5v4;
    private Nivel5v5 vistanivel5v5;
    private Nivel5v6 vistanivel5v6;
    private Nivel5v7 vistanivel5v7;
    private Nivel5v8 vistanivel5v8;
    private Nivel5v9 vistanivel5v9;
    private Nivel5v10 vistanivel5v10;
    private Nivel5v11 vistanivel5v11;
    private Nivel5v12 vistanivel5v12;
    private Nivel5v13 vistanivel5v13;
    private Nivel5v14 vistanivel5v14;
    private Nivel5v15 vistanivel5v15;
    private Nivel5v16 vistanivel5v16;
    private Registro vistaregistro;
    private Créditos vistacredi;
    private Acercade vistaacer;
            
    AlumnoDAO alumnoDAO;        
    UnoEjercicioUnoDAO unoEjercicioUnoDAO;
    UnoEjercicioDosDAO unoEjercicioDosDAO;
    UnoEjercicioTresDAO unoEjercicioTresDAO;
    UnoEjercicioFinalDAO unoEjercicioFinalDAO;
    UnoCalificacionDAO unoCalificacionDAO;
    
    DosCalificacionDAO dosCalificacionDAO;
    
    CuatroEjercicioUnoDAO cuatroEjercicioUnoDAO;
    CuatroEjercicioDosDAO cuatroEjercicioDosDAO;
    CuatroEjercicioTresDAO cuatroEjercicioTresDAO;
    CuatroEjercicioFinalDAO cuatroEjercicioFinalDAO;
    CuatroCalificacionDAO cuatroCalificacionDAO;
    
    TresEjercicioUnoDAO tresEjercicioUnoDAO;
    TresEjercicioDosDAO tresEjercicioDosDAO;
    TresEjercicioTresDAO tresEjercicioTresDAO;
    TresEjercicioFinalDAO tresEjercicioFinalDAO;
    TresCalificacionDAO tresCalificacionDAO;
    
    CincoCalificacionDAO cincoCalificacionDAO;
    
    PromedioDAO promedio;
    
    int calificacionCinco = 0;
    
    
            
    public ControladorVideojuego(Inicio vistaini, Menu vistamenu, Nivel1 vistanivel1, Nivel3 vistanivel3, Nivel4 vistanivel4,
            Nivel5 vistanivel5, Registro vistaregistro, Créditos vistacredi, Acercade vistaacer, AlumnoDAO alumnoDAO, Nivel1v1 vistanivel1ini,
            Nivel1v2 vistanivel1ini2, Nivel1v3 vistanivel1v3,Nivel1v4 vistanivel1v4,Nivel1v5 vistanivel1v5,Nivel1v6 vistanivel1v6,
            Nivel1v7 vistanivel1v7,Nivel1v8 vistanivel1v8,Nivel1v9 vistanivel1v9,Nivel1v10 vistanivel1v10,Nivel1v11 vistanivel1v11,Nivel1v12 vistanivel1v12
            ,Nivel1v13 vistanivel1v13,Nivel1v14 vistanivel1v14,Nivel4v1 vistanivel4v1, Nivel4v2 vistanivel4v2,Nivel4v3 vistanivel4v3,Nivel4v4 vistanivel4v4,Nivel4v5 vistanivel4v5,
            Nivel4v6 vistanivel4v6, Nivel4v7 vistanivel4v7, Nivel4v8 vistanivel4v8,Nivel4v9 vistanivel4v9, Nivel4v10 vistanivel4v10, Nivel4v11 vistanivel4v11,
             Nivel4v12 vistanivel4v12, Nivel4v13 vistanivel4v13, Nivel4v14 vistanivel4v14, Nivel4v15 vistanivel4v15, Nivel4v16 vistanivel4v16 ,UnoEjercicioUnoDAO unoEjercicioUnoDAO, 
            UnoEjercicioDosDAO unoEjercicioDosDAO, UnoEjercicioTresDAO unoEjercicioTresDAO, UnoEjercicioFinalDAO unoEjercicioFinalDAO, UnoCalificacionDAO unoCalificacionDAO,
            Nivel2v1 vistanivel2v1,Nivel2v2 vistanivel2v2,Nivel2v3 vistanivel2v3,Nivel2v4 vistanivel2v4,Nivel2v5 vistanivel2v5,Nivel2v6 vistanivel2v6,Nivel2v7 vistanivel2v7,
            Nivel2v8 vistanivel2v8,Nivel2v9 vistanivel2v9,Nivel2v10 vistanivel2v10,Nivel2v11 vistanivel2v11,Nivel2v12 vistanivel2v12, 
            CuatroEjercicioUnoDAO cuatroEjercicioUnoDAO, CuatroEjercicioDosDAO cuatroEjercicioDosDAO, CuatroEjercicioTresDAO cuatroEjercicioTresDAO,
            CuatroEjercicioFinalDAO cuatroEjercicioFinalDAO, CuatroCalificacionDAO cuatroCalificacionDAO, DosCalificacionDAO dosCalificacionDAO, Nivel3v1 vistanivel3v1,
            Nivel3v2 vistanivel3v2,Nivel3v3 vistanivel3v3,Nivel3v4 vistanivel3v4,Nivel3v5 vistanivel3v5,Nivel3v6 vistanivel3v6,Nivel3v7 vistanivel3v7,
            Nivel3v8 vistanivel3v8,Nivel3v9 vistanivel3v9,Nivel3v10 vistanivel3v10,Nivel3v11 vistanivel3v11,Nivel3v12 vistanivel3v12,Nivel3v13 vistanivel3v13,
            Nivel3v14 vistanivel3v14,Nivel3v15 vistanivel3v15, Nivel5v1 vistanivel5v1, Nivel5v2 vistanivel5v2, Nivel5v3 vistanivel5v3, Nivel5v4 vistanivel5v4, Nivel5v5 vistanivel5v5,
            Nivel5v6 vistanivel5v6, Nivel5v7 vistanivel5v7, Nivel5v8 vistanivel5v8, Nivel5v9 vistanivel5v9, Nivel5v10 vistanivel5v10, Nivel5v11 vistanivel5v11, Nivel5v12 vistanivel5v12,
            Nivel5v13 vistanivel5v13, Nivel5v14 vistanivel5v14, Nivel5v15 vistanivel5v15, Nivel5v16 vistanivel5v16,
            TresEjercicioUnoDAO tresEjercicioUnoDAO, TresEjercicioDosDAO tresEjercicioDosDAO, TresEjercicioTresDAO tresEjercicioTresDAO,
            TresEjercicioFinalDAO tresEjercicioFinalDAO, TresCalificacionDAO tresCalificacionDAO, 
            CincoCalificacionDAO cincoCalificacionDAO, PromedioDAO promedio){
        
        this.vistaini=vistaini;
        this.vistamenu=vistamenu;
        this.vistanivel1=vistanivel1;
        this.vistanivel1ini=vistanivel1ini;
        this.vistanivel1ini2=vistanivel1ini2;
        this.vistanivel1v3=vistanivel1v3;
        this.vistanivel1v4=vistanivel1v4;
        this.vistanivel1v5=vistanivel1v5;
        this.vistanivel1v6=vistanivel1v6;
        this.vistanivel1v7=vistanivel1v7;
        this.vistanivel1v8=vistanivel1v8;
        this.vistanivel1v9=vistanivel1v9;
        this.vistanivel1v10=vistanivel1v10;
        this.vistanivel1v11=vistanivel1v11;
        this.vistanivel1v12=vistanivel1v12;
        this.vistanivel1v13=vistanivel1v13;
        this.vistanivel1v14=vistanivel1v14;
        this.vistanivel2v1=vistanivel2v1;
        this.vistanivel2v2=vistanivel2v2;
        this.vistanivel2v3=vistanivel2v3;
        this.vistanivel2v4=vistanivel2v4;
        this.vistanivel2v5=vistanivel2v5;
        this.vistanivel2v6=vistanivel2v6;
        this.vistanivel2v7=vistanivel2v7;
        this.vistanivel2v8=vistanivel2v8;
        this.vistanivel2v9=vistanivel2v9;
        this.vistanivel2v10=vistanivel2v10;
        this.vistanivel2v11=vistanivel2v11;
        this.vistanivel2v12=vistanivel2v12;
        this.vistanivel3=vistanivel3;
        this.vistanivel3v1=vistanivel3v1;
        this.vistanivel3v2=vistanivel3v2;
        this.vistanivel3v3=vistanivel3v3;
        this.vistanivel3v4=vistanivel3v4;
        this.vistanivel3v5=vistanivel3v5;
        this.vistanivel3v6=vistanivel3v6;
        this.vistanivel3v7=vistanivel3v7;
        this.vistanivel3v8=vistanivel3v8;
        this.vistanivel3v9=vistanivel3v9;
        this.vistanivel3v10=vistanivel3v10;
        this.vistanivel3v11=vistanivel3v11;
        this.vistanivel3v12=vistanivel3v12;
        this.vistanivel3v13=vistanivel3v13;
        this.vistanivel3v14=vistanivel3v14;
        this.vistanivel3v15=vistanivel3v15;
        this.vistanivel4=vistanivel4;
        this.vistanivel4v1=vistanivel4v1;
        this.vistanivel4v2=vistanivel4v2;
        this.vistanivel4v3=vistanivel4v3;
        this.vistanivel4v4=vistanivel4v4;
        this.vistanivel4v5=vistanivel4v5;
        this.vistanivel4v6=vistanivel4v6;
        this.vistanivel4v7=vistanivel4v7;
        this.vistanivel4v8=vistanivel4v8;
        this.vistanivel4v9=vistanivel4v9;
        this.vistanivel4v10=vistanivel4v10;
        this.vistanivel4v11=vistanivel4v11;
        this.vistanivel4v12=vistanivel4v12;
        this.vistanivel4v13=vistanivel4v13;
        this.vistanivel4v14=vistanivel4v14;
        this.vistanivel4v15=vistanivel4v15;
        this.vistanivel4v16=vistanivel4v16;
        this.vistanivel5=vistanivel5;
        this.vistanivel5v1=vistanivel5v1;
        this.vistanivel5v2=vistanivel5v2;
        this.vistanivel5v3=vistanivel5v3;
        this.vistanivel5v4=vistanivel5v4;
        this.vistanivel5v5=vistanivel5v5;
        this.vistanivel5v6=vistanivel5v6;
        this.vistanivel5v7=vistanivel5v7;
        this.vistanivel5v8=vistanivel5v8;
        this.vistanivel5v9=vistanivel5v9;
        this.vistanivel5v10=vistanivel5v10;
        this.vistanivel5v11=vistanivel5v11;
        this.vistanivel5v12=vistanivel5v12;
        this.vistanivel5v13=vistanivel5v13;
        this.vistanivel5v14=vistanivel5v14;
        this.vistanivel5v15=vistanivel5v15;
        this.vistanivel5v16=vistanivel5v16;
        this.vistaregistro=vistaregistro;
        this.vistacredi=vistacredi;
        this.vistaacer=vistaacer;
        this.alumnoDAO = alumnoDAO;
        
        this.unoEjercicioUnoDAO = unoEjercicioUnoDAO; 
        this.unoEjercicioDosDAO = unoEjercicioDosDAO;
        this.unoEjercicioTresDAO = unoEjercicioTresDAO;
        this.unoEjercicioFinalDAO = unoEjercicioFinalDAO;
        this.unoCalificacionDAO = unoCalificacionDAO;
        
        this.dosCalificacionDAO = dosCalificacionDAO;
        
        this.tresEjercicioUnoDAO = tresEjercicioUnoDAO;
        this.tresEjercicioDosDAO = tresEjercicioDosDAO;
        this.tresEjercicioTresDAO = tresEjercicioTresDAO;
        this.tresEjercicioFinalDAO = tresEjercicioFinalDAO;
        this.tresCalificacionDAO = tresCalificacionDAO;
        
        this.cuatroEjercicioUnoDAO = cuatroEjercicioUnoDAO; 
        this.cuatroEjercicioDosDAO = cuatroEjercicioDosDAO;
        this.cuatroEjercicioTresDAO = cuatroEjercicioTresDAO;
        this.cuatroEjercicioFinalDAO = cuatroEjercicioFinalDAO;
        this.cuatroCalificacionDAO = cuatroCalificacionDAO;
        
        this.cincoCalificacionDAO = cincoCalificacionDAO; 
        
        this.promedio = promedio;
        
        vistaini.btn_ingresar.addActionListener(this);
        vistaini.btn_registrar.addActionListener(this);
        vistamenu.btnnivel_1.addActionListener(this);
        vistamenu.btnnivel_2.addActionListener(this);
        vistamenu.btnnivel_3.addActionListener(this);
        vistamenu.btnnivel_4.addActionListener(this);
        vistamenu.btnnivel_5.addActionListener(this);
        vistamenu.btn_acerca.addActionListener(this);
        vistamenu.btn_creditos.addActionListener(this);
        vistamenu.btn_salir.addActionListener(this);
      
        vistaacer.btnregre_acer.addActionListener(this);
        vistacredi.btnregre_credi.addActionListener(this);
        vistaregistro.btnregre_regi.addActionListener(this);
        vistaregistro.btn_registrarse.addActionListener(this);
        //botones nivel 1
        vistanivel1.btn_regresar1.addActionListener(this);
        vistanivel1.btn_ininivel1.addActionListener(this);
        vistanivel1ini.btn1_nivel1ini.addActionListener(this);
        vistanivel1ini2.btn1_nivel1ini2.addActionListener(this);
        vistanivel1ini2.btn2_nivel1ini2.addActionListener(this);
        vistanivel1v3.btn1_nivel1v3.addActionListener(this);
        vistanivel1v3.btn2_n1v3.addActionListener(this);
        vistanivel1v4.btn1_niv1v4.addActionListener(this);
        vistanivel1v5.btn1_n1v5.addActionListener(this);
        vistanivel1v6.btn1_n1v6.addActionListener(this);
        vistanivel1v7.btn1_n1v7.addActionListener(this);
        vistanivel1v7.btn2_n1v7.addActionListener(this);
        vistanivel1v8.btn1_n1v8.addActionListener(this);
        vistanivel1v9.rbtn_n1v9.addActionListener(this);
        vistanivel1v9.rbtn2_n1v9.addActionListener(this);
        vistanivel1v9.rbtn3_n1v9.addActionListener(this);
        vistanivel1v9.rbtn4_n1v9.addActionListener(this);
        vistanivel1v9.btn1_n1v9.addActionListener(this);
        
        vistanivel1v9.btnGroupA.add(vistanivel1v9.rbtn_n1v9);
        vistanivel1v9.btnGroupA.add(vistanivel1v9.rbtn2_n1v9);
        
        vistanivel1v9.btnGroupB.add(vistanivel1v9.rbtn3_n1v9);
        vistanivel1v9.btnGroupB.add(vistanivel1v9.rbtn4_n1v9);
        
        vistanivel1v10.btn1_n1v10.addActionListener(this);
        vistanivel1v11.btn1_n1v11.addActionListener(this);
        vistanivel1v12.btn1_n1v12.addActionListener(this);
        vistanivel1v13.btn1_n1v13.addActionListener(this);
        vistanivel1v13.rbtn1_n1v13.addActionListener(this);
        vistanivel1v13.rbtn2_n1v13.addActionListener(this);
        vistanivel1v13.rbtn3_n1v13.addActionListener(this);
        
        vistanivel1v13.btnGroupSeleccion.add(vistanivel1v13.rbtn1_n1v13);
        vistanivel1v13.btnGroupSeleccion.add(vistanivel1v13.rbtn2_n1v13);
        vistanivel1v13.btnGroupSeleccion.add(vistanivel1v13.rbtn3_n1v13);
        
        vistanivel1v14.btn1_n1v14.addActionListener(this);
        //botones nivel 2
        vistanivel2v1.btn_ininivel2.addActionListener(this);
        vistanivel2v1.btn_ren2v1.addActionListener(this);
        vistanivel2v2.btn_n2v2.addActionListener(this);
        vistanivel2v3.btn_n2v3.addActionListener(this);
        vistanivel2v4.btn_n2v4.addActionListener(this);
        vistanivel2v5.btn_n2v5.addActionListener(this);
        vistanivel2v5.btn2_n2v5.addActionListener(this);
        vistanivel2v6.btn_n2v6.addActionListener(this);
        vistanivel2v7.btn_n2v7.addActionListener(this);
        vistanivel2v8.btn_n2v8.addActionListener(this);
        vistanivel2v9.btn_n2v9.addActionListener(this);
        vistanivel2v10.btn_n2v10.addActionListener(this);
        vistanivel2v11.btn1_memo.addActionListener(this);
        
        
        vistanivel2v12.btn_n2v12.addActionListener(this);
        //botones nivel 3
        vistanivel3.btn_regresar3.addActionListener(this);
        vistanivel3.btn_ininivel3.addActionListener(this);
        vistanivel3v1.b1_n3v1.addActionListener(this);
        vistanivel3v2.b1_n3v2.addActionListener(this);
        vistanivel3v3.b1_n3v3.addActionListener(this);
        vistanivel3v4.b1_n3v4.addActionListener(this);
        vistanivel3v5.b1_n3v5.addActionListener(this);
        vistanivel3v6.b1_n3v6.addActionListener(this);
        vistanivel3v7.b1_n3v7.addActionListener(this);
        vistanivel3v8.b1_n3v8.addActionListener(this);
        vistanivel3v9.b1_n3v9.addActionListener(this);
        vistanivel3v10.b1_n3v10.addActionListener(this);
        vistanivel3v11.b1_n3v11.addActionListener(this);
        vistanivel3v12.b1_n3v12.addActionListener(this);
        vistanivel3v13.b1_n3v13.addActionListener(this);
        vistanivel3v14.b1_n3v14.addActionListener(this);
        vistanivel3v15.b1_n3v15.addActionListener(this);
        //botones nivel 4
        vistanivel4.btn_regresar4.addActionListener(this);
        vistanivel4.btn_ininivel4.addActionListener(this);
        vistanivel4v1.b1_n4v1.addActionListener(this);
        vistanivel4v2.b1_n4v2.addActionListener(this);
        vistanivel4v3.b1_n4v3.addActionListener(this);
        vistanivel4v4.b1_n4v4.addActionListener(this);
        vistanivel4v5.b1_n4v5.addActionListener(this);
        vistanivel4v6.b1_n4v6.addActionListener(this);
        vistanivel4v7.b1_n4v7.addActionListener(this);
        vistanivel4v8.b1_n4v8.addActionListener(this);
        vistanivel4v9.b1_n4v9.addActionListener(this);
        vistanivel4v10.b1_n4v10.addActionListener(this);
        vistanivel4v11.b1_n4v11.addActionListener(this);
        
        //Nivel 4 Ejercicio 3
        vistanivel4v12.b1_n4v12.addActionListener(this);
        vistanivel4v12.btnGroupR.add(vistanivel4v12.rbtn1_n4v12);
        vistanivel4v12.btnGroupR.add(vistanivel4v12.rbtn2_n4v12);
        vistanivel4v12.btnGroupR.add(vistanivel4v12.rbtn3_n4v12);
        
        
        vistanivel4v13.b1_n4v13.addActionListener(this);
        vistanivel4v14.b1_n4v14.addActionListener(this);
        vistanivel4v15.b1_n4v15.addActionListener(this);
        vistanivel4v16.b1_n4v16.addActionListener(this);
        
        //botones nivel 5
        vistanivel5.btn_regresar5.addActionListener(this);
        vistanivel5.btn_ininivel5.addActionListener(this);
        
        
        
        
        vistanivel5v1.btn1_n5v1.addActionListener(this);
        vistanivel5v2.btn1_n5v2.addActionListener(this);
        vistanivel5v3.btn1_n5v3.addActionListener(this);
        vistanivel5v4.btn1_n5v4.addActionListener(this);
        vistanivel5v5.btn1_n5v5.addActionListener(this);
        vistanivel5v6.btn1_n5v6.addActionListener(this);
        vistanivel5v7.btn1_n5v7.addActionListener(this);
        vistanivel5v8.btn1_n5v8.addActionListener(this);
        vistanivel5v9.btn1_n5v9.addActionListener(this);
        vistanivel5v10.btn1_n5v10.addActionListener(this);
        vistanivel5v11.btn1_n5v11.addActionListener(this);
        vistanivel5v12.btn1_n5v12.addActionListener(this);
        vistanivel5v13.btn1_n5v13.addActionListener(this);
        vistanivel5v14.btn1_n5v14.addActionListener(this);
        vistanivel5v15.btn1_n5v15.addActionListener(this);
        vistanivel5v16.btn1_n5v16.addActionListener(this);
        
        
        
        //Nivel 5 prueba final(radio button y jtext)
        vistanivel5v13.btnGroupG.add(vistanivel5v13.rbtn1_n5v13);
        vistanivel5v13.btnGroupG.add(vistanivel5v13.rbtn2_n5v13);
        
        
       
        
    }
    
    
    
    public void registrarAlumno(){
        int nControl = Integer.parseInt(vistaregistro.jtxtNControl.getText());
        String nombre = vistaregistro.jtxtNombre.getText();
        String apellidos = vistaregistro.jtxtApellidos.getText();
        String Carrera = vistaregistro.jTxtCarrera.getText();
        String contrasenia = vistaregistro.jTxtContrasenia.getText();
        
        alumnoDAO.agregar(nControl, nombre, apellidos, Carrera, contrasenia);
        
    }
    
    
    public void calificacionFinalTres(){
        
        double suma;
        
        int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
        
        int valor = tresCalificacionDAO.numeroControl(nControl);
        
        if (valor != 0) {
           
            suma = (tresCalificacionDAO.calificacionEjercicioUno(nControl) +
            tresCalificacionDAO.calificacionEjercicioDos(nControl) +
            tresCalificacionDAO.calificacionEjercicioTres(nControl) +
            tresCalificacionDAO.calificacionEjercicioFinal(nControl)) / 4;
           
            tresCalificacionDAO.actualizarCalificacion(nControl, suma);
        
        
        }else{
            
        suma = (tresCalificacionDAO.calificacionEjercicioUno(nControl) +
            tresCalificacionDAO.calificacionEjercicioDos(nControl) +
            tresCalificacionDAO.calificacionEjercicioTres(nControl) +
            tresCalificacionDAO.calificacionEjercicioFinal(nControl)) / 4;
        
            tresCalificacionDAO.calificacionFinal(nControl, suma);
        }
        
        
        
    }
    
    public void calificacionFinalCuatro(){
        
        double suma;
        
        int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
        
        int valor = cuatroCalificacionDAO.numeroControl(nControl);
        
        if (valor != 0) {
           
            suma = (cuatroCalificacionDAO.calificacionEjercicioUno(nControl) +
            cuatroCalificacionDAO.calificacionEjercicioDos(nControl) +
            cuatroCalificacionDAO.calificacionEjercicioTres(nControl) +
            cuatroCalificacionDAO.calificacionEjercicioFinal(nControl)) / 4;
           
            cuatroCalificacionDAO.actualizarCalificacion(nControl, suma);
        
        
        }else{
            
        suma = (cuatroCalificacionDAO.calificacionEjercicioUno(nControl) +
            cuatroCalificacionDAO.calificacionEjercicioDos(nControl) +
            cuatroCalificacionDAO.calificacionEjercicioTres(nControl) +
            cuatroCalificacionDAO.calificacionEjercicioFinal(nControl)) / 4;
        
            cuatroCalificacionDAO.calificacionFinal(nControl, suma);
        }
        
        
    }
    
    public void calificacionFinal(){
        double suma;
        
        int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
        
        int valor = promedio.numeroControl(nControl);
        
        if (valor != 0) {
            
            suma = (promedio.calificacionUno(nControl) + promedio.calificacionDos(nControl)
                    + promedio.calificacionTres(nControl)+ promedio.calificacionCuatro(nControl)
                    + promedio.calificacionCinco(nControl)) / 5;
            
            promedio.actualizarCalificacion(nControl, suma);
            
        }else{
            
            suma = (promedio.calificacionUno(nControl) + promedio.calificacionDos(nControl)
                    + promedio.calificacionTres(nControl)+ promedio.calificacionCuatro(nControl)
                    + promedio.calificacionCinco(nControl)) / 5;
            
            promedio.calificacionFinal(nControl, suma);
            
        }
        
        
    }
    
    public void calificacionFinalDos(){
        double suma = 100;
        
        int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
        
        int valor = dosCalificacionDAO.numeroControl(nControl);
        
        if (valor != 0) {
           dosCalificacionDAO.actualizarCalificacion(nControl, suma);
        }else{
           dosCalificacionDAO.calificacionFinal(nControl, suma);
        }
        
    }
    
    public void calificacionFinalUno(){
        double suma;
        
        int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
        
        int valor = unoCalificacionDAO.numeroControl(nControl);
        
        if (valor != 0) {
           
            suma = (unoCalificacionDAO.calificacionEjercicioUno(nControl) +
            unoCalificacionDAO.calificacionEjercicioDos(nControl) +
            unoCalificacionDAO.calificacionEjercicioTres(nControl) +
            unoCalificacionDAO.calificacionEjercicioFinal(nControl)) / 4;
           
            unoCalificacionDAO.actualizarCalificacion(nControl, suma);
        
        
        }else{
            
        suma = (unoCalificacionDAO.calificacionEjercicioUno(nControl) +
            unoCalificacionDAO.calificacionEjercicioDos(nControl) +
            unoCalificacionDAO.calificacionEjercicioTres(nControl) +
            unoCalificacionDAO.calificacionEjercicioFinal(nControl)) / 4;
        
        unoCalificacionDAO.calificacionFinal(nControl, suma);
        }
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
       //BOTONES VISTA INICIO
       AudioClip Sound, Sound2;
       Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Elementos/m2.wav"));
       Sound2 = java.applet.Applet.newAudioClip(getClass().getResource("/Elementos/btn1.wav"));
       if (e.getSource() == vistaini.btn_ingresar) {
            
            if (vistaini.jtxtContrasenia.getText().equals("") && vistaini.jtxtNControl.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Ingresa tus datos, por favor", "Error", JOptionPane.ERROR_MESSAGE);
           
           }else{
               
               Boolean verdad = false;
           
               String nControl;
               nControl = vistaini.jtxtNControl.getText();
           
               String contrasenia;
               contrasenia = vistaini.jtxtContrasenia.getText();
           
               String pass = alumnoDAO.contrasenias(Integer.parseInt(nControl));
           
               if (contrasenia.equals(pass)) {
                   verdad = true;
               }
           
           
               if (verdad == true) {
                   vistaini.jtxtContrasenia.setText("");
                   
                   vistaini.setVisible(false);
                   vistamenu.setVisible(true);
                    Sound.play();
                    Sound2.play();
               }else{
                   JOptionPane.showMessageDialog(null, "Ingresa correctamente la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
                   vistaini.jtxtContrasenia.setText("");
                   vistaini.jtxtNControl.setText("");
               }
           }
           
           
        }
       if (e.getSource() == vistaini.btn_registrar) {
            vistaini.setVisible(false);
            vistaregistro.setVisible(true);
        }
       
       //boton musica
      
       
       //BOTONES VISTA REGISTRO
       if (e.getSource() == vistaregistro.btn_registrarse) {
            registrarAlumno();
            vistaregistro.jTxtCarrera.setText("");
            vistaregistro.jTxtContrasenia.setText("");
            vistaregistro.jtxtApellidos.setText("");
            vistaregistro.jtxtNControl.setText("");
            vistaregistro.jtxtNombre.setText("");
        }
       if (e.getSource() == vistaregistro.btnregre_regi) {
           
           
           vistaregistro.setVisible(false);
            vistaini.setVisible(true);
            Sound2.play();
        }
       
       //BOTONES VISTA MENU
       if (e.getSource() == vistamenu.btn_salir) {
            vistamenu.setVisible(false);
            vistaini.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistamenu.btn_acerca) {
            vistamenu.setVisible(false);
            vistaacer.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistamenu.btnnivel_1) {
            vistamenu.setVisible(false);
            vistanivel1.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistamenu.btnnivel_2) {
            vistamenu.setVisible(false);
            vistanivel2v1.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistamenu.btnnivel_3) {
            vistamenu.setVisible(false);
            vistanivel3.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistamenu.btnnivel_4) {
            vistamenu.setVisible(false);
            vistanivel4.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistamenu.btnnivel_5) {
            vistamenu.setVisible(false);
            vistanivel5.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistaacer.btnregre_acer) {
            vistaacer.setVisible(false);
            vistamenu.setVisible(true);
            Sound2.play();
            
        }
       if (e.getSource() == vistamenu.btn_creditos) {
            vistamenu.setVisible(false);
            vistacredi.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistacredi.btnregre_credi) {
            vistacredi.setVisible(false);
            vistamenu.setVisible(true);
            Sound2.play();
            
        }
       
       //BOTONES VISTA NIVEL 1
       if (e.getSource() == vistanivel1.btn_regresar1) {
            vistanivel1.setVisible(false);
            vistamenu.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistanivel1.btn_ininivel1) {
            vistanivel1.setVisible(false);
            vistanivel1ini.setVisible(true);
            Sound2.play();
        }
       
       if (e.getSource() == vistanivel1ini.btn1_nivel1ini) {
            vistanivel1ini.setVisible(false);
            vistanivel1ini2.setVisible(true);
            Sound2.play();
        }
       //BOTONES VISTA 2 NIVEL 1
       if (e.getSource() == vistanivel1ini2.btn1_nivel1ini2) {
            vistanivel1ini2.setVisible(false);
            vistanivel1v3.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistanivel1ini2.btn2_nivel1ini2) {
           Sound2.play(); 
           JOptionPane.showMessageDialog(null, "Estás a punto de iniciar un ejercicio, revisa cuidadosamente tus respuestas", "¡PRECAUCIÓN!", JOptionPane.WARNING_MESSAGE);
        }
       //BOTONES VISTA 3 NIVEL 1
       if (e.getSource() == vistanivel1v3.btn1_nivel1v3) {
         Sound2.play();  
           
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = unoEjercicioUnoDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = unoEjercicioUnoDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel1v3.setVisible(false);
                   vistanivel1v4.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel1v3.jtxt1nivel1ejercicio1.getText().equals("RRFN")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v3.jtxt2nivel1ejercicio1.getText().equals("RIP")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v3.jtxt3nivel1ejercicio1.getText().equals("RREP")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v3.jtxt4nivel1ejercicio1.getText().equals("RRFP")) {
                   suma = suma + 25;
               }
               
               unoEjercicioUnoDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = unoEjercicioUnoDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
           if (vistanivel1v3.jtxt1nivel1ejercicio1.getText().equals("RRFN")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v3.jtxt2nivel1ejercicio1.getText().equals("RIP")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v3.jtxt3nivel1ejercicio1.getText().equals("RREP")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v3.jtxt4nivel1ejercicio1.getText().equals("RRFP")) {
                   suma = suma + 25;
               }
           
           unoEjercicioUnoDAO.agregar(nControl, intentos, suma);    
           
           }
           
         
           
            vistanivel1v3.setVisible(false);
            vistanivel1v4.setVisible(true);
        }
       if (e.getSource() == vistanivel1v3.btn2_n1v3) {
            Sound2.play();
           JOptionPane.showMessageDialog(null, "Recuerda que todos los números del ejercicio son reales, entonces todos comienzan con una R", "¡CONSEJO!", JOptionPane.INFORMATION_MESSAGE);
        }
       //BOTONES VISTA 4 NIVEL 1
       if (e.getSource() == vistanivel1v4.btn1_niv1v4) {
            vistanivel1v4.setVisible(false);
            vistanivel1v5.setVisible(true);
            Sound2.play();
        }
       
       //BOTONES VISTA 5 NIVEL 1
       if (e.getSource() == vistanivel1v5.btn1_n1v5) {
           Sound2.play();
           
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = unoEjercicioDosDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = unoEjercicioDosDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel1v5.setVisible(false);
                   vistanivel1v6.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel1v5.jtxt1_n1v5.getText().equals("F")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v5.jtxt2_n1v5.getText().equals("V")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v5.jtxt3_n1v5.getText().equals("F")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v5.jtxt4_n1v5.getText().equals("F")) {
                   suma = suma + 25;
               }
               
               unoEjercicioDosDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = unoEjercicioDosDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel1v5.jtxt1_n1v5.getText().equals("F")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v5.jtxt2_n1v5.getText().equals("V")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v5.jtxt3_n1v5.getText().equals("F")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v5.jtxt4_n1v5.getText().equals("F")) {
                   suma = suma + 25;
               }
           
           unoEjercicioDosDAO.agregar(nControl, intentos, suma);    
           
           }
           
           vistanivel1v5.setVisible(false);
           vistanivel1v6.setVisible(true);
        }
       //BOTONES VISTA 6 NIVEL 1
       if (e.getSource() == vistanivel1v6.btn1_n1v6) {
            vistanivel1v6.setVisible(false);
            vistanivel1v7.setVisible(true);
            Sound2.play();
        }
       //BOTONES VISTA 7 NIVEL 1
       if (e.getSource() == vistanivel1v7.btn1_n1v7) {
            vistanivel1v7.setVisible(false);
            vistanivel1v8.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistanivel1v7.btn2_n1v7) {
           Sound2.play(); 
           JOptionPane.showMessageDialog(null, "Estudia bien esta tabla que te servirá en tu próximo ejercicio", "¡CONSEJO!", JOptionPane.INFORMATION_MESSAGE);
        }
       //BOTONES VISTA 8 NIVEL 1
       if (e.getSource() == vistanivel1v8.btn1_n1v8) {
            vistanivel1v8.setVisible(false);
            vistanivel1v9.setVisible(true);
            Sound2.play();
        }
       //BOTONES VISTA 9 NIVEL 1
       if (e.getSource() == vistanivel1v9.btn1_n1v9) {
           Sound2.play();
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = unoEjercicioTresDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = unoEjercicioTresDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel1v9.setVisible(false);
                   vistanivel1v10.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel1v9.jtxt_n1v9.getText().equals("[0,3)")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v9.jtxt2_n1v9.getText().equals("(-5,-2]")) {
                   suma = suma + 25;   
               }
                   if (vistanivel1v9.rbtn_n1v9.isSelected()) {
                       suma = suma + 25;
                   }
               
                   if (vistanivel1v9.rbtn3_n1v9.isSelected()) {
                       suma = suma + 25;
                   }
                   
               unoEjercicioTresDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = unoEjercicioTresDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel1v9.jtxt_n1v9.getText().equals("[0,3)")) {
                   suma = suma + 25;   
               }
               if (vistanivel1v9.jtxt2_n1v9.getText().equals("(-5,-2]")) {
                   suma = suma + 25;   
               }
                   if (vistanivel1v9.rbtn_n1v9.isSelected()) {
                       suma = suma + 25;
                   }
               
                   if (vistanivel1v9.rbtn3_n1v9.isSelected()) {
                       suma = suma + 25;
                   }
           
           unoEjercicioTresDAO.agregar(nControl, intentos, suma);    
           
           }
           
           
           
           
            vistanivel1v9.setVisible(false);
            vistanivel1v10.setVisible(true);
        }
       
       
       //BOTONES VISTA 10 NIVEL 1
       if (e.getSource() == vistanivel1v10.btn1_n1v10) {
            vistanivel1v10.setVisible(false);
            vistanivel1v11.setVisible(true);
            Sound2.play();
        }
       //BOTONES VISTA 11 NIVEL 1
       if (e.getSource() == vistanivel1v11.btn1_n1v11) {
           Sound2.play();
            vistanivel1v11.setVisible(false);
            vistanivel1v12.setVisible(true);
        }
       //BOTONES VISTA 12 NIVEL 1
       if (e.getSource() == vistanivel1v12.btn1_n1v12) {
           Sound2.play();
            vistanivel1v12.setVisible(false);
            vistanivel1v13.setVisible(true);
        }
       //BOTONES VISTA 13 NIVEL 1
       if (e.getSource() == vistanivel1v13.btn1_n1v13) {
            
           Sound2.play();
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = unoEjercicioFinalDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = unoEjercicioFinalDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel1v13.setVisible(false);
                   vistanivel1v14.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel1v13.jtxt1_n1v13.getText().equals("RRFP")) {
                   suma = suma + 20;   
               }
               if (vistanivel1v13.jtxt2_n1v13.getText().equals("RIN")) {
                   suma = suma + 20;   
               }
                   if (vistanivel1v13.jtxt3_n1v13.getText().equals("(-4,1]")) {
                       suma = suma + 20;
                   }
                   if (vistanivel1v13.jtxt4_n1v13.getText().equals("(0.1,0.9)")) {
                       suma = suma + 20;
                   }
                   if (vistanivel1v13.rbtn1_n1v13.isSelected()) {
                       suma = suma + 20;
                   }
                  
                   
               unoEjercicioFinalDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = unoEjercicioFinalDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel1v13.jtxt1_n1v13.getText().equals("RRFP")) {
                   suma = suma + 20;   
               }
               if (vistanivel1v13.jtxt2_n1v13.getText().equals("RIN")) {
                   suma = suma + 20;   
               }
                   if (vistanivel1v13.jtxt3_n1v13.getText().equals("(-4,1]")) {
                       suma = suma + 20;
                   }
                   if (vistanivel1v13.jtxt4_n1v13.getText().equals("(0.1,0.9)")) {
                       suma = suma + 20;
                   }
                   if (vistanivel1v13.rbtn1_n1v13.isSelected()) {
                       suma = suma + 20;
                   }
                  
                   
               unoEjercicioFinalDAO.agregar(nControl, intentos, suma);
                 
           
           }
           
           calificacionFinalUno();
           
           
           vistanivel1v13.setVisible(false);
           vistanivel1v14.setVisible(true);
           
        }
      
       
       //BOTONES VISTA 14 NIVEL 1
       if (e.getSource() == vistanivel1v14.btn1_n1v14) {
           Sound2.play();
           vistanivel1v14.setVisible(false);
            vistamenu.setVisible(true);
        }
       //BOTONES VISTA 1 NIVEL 2
       if (e.getSource() == vistanivel2v1.btn_ren2v1) {
            vistanivel2v1.setVisible(false);
            vistamenu.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistanivel2v1.btn_ininivel2) {
           Sound2.play(); 
           vistanivel2v1.setVisible(false);
            vistanivel2v2.setVisible(true);
        }
       //BOTONES VISTA 2 NIVEL 2
       if (e.getSource() == vistanivel2v2.btn_n2v2) {
           Sound2.play(); 
           vistanivel2v2.setVisible(false);
            vistanivel2v3.setVisible(true);
        }
       //BOTONES VISTA 3 NIVEL 2
       if (e.getSource() == vistanivel2v3.btn_n2v3) {
           Sound2.play(); 
           vistanivel2v3.setVisible(false);
            vistanivel2v4.setVisible(true);
        }
       //BOTONES VISTA 4 NIVEL 2
       if (e.getSource() == vistanivel2v4.btn_n2v4) {
           Sound2.play(); 
           vistanivel2v4.setVisible(false);
            vistanivel2v5.setVisible(true);
        }
       //BOTONES VISTA 5 NIVEL 2
       if (e.getSource() == vistanivel2v5.btn_n2v5) {
           Sound2.play(); 
           vistanivel2v5.setVisible(false);
            vistanivel2v6.setVisible(true);
        }
       if (e.getSource() == vistanivel2v5.btn2_n2v5) {
           Sound2.play(); 
           JOptionPane.showMessageDialog(null, "Estudia bien la manera en la que se representan las funciones, lo necesitarás", "¡CONSEJO!", JOptionPane.INFORMATION_MESSAGE);
        }
       //BOTONES VISTA 6 NIVEL 2
       if (e.getSource() == vistanivel2v6.btn_n2v6) {
           Sound2.play(); 
           vistanivel2v6.setVisible(false);
            vistanivel2v7.setVisible(true);
        }
       //BOTONES VISTA 7 NIVEL 2
       if (e.getSource() == vistanivel2v7.btn_n2v7) {
           Sound2.play();
           vistanivel2v7.setVisible(false);
            vistanivel2v8.setVisible(true);
        }
       //BOTONES VISTA 8 NIVEL 2
       if (e.getSource() == vistanivel2v8.btn_n2v8) {
           Sound2.play(); 
           vistanivel2v8.setVisible(false);
            vistanivel2v9.setVisible(true);
        }
       //BOTONES VISTA 9 NIVEL 2
       if (e.getSource() == vistanivel2v9.btn_n2v9) {
           Sound2.play(); 
           vistanivel2v9.setVisible(false);
            vistanivel2v10.setVisible(true);
        }
       //BOTONES VISTA 10 NIVEL 2
       if (e.getSource() == vistanivel2v10.btn_n2v10) {
           Sound2.play(); 
           vistanivel2v10.setVisible(false);
            vistanivel2v11.setVisible(true);
            vistanivel2v11.btn1_memo.setVisible(false);
            
            vistanivel2v11.nivel.addItem("Nivel_1");
            
        }
       //BOTONES VISTA 11 NIVEL 2
       if (e.getSource() == vistanivel2v11.btn1_memo) {
            Sound2.play();
           calificacionFinalDos();
           
           
           
           vistanivel2v11.setVisible(false);
           vistanivel2v12.setVisible(true);
        }
       //BOTONES VISTA 12 NIVEL 2
       if (e.getSource() == vistanivel2v12.btn_n2v12) {
           Sound2.play(); 
           vistanivel2v12.setVisible(false);
            vistamenu.setVisible(true);
        }
       //BOTONES VISTA NIVEL 3
       if (e.getSource() == vistanivel3.btn_regresar3) {
           Sound2.play();
           vistanivel3.setVisible(false);
            vistamenu.setVisible(true);
            
        }
       if (e.getSource() == vistanivel3.btn_ininivel3) {
          Sound2.play();
           vistanivel3.setVisible(false);
           vistanivel3v1.setVisible(true);
        }
       //BOTONES VISTA 1 NIVEL 3
       if (e.getSource() == vistanivel3v1.b1_n3v1) {
          Sound2.play();
           vistanivel3v1.setVisible(false);
           vistanivel3v2.setVisible(true);
        }
       //BOTONES VISTA 2 NIVEL 3
       if (e.getSource() == vistanivel3v2.b1_n3v2) {
           Sound2.play();
           vistanivel3v2.setVisible(false);
           vistanivel3v3.setVisible(true);
        }
       //BOTONES VISTA 3 NIVEL 3
       if (e.getSource() == vistanivel3v3.b1_n3v3) {
           Sound2.play();
           vistanivel3v3.setVisible(false);
           vistanivel3v4.setVisible(true);
        }
       //BOTONES VISTA 4 NIVEL 3
       if (e.getSource() == vistanivel3v4.b1_n3v4) {
           Sound2.play();
           vistanivel3v4.setVisible(false);
           vistanivel3v5.setVisible(true);
        }
       //BOTONES VISTA 5 NIVEL 3
       if (e.getSource() == vistanivel3v5.b1_n3v5) {
           Sound2.play();
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = tresEjercicioUnoDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = tresEjercicioUnoDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel3v5.setVisible(false);
                   vistanivel3v6.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel3v5.jtxtn3_1.getText().equals("22")) {
                   suma = suma + 25;   
               }
               if (vistanivel3v5.jtxtn3_2.getText().equals("78.8")) {
                   suma = suma + 25;   
               }
               if (vistanivel3v5.jtxtn3_3.getText().equals("-9")) {
                   suma = suma + 25;   
               }
               if (vistanivel3v5.jtxtn3_4.getText().equals("-3")) {
                   suma = suma + 25;
               }
               
               tresEjercicioUnoDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = tresEjercicioUnoDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel3v5.jtxtn3_1.getText().equals("22")) {
                   suma = suma + 25;   
               }
               if (vistanivel3v5.jtxtn3_2.getText().equals("78.8")) {
                   suma = suma + 25;   
               }
               if (vistanivel3v5.jtxtn3_3.getText().equals("-9")) {
                   suma = suma + 25;   
               }
               if (vistanivel3v5.jtxtn3_4.getText().equals("-3")) {
                   suma = suma + 25;
               }
           
           tresEjercicioUnoDAO.agregar(nControl, intentos, suma);    
           
           }
           
           
            
           vistanivel3v5.setVisible(false);
           vistanivel3v6.setVisible(true);
        }
       //BOTONES VISTA 6 NIVEL 3
       if (e.getSource() == vistanivel3v6.b1_n3v6) {
          Sound2.play();
           vistanivel3v6.setVisible(false);
           vistanivel3v7.setVisible(true);
        }
       //BOTONES VISTA 7 NIVEL 3
       if (e.getSource() == vistanivel3v7.b1_n3v7) {
           Sound2.play();
           vistanivel3v7.setVisible(false);
           vistanivel3v8.setVisible(true);
        }
       //BOTONES VISTA 8 NIVEL 3
       if (e.getSource() == vistanivel3v8.b1_n3v8) {
           Sound2.play();
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = tresEjercicioDosDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = tresEjercicioDosDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel3v8.setVisible(false);
                   vistanivel3v9.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel3v8.jtxt_n3v8.getText().equals("2x")) {
                   suma = suma + 25;   
               }
               
               
               tresEjercicioDosDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = tresEjercicioDosDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel3v8.jtxt_n3v8.getText().equals("2x")) {
                   suma = 100;   
               }
           
           tresEjercicioDosDAO.agregar(nControl, intentos, suma);    
           
           }
           
           vistanivel3v8.setVisible(false);
           vistanivel3v9.setVisible(true);
        }
       //BOTONES VISTA 9 NIVEL 3
       if (e.getSource() == vistanivel3v9.b1_n3v9) {
           Sound2.play();
           vistanivel3v9.setVisible(false);
           vistanivel3v10.setVisible(true);
        }
       //BOTONES VISTA 10 NIVEL 3
       if (e.getSource() == vistanivel3v10.b1_n3v10) {
           Sound2.play();
           vistanivel3v10.setVisible(false);
           vistanivel3v11.setVisible(true);
        }
       //BOTONES VISTA 11 NIVEL 3
       if (e.getSource() == vistanivel3v11.b1_n3v11) {
           Sound2.play();
           vistanivel3v11.setVisible(false);
           vistanivel3v12.setVisible(true);
        }
       //BOTONES VISTA 12 NIVEL 3
       if (e.getSource() == vistanivel3v12.b1_n3v12) {
           Sound2.play();
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = tresEjercicioTresDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = tresEjercicioTresDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel3v12.setVisible(false);
                   vistanivel3v13.setVisible(true);
                   
                   
               }else{              
               
               double suma = 0;
               if (vistanivel3v12.jtxt1_n3v12.getText().equals("continua")) {
                   suma = suma + 100;   
               }
               
               
               tresEjercicioTresDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = tresEjercicioTresDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel3v12.jtxt1_n3v12.getText().equals("continua")) {
                   suma = 100;   
               }
           
           tresEjercicioTresDAO.agregar(nControl, intentos, suma);    
           
           }
           
           vistanivel3v12.setVisible(false);
           vistanivel3v13.setVisible(true);
        }
       //BOTONES VISTA 13 NIVEL 3
       if (e.getSource() == vistanivel3v13.b1_n3v13) {
          Sound2.play();
           vistanivel3v13.setVisible(false);
           vistanivel3v14.setVisible(true);
        }
       //BOTONES VISTA 14 NIVEL 3
       if (e.getSource() == vistanivel3v14.b1_n3v14) {
           Sound2.play();
            int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = tresEjercicioFinalDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = tresEjercicioFinalDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel3v14.setVisible(false);
                   vistanivel3v15.setVisible(true);
                   
                   
               }else{              
               
               double suma = 0;
               if (vistanivel3v14.jtxt_n3v14.getText().equals("discontinua")) {
                   suma = suma + 100;   
               }
               
               
               tresEjercicioFinalDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = tresEjercicioFinalDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel3v14.jtxt_n3v14.getText().equals("discontinua")) {
                   suma = suma + 100;   
               }
           
           tresEjercicioFinalDAO.agregar(nControl, intentos, suma);    
           
           }
           
           
           calificacionFinalTres();
           
           vistanivel3v14.setVisible(false);
           vistanivel3v15.setVisible(true);
        }
       //BOTONES VISTA 15 NIVEL 3
       if (e.getSource() == vistanivel3v15.b1_n3v15) {
           Sound2.play();
           vistanivel3v15.setVisible(false);
           vistamenu.setVisible(true);
        }
       //BOTONES VISTA NIVEL 4
       if (e.getSource() == vistanivel4.btn_regresar4) {
            vistanivel4.setVisible(false);
            vistamenu.setVisible(true);
            Sound2.play();
        }
       if (e.getSource() == vistanivel4.btn_ininivel4) {
           Sound2.play();
           vistanivel4.setVisible(false);
            vistanivel4v1.setVisible(true);
        }
       
        //BOTONES VISTA 1 NIVEL 4
       if (e.getSource() == vistanivel4v1.b1_n4v1) {
           Sound2.play(); 
           vistanivel4v1.setVisible(false);
            vistanivel4v2.setVisible(true);
        }
       
         //BOTONES VISTA 2 NIVEL 4
       if (e.getSource() == vistanivel4v2.b1_n4v2) {
           Sound2.play();
           vistanivel4v2.setVisible(false);
            vistanivel4v3.setVisible(true);
        }
       
         //BOTONES VISTA 3 NIVEL 4
       if (e.getSource() == vistanivel4v3.b1_n4v3) {
           Sound2.play();
           vistanivel4v3.setVisible(false);
            vistanivel4v4.setVisible(true);
        }
       
         //BOTONES VISTA 4 NIVEL 4
       if (e.getSource() == vistanivel4v4.b1_n4v4) {
           Sound2.play();
           vistanivel4v4.setVisible(false);
            vistanivel4v5.setVisible(true);
        }
       
         //BOTONES VISTA 5 NIVEL 4
       if (e.getSource() == vistanivel4v5.b1_n4v5) {
           Sound2.play();
           vistanivel4v5.setVisible(false);
            vistanivel4v6.setVisible(true);
        }
       
         //BOTONES VISTA 6 NIVEL 4
       if (e.getSource() == vistanivel4v6.b1_n4v6) {
           Sound2.play();
           
           
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = cuatroEjercicioUnoDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = cuatroEjercicioUnoDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel4v6.setVisible(false);
                   vistanivel4v7.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel4v6.jtxt1_n4v6.getText().equals("2")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v6.jtxt2_n4v6.getText().equals("1")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v6.jtxt3_n4v6.getText().equals("4")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v6.jtxt4_n4v6.getText().equals("3")) {
                   suma = suma + 25;
               }
               
               cuatroEjercicioUnoDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = cuatroEjercicioUnoDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel4v6.jtxt1_n4v6.getText().equals("2")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v6.jtxt2_n4v6.getText().equals("1")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v6.jtxt3_n4v6.getText().equals("4")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v6.jtxt4_n4v6.getText().equals("3")) {
                   suma = suma + 25;
               }
           
           cuatroEjercicioUnoDAO.agregar(nControl, intentos, suma);    
           
           }
           
         
           
           
            vistanivel4v6.setVisible(false);
            vistanivel4v7.setVisible(true);
        }
       
         //BOTONES VISTA 7 NIVEL 4
       if (e.getSource() == vistanivel4v7.b1_n4v7) {
           Sound2.play();
           vistanivel4v7.setVisible(false);
            vistanivel4v8.setVisible(true);
        }
       
         //BOTONES VISTA 8 NIVEL 4
       if (e.getSource() == vistanivel4v8.b1_n4v8) {
           Sound2.play(); 
           vistanivel4v8.setVisible(false);
            vistanivel4v9.setVisible(true);
        }
       
          //BOTONES VISTA 9 NIVEL 4
       if (e.getSource() == vistanivel4v9.b1_n4v9) {
           Sound2.play(); 
           vistanivel4v9.setVisible(false);
            vistanivel4v10.setVisible(true);
        }
       
          //BOTONES VISTA 10 NIVEL 4
       if (e.getSource() == vistanivel4v10.b1_n4v10) {
           Sound2.play();
           
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = cuatroEjercicioDosDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = cuatroEjercicioDosDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel4v10.setVisible(false);
                   vistanivel4v11.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel4v10.jtxt1_n4v10.getText().equals("0")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v10.jtxt2_n4v10.getText().equals("1")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v10.jtxt3_n4v10.getText().equals("3")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v10.jtxt4_n4v10.getText().equals("2x")) {
                   suma = suma + 25;
               }
               
               cuatroEjercicioDosDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = cuatroEjercicioDosDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel4v10.jtxt1_n4v10.getText().equals("0")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v10.jtxt2_n4v10.getText().equals("1")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v10.jtxt3_n4v10.getText().equals("3")) {
                   suma = suma + 25;   
               }
               if (vistanivel4v10.jtxt4_n4v10.getText().equals("2x")) {
                   suma = suma + 25;
               }
           
           cuatroEjercicioDosDAO.agregar(nControl, intentos, suma);    
           
           }
           
           
            vistanivel4v10.setVisible(false);
            vistanivel4v11.setVisible(true);
        }
       
          //BOTONES VISTA 11 NIVEL 4
       if (e.getSource() == vistanivel4v11.b1_n4v11) {
           Sound2.play(); 
           vistanivel4v11.setVisible(false);
            vistanivel4v12.setVisible(true);
        }
       
          //BOTONES VISTA 12 NIVEL 4
       if (e.getSource() == vistanivel4v12.b1_n4v12) {
            Sound2.play();
           
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = cuatroEjercicioTresDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = cuatroEjercicioTresDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel4v12.setVisible(false);
                   vistanivel4v13.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel4v12.jtxt1_n4v12.getText().equals("8x")) {
                   suma = suma + 30;   
               }
               if (vistanivel4v12.jtxt2_n4v12.getText().equals("32x")) {
                   suma = suma + 30;   
               }
               if (vistanivel4v12.rbtn2_n4v12.isSelected()) {
                       suma = suma + 40;
               }
               
               cuatroEjercicioTresDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = cuatroEjercicioTresDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               
               if (vistanivel4v12.jtxt1_n4v12.getText().equals("8x")) {
                   suma = suma + 30;   
               }
               if (vistanivel4v12.jtxt2_n4v12.getText().equals("32x")) {
                   suma = suma + 30;   
               }
               if (vistanivel4v12.rbtn2_n4v12.isSelected()) {
                   suma = suma + 40;
               }
           
           cuatroEjercicioTresDAO.agregar(nControl, intentos, suma);    
           
           }
           
           
           vistanivel4v12.setVisible(false);
           vistanivel4v13.setVisible(true);
        }
       
          //BOTONES VISTA 13 NIVEL 4
       if (e.getSource() == vistanivel4v13.b1_n4v13) {
           Sound2.play(); 
           vistanivel4v13.setVisible(false);
            vistanivel4v14.setVisible(true);
        }
       
          //BOTONES VISTA 14 NIVEL 4
       if (e.getSource() == vistanivel4v14.b1_n4v14) {
           Sound2.play();
           vistanivel4v14.setVisible(false);
            vistanivel4v15.setVisible(true);
        }
       
          //BOTONES VISTA 15 NIVEL 4
       if (e.getSource() == vistanivel4v15.b1_n4v15) {
            Sound2.play();
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = cuatroEjercicioFinalDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = cuatroEjercicioFinalDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel4v15.setVisible(false);
                   vistanivel4v16.setVisible(true);
                   
               }else{              
               
               double suma = 0;
               if (vistanivel4v15.jtxt1_n4v15.getText().equals("5")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt2_n4v15.getText().equals("1")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt3_n4v15.getText().equals("3")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt4_n4v15.getText().equals("6")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt5_n4v15.getText().equals("2")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt6_n4v15.getText().equals("4")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt7_n4v15.getText().equals("500")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt8_n4v15.getText().equals("64x")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt9_n4v15.getText().equals("4")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt10_n4v15.getText().equals("16x")) {
                   suma = suma + 10;   
               }
               
               
               cuatroEjercicioFinalDAO.actualizarEjercicio(nControl, intentos, suma);
               
               }
               
           }else{
               
           int intentos = cuatroEjercicioFinalDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           double suma = 0;
               if (vistanivel4v15.jtxt1_n4v15.getText().equals("5")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt2_n4v15.getText().equals("1")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt3_n4v15.getText().equals("3")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt4_n4v15.getText().equals("6")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt5_n4v15.getText().equals("2")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt6_n4v15.getText().equals("4")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt7_n4v15.getText().equals("500")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt8_n4v15.getText().equals("64x")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt9_n4v15.getText().equals("4")) {
                   suma = suma + 10;   
               }
               if (vistanivel4v15.jtxt10_n4v15.getText().equals("16x")) {
                   suma = suma + 10;   
               }
           
           cuatroEjercicioFinalDAO.agregar(nControl, intentos, suma);    
           
           }
           
           calificacionFinalCuatro();
           
           
           vistanivel4v15.setVisible(false);
           vistanivel4v16.setVisible(true);
        }
       
          //BOTONES VISTA 16 NIVEL 4
       if (e.getSource() == vistanivel4v16.b1_n4v16) {
           Sound2.play(); 
           vistanivel4v16.setVisible(false);
            vistamenu.setVisible(true);
        }
       
       
       
       //BOTONES VISTA NIVEL 5
       if (e.getSource() == vistanivel5.btn_regresar5) {
            Sound2.play();
           vistanivel5.setVisible(false);
            vistamenu.setVisible(true);
           
        }
       if (e.getSource() == vistanivel5.btn_ininivel5) {
           Sound2.play(); 
           vistanivel5.setVisible(false);
            vistanivel5v1.setVisible(true);
        }
       
       //BOTONES VISTA 1 NIVEL 5
       if (e.getSource() == vistanivel5v1.btn1_n5v1) {
           Sound2.play(); 
           vistanivel5v1.setVisible(false);
            vistanivel5v2.setVisible(true);
        }
       
       //BOTONES VISTA 2 NIVEL 5
       if (e.getSource() == vistanivel5v2.btn1_n5v2) {
           Sound2.play(); 
           vistanivel5v2.setVisible(false);
            vistanivel5v3.setVisible(true);
        }
      
       //BOTONES VISTA 3 NIVEL 5
       if (e.getSource() == vistanivel5v3.btn1_n5v3) {
           Sound2.play(); 
           vistanivel5v3.setVisible(false);
            vistanivel5v4.setVisible(true);
        }
       
       //BOTONES VISTA 4 NIVEL 5
       if (e.getSource() == vistanivel5v4.btn1_n5v4) {
           Sound2.play();
           vistanivel5v4.setVisible(false);
            vistanivel5v5.setVisible(true);
        }
       
       //BOTONES VISTA 5 NIVEL 5
       if (e.getSource() == vistanivel5v5.btn1_n5v5) {
           Sound2.play(); 
           vistanivel5v5.setVisible(false);
            vistanivel5v6.setVisible(true);
        }
       
       //BOTONES VISTA 6 NIVEL 5
       if (e.getSource() == vistanivel5v6.btn1_n5v6) {
           Sound2.play(); 
           vistanivel5v6.setVisible(false);
            vistanivel5v7.setVisible(true);
        }
       
       //BOTONES VISTA 7 NIVEL 5
       if (e.getSource() == vistanivel5v7.btn1_n5v7) {
           Sound2.play(); 
           vistanivel5v7.setVisible(false);
            vistanivel5v8.setVisible(true);
        }
       
       //BOTONES VISTA 8 NIVEL 5
       if (e.getSource() == vistanivel5v8.btn1_n5v8) {
           Sound2.play();
           vistanivel5v8.setVisible(false);
            vistanivel5v9.setVisible(true);
        }
       
       //BOTONES VISTA 9 NIVEL 5
       if (e.getSource() == vistanivel5v9.btn1_n5v9) {
           Sound2.play();
           vistanivel5v9.setVisible(false);
            vistanivel5v10.setVisible(true);
        }
       
       //BOTONES VISTA 10 NIVEL 5
       if (e.getSource() == vistanivel5v10.btn1_n5v10) {
           Sound2.play();
           if (vistanivel5v10.jtxt1_n5v10.getText().equals("2x+1") || vistanivel5v10.jtxt1_n5v10.getText().equals("2x + 1")) {
               calificacionCinco = calificacionCinco + 6;
           }
           
           if (vistanivel5v10.jtxt2_n5v10.getText().equals("-3")){
               calificacionCinco = calificacionCinco + 6;
           }
           
           if (vistanivel5v10.jtxt3_n5v10.getText().equals("2")){
               calificacionCinco = calificacionCinco + 4;
           }
           
           
            vistanivel5v10.setVisible(false);
            vistanivel5v11.setVisible(true);
        }
       
       //BOTONES VISTA 11 NIVEL 5
       if (e.getSource() == vistanivel5v11.btn1_n5v11) {
           Sound2.play();
           if (vistanivel5v11.jtxt1_n5v11.getText().equals("1.84")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v11.jtxt2_n5v11.getText().equals("11.67")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v11.jtxt3_n5v11.getText().equals("14.5")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v11.jtxt4_n5v11.getText().equals("12.34")) {
               calificacionCinco = calificacionCinco + 4;
           }
            
           
           
            vistanivel5v11.setVisible(false);
            vistanivel5v12.setVisible(true);
        }
       
       //BOTONES VISTA 12 NIVEL 5
       if (e.getSource() == vistanivel5v12.btn1_n5v12) {
           Sound2.play();
           if (vistanivel5v12.jtxt1_n5v12.getText().equals("7.83")) {
               calificacionCinco = calificacionCinco + 4;
           }
           if (vistanivel5v12.jtxt2_n5v12.getText().equals("4.085")) {
               calificacionCinco = calificacionCinco + 4;
           }
           if (vistanivel5v12.jtxt3_n5v12.getText().equals("1")) {
               calificacionCinco = calificacionCinco + 4;
           }
           if (vistanivel5v12.jtxt4_n5v12.getText().equals("-4.17")) {
               calificacionCinco = calificacionCinco + 4;
           }
           if (vistanivel5v12.jtxt5_n5v12.getText().equals("-6.34")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v12.jtxt6_n5v12.getText().equals("-3.5")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v12.jtxt7_n5v12.getText().equals("6.33")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
            vistanivel5v12.setVisible(false);
            vistanivel5v13.setVisible(true);
        }
       
       
       //BOTONES VISTA 13 NIVEL 5
       if (e.getSource() == vistanivel5v13.btn1_n5v13) {
           Sound2.play();
           if (vistanivel5v13.rbtn1_n5v13.isSelected()) {
               calificacionCinco = calificacionCinco + 4;
           }
           
            vistanivel5v13.setVisible(false);
            vistanivel5v14.setVisible(true);
        }
       
       
       //BOTONES VISTA 14 NIVEL 5
       if (e.getSource() == vistanivel5v14.btn1_n5v14) {
           Sound2.play();
           if (vistanivel5v14.jtxt1_n5v14.getText().equals("-3")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v14.jtxt2_n5v14.getText().equals("-3")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v14.jtxt3_n5v14.getText().equals("2")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v14.jtxt4_n5v14.getText().equals("2")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           if (vistanivel5v14.jtxt5_n5v14.getText().equals("6")) {
               calificacionCinco = calificacionCinco + 4;
           }
           
           
            vistanivel5v14.setVisible(false);
            vistanivel5v15.setVisible(true);
        }
       
       
       //BOTONES VISTA 15 NIVEL 5
       if (e.getSource() == vistanivel5v15.btn1_n5v15) {
           Sound2.play();
           int nControl = Integer.parseInt(vistaini.jtxtNControl.getText());
           
           int valor = cincoCalificacionDAO.numeroControl(nControl);
           
           
           
           if (valor != 0) {
              
               int intentos = cincoCalificacionDAO.intento(nControl);
               
               
               if (intentos == 0) {
               
                   intentos = 1;
                   
               }else{
                   
                   intentos = intentos + 1;
                   
               }
               
               if (intentos == 3) {
                   
                   vistanivel5v15.setVisible(false);
                   vistanivel5v16.setVisible(true);
                   
                   calificacionCinco = 0;
                   
               }else{              
               
               
               if (vistanivel5v15.jtxt1_n5v15.getText().equals("35.67")) {
                     calificacionCinco = calificacionCinco + 4;
               }
               
               if (vistanivel5v15.jtxt2_n5v15.getText().equals("35.67")) {
                     calificacionCinco = calificacionCinco + 4;
               }
               
               if (vistanivel5v15.jtxt3_n5v15.getText().equals("35.67")) {
                     calificacionCinco = calificacionCinco + 4;
               }
               
               if (vistanivel5v15.jtxt4_n5v15.getText().equals("-5.94")) {
                     calificacionCinco = calificacionCinco + 4;
               }
                   
               cincoCalificacionDAO.actualizarEjercicio(nControl, intentos, calificacionCinco);
               
               calificacionCinco = 0;
               
               }
               
           }else{
               
           int intentos = cincoCalificacionDAO.intento(nControl);
           
           if (intentos == 0) {
               intentos = 1;
           }else{
               intentos = intentos + 1;
           }
           
           if (vistanivel5v15.jtxt1_n5v15.getText().equals("35.67")) {
                     calificacionCinco = calificacionCinco + 4;
               }
               
               if (vistanivel5v15.jtxt2_n5v15.getText().equals("35.67")) {
                     calificacionCinco = calificacionCinco + 4;
               }
               
               if (vistanivel5v15.jtxt3_n5v15.getText().equals("35.67")) {
                     calificacionCinco = calificacionCinco + 4;
               }
               
               if (vistanivel5v15.jtxt4_n5v15.getText().equals("-5.94")) {
                     calificacionCinco = calificacionCinco + 4;
               }
           
           
               cincoCalificacionDAO.agregar(nControl, intentos, calificacionCinco);    
               calificacionCinco = 0;
           }
           
           calificacionFinal();
           
           
            vistanivel5v15.setVisible(false);
            vistanivel5v16.setVisible(true);
        }
       
       
       //BOTONES VISTA 16 NIVEL 5
       if (e.getSource() == vistanivel5v16.btn1_n5v16) {
           Sound2.play();
           vistanivel5v16.setVisible(false);
            vistamenu.setVisible(true);
        }
       
    }
    
}
