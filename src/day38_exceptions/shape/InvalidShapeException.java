
package day38_exceptions.shape;

import java.lang.String;
public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }
}
