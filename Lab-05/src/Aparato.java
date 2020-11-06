
public abstract class Aparato implements Interruptor{
	
	private static int contadorAparatos = 0;
	public String nombre;
	public String marca;
	public Boolean estado;
	private int id;
	
	
	public Aparato(String nombre, String marca) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.estado = false;
		this.id = ++contadorAparatos;
	}


	@Override
	public String toString() {
		String texto = id +  ". " + nombre + " " + marca;
		if (estado) {
			texto += " [ On ] ";
		}
		else {
			texto += " [ Off ] ";
		}
		return texto;
	}
	
	
	public void encender () {
		this.estado = true; 
	}
	
	public void apagar () {
		this.estado = false;
	}
	
	
	
	
}
