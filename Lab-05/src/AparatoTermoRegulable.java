
public class AparatoTermoRegulable extends Aparato{
	
	private int temperaturaMinima;
	private int temperaturaMaxima;
	private int temperaturaActual;
	
	public AparatoTermoRegulable(String nombre, String marca, int temepraturaMinima, int temperaturaMaxima) {
		super(nombre, marca);
		this.temperaturaMinima = temepraturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}

	@Override
	public void encender() {
		super.encender();
		this.temperaturaActual = (temperaturaMinima + temperaturaMaxima)/2;
		System.out.println(super.toString() + " con temperatura de  " + temperaturaActual + " grados.");		
	}

	@Override
	public void apagar() {
		super.apagar();
		System.out.println(super.toString());
	}
}
