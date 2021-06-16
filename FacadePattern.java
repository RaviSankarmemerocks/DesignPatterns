interface Draw{
    public void draw();
}
class Circle_facade implements Draw{
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
class Rectangle_facade implements Draw{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Square_facade implements Draw{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
class Shape_facade{
    Square_facade sf;
    Circle_facade cf;
    Rectangle_facade rf;
   Shape_facade(){
       sf=new Square_facade();
       cf=new Circle_facade();
       rf=new Rectangle_facade();
   }
   public void DrawCircle(){
       cf.draw();
   }
    public void DrawRectangle(){
        rf.draw();
    }
    public void DrawSquare(){
        sf.draw();
    }
}
public class FacadePattern {
    public static void main(String args[]){
        Shape_facade sf=new Shape_facade();
        sf.DrawCircle();
        sf.DrawRectangle();
        sf.DrawSquare();
    }

}

