
package entidadFinanciera;
/**
* @author Gabriel
*/

public class CCuenta {

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a colocar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta la cuenta a colocar 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a colocar o retirar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipoInterés 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el tipoInterés a colocar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Atributos 
     * @param nom nombre de la persona titular de la cuenta
     * @param cuenta numero de cuenta
     * @param saldo saldo de la cuenta
     * @param tipoInterés tipo de interes en la cuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor por defecto 
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con todos los atributos
     * 
     * @param nom nombre de la persona titular de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes en la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
    *@return el estado de la cuenta
    */
    
    public double estado(){
        return this.getSaldo();
    }
    /**
    * @param cantidad cantidad va ingresar
    * @throws Exception en caso de que la cantidad sea negativa  
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA );
        setSaldo(getSaldo() + cantidad);
    }
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    
    /**
    * @param cantidad cantidad va retirar
    * @throws Exception en caso de que la cantidad sea negativa   
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


    
   