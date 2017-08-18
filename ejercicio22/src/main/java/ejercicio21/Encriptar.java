package ejercicio21;

import java.security.NoSuchAlgorithmException;

import javax.jws.WebService;

@WebService(endpointInterface="ejercicio21.IEncriptar")
public class Encriptar implements IEncriptar {

	@Override
	public String encriptar(String palabra) {
		// TODO Auto-generated method stub
		String retorno = "";
		try {
			retorno = new MD5Logic().convertirMD5(palabra);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retorno = e.toString();
		}
		return retorno;
	}

}
