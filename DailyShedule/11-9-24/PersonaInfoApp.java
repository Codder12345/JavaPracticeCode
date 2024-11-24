import java.util.*;
  class PersonaInfo{
        String name,midname,lastname;
     PersonaInfo(String name,String midname,String lastname)
     {
       this.name=name;
       this.midname=midname;
       this.lastname=lastname;
     }
     
  }
  class ProffessionalInfo extends PersonaInfo{
             int id,sal;
             String des,skillset;
             
             
        ProffessionalInfo(int id,String des,int sal,String skillset)
        {
           super("Ajay","sambhaji","Deshmukh");

           this.id=id;
           this.des=des;
           this.sal=sal;
           this.skillset=skillset;   
        }
        
       void showData() 
        {
            
          System.out.println(name+"\t"+midname+"\t"+lastname+"\t"+id+"\t"+des+"\t"+sal+"\t"+skillset);
                     
        }        
        
      }   
  public class PersonaInfoApp{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter name midname lastname id des salary skillset");
//      String  name=sc.nextLine();
  //    String midname=sc.nextLine();
    //  String lastname=sc.nextLine();
      int id=sc.nextInt();
      String des=sc.nextLine();
      int sal=sc.nextInt();
     String skillset=sc.nextLine();
      
      ProffessionalInfo p=new ProffessionalInfo(id,des,sal,skillset);
       p.showData();
     
     
    
        
    }
  }
  