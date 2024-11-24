public class VoterMachine
{
   public static void main(String ...x)
   {
       Voter v1=new Voter();
       v1.setId(1);
       v1.setName("Maya");
       v1.setAge(70);
       
       Voter v2=new Voter();
       v2.setId(2);
       v2.setName("Pooja");
       v2.setAge(14);
       
       Voter v3=new Voter();
       v3.setId(3);
       v3.setName("Teja");
       v3.setAge(90);
       
       Voter v4=new Voter();
       v4.setId(4);
       v4.setName("Pooja");
       v4.setAge(69);
       
       Ward w1=new Ward();
       w1.setId(111);
       w1.setName("A");
       w1.setVoter(v1,v2,v3);
       
       Ward w2=new Ward();
       w2.setId(222);
       w2.setName("B");
       w2.setVoter(v2,v3,v4);
       
       ShowVoter sv=new ShowVoter();
       sv.setWard(w1,w2);
       sv.showDetails();
   } 
       
}