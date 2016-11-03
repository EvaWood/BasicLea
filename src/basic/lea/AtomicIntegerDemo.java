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

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo{
	public static void main(String[] arg){
		/*AtomicInteger ai=new AtomicInteger(0);
		int i1=ai.get();
		v(i1);
		//取当前的值，并设置新的值
		int i2=ai.getAndSet(5);
		v(i2);
		int i3=ai.get();
		v(i3);
		 //获取当前的值，并自增
  		int i4=ai.getAndIncrement();
  		v(i4);
  		int i5=ai.getAndAdd(3);
  		v(i5);
  		v(ai.get());*/
		
		/*
		double r=Math.random();
		System.out.println(r);
		*/
		/*int i=0;
		do{
			System.out.println(i);
			i++;
		}while(i<10);*/
		
		int n=13;
		boolean flag=true;
		
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		System.out.println(n+(flag ? " is ":" is not ")+"a prime number");
		
  
	}
	static void v(int i)
	{
		System.out.println("i : "+i);
		System.gc();
		Runtime.getRuntime().gc();
	}
}