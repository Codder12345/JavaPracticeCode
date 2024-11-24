class Ward
{
   int id;
   String name;
   Voter v[];
   void setId(int id)
   {
      this.id=id;
   }
   void setName(String name)
   {
     this.name=name;
   }
   void setVoter(Voter ...v1)
   {
     v=v1;
   }
   int getId()
   {
     return id;
   }
   String getName()
   {
       return name;
   }
   Voter [] getVoter()
   {
      return v;
   }
}
