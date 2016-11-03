package basic.lea;

public  class Student{  
    
   String StuName;
   int Age;
  //abstract void study(); 
  
  public Student(String StuName, int Age) {
	  this.StuName=StuName;
	  this.Age=Age;
  }  
	// TODO Auto-generated constructor stub
public boolean equals(Object O){
	Student S=(Student)O;
	//System.out.println((StuName.equals(S.StuName))&& (Age==S.Age));
	return (StuName.equals(S.StuName))&& (Age==S.Age);
}
public String toString(){
	return "学生"+StuName+"的年龄是"+Age+"岁。";
}

}
  class Persons extends Student{
	 private String add;
	public Persons(String StuName, int Age,String Add) {
		super(StuName, Age);
		this.add=Add;
		// TODO Auto-generated constructor stub
	}

	void study() {
		// TODO Auto-generated method stub
		
	}
	  
  }

  
  