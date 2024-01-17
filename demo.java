class A{
A(){
System.out.println("constructor A");

}

void display(){
System.out.println("display a");
}}

class demo{
public static void main(String args[]){
System.out.println("Hi");
A a=new A();
a.display();
}
}
