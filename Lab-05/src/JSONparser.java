import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class JSONparser {

	private File file;
	private ObjectMapper mapper;
	private JsonNode nodo;
	
	public JSONparser () {
		file = new File("resources/data.json");
		mapper = new ObjectMapper();
		
		try {
			nodo = mapper.readTree(file);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Controlador cargarAparatos() {
		
		Controlador controlador = new Controlador();
		
		ArrayNode aparatos = (ArrayNode) nodo.get("aparatos");
		if (aparatos != null) {
			for (int i=0; i<aparatos.size(); i++) {
				JsonNode aparato = aparatos.get(i);
				String nombre = aparato.get("nombre").asText();
				String marca = aparato.get("marca").asText();
				String tipo = aparato.get("tipo").asText();
				
				switch(tipo) {
				case "termoregulable":
					int minima = aparato.get("temperaturaMinima").asInt();
					int maxima = aparato.get("temperaturaMaxima").asInt();
					AparatoTermoRegulable atr = new AparatoTermoRegulable (nombre, marca, minima, maxima);
					controlador.add(atr);
					break;
				case "modalidades":
					ArrayNode modalidadesJSON = (ArrayNode) aparato.get("modalidades");
					if (modalidadesJSON != null) {
						String[] modalidades = new String[modalidadesJSON.size()];
						for(int j = 0; j<modalidadesJSON.size(); j++) {
							modalidades[j]=modalidadesJSON.get(j).asText();
						}
						AparatoConModalidad acm = new AparatoConModalidad(nombre, marca, modalidades);
						controlador.add(acm);
					}
					break;
				case "senales":
					ArrayNode senalesJSON = (ArrayNode) aparato.get("senales");
					if (senalesJSON != null) {
						float[]senales = new float[senalesJSON.size()];
						for (int j = 0; j<senalesJSON.size();j++) {
							senales[j]=senalesJSON.get(j).asLong();
						}
						AparatoConSenal acs = new AparatoConSenal(nombre, marca, senales);
						controlador.add(acs);
					}
				}
				
			}
		}
		
		return controlador;
	}
}
