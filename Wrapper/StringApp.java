  import java.util.*;
    class StringOperation{
         Scanner sc=new Scanner(System.in);
      private String str;
     public void SetString(String str)
      {
         this.str=str;
      }
     public void ReversString()
     {
        String  words[]=str.split(" ");
        StringBuffer sb=new StringBuffer();
        for(String word:words)
        {
           String s="";
          for(int i=(word.length()-1);i>=0;i--)
          {
              s=s+word.charAt(i);
          }          
            s=s+" ";
            sb.append(s);            
          }                  
         System.out.println(""+sb);          
        }                 
         
     public void InsertCharacter()
     {
          StringBuffer sb=new StringBuffer(str);
          System.out.println("Enter character:");
            char ch=sc.next().charAt(0);
           System.out.println("Enter index you want to insert character:");
            int index=sc.nextInt();
           sb.insert(index,ch);
           System.out.println(sb);
     }         
     public void  AppendString()
      {
        StringBuffer sb=new StringBuffer(str);
        System.out.println("Enter string for appends");
          String ch=sc.nextLine();
         sb.append(ch);
         System.out.println(sb);           
      }
    public void  DeletString()
    {
       StringBuffer sb=new StringBuffer(str);
       System.out.println("Enter starting and ending index: for deleting string:");
        int start=sc.nextInt();
        int end=sc.nextInt();
       sb.delete(start,end);
       System.out.println(sb);
    }    
   public void ReplaceSubstring()
   { 
    
      StringBuffer sb=new StringBuffer(str);
       System.out.println("Enter string for replace:");
       String str=sc.nextLine(); 
       System.out.println("Enter start and end index");
       int start=sc.nextInt();
       int end=sc.nextInt();
          sb.replace(start,end,str); 
       // sh+=s;
       System.out.println(sb.toString()); 
   }
   
    public void CapacityStringBuffer()
    {
         StringBuffer sb=new StringBuffer(str);
          int s=sb.capacity();
         System.out.println(s);
          
    }
    public void DemostreatChaining()
    {
        String s=str;
      StringBuffer sb=new StringBuffer(s);
        sb.reverse();
       boolean p= s.equals(sb.toString());
        if(p)
        {
            System.out.println("Palindrom");
        }
        else{
             System.out.println("not Palindrom");
        }
                    
       
    }
      
 }   
 public  class StringApp{
     public static void main(String arg[])
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String:");
       String str=sc.nextLine();
         
       StringOperation sp=new StringOperation();
       int ch=0;
        do
        {
           System.out.println("1:Reversing a string:");
           System.out.println("2:Inserting Characters:");
           System.out.println("3:Appending String ");
           System.out.println("4:Deleting String");
           System.out.println("5:Replace a Substring");
           System.out.println("6:check capacity,Ensure Capacity from StringBuffer class ");
           System.out.println("7:Demostreat Chaining Methods by using StringBuffer ");           
           System.out.println("Enter your choice");
           ch=sc.nextInt();
           switch(ch)
           {
             case 1:
              sp.SetString(str);
             sp.ReversString();
             break;
              
             case 2:
             sp.SetString(str); 
             sp.InsertCharacter();
              break;
              
             case 3:
              sp.SetString(str);
              sp.AppendString();
               
             break;
             case 4:
             sp.SetString(str);
             sp.DeletString();
             break;
             
             case 5:
              sp.SetString(str);
              sp.ReplaceSubstring();
              break;
              
              case 6:
               sp.SetString(str);
               sp.CapacityStringBuffer();
              break;              
                
                case 7:
              sp.SetString(str);
              sp.DemostreatChaining();              
                          
             default:
             System.out.println("Invalid choice:");
             break;            
           }
        }while(ch!=0);        
}
 
} 