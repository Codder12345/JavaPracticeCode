import java.util.*;

  class Encrypt{
       String str;
       char ch[];
        Encrypt(String s)
        {
          str=s;
        }          
          void beforEncrypt()
           {
            System.out.println(str);
           }
           
           void afterEncrypt()
           {
               int count=0;
               ch=str.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                count=1;
             for(int j=i+1;j<ch.length;j++)
              {
                
                if(ch[i]==ch[j])
                {
                 count++;
                 ch[j]='0';
                }
            }
            if(ch[i]!='0')
             System.out.println(ch[i]+"=====>"+count);
            }
          }
  }
  class EncryptApp{
   public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String for Users:");
        String str=sc.nextLine();
         Encrypt e=new Encrypt(str);
         e.beforEncrypt();
         e.afterEncrypt();
 
   }
  }