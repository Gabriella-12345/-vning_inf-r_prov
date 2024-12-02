import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
public class App {
    public static void main(String[] args) throws Exception {
        
        user user = new user();
         
        user.name ="Nils";
        user.password ="Jagälskarläsk";

        user.sayHello();


        try { 
            
            // user user = null;
            FileInputStream fileIn = new FileInputStream("G:\\My Drive\\Backup\\Java projekt\\Programering 2\\övning_inför_prov\\övning_inför_prov\\src\\App.java");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (user) in.readObject();
            in.close();
            fileIn.close(); 
            
    
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(user.name);
            System.out.println(user.password);
            user.sayHello();
        }
       
        


    }
}
