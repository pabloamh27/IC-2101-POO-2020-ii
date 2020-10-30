
public class Servicio {
	public String nombre;
	public Double costoporhora;
	public String descripcion;
	public String hashtags;
	public Float latitud;
	public Float longitud;
	public Servicio (String nombre, Double costoporhora, String descripcion, String hashtags, Float latitud, Float longitud) {
		this.nombre = nombre;
		this.costoporhora = costoporhora;
		this.descripcion = descripcion;
		this.hashtags = hashtags;
		this.latitud = latitud;
		this.longitud = longitud;	
	}

	  public String getNombre(){
		    return nombre;
	  }
	  
	  public void setNombre(String nombre){
		    this.nombre = nombre;
	  }
	  
	  public Double getCostoporhora(){
		    return costoporhora;
	  }
	  
	  public void setCostoporhora(Double costoporhora){
		 	this.costoporhora = costoporhora;
	  }
	  
	  public String getDescripcion(){
		    return descripcion;
	  }
	  
	  public void setDescripcion(String descripcion){
		  	this.descripcion = descripcion;
	  }
	  
	  public String getHashtags(){
		  	return hashtags;
	  }
	  
	  public void setHashtags(String hashtags){
		  	this.hashtags = hashtags;
	  }
	  
	  public Float getLatitud(){
		    return latitud;
	  }
	  
	  public void setLatitud(Float latitud){
		  	this.latitud = latitud;
	  }
	  
	  public Float getLongitud(){
		    return longitud;
	  }
	  
	  public void setLongitud(Float longitud){
		  	this.longitud = longitud;
	  }
	  
	  @Override
	  public String toString(){
		  return nombre+"\n"+costoporhora+" CRC / hora \n\n"+descripcion+"\n\n"+hashtags+"\n\n"+latitud+", "+longitud+ "\n\n\n\n"; 
	  }
	  
}
