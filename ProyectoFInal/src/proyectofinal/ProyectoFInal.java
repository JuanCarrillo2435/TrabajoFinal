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
        CuartelData cuartel = new CuartelData();
       Cuartel c1 = new Cuartel("Santa Rita","Av. Siempre Viva 843",32,123,"+ 1555-123-4567","cuartelsantarita@gmail.com");
       Cuartel c2 = new Cuartel("San Patricio","Maipu",10,10,"+ 0800-666-4592","cuartelmaipu@gmail.com");
//        cuartel.crearCuartel(c2);
        
        

//---------------------------------------------
//CREAR BRIGADAS
        BrigadaData brigada = new BrigadaData();
        Brigada alfa = new Brigada("Gama","Incendios en industrias y fábricas",true,3);
//        
//     brigada.crearBrigada(alfa);


//-----------------------------------------------------
//CREAR BOMBEROS
//
    BomberosData bombero = new BomberosData();
    Bomberos b1 = new Bomberos(2,"12112121","Pedro RompePiedras",LocalDate.of(2000,Month.APRIL,12),"2664121333",3, true);
//    Bomberos b2 = new Bomberos(2,"42744243","El chavo del 8",LocalDate.of(2000,Month.AUGUST,28),"2664288564",3, true);
    
 //  bombero.CrearBombero(b2);
//Actualizar bombero
//bombero.actualizarBombero(b1);

//Listar Bomberos


// List<Bomberos> listar = bombero.listarBomberos();
// 
//        if (listar !=null) {
//            for (int i = 0; i < listar.size(); i++) {
//                Bomberos bom = listar.get(i);
//                System.out.println(bom);
//            
//            }
//        }else{
//            System.out.println("Lista nula");
//        }
 
// listar.forEach(bom -> {System.out.println(bom);});
        
    
//----------------------------------------------------
//CREAR SINIESTRO

    SiniestroData siniestro = new SiniestroData();
    Siniestro s1 = new Siniestro("Incendio de planta induestrial",LocalDate.of(2023, Month.MARCH, 11),22,76,"Cortocircuito");
    //Siniestro s1 = new Siniestro(LocalDate.of(2023, Month.AUGUST, 12), 7,3);
    siniestro.crearSiniestro(s1);
    Siniestro s2 = new Siniestro(s1.getCodigo() ,LocalDate.of(2023, Month.AUGUST, 12), 7, 4);
    //PROBANDO ACTUALIZAR SINIESTRO
  //  siniestro.completarSiniestro(s2);
   
   //LISTAR SINIESTROS NO LIBRES
   List<Siniestro> buscarSin = siniestro.listarSiniestrosNOResueltos();
   List<Siniestro> buscarCon = siniestro.listarSiniestrosResueltos();
   
   if (buscarCon!=null) {
            for (int i = 0; i < buscarCon.size(); i++) {
                Siniestro sin = buscarCon.get(i);
                 System.out.println(sin);
            }
            
        } else{
            System.out.println("Lista nula");
        }

//-------------------------------------------------------------
//Listar Brigadas No libres
     List <Brigada> buscar = brigada.brigadasNOLibres();
     List <Brigada> buscar2 = brigada.brigadasLibres();
//        if (buscar==null) {
//            for (int i = 0; i < buscar.size(); i++) {
//                Brigada bri = buscar.get(i);
//                 System.out.println(bri);
//            }
//            
//        } else{
//            System.out.println("Lista nula");
//        }
    //LISTAR BRIGADAS LIBRES
//    if (buscar2!=null) {
//            for (int i = 0; i < buscar2.size(); i++) {
//                Brigada bri = buscar2.get(i);
//                 System.out.println(bri);
//            }
//            
//        } else{
//            System.out.println("Lista nula");
//        }
//    //PROBAR DISTANCIA
//        System.out.println(" La distancia entre el cuartel y el sinietro es : "+cuartel.distancia(c1.getCoord_X(), c1.getCoord_Y(), s1.getCoord_X(), s1.getCoord_Y()));
//    //PROBAR QUÉ CUARTEL ESTÁ MÁS CERCANO
//        
//        System.out.println("El cuartel más cercano es: "+cuartel.cuartelCerca(s1.getCoord_X(), s1.getCoord_Y()));
    //PROBAR CAMBIAR BRIGADA DE CUARTEL
    //brigada.actualizarBrigada(alfa);
    
    }
   
    
    
    
}