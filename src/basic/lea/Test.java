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

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public  class Test implements Lock {
		String add;
    
		public Test(String StuName, int Age,String Add) {
		//super(StuName, Age);
		this.add=Add;
		// TODO Auto-generated constructor stub
		}
		
		public Test() {
			// TODO Auto-generated constructor stub
		}

		void study() {
			// TODO Auto-generated method stub
			
			System.out.println("学生要去学校学习");
			
		}
			     
	 	    
	     public static void main(String[] args) {
	         //new Test(3,3);
	    	 //ClassA S=new ClassA();
	    	// System.out.println(S instanceof ClassB);
	    	// System.out.println(S instanceof ClassA);
	    	 //Test a1=new Test();
	    	 
	    	 //Student S=new Student("Eva",19);
	    	 
	    	// Student S=new Student("Eva",19);
	    	 //S.equals(S);
	    	 //System.out.println(S);
	    	 
	    	 String S1=new String("Hello");
	    	 String S2="Hello";
	    	 String S6="Hello";
	    	 String S3=new String("Hello");
	    	 System.out.println("S1==S2:"+(S1==S2));//false
	    	 System.out.println("S1==S3:"+(S3==S1));//false
	    	 System.out.println("S2==S6:"+(S2==S6));//true
	    	 System.out.println("S1.equals(S3):"+S1.equals(S3));//true	    	 
	    	 System.out.println("S1.equals(S2):"+S1.equals(S2));//true
	    	 
	    	Student S4=new Student("Wood",19);	    	 
		    Student S5=new Student("Eva",19);
		    Test T=new Test();
		    try{
		    	T.lock();
		    System.out.println("S4==S5:"+(S4.StuName==S5.StuName));//false
		    }finally{
		    	T.unlock();
		    }
		    System.out.println("S4.equals(S5):"+S4.equals(S5));//false
	    	 
	    	 
	     }

		@Override
		public void lock() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void lockInterruptibly() throws InterruptedException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean tryLock() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void unlock() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Condition newCondition() {
			// TODO Auto-generated method stub
			return null;
		}

		
	
	
	
}