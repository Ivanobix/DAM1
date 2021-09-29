class Actividad0621 {  
    public boolean esPalindromo(String palabra) {
        String comprobarPalindromo;
        comprobarPalindromo = palabra;
        boolean test = false;
        if (comprobarPalindromo.length() == 4 && comprobarPalindromo.charAt(0) == comprobarPalindromo.charAt(3)
        && comprobarPalindromo.charAt (1) == comprobarPalindromo.charAt(2)){
            test = true;
        }
        return test;
    }   
}   