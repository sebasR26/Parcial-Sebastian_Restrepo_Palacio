import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos o = new metodos();
        System.out.println("cuantas ventas se realizo");
        int n= sc.nextInt();
        obj[] item = new obj[n];
        boolean con = true;

        while(con){
            System.out.println("\nque quiere?");
            System.out.println("1- ingresar venta");
            System.out.println("2- Ver mejor vendedor");
            System.out.println("3- Ver todas la ventas");
            System.out.println("4- salir");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    o.llenar(item, sc);
                    break;
                case 2:
                    o.mejor(item);
                    
                    break;
                case 3:
                    System.out.println("bye");
                    con = false;
                    
                    break;      
                case 4:
                    o.mostrarVentas(item);
                    con = false;
                    
                    break;           
            
                default:
                    System.out.println("fastidioso");
                    break;
            }

            
        }
    }
    
}
