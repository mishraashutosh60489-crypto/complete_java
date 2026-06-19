
class Rectangle1{
	public int width;
	public int length;
	public int getWidth(){

        return width;
	}
	public void setWidth(int width){

        this.width = width;
	}
	public int getLength(){

        return length;
	}
	public void setLength(int length){

        this.length = length;
	}
	void Area(int length,int width){

        System.out.println("Area of the rectangle is : "+length*width);
	}
	void Perimeter(int length,int width) {

		System.out.println("Perimeter of the rectangle is : "+2*(length+width));
	}
}
class Cuboid extends Rectangle1{
	public int height;
	public int getHeight(){

        return height;
	}
	public void setHeight(int height){

        this.height = height;
	}
	void Volume(int length,int width,int height){

        System.out.println("Volume of the cuboid is : "+length*width*height);
	}
}



public class Inheritance_4{
	public static void main(String[] args){
		Cuboid c = new Cuboid();
		c.setHeight(4);
		c.setLength(5);
		c.setWidth(6);
		c.Area(c.getLength(),c.getWidth());

		c.Volume(c.getLength(),c.getWidth(),c.getHeight());
	}
}