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

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo{
	public static void main(String[] arg){
		/*AtomicInteger ai=new AtomicInteger(0);
		int i1=ai.get();
		v(i1);
		//ȡ��ǰ��ֵ���������µ�ֵ
		int i2=ai.getAndSet(5);
		v(i2);
		int i3=ai.get();
		v(i3);
		 //��ȡ��ǰ��ֵ��������
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