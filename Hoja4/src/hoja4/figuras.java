
package hoja4;
import java.math.*;


public class figuras {
        public double pi = Math.PI;
 
    
    
    public figuras(){
    
    }
       public double volumenes (String figura, double radio, double high, double largo, double ancho){
           double resultado = 0.0;
           switch(figura){
               case "Esfera":
                   resultado = (4/3)*pi*Math.pow(radio,3);
                   return resultado;
                 case "Paralelepipedo":
                   resultado = high*largo*ancho;
                   return resultado;
                 case "Cono":
                   resultado = 0.333*(areacirculo(radio)*largo);
                   return resultado;   
                  case "Cilindro":
                   resultado = areacirculo(radio)*high;
                   return resultado; 
               default:
                   System.out.println("Escogiste una figura incorrecta");
                   return 0.0;
                   
           }

       }
       
       public double areas (String figura, double radio, double high, double largo, double ancho){
           double resultado = 0.0;
         switch(figura){
             
          case "Esfera":
                   resultado = 4 * Math.pow(4, 2);
                   return resultado;
                 case "Paralelepipedo":
                   resultado = 2*(largo+ancho)*high+2*largo*ancho;
                   return resultado;
                 case "Cono":
                   resultado = Math.PI*radio*(radio+high);
                   return resultado;   
                  case "Cilindro":
                   resultado = 2*Math.PI*radio*(radio+high);
                   return resultado; 
               default:
                   System.out.println("Escogiste una figura incorrecta");
                   return 0.0;
       
                 
                 }
       
       }
        public double perimetros (String figura, double radio, double high, double largo, double ancho){
            double resultado = 0.0;
         switch(figura){
          case "Esfera":
                   resultado = 2 * Math.PI*radio;
                   return resultado;
                 case "Paralelepipedo":
                   resultado = high*ancho;
                   return resultado;
                 case "Cono":
                   resultado = 2*largo + 2*radio ;
                   return resultado;   
                  case "Cilindro":
                   resultado = 4*radio+2*high;
                   return resultado; 
               default:
                   System.out.println("Escogiste una figura incorrecta");
                   return 0.0;
       
                 
                 }
       
       }
       

   public double areacirculo(double radio){
       double resultado = 0.0;
       resultado = pi*Math.pow(radio, 2);
        return resultado;
   
   }

    double volumenes(int opci, double radio) {
        double resultado = 0.0;
       resultado = pi*Math.pow(radio,2);
        return resultado;
       
    }
}

