public class MaquinaExpendedoraMejorada {

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
    // Tipo normal o premio
    private String tipo;
    // Numero maximo de billetes que puede imprimir una maquina
    private int numMaxBillete;
    // Contador de billetes
    private int cont;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */

    public MaquinaExpendedoraMejorada(int precioDelBillete, String origen, String destino, String tipoBillete, int numeroMaximoDeBilletes) {
        precioBillete = precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = origen;
        estacionDestino = destino;
        tipo = tipoBillete;
        numMaxBillete = numeroMaximoDeBilletes;
        cont = 0;
    }

    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
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
        if (cont < numMaxBillete) {
            if(cantidadIntroducida > 0) {
                balanceClienteActual = balanceClienteActual + cantidadIntroducida;
            }
            else {
                System.out.println(cantidadIntroducida + " no es una cantidad de dinero valida.");
            } 
        }
        else {
            System.out.println("Error: Los billetes se han agotado");
        }
    }

    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        if (cont < numMaxBillete) {
            if(balanceClienteActual >= precioBillete) {        
                // Simula la impresion de un billete
                System.out.println("##################");
                System.out.println("# Billete de tren:");
                System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
                System.out.println("# " + precioBillete + " euros.");
                System.out.println("##################");
                System.out.println();         

                // Actualiza el total de dinero acumulado en la maquina
                totalDineroAcumulado = totalDineroAcumulado + precioBillete;
                // Reduce el balance del cliente actual dejandole seguir utilizando la maquina
                balanceClienteActual = balanceClienteActual - precioBillete;
                //Sumamos 1 al contador de billetes
                cont += 1;
                if (tipo == "Premio") {
                    System.out.println("##################");
                    System.out.println("# Billete de tren  de regalo adicional:");
                    System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
                    System.out.println("# " + precioBillete + " euros.");
                    System.out.println("##################");
                    System.out.println();
                    cont += 1;
                }
            }
            else {
                System.out.println("Necesitas introducir " + (precioBillete - balanceClienteActual) + " euros mas!");
            }
        }
        else {
            System.out.println("Error: Los billetes se han agotado");

        }

    }

    /**
     * Cancela la operacion de compra del cliente actual y le
     * devuelve al cliente el dinero que ha introducido hasta el momento
     */
    public int cancelarOperacionYDevolverDinero()
    {
        int cantidadDeDineroADevolver;
        cantidadDeDineroADevolver = balanceClienteActual;
        balanceClienteActual = 0;
        return cantidadDeDineroADevolver;
    } 

    public int vaciarDineroDeLaMaquina()
    {
        int respuesta;
        if (balanceClienteActual == 0) {
            respuesta = totalDineroAcumulado;
            totalDineroAcumulado = 0;
        }
        else {
            System.out.println("Cierre la operación en curso para realizar el vaciado");
            respuesta = -1;
        }
        return respuesta;
    }
}
