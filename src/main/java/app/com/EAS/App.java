package app.com.EAS;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class App 
{
    public static void main( String[] args )
    {
    	try {
            final String claveEncriptacion = "@#!-._muxhe/";            
            String datosOriginales = "que onda con la criptografía xD";            
            
           EncriptadorAES encriptador = new EncriptadorAES();

            String encriptado = encriptador.encriptar(datosOriginales, claveEncriptacion);
            String desencriptado = encriptador.desencriptar(encriptado, claveEncriptacion);
            
            System.out.println("Cadena Original: " + datosOriginales);
            System.out.println("Escriptado     : " + encriptado);
            System.out.println("Desencriptado  : " + desencriptado);            
            
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(EncriptadorAES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
