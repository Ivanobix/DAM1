public class Personaje
{
	private int vida;  //5 maxima vida, 0 muerto
	private int edad;
    	private TipoPersonaje clase;  //Guerrero, Curandero o Mago

    	public Personaje(int vida , int edad , TipoPersonaje clase) {
		this.vida = vida;
		this.edad = edad;
		this.clase = clase;
    	}

    	public int getVida() {
		return vida;
    	}

    	public int getEdad() {
    		return edad;

    	}

	public String getClase() {
		return clase.toString();
	}
		
	public String toString() {
		return "Vida: " + getVida() + ", edad: " + getEdad() + ", clase: " + clase;
	}
}    
