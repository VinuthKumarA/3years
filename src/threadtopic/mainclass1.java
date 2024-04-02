package threadtopic;
import java.util.Arrays;
class student implements Comparable<student>{
	int id;
	String name;
	double per;
	public student(int id,String name,double per){
		super();
		this.id=id;
		this.name=name;
		this.per=per;
	}
	public String toString(){
		return id+" "+name+" "+per;
	}
	public int compareTo(student s) {
		return this.id-s.id;
	}
}
public class mainclass1 {
	public static void main(String[] arg) {
		student s1 = new student(55,"ram",99.99);
		student s2 = new student(5,"ram",90);
		student s3 = new student(545,"ram",70);
		student arr[]= {s1,s2,s3};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
