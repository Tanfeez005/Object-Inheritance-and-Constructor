
public class Rectangle {
	int length;
	int width;
	// default or non parametrized cunstructor
	Rectangle(){
		this.length=length;
		this.width=width;
		
	}
	// default or parametrized cunstructor
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	
	public void display() {
		int Area=length*width;
		System.out.println("Area of rectangle is: "+Area +" sqft");
	}
	

	public static void main(String[] args) {
		Rectangle A=new Rectangle();
		A.length=20;
		A.width=20;
		Rectangle B=new Rectangle(10,30);
		
		A.display();
		B.display();
		

	}

}
