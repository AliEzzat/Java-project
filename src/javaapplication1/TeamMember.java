
package project;
import java.util.Scanner;
public class TeamMember { 
    public TeamMember() {
        int ID,phone;
      String name,address,Email;
      Scanner id =new Scanner (System.in);
      ID=id.nextInt();
      Scanner Phone =new Scanner (System.in);
      phone=Phone.nextInt();
      Scanner NAME =new Scanner (System.in);
      name=NAME.nextLine();
      Scanner ADDRESS =new Scanner (System.in);
      address=ADDRESS.nextLine();
      Scanner EMAIL =new Scanner (System.in);
      Email=EMAIL.nextLine();
    }
}
