public class personas extends usuarios {

    private int edad;

    //Constructor
    public personas(String nombre, String apellido, int numeroCuenta, int clave, double monto, int edad){
        super(nombre, apellido, numeroCuenta, clave, monto);
        this.edad=edad;
    }

    //Setter y getter

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
