import java.io.Serializable;

public class user implements Serializable{
   String password;
   String name;

   public void sayHello(){
      System.out.println("Hello " + name);
   }


}
