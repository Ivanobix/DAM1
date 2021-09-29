public class Comida
{
    private String nombreComida = "";
    private int caloriasComida = 0;
    
    public Comida(String nombre, int calorias) {
        nombreComida = nombre;
        caloriasComida = calorias;
    }
    
    public int getCalorias() {
        return caloriasComida;
    }
    
    public String getNombreComida() {
        return nombreComida;
    }
}