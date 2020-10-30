public class Principal {
	public static void main(String[] args) {
		String nombre, descripcion, hashtags;
		Float latitud, longitud;
		Double costoporhora;
		Servicio servicio1;
		Servicio servicio2;
		Servicio servicio3;
		
		nombre = "Limpieza de Alfombras";
		descripcion = "Nos trasladamos hasta su hogar\n" + 
				"para realizar una limpieza\n" + 
				"profunda de sus alfombras,\n" + 
				"nuestros productos le aseguran\n" + 
				"desinfección total del 99% de\n" + 
				"virus y bacterias. (única empresa\n" + 
				"con garantía anti covid19).";
		hashtags = "#limpieza #muebles #casa #covid19";
		costoporhora = (double) 15000;
		latitud = (float) 10.068230;
		longitud = (float) -84.312330;
		
		servicio1 = new Servicio (nombre, costoporhora, descripcion, hashtags, latitud, longitud);

		nombre = "Jardinería";
		descripcion = "Ofrecemos servicios de jardinería\n" + 
				"en la provincia de Alajuela.\n" + 
				"Contamos con todo el equipo\n" + 
				"necesario, cuidamos de sus\n" + 
				"plantas y les damos lo que necesiten";
		hashtags = "#plantas #jardinería #casa";
		costoporhora = (double) 8000;
		latitud = (float) 16.974260;
		longitud = (float) -96.726830;
		
		servicio2 = new Servicio (nombre, costoporhora, descripcion, hashtags, latitud, longitud);
		
		nombre = "Pintura de casas";
		descripcion = "Ofrecemos servicio de pintura a domicilio dentro del GAM\n"+ 
				"Contamos con todo el equipo necesario, pintamos\n" + 
				"con la pintura de mas alta calidad y proveemos un servicio\n" + 
				"de garantia especial en caso de que la pintura tenga algun defecto en la mezcla!";
		hashtags = "#pintura #arte #casa #pintor #inspiracion";
		costoporhora = (double) 10000;
		latitud = (float) 12.656554;
		longitud = (float) -85.548881;
		
		servicio3 = new Servicio (nombre, costoporhora, descripcion, hashtags, latitud, longitud);
		System.out.println(servicio1.toString());
		System.out.println(servicio2.toString());
		System.out.println(servicio3.toString());
		
	}
	
}
