
import java.util.Scanner;

public class metodos {

    public obj[] llenar(obj[] a, Scanner sc){
        for(int i=0; i<a.length; i++){
            int n = i+1;
                System.out.println("\ndatos de la venta #" + n);
            
                System.out.println("\ningrese nombre vendedor: ");
                String name = sc.next();
                System.out.println("ingrese codigo del vendero: ");
                int cod = sc.nextInt();
                System.out.println("ingrese fecha: ");
                String fecha = sc.next();
                System.out.println("ingrese Valor de la venta: ");
                double valor = sc.nextDouble();

                

                

                obj o = new obj(name, cod, fecha, valor);

                

                a[i] = o;

                

                
                

            
        }
        
        return a;
    

    }

    public void mostrarVentas(obj[] a) {
        for (int i = 0; i < a.length; i++) {
                System.out.println("Nombre: " + a[i].getName());
                System.out.println("codigo: " + a[i].getCod_vendedor());
                System.out.println("fecha: " + a[i].getFecha());
                System.out.println("valor: " + a[i].getValor());
                
            
        }
    }

    public void suma(obj a){
        
    }

    

    public void mejor(obj[] a){
        double alto=0;
        for (int i = 0; i < a.length; i++){
            if (a[i].getValor() > alto) {
                System.out.println("el mejor vendedor es: \n");
                System.out.println("Nombre: " + a[i].getName());
                System.out.println("codigo: " + a[i].getCod_vendedor());
                System.out.println("valor: " + a[i].getValor());
                
                
                
            }
        }
    }


    
}
