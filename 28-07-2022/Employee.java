public class Employee {
		private String name;
		private short  joingyear;
		private double salary;
		private String address;
		
		public Employee(String name, short joingyear, double salary, String address) {
			this.name = name;
			this. joingyear = joingyear ;
			this.salary = salary;
			this.address = address;
		}
		
		
		public String toString() {
			return name + "\t\t" +  joingyear + "\t\t   " + salary + "\t" + address;
		}



		public static void main(String[] args) {
			Employee e = new Employee("Santosh Patil", (short)2022, 89999, "Pune Mhaharshtra");
			Employee e2 = new Employee("Sanket Patil", (short)2022, 6777, "Mumbai Maharashtra");
			Employee e3 = new Employee("Jonny Deffe", (short)2020, 899, "panji Goa");
			
			
			
			
		
			System.out.println(e.toString());
			System.out.println(e2.toString());
			System.out.println(e3.toString());
		}
		
		

	}