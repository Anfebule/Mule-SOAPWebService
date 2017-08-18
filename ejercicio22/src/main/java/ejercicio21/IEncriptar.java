package ejercicio21;

import javax.jws.WebService;

@WebService
public interface IEncriptar {
	
	public String encriptar(String palabra);
	
}
