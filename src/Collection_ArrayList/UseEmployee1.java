package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee1 {
	public static void main(String[] args) {
		Employee e=new Employee(1242,"suresh",25,"Male",56000);
		Employee e1=new Employee(2564,"ramesh",45,"Male",65244);
		Employee e2=new Employee(1324,"pavani",24,"FeMale",45000);
		Employee e3=new Employee(1124,"rakesh",35,"Male",26452);
		Employee e4=new Employee(2134,"priya",28,"FeMale",65822);
		Employee e5=new Employee(1247,"sravani",30,"FeMale",35000);
		Employee e6=new Employee(3545,"balaji",26,"Male",125600);
		Employee e7=new Employee(1242,"maruthi",28,"Male",29000);
		Employee e8=new Employee(1025,"vani",32,"FeMale",28560);
		Employee e9=new Employee(2364,"gopi",26,"Male",45622);
		Employee e10=new Employee(1198,"lakshmi",29,"FeMale",47000);
		HashMap<Integer,Employee> emps=new HashMap<>();
		emps.put(e.getId(), e);
		emps.put(e1.getId(), e1);
		emps.put(e2.getId(), e2);
		emps.put(e3.getId(), e3);
		emps.put(e4.getId(), e4);
		emps.put(e5.getId(), e5);
		emps.put(e6.getId(), e6);
		emps.put(e7.getId(), e7);
		emps.put(e8.getId(), e8);
		emps.put(e9.getId(), e9);
		emps.put(e10.getId(), e10);
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);
		emp.add(e10);
		
		//emps.forEach((x,y)-> System.out.println(x+" "+y));
//		HashMap<Integer,Employee> male=new HashMap<>();
//		
//		for(Integer s:emps.keySet()){
//			if(emps.get(s).getGender().equalsIgnoreCase("Male")) {
//				male.put(s,emps.get(s));
//			}
//		}
//		male.forEach((x,y)-> System.out.println(x+" "+y));
//		
//		for(Integer k:emps.keySet()){
//			if(emps.get(k).getGender().equalsIgnoreCase("Male")) {
//				emps.remove(k);
//			}
//		}
//		emps.forEach((x,y)-> System.out.println(x+" "+y));
//		
//		Iterator<Integer> itr=emps.keySet().iterator();
//		while(itr.hasNext()) {
//			int k=itr.next();
//			if(emps.get(k).getGender().equals("FeMale")) {
//				itr.remove();
//			}
//		}
//		emps.forEach((x,y)-> System.out.println(x+" "+y));
		List<Employee> newemp= emp.stream().filter(x->x.getSalary()>=65000).collect(Collectors.toList());
		newemp.forEach(x->System.out.println(x));
//		Employee maxSalary=emp.stream().max(Comparator.comparing(Employee::getSalary())).get();
//		maxSalary.forEach(y->System.out.println(y));
}
}
