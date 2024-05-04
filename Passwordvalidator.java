
class Passwordvalidator extends Exception{
    public void psvalidator(int ps) throws PasswordTooSmall,PasswordTooBig {
             String temp = ps + "";
             int zeroCounter=0;
             int a;
             for(int i=0;i<4;i++){
                 a = ps%10;
                if(a==0){
                    zeroCounter++;
                }
                ps =ps/10;
             }
        
            if((temp.length()+zeroCounter<4)){
                  throw new PasswordTooSmall();
            }
            if(temp.length()+zeroCounter>4){
                  throw new PasswordTooBig();
            }

    }
    public static void main(String[] args) {
        
    }
    
}

class PasswordTooSmall extends Exception {
        public PasswordTooSmall(){
        super("Password is too small Please Select 4 digit code");
        }
}
class PasswordTooBig extends Exception{
 
        public PasswordTooBig(){
            super("Password is too big Please Select 4 digit code");
        }

}