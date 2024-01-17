import java.util.Scanner;
class employee
{
	employee()
	{

		
		Scanner sc= new Scanner(System.in);

                System.out.println("enter id");
                int id=sc.nextInt();

                System.out.println("enter name");
                  String name=sc.next();

            System.out.println("enter age");
             int age=sc.nextInt();

           System.out.println("enter designation");
             String designation=sc.next();

System.out.println("enter salary");
int salary=sc.nextInt();
display(id,age, salary, designation,name);

}

void display(int id, int age, int salary, String designation, String name){
System.out.println("my id is :"+id);
System.out.println("my age is :"+age);
System.out.println("my salary is :"+salary);
System.out.println("my designation is :"+designation);
System.out.println("my name is :"+name);

}


}
class demo2{



public static void main(String args[]){

employee e=new employee();


// Scanner sc= new Scanner(System.in);

// System.out.println("enter id");
// int id=sc.nextInt();

// System.out.println("enter name");
// String name=sc.next();

// System.out.println("enter age");
// int age=sc.nextInt();

// System.out.println("enter designation");
// String designation=sc.next();

// System.out.println("enter salary");
// int salary=sc.nextInt();

// System.out.println("my id is :"+id);
// System.out.println("my age is :"+age);
// System.out.println("my salary is :"+salary);
// System.out.println("my designation is :"+designation);
// System.out.println("my name is :"+name);

}
}

