public class usuarios {

    private String nombre;
    private String apellido;
    private int numeroCuenta;
    private int clave;
    private double monto;

    //Acciones que hace cada usuario
    public void retiraDinero(){
        System.out.println("Va a retirar su dinero");
    }

    //Constructores


    public usuarios(String nombre, String apellido, int numeroCuenta, int clave, double monto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.monto = monto;
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
