class StringRevers{
  public static void main(String arg[])
  {
    String str="Good morning  india";
     char ch[];
     ch=str.toCharArray();
     for(int i=0;i<ch.length;i++)
     {
        int j=i;
       while(j<ch.length && j!=' ')
       {
        j++;
     }
     for(int k=j-1;k>i;k--)
        {
            System.out.print("%c"+CharAt(k));
        }
        i=j;
        System.out.printf("\t");
       }
     System.out.println(ch);
  }
}