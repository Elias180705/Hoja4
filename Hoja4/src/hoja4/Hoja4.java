
package hoja4;
import java.util.Scanner;
public class Hoja4 {

   
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);

       figuras  figura = new figuras();
       double radio,altura,genera,ancho,largo;
       String opci1;
       
       do{
           System.out.println("-------------------");
           System.out.println("----Menu------");
           System.out.println("1. Esfera");
           System.out.println("2.Cilindro");
           System.out.println("3.Paralelepipedo");
           System.out.println("4.Cono");
           System.out.println("5. Salir");
           opci1 = sn.nextLine();
           System.out.println("");
           
          switch(opci1){
              case "Esfera":
                  System.out.println("Escogiste la Esfera");
                  System.out.println("Ingrese el radio");
                  radio = sn.nextDouble();
                  System.out.println("El volumen es:"+figura.volumenes(opci1, radio, 0, 0, 0));
                  System.out.println("El area es:"+figura.areas(opci1, radio, 0, 0, 0));
                  System.out.println("El perimetro del area es:"+figura.perimetros(opci1, radio, 0, 0,0));
                  break;
              case "Cilindro":
                  System.out.println("Escogiste el cilindro");
                  System.out.println("Ingrese el radio");
                  radio = sn.nextDouble();
                  System.out.println("Ingrese la altura");
                  altura = sn.nextDouble();
                  System.out.println("El volumen es:"+figura.volumenes(opci1, radio, altura, 0, 0));
                  System.out.println("El area es:"+figura.areas(opci1, radio, altura, 0, 0));
                  System.out.println("El perimetro del area es:"+figura.perimetros(opci1, radio, altura, 0,0));
                  break;
          
              case "Paralelepipedo":
                  System.out.println("Paralelepipedo");
                  System.out.println("Ingrese su altura");
                  altura = sn.nextDouble();
                  System.out.println("Ingrese su largo");
                   largo = sn.nextDouble();
                  System.out.println("Ingrese su ancho");
                  ancho = sn.nextDouble();
                  System.out.println("El volumen es:"+figura.volumenes(opci1, 0, altura, largo,ancho));
                  System.out.println("El area es:"+figura.areas(opci1, 0, altura, largo,ancho));
                  System.out.println("El perimetro del area es:"+figura.perimetros(opci1,0, altura, largo,ancho));
             
                  break;
              case "Cono":
                  System.out.println("Cono");
                    System.out.println("Ingrese el radio");
                    radio = sn.nextDouble();
                    System.out.println("Ingrese la generatriz");
                    genera = sn.nextDouble();
                  System.out.println("El volumen es:"+figura.volumenes(opci1, radio, 0, genera,0));
                  System.out.println("El area es:"+figura.areas(opci1, radio, 0, genera,0));
                  System.out.println("El perimetro del area es:"+figura.perimetros(opci1,radio, 0, genera,0));
                  
                  break;
              case "Salir":
                  System.out.println("Orale");
                  
                  break;
                  
                  
              default:
                  System.out.println("Ingrese una opcion valida");
                  
          
          }
          
           }while(!"Salir".equals(opci1));
           
                   
       }
}

     
  

     
    
    
    

