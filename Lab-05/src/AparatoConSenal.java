import java.util.Random;

public class AparatoConSenal extends Aparato{
	
	private float[] senales;
	private float senalActual;
	public AparatoConSenal(String nombre, String marca, float[] senales) {
		super(nombre, marca);
		this.senales = senales;
	}
	
	
	@Override
	public void encender() {
		super.encender();
		Random ran = new Random();
		int aleatorio = ran.nextInt(senales.length);
		this.senalActual = senales[aleatorio];
		System.out.println(super.toString() + " señal actual " + senalActual);
	}
	
	
	@Override
	public void apagar() {
		super.apagar();
		System.out.println(super.toString());
	}
	
	
	
}
