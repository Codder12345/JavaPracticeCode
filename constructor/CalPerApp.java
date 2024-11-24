  class Per{
   protected int a[];
    protected int sum=0;
    void calPer(int a[])
    {
         this.a=a;
        
         for(int i=0;i<a.length;i++)
         {
              sum=sum+a[i];
         }
    }
    
  }
  
  class CSE extends Per{
        int id;
        String name;
        String Add;
        CSE(int id,String name,String Add)
        {
             this.id=id;
             this.name=name;
             this.Add=Add;
        }
        
        void showCSEPer()
        {
          int per=sum/a.length; 
          System.out.println(id+"\t"+name+"\t"+Add+"\t"+per);
        }
  }
  class  ETC extends Per{
        int id;
        String name;
        String Add;
        int newsub;
        ETC(int id,String name,String Add,int newSubj)
        {
             this.id=id;
             this.name=name;
             this.Add=Add;
             this.newSubj=newSubj;
        }
        
        void showETCPer()
        {
           
          int per=sum+newSubj/a.length+1; 
          System.out.println(id+"\t"+name+"\t"+Add+"\t"+per);
        }
  }
  
  
 public class ResultApp{
    public  static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter array size");
          int size=sc.nextInt();
          int a[]=new int[size];
        System.out.println("Enter array element:");
          for(int i=0;i<a.length;i++)
          {
               a[i]=sc.nextInt();
               
          }
          int id=sc.nextInt();
          String name=sc.next();
          String Add=sc.next();
          
          
          CSE c1=new CSE(id,name,Add);
          c1.calPer(a);
          c1.showCSEPer();
          System.out.println("Enter new subject");
           int newSubj=sc.nextInt();
          ETC e1=new ETC(id,name,Add,newSubj);
          e1.calPer(a);
          e1.showETCPer();
          
          
          
        
    }
  }