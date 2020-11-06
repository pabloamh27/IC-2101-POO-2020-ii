
public class AparatoConModalidad extends Aparato{

		private String[] modalidades;
		private String modalidadActual;
		public AparatoConModalidad(String nombre, String marca, String[] modalidades) {
			super(nombre, marca);
			this.modalidades = modalidades;
		}
		@Override
		public void encender() {
			super.encender();
			this.modalidadActual = modalidades[0];
			System.out.println(super.toString() + " modalidad " + modalidadActual);
			
		}
		@Override
		public void apagar() {
			super.apagar();
			System.out.println(super.toString());
		}
		
		
		
		
	
}
