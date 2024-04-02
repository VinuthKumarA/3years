package threadtopic;
import java.util.Arrays;
class employ implements Comparable<employ>{
	int id;
	String name;
	double salary;
	char grade;
	String company;
	public employ(int id,String name,double salary,char grade,String company){
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		this.company=company;
	}
	public String toString(){
		return id+" "+name+" "+salary+" "+grade+" "+company;
	}
	public int compareTo(employ e) {
		return this.id-e.id;
	}
}	
		

public class comparableassign {
	public static void main(String[] arg) {
		employ e1 = new employ(55,"ram",3455.45,'a',"tata");
		employ e2 = new employ( 33,"beem",2433.232,'b',"tcs");
		employ e3 = new employ( 11,"sam",2453.22,'c',"epam");
		employ e4 = new employ( 11,"gem",2135663.22,'g',"epam-a");
		employ e5 = new employ( 11,"game",213341113.22,'e',"epam-b");
		employ arr[]= {e1,e2,e3,e4,e5};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
