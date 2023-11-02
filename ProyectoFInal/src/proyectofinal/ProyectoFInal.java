package proyectofinal;
import Data.BomberosData;
import Data.BrigadaData;
import Data.CuartelData;
import Data.SiniestroData;
import Entidades.Bomberos;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProyectoFInal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //CREAR CUARTELES
//        CuartelData cuartel = new CuartelData();
//        Cuartel c1 = new Cuartel("Santa Rita","Av. Siempre Viva 843",32,123,"+ 1555-123-4567","cuartelsantarita@gmail.com");
//        cuartel.crearCuartel(c1);
        
        

//---------------------------------------------
//CREAR BRIGADAS
        BrigadaData brigada = new BrigadaData();
        Brigada alfa = new Brigada("Alfa","Incendios en viviendas, e industrias",true,2);
        
        brigada.crearBrigada(alfa);


//-----------------------------------------------------
//CREAR BOMBEROS
//
    BomberosData bombero = new BomberosData();
    Bomberos b1 = new Bomberos("12112121","Pedro Picapiedra",LocalDate.of(2000,Month.APRIL,12),"2664121212",3);
    
    bombero.CrearBombero(b1);


//----------------------------------------------------
//CREAR SINIESTRO

    SiniestroData siniestro = new SiniestroData();
    Siniestro s1 = new Siniestro("Incendio de casa",LocalDate.of(2023, Month.MARCH, 11),22,76,"Exploto el horno e incendio toda la casa",LocalDate.of(2023, Month.MARCH, 12), 7,3);
    siniestro.crearSiniestro(s1);

//-------------------------------------------------------------
//Listar Brigadas No libres
     List <Brigada> buscar = brigada.brigadasNOLibres();
     
        if (buscar==null) {
            for (int i = 0; i < buscar.size(); i++) {
                Brigada bri = buscar.get(i);
                 System.out.println(bri);
            }
            
        } else{
            System.out.println("Lista nula");
        }
    }
    
    
}