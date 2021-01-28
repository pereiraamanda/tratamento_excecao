
package ex1;

public class NaoVerificadaException extends RuntimeException{
    
    public NaoVerificadaException(String message){
        super(message);
    }
    
    public NaoVerificadaException(){
        
    }
}
