/**
 * 
 */
/**
 * ����AtomicInteger�ṩ�Ľӿڡ�
 // ��ȡ��ǰ��ֵ
 
 public final int get()
 
 //ȡ��ǰ��ֵ���������µ�ֵ
 
  public final int getAndSet(int newValue)
 
 //��ȡ��ǰ��ֵ��������
 
  public final int getAndIncrement() 
 
 //��ȡ��ǰ��ֵ�����Լ�
 
 public final int getAndDecrement()
 
 //��ȡ��ǰ��ֵ��������Ԥ�ڵ�ֵ
 
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
