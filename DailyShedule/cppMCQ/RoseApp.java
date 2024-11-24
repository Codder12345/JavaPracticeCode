class Rose{  
public void sam() {  
int y[] = {4, 2, 8};  
for (int x=2; x<1+3*2-4; x++){  
System.out.print(x+"\t");  
for (int j:y) {  
j=j*x-4;  
System.out.print(j+"\t");  
}  
}  
}
}
  public class RoseApp{
     public static void main(String[] args) {  
  Rose r = new Rose();  
   r.sam();  
 }  
} 