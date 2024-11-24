    public class LargestGap{
      public static void main(String arg[])
      {
        int a[]=new int[]{23,-2,45,38,12,4,6};
           for(int i=0;i<a.length;i++)
           {
             for(int j=0;j<a.length;j++)
             {
               if(a[i]>a[j])
               {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               }
             }
           }
          
       System.out.println("Show sorted array");
         for(int i=0;i<a.length;i++)
         {
          System.out.print("\t"+a[i]);
         } 
         
         int Ndi=0,di=0;
         System.out.println();
        for(int i=0;i<a.length;i++)
         {
           int p=a[i];
           int p1=a[i+1];
           di=p-p1;
            if(di>Ndi)
               Ndi=di;   
            {
              System.out.println(Ndi);    
             
             }
               
          }
   
           
          
        
      }
    }