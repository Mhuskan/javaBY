import java.util.Scanner;

class Emp{
	int id;
	String name;
	int age;

	Emp(){
			Scanner sc= new Scanner(System.in);	
			System.out.println("enter id:");
			id=sc.nextInt();
			System.out.println("enter name:");
			name=sc.next();				
			System.out.println("enter age:");
			age=sc.nextInt();
		}
}

class developer extends Emp{
	
	int salary=80000000;
	String designation= "developer";

		

void display(){
	System.out.println("my id is:"+id);
	System.out.println("my name is:"+name);
	System.out.println("my age is:"+age);
	System.out.println("my salary is:"+salary);
	System.out.println("my designation is:"+designation);
	}

}


class clerk extends Emp{

int salary=20000;
String designation="clerk";



void display(){
	System.out.println("my id is:"+id);
	System.out.println("my name is:"+name);
	System.out.println("my age is:"+age);
	System.out.println("my salary is:"+salary);
	System.out.println("my designation is:"+designation);
	}






}




class manager extends Emp{

int salary=6000000;
String designation="manager";



void display(){
	System.out.println("my id is:"+id);
	System.out.println("my name is:"+name);
	System.out.println("my age is:"+age);
	System.out.println("my salary is:"+salary);
	System.out.println("my designation is:"+designation);
	}





}








class demo4{






public static void main( String args[])
{

int ch1;
Scanner sc= new Scanner(System.in);
do{
	System.out.println("1)developer");
	System.out.println("2)clerk");
	System.out.println("3)manager");
        System.out.println("4)exit");

System.out.println("enter an option:");
ch1=sc.nextInt();

if(ch1==1){
developer d=new developer();
d.display();


}

if(ch1==2){

clerk c=new clerk();
c.display();
}
}

while(ch1!=4);

}



}

























