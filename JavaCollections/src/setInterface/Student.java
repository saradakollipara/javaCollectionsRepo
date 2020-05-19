package setInterface;

//Comparable Interface is implemented to order the Student object in Tree set in custom order. 
public class Student implements Comparable<Student>{
	
	int sNo;
	String sName;
	
	//Getters and Setters
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	//Constructor with arguments
	public Student(int sNo, String sName) {
		super();
		this.sNo = sNo;
		this.sName = sName;
	}
	//default constructor
	public Student() {
		
	}
	
	//Override hash code method, so that it will not return the default hashcode
	//manually giving same hash code to all the objects
	@Override
	public int hashCode() {
		return this.getsNo()+this.getsName().length();
	}
	
	//override equals method so objects are compared properly
	//when two objects are compared, if the objects are equal it returns true
	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return this.getsNo() == s1.getsNo() && this.getsName().equalsIgnoreCase(s1.getsName());
	}
	
	
	//*********Only for tree set*******
	//compareTo method is overriden which is Comparable Interface
	//Sorts objects based on logic
		// + is greater
		// 0 is equal
		// -1 is less than 
	@Override
	public int compareTo(Student obj) {
		if(this.sNo > obj.sNo) {
			return 1;
		}
		else if(this.sNo < obj.sNo) {
			return -1;
		}
		else return 0;
	}
	
	
	
	
}
