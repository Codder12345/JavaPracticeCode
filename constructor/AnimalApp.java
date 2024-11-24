import java.util.*;
  abstract class Animal{
     abstract void makeSound();
  }
  class Cat extends Animal{
       void makeSound()
       {
          System.out.println("mau mau");
       }
  }
   class dog extends Animal{
       void makeSound()
       {
          System.out.println("bark bark");
       }
  }
  public class AnimalApp{
    public static void main(String arg[])
    {
       dog d=new dog();
       d.makeSound();
       Cat c=new Cat();
       c.makeSound();
    }
    
  }