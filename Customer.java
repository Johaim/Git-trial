import java.util.*;
class User{
    protected int id;
    protected String Firstname;
    protected String Lastname;
    protected int password;
    public User(int id, String F , String L){
        this.id= id;
        this.Firstname = F;
        this.Lastname = L;
    }
    public User(){

    }

}
public class Customer extends User {
   
    public Customer(){

    }
    public Customer(int id,String F,String L){
           super(id,F,L);
    }
           public String getFirstname(){

            return Firstname;
        }
        public String getLastname(){
    
            return Lastname;
        }
        public void Register(){
            try{
                String name,lastname;
                Passwordvalidator vali = new Passwordvalidator();//to check if password is possible
                Namevalidator nameVali = new Namevalidator();
            System.out.println(" Creating An account enter your first name");
            Scanner scan = new Scanner(System.in);
             name = scan.nextLine();
             nameVali.nameValidator(name);
            this.Firstname = name;
            System.out.println("Enter your last name");
             lastname = scan.nextLine();
             nameVali.nameValidator(lastname);
            this.Lastname = lastname;
            System.out.println("Enter your password 4 digit");
            int ps = scan.nextInt();
            vali.psvalidator(ps);
            
            this.password = ps;
            scan.close();
            }catch (PasswordTooSmall e){
                 System.out.println( "Password is too small"+ e.getMessage());
                 
            }catch(PasswordTooBig e){
                  System.out.println("Password is too big" + e.getMessage());
            }catch(InputMismatchException e){
                 System.out.println("Wrong input");
            }catch(ValidNameException e){
                  System.out.println("Wrong name input");
                 
            }
    
            
        }
        public static void main(String[] args) {
    
                ArrayList<Customer> customers = new ArrayList<>();
                Customer c1 = new Customer();
               Customer c2 = new Customer();
                c1.Register();
    
                customers.add(c1);
                //c2.Register();
                System.out.println("Displaying customers name");
                for(Customer each:customers){
                        System.out.println(each.getFirstname());
                }
            
    
                    
           
        }
        
    }
    
    
