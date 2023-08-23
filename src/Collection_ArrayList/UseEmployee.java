package Collection_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e=new Employee(1242,"suresh",25,"Male",56000);
		Employee e1=new Employee(2564,"ramesh",45,"Male",65244);
		Employee e2=new Employee(1324,"pavani",24,"FeMale",45000);
		Employee e3=new Employee(1124,"rakesh",35,"Male",26452);
		Employee e4=new Employee(2134,"priya",28,"FeMale",65822);
		Employee e5=new Employee(1247,"sravani",30,"FeMale",35000);
		Employee e6=new Employee(3545,"balaji",26,"Male",125600);
		Employee e7=new Employee(1242,"maruthi",28,"Male",89000);
		Employee e8=new Employee(1025,"vani",32,"FeMale",28560);
		Employee e9=new Employee(2364,"gopi",26,"Male",45622);
		Employee e10=new Employee(1198,"lakshmi",29,"FeMale",47000);
		ArrayList<Employee> nums=new ArrayList<>();
		// female=new ArrayList<>();
		nums.add(e);
		nums.add(e1);
		nums.add(e2);
		nums.add(e3);
		nums.add(e4);
		nums.add(e5);
		nums.add(e6);
		nums.add(e7);
		nums.add(e8);
		nums.add(e9);
		nums.add(e10);
//		for(Employee v:nums) {
//			System.out.println(v);+
//		}
//		System.out.println();
//		Employee max=nums.get(0);
//		for(int i=0; i<nums.size(); i++) {
//			if(nums.get(i).getSalary()>max.getSalary()) {
//				max=nums.get(i);
//			}
//		}
//		System.out.println(max);
//		
//		System.out.println();
//		Employee min=nums.get(0);
//		for(int i=0; i<nums.size(); i++) {
//			if(nums.get(i).getSalary()<min.getSalary()) {
//				min=nums.get(i);
//			}
//		}
//		System.out.println(min);
//		System.out.println();
//		Employee senior=nums.get(0);
//		for(int i=0; i<nums.size(); i++) {
//			if(nums.get(i).getId()<senior.getId()) {
//				senior=nums.get(i);
//			}
//		}
//		System.out.println(senior);
//		System.out.println();
//		for(int i=0; i<nums.size(); i++) {
//			if(nums.get(i).getGender().equalsIgnoreCase("Male")) {
//				System.out.println("Male Candidate: "+nums.get(i));
//			}
//		}
//		System.out.println(senior);
//		System.out.println();
//		int count=0;
////		for(int i=0; i<nums.size(); i++) {
////			if(nums.get(i).getGender().equalsIgnoreCase("FeMale")) {
////				count++;
////				System.out.println("FeMale Candidate: "+nums.get(i));
////				female.add(nums.get(i));
////			}
////		}
////		System.out.println("Female Count is: "+count);
////		System.out.println();
////		for(Employee v:female) {
////			System.out.println(v);
////		}
		
		List<Employee> fm = e1.female(nums);
//		fm.forEach(x->System.out.println(x));
		Employee b=fm.get(0);
		for(Employee q:fm) {
			if(q.getName().length()>b.getName().length());
			{
				b=q;
			}			
		}
		System.out.println(b);
	}
	
}
