class ShowVoter
{
    Ward w[];
    void setWard(Ward ...w1)
    {
      w=w1;
    }
    void showDetails()
    {   int TV=0,TVI=0,T=0;
       for(int i=0;i<w.length;i++)
       {   TV=0;
           TVI=0;
          System.out.println("__________________________________________");
          System.out.println("Ward Details:");
          System.out.println("__________________________________________");
          System.out.println("Id:"+w[i].getId()+"\tName:"+w[i].getName());
          System.out.println("__________________________________________");
          Voter v1[]=w[i].getVoter();
          System.out.println("Voter Details:");
          System.out.println("__________________________________________");
          System.out.println("Id\tName\tAge");
          System.out.println("__________________________________________");
          for(int j=0;j<v1.length;j++)
          {
            System.out.println(v1[j].getId()+"\t"+v1[j].getName()+"\t"+v1[j].getAge());
            T++;
            if(v1[j].getAge()>18)
            {
                  TV++;
            }
            else
                 TVI++;
          }
        
          System.out.println("__________________________________________");
          System.out.println("Total valid:"+TV);
          System.out.println("__________________________________________");
          System.out.println("Total Invalid:"+TVI);
          System.out.println("__________________________________________");
       }
       System.out.println("Total:"+T);
       System.out.println("__________________________________________");
    }
}