package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {
	@SuppressWarnings("unused")
	private static final Collectors collector = null;

	public static void main(String[] args) {
		Car c1=new Car("Audi",2000000,2018,"White","Ap");
		Car c2=new Car("BMW",2500000,2023,"Black","TN");
		Car c3=new Car("Hyundai",7850000,2022,"Blue","KL");
		Car c4=new Car("Suziki",695000,2021,"Grey","DL");
		Car c5=new Car("Ferrari",4500000,2015,"White","MP");
		Car c6=new Car("Range Rover",3500000,2002,"NavyBlue","UP");
		Car c7=new Car("Mercedece",6985000,2019,"Red","KN");
		Car c8=new Car("Nissan",4230000,2005,"Blue","BR");
		Car c9=new Car("VolksWagen",56200000,2016,"Black","KL");
		Car c10=new Car("Kia",4660000,2017,"Grey","Ap");
		ArrayList<Car> cars=new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		cars.add(c8);
		cars.add(c9);
		cars.add(c10);
//		List<Car> newCars=cars.stream().filter(x->x.getModel()>=2018).collect(Collectors.toList());
//		newCars.forEach(x->System.out.println(x));
//		long newCars1=newCars.stream().count();
//		System.out.println(newCars1);
		
//		List<String> brands=cars.stream().filter(z->z.getPrice()>2562000).map(a->a.getBrand()).collect(Collectors.toList());
//		brands.forEach(x->System.out.println(x));
//		
//		System.out.println();
//		
//		Car costlyCar=cars.stream().max(Comparator.comparing(Car::getPrice)).get();
//		System.out.println(costlyCar);
//		
//		System.out.println();
//		
		Car cheapCar=cars.stream().min(Comparator.comparing(Car::getPrice)).get();
		System.out.println(cheapCar);
		
//		System.out.println();
		
		List<Integer> brand=cars.stream().filter(z->z.getPrice()>0).map(a->a.getPrice()).collect(Collectors.toList());
		brand.forEach(y->System.out.println(y));
//		
//		System.out.println();
		
//		List<Integer> sorting=cars.stream().sorted(Comparator.comparing(Car::getPrice)).get();
//		System.out.println(sorting);
//		
//		List<Car> audi=cars.stream().filter(var->var.getBrand().equalsIgnoreCase("audi")).map(e-> {
//			e.setPrice(e.getPrice()+e.getPrice()*5/100);
//			return e;
//		}).collect(Collectors.toList());
//		System.out.println(audi);
	}
}
