 class Rectangle
{   
    int length,breadth;
    void getData(int x,int y)
    {
        length=x;
        breadth=y;
    }
    int rectArea()
    {
        int area=length*breadth;
        return area;
    }
}
public class RectangleArea {
    public static void main(String[] args)
    {
        Rectangle rect1=new Rectangle();
        Rectangle rect2=new Rectangle();
        rect1.length=10;
        rect1.breadth=15;
        int area1=rect1.length*rect1.breadth;
        rect2.getData(20,12);
        int area2=rect2.rectArea();
        System.out.println("Area of rect1: " + area1);
        System.out.println("Area of rect2: " + area2);
    }
}