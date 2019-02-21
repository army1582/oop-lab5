public class Main{
	public static void main(String[] args) {
        Person p1 = new Person("army",23);
        Teacher p2 = new Teacher("jorn",26,"CoE");
        Employee p3 = new Employee("farn",24,333);
        PerEmployee p4 = new PerEmployee("denel ",32,444,4000);
        ConEmployee p5 = new ConEmployee("wit",25,555,5050);
        
        System.out.println("-- PERSON --");
        p1.printDetails();
        System.out.println("\n"+"-- TEACHER --");
        p2.printDetails();
        System.out.println("\n"+"-- EMPLOYEE --");
        p3.printDetails();
        System.out.println("\n"+"-- PERMANENT EMPLOYEE --");
        p4.printDetails();
        System.out.println("\n"+"-- CONTRACT EMPLOYEE --");
        p5.printDetails();
	}
}

class Person{
    String name;
    int age;
    
    public Person(String n,int a){
        name = new String(n);
        age = a;
    }
    
    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

class Teacher extends Person{
    String faculity;
    
    public Teacher(String n,int a,String f){
        super(n,a);
        faculity = new String(f);
    }
    
    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Faculity:"+faculity);
    }
}

class Employee extends Person{
    int id;
    
    public Employee(String n,int a,int i){
        super(n,a);
        id = i;
    }
    
    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("EmployeeId:"+id);
    }
}

class PerEmployee extends Employee{
    int salary;
    
    public PerEmployee(String n,int a,int i,int s){
        super(n,a,i);
        salary = s;
    }
    
    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("EmployeeId:"+id);
        System.out.println("Salary:"+salary);
    }
}

class ConEmployee extends Employee{
    int payment;
    
    public ConEmployee(String n,int a,int i,int p){
        super(n,a,i);
        payment = p;
    }
    
    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("EmployeeId:"+id);
        System.out.println("Payment:"+payment);
    }
}
