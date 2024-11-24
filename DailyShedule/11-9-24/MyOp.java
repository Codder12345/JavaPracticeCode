

interface CharOperator{

    void setChar(char ch[]); // public abstract void setChar(char ch[]);
    char []getChar(); // public abstract char []getChar();
}

class ConvertToUpper implements CharOperator{
    
       char ch[];
       public void setChar(char ch[])
       {
            this.ch=ch;
       }
       public char []getChar(){
           
           char c[] = new char[ch.length];
            for(int i=0;i<ch.length;i++)
            {
                c[i]=(char)((int)ch[i]-32);    
            }
           return c;
       } 
}
class  ChangeAlterNateChar implements CharOperator{
    
       char ch[];
       public void setChar(char ch[])
       {
            this.ch=ch;
       }
       public char []getChar(){
           
           char c[] = new char[ch.length];
            for(int i=0;i<ch.length;i++)
            {
                if(i%2==0){
                    c[i]=(char)((int)ch[i]-32);
                }else{
                  c[i]=ch[i];
                }
                
            }
           return c;
       } 
}










class MyOp{

        public static void main(String args[])
        {
                char cc[]={'g','o','o','d'};
                CharOperator c1 = new ConvertToUpper();
                c1.setChar(cc);
                char result1[]=c1.getChar();
                for(char c:result1){
                    System.out.print(" "+c);
                }
                
                System.out.println("After Alternativelly Convert:");
                c1 = new ChangeAlterNateChar();
                c1.setChar(cc);
                char result2[]=c1.getChar();
                for(char c:result2){
                    System.out.print(" "+c);
                }
                
        }

}   