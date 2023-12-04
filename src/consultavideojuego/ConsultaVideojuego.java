/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultavideojuego;

import Controlador.ControladorVideojuego;
import Vista.Acercade;
import Vista.Créditos;
import Vista.Inicio;
import Vista.Menu;
import Vista.Nivel1;
import Vista.Nivel1v1;
import Vista.Nivel1v2;
import Vista.Nivel1v3;
import Vista.Nivel3;
import Vista.Nivel4;
import Vista.Nivel5;
import Vista.Registro;
import Modelo.Alumno;
import Modelo.AlumnoDAO;
import Modelo.CincoCalificacionDAO;
import Modelo.ConexionBD;
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
import Vista.Nivel2v10;
import Vista.Nivel2v11;
import Vista.Nivel2v12;
import Vista.Nivel2v2;
import Vista.Nivel2v3;
import Vista.Nivel2v4;
import Vista.Nivel2v5;
import Vista.Nivel2v6;
import Vista.Nivel2v7;
import Vista.Nivel2v8;
import Vista.Nivel2v9;
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

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConsultaVideojuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.establecerConexion();
        Inicio vistaI = new Inicio();
        Menu vistaM = new Menu();
        Registro vistaR = new Registro();
        Acercade vistaAcer = new Acercade();
        Créditos vistac = new Créditos();
        Nivel1 N1 = new Nivel1();
        Nivel1v1 n1v1 = new Nivel1v1();
        Nivel1v2 n1v2 = new Nivel1v2();
        Nivel1v3 n1v3 = new Nivel1v3();
        Nivel1v4 n1v4 = new Nivel1v4();
        Nivel1v5 n1v5 = new Nivel1v5();
        Nivel1v6 n1v6 = new Nivel1v6();
        Nivel1v7 n1v7 = new Nivel1v7();
        Nivel1v8 n1v8 = new Nivel1v8();
        Nivel1v9 n1v9 = new Nivel1v9();
        Nivel1v10 n1v10 = new Nivel1v10();
        Nivel1v11 n1v11 = new Nivel1v11();
        Nivel1v12 n1v12 = new Nivel1v12();
        Nivel1v13 n1v13 = new Nivel1v13();
        Nivel1v14 n1v14 = new Nivel1v14();
        Nivel2v1 n2v1 = new Nivel2v1();
        Nivel2v2 n2v2 = new Nivel2v2();
        Nivel2v3 n2v3 = new Nivel2v3();
        Nivel2v4 n2v4 = new Nivel2v4();
        Nivel2v5 n2v5 = new Nivel2v5();
        Nivel2v6 n2v6 = new Nivel2v6();
        Nivel2v7 n2v7 = new Nivel2v7();
        Nivel2v8 n2v8 = new Nivel2v8();
        Nivel2v9 n2v9 = new Nivel2v9();
        Nivel2v10 n2v10 = new Nivel2v10();
        Nivel2v11 n2v11 = new Nivel2v11();
        Nivel2v12 n2v12 = new Nivel2v12();
        Nivel3 N3 = new Nivel3();
        Nivel3v1 n3v1 = new Nivel3v1();
        Nivel3v2 n3v2 = new Nivel3v2();
        Nivel3v3 n3v3 = new Nivel3v3();
        Nivel3v4 n3v4 = new Nivel3v4();
        Nivel3v5 n3v5 = new Nivel3v5();
        Nivel3v6 n3v6 = new Nivel3v6();
        Nivel3v7 n3v7 = new Nivel3v7();
        Nivel3v8 n3v8 = new Nivel3v8();
        Nivel3v9 n3v9 = new Nivel3v9();
        Nivel3v10 n3v10 = new Nivel3v10();
        Nivel3v11 n3v11 = new Nivel3v11();
        Nivel3v12 n3v12 = new Nivel3v12();
        Nivel3v13 n3v13 = new Nivel3v13();
        Nivel3v14 n3v14 = new Nivel3v14();
        Nivel3v15 n3v15 = new Nivel3v15();
        Nivel4 N4 = new Nivel4();
        Nivel4v1 n4v1 = new Nivel4v1();
        Nivel4v2 n4v2 = new Nivel4v2();
        Nivel4v3 n4v3 = new Nivel4v3();
        Nivel4v4 n4v4 = new Nivel4v4();
        Nivel4v5 n4v5 = new Nivel4v5();
        Nivel4v6 n4v6 = new Nivel4v6();
        Nivel4v7 n4v7 = new Nivel4v7();
        Nivel4v8 n4v8 = new Nivel4v8();
        Nivel4v9 n4v9 = new Nivel4v9();
        Nivel4v10 n4v10 = new Nivel4v10();
        Nivel4v11 n4v11 = new Nivel4v11();
        Nivel4v12 n4v12 = new Nivel4v12();
        Nivel4v13 n4v13 = new Nivel4v13();
        Nivel4v14 n4v14 = new Nivel4v14();
        Nivel4v15 n4v15 = new Nivel4v15();
        Nivel4v16 n4v16 = new Nivel4v16();
        Nivel5 N5 = new Nivel5();
        Nivel5v1 n5v1 = new Nivel5v1();
        Nivel5v2 n5v2 = new Nivel5v2();
        Nivel5v3 n5v3 = new Nivel5v3();
        Nivel5v4 n5v4 = new Nivel5v4();
        Nivel5v5 n5v5 = new Nivel5v5();
        Nivel5v6 n5v6 = new Nivel5v6();
        Nivel5v7 n5v7 = new Nivel5v7();
        Nivel5v8 n5v8 = new Nivel5v8();
        Nivel5v9 n5v9 = new Nivel5v9();
        Nivel5v10 n5v10 = new Nivel5v10();
        Nivel5v11 n5v11 = new Nivel5v11();
        Nivel5v12 n5v12 = new Nivel5v12();
        Nivel5v13 n5v13 = new Nivel5v13();
        Nivel5v14 n5v14 = new Nivel5v14();
        Nivel5v15 n5v15 = new Nivel5v15();
        Nivel5v16 n5v16 = new Nivel5v16();
        
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        
        UnoEjercicioUnoDAO unoEjercicioUnoDAO = new UnoEjercicioUnoDAO();
        UnoEjercicioDosDAO unoEjercicioDosDAO = new UnoEjercicioDosDAO();
        UnoEjercicioTresDAO unoEjercicioTresDAO = new UnoEjercicioTresDAO();
        UnoEjercicioFinalDAO unoEjercicioFinalDAO = new UnoEjercicioFinalDAO();
        UnoCalificacionDAO unoCalificacionDAO = new UnoCalificacionDAO();
        
        DosCalificacionDAO dosCalificacionDAO = new DosCalificacionDAO();
        
        TresEjercicioUnoDAO tresEjercicioUnoDAO = new TresEjercicioUnoDAO();
        TresEjercicioDosDAO tresEjercicioDosDAO = new TresEjercicioDosDAO();
        TresEjercicioTresDAO tresEjercicioTresDAO = new TresEjercicioTresDAO();
        TresEjercicioFinalDAO tresEjercicioFinalDAO = new TresEjercicioFinalDAO();
        TresCalificacionDAO tresCalificacionDAO = new TresCalificacionDAO();
        
        
        
        CuatroEjercicioUnoDAO cuatroEjercicioUnoDAO = new CuatroEjercicioUnoDAO();
        CuatroEjercicioDosDAO cuatroEjercicioDosDAO = new CuatroEjercicioDosDAO();
        CuatroEjercicioTresDAO cuatroEjercicioTresDAO = new CuatroEjercicioTresDAO();
        CuatroEjercicioFinalDAO cuatroEjercicioFinalDAO = new CuatroEjercicioFinalDAO();
        CuatroCalificacionDAO cuatroCalificacionDAO = new CuatroCalificacionDAO();
        
        
        CincoCalificacionDAO cincoCalificacionDAO = new CincoCalificacionDAO();
        
        PromedioDAO promedio = new PromedioDAO();
        
        
        ControladorVideojuego controladorV = new ControladorVideojuego(vistaI, vistaM, N1, N3, N4, N5, vistaR, 
        vistac, vistaAcer, alumnoDAO, n1v1, n1v2, n1v3,n1v4, n1v5, n1v6, n1v7, n1v8, n1v9, n1v10, n1v11, n1v12, n1v13
        , n1v14, n4v1, n4v2, n4v3, n4v4, n4v5, n4v6,n4v7, n4v8, n4v9, n4v10, n4v11, n4v12, n4v13, n4v14 ,n4v15, n4v16,
        unoEjercicioUnoDAO, unoEjercicioDosDAO, unoEjercicioTresDAO, unoEjercicioFinalDAO, unoCalificacionDAO,
        n2v1,n2v2,n2v3,n2v4,n2v5,n2v6,n2v7,n2v8,n2v9,n2v10,n2v11,n2v12, cuatroEjercicioUnoDAO, cuatroEjercicioDosDAO,
        cuatroEjercicioTresDAO, cuatroEjercicioFinalDAO, cuatroCalificacionDAO, dosCalificacionDAO,n3v1,n3v2,
        n3v3,n3v4,n3v5,n3v6,n3v7,n3v8,n3v9,n3v10,n3v11,n3v12,n3v13,n3v14,n3v15, n5v1, n5v2, n5v3, n5v4, n5v5, n5v6, n5v7,
        n5v8, n5v9, n5v10, n5v11, n5v12, n5v13, n5v14, n5v15, n5v16, tresEjercicioUnoDAO, tresEjercicioDosDAO,
        tresEjercicioTresDAO, tresEjercicioFinalDAO, tresCalificacionDAO, cincoCalificacionDAO, promedio);
        vistaI.setVisible(true);
        vistaI.setLocationRelativeTo(null);
        vistaI.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
