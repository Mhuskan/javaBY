class emp{
             	byte a=127;
             	short s=32766;
		long i=	9234567890L;
		float f=10/3f;
		double d=10/3d;
		int e=100;
	void display(){
   			 System.out.println("byte:"+a);
 System.out.println("short:"+s);
 System.out.println("float:"+f);
			
}
	}
	
				
class demo3{
public static void main(String args[]){
         emp e=new emp();
         e.display();
}
}