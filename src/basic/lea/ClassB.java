package basic.lea;

public class ClassB{  
   public ClassB(){  
      System.out.println("调用了A的无参构造函数");  
   }  
   public ClassB(String mess){  
      System.out.println("调用了A的有参的构造函数\n"+  
         "参数内容为："+mess);  
   }  
}  