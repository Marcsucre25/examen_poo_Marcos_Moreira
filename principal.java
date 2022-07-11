import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class principal {
    public static ArrayList<usuarios> usuario=new ArrayList<>();
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        String nombre="";
        String apellido="";
        int numeroCuenta=0;
        int clave=0;
        double monto=0.0;
        int edad=0;

        personas a[]= new personas[3];

        //Pedimos datos por teclado
        for(int i=0; i<a.length; i++){

            System.out.println("Su nombre: ");
            nombre=leer.nextLine();
            leer.nextLine();
            System.out.println("Su apellido: ");
            apellido=leer.nextLine();
            System.out.println("Su numero de cuenta: ");
            numeroCuenta=leer.nextInt();
            System.out.println("Su clave: ");
            clave=leer.nextInt();
            System.out.println("Su monto actual en su cuenta: ");
            monto=leer.nextDouble();
            System.out.println("Su edad: ");
            clave=leer.nextInt();

            a[i]=new personas(nombre, apellido, numeroCuenta,clave, monto, edad);

        }


        //Guardar los datos de los usuarios en un archivo.txt
        //Textos del archivo
        String texto1 = "Nombre: ";
        String texto2 = "Apellido: ";
        String texto3 = "Numero de cuenta: ";
        String texto4 = "Clave:  ";
        String texto5 = "Monto a retirar/depositar:  ";
        String texto6 = "Edad: ";
        String texto7= "REGISTROS DE USUARIOS";

        //Creacion del archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ESFOT-22-A\\Desktop\\ExamenPoo_Moreira.txt"))) {
            for (int i = 0; i < a.length; i++) {
                bw.write(texto7);
                bw.newLine();
                bw.write(texto1);
                bw.write(a[i].getNombre());
                bw.newLine();
                bw.write(texto2);
                bw.write(a[i].getApellido());
                bw.newLine();
                bw.write(texto3);
                bw.write((int) a[i].getNumeroCuenta());
                bw.newLine();
                bw.write(texto4);
                bw.write(a[i].getClave());
                bw.newLine();
                bw.write(texto5);
                bw.write(String.valueOf((double) a[i].getMonto()));
                bw.newLine();
                bw.write(texto6);
                bw.write((int) a[i].getEdad());
                bw.newLine();
                bw.newLine();

            }
            System.out.println("Escritura correcta");
        } catch (IOException e) {
            System.out.println("Error");
        }



        //FUNCIONES QUE PERMITAN DEPOSITAR/RETIRAR DINERO
        int clave2, clave3, op;
        double monto1, retiro, deposito;

        System.out.println("\nBienvenido\n1) Retiro\n2) Deposito\n----> Opcion: ");
        op=leer.nextInt();

        if(op == 1) {

            System.out.println("Ingrese clave: ");
            clave2= leer.nextInt();
            System.out.println("Monto a retirar: ");
            retiro= leer.nextDouble();

            System.out.println("Su transacción fue realizada con éxito");
        }

        else{

            System.out.println("Ingrese clave: ");
            clave3= leer.nextInt();
            System.out.println("Monto a depositar: ");
            deposito= leer.nextDouble();

            System.out.println("Su transacción fue realizada con éxito");

        }
    }


}






