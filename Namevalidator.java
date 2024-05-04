import java.util.InputMismatchException;

public class Namevalidator {
     
    public void nameValidator(String a) throws ValidNameException {
        String regex = "^[A-Za-z]*$";
            boolean valid =   a.matches(regex);
            if (!valid){
               throw new ValidNameException();
            }
    }
    

}

class ValidNameException extends Exception{
 
         public ValidNameException (){
             super("Invalid Name Please Enter Again");
         }

}