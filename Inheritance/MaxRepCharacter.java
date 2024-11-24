public class MaxRepCharacter{

    public static void main(String args[])
    {
            String str="good morning";
            char ch[]=str.toCharArray();
            int maxCount=0;
            char c=' ';
            for(int i=0;i<ch.length;i++)
             {
                int count=1;
                for(int j=i+1;j<ch.length-1;j++)
                 {
                        if(ch[i]==ch[j])
                        {
                            count++;
                        }
                 }
                 if(maxCount<count){
                    maxCount=count;
                    c=ch[i];
                 }
            }
            System.out.println("Maximum Repetative Character:"+c+"----------->"+maxCount);
    
    }
}