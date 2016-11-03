/**
 * 
 */
/**
 * 来看AtomicInteger提供的接口。
 // 获取当前的值
 
 public final int get()
 
 //取当前的值，并设置新的值
 
  public final int getAndSet(int newValue)
 
 //获取当前的值，并自增
 
  public final int getAndIncrement() 
 
 //获取当前的值，并自减
 
 public final int getAndDecrement()
 
 //获取当前的值，并加上预期的值
 
 public final int getAndAdd(int delta)
 * 
 * @author evawood
 *
 */
package basic.lea;

public class SampleAA{      
    public int v1 = 1;      
    public SampleAA(){      
        System.out.println("Sample is load by :" + this.getClass().getClassLoader());      
    }   
    public void run(){
    	System.out.println("Sample is load by :");
    }
}
