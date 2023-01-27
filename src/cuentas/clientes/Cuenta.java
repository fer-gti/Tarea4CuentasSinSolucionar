package cuentas.clientes;

public class Cuenta {

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return Cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.Cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return Saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return TipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.TipoInteres = tipoInteres;
    }


    private String Nombre;
    private String Cuenta;
    private double Saldo;
    private double TipoInteres;
    private int dni;

    public Cuenta()
    {
        Nombre ="";
        Cuenta="";
        Saldo=0;
        TipoInteres=0;
    }

    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        Nombre =nom;
        Cuenta=cue;
        Saldo=sal;
        TipoInteres=tipo;
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
