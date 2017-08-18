package ejercicio21;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Logic {

	public String convertirMD5(String password) throws NoSuchAlgorithmException {

		String hash=password;
		byte[] defaultBytes = password.getBytes();	        	
		MessageDigest algorithm = MessageDigest.getInstance("MD5");
		algorithm.reset();
		algorithm.update(defaultBytes);
		byte messageDigest[] = algorithm.digest();	        		            
		StringBuffer hexString = new StringBuffer();
		for (int i=0;i<messageDigest.length;i++) {
			int val = 0xff &  messageDigest[i];
			if (val < 16)
				hexString.append("0");
			hexString.append(Integer.toHexString(val));

			//hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
		}	        			        			
		hash=hexString+"";

		return hash;

	}
	
}