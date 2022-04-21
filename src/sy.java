interface rec_Area_Peri{
    int getArea();
}
interface a{
    int getPerimeter();
}
class Rectangle implements rec_Area_Peri,a{
    int width,length;
    Rectangle(int w,int l)
    {
        width =w;
        length = l;

    }

   public int getArea()
    {
        return width*length;
    }

     public  int getPerimeter() {
        return 2*(width+length);
    }
}
public class sy {
    public static void main(String args[]){
        Rectangle rect = new Rectangle(10,20);
        System.out.println("矩形面积"+rect.getArea());
        System.out.println("周长"+rect.getPerimeter());
    }
}







