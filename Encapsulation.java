public class Encapsulation {  
public static void main(String[] args) {   
    Account a = new Account();  
    a.setAccNo(367458);  
    a.setName("Arnab");  
    a.setEmail("ah@gmail.com");  
    a.setAmount(100000);  

    System.out.println(a.getAccNo()+" "+a.getName()+" "+a.getEmail()+" "+a.getAmount());  
    

    }  
}