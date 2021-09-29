public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;
    //El valor del descuento
    private int descuento;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 12;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = "Alicante";
    }
    public MaquinaExpendedoraSimple(int precioDelBillete, String destino) {
        precioBillete = precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = destino;
    }
    
    /**Cambiar precio del billete */
    public void setter(int precioDelBillete) {
        precioBillete = precioDelBillete;
    }
    
    /**Dinero que tiene la máquina */
    public int getter() {
        return totalDineroAcumulado;
    }

    /** Devuelve el precio del billete */
    public int getPrecioBillete() {
        return precioBillete;
    }
    
    /**
     * Aplica un descuento
     */    
    public void ruducirPrecio(int descuento) {
     precioBillete = precioBillete - descuento;   
    }

    public void vaciarDepositoDinero() {
       totalDineroAcumulado = 0 ;
    }
    
    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
        totalDineroAcumulado = cantidadIntroducida + totalDineroAcumulado;
    }

    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}
