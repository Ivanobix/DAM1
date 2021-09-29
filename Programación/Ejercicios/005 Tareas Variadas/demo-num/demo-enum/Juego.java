import java.util.ArrayList;

public class Juego
{
	private ArrayList<Personaje> personajes;

	public Juego (){
		personajes = new ArrayList <Personaje>();
		Personaje personaje1 = new Personaje(5, 20, TipoPersonaje.GUERRERO);
		Personaje personaje2 = new Personaje(3, 30, TipoPersonaje.CURANDERO);
		personajes.add(personaje1);
		personajes.add(personaje2);
	}
	
	public void mostrarPersonajes() {
		String cadenaADevovler = "";	
		for(Personaje personajeActual : personajes){
			cadenaADevovler += personajeActual + "\n";
		}
		System.out.println(cadenaADevovler);
	}
}

