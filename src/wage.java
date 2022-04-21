import java.util.Scanner;
class student
{
    int x,y,z,average;
    String name,position;
     public student(int x,int y,int z,String name, String position)
     {
         this.name = name;
         this.x= x;
         this.y = y;
         this.z= z;
         this.position = position;
         average=(this.x+this.y+this.z)/3;
     }
}
class undergraduate extends student {
    public undergraduate(int x, int y, int z, String name, String position)
    {
        super(x, y, z, name, position);
        if (average>70)
            System.out.println(name+" 毕业 ");
        else
            System.out.println(name+" 肄业 ");
    }
}
class graduate extends student{
    public graduate(int x, int y, int z, String name, String position){
        super(x,y,z,name,position);
        if (average>70)
            System.out.println(name+" 毕业 ");
        else
            System.out.println(name+" 肄业 ");
    }
}
public class wage{
    public static void main(String args[]){
        int x,y,z;
        String name,position;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入语文成绩:");
        x = scanner.nextInt();
        System.out.println("输入数学成绩:");
        y = scanner.nextInt();
        System.out.println("输入英语成绩:");
        z = scanner.nextInt();
        System.out.println("输入姓名:");
        name = scanner.next();
        System.out.println("输入年级:");
        position = scanner.next();
        if (position == "undergraduate")
        {
            undergraduate a = new undergraduate(x, y, z, name, position);
        }
        else
        {
            graduate b = new graduate(x,y,z,name,position);
        }

    }
}