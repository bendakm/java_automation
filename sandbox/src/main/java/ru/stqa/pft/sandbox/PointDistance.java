package ru.stqa.pft.sandbox;

public class PointDistance {

  public static void main(String[] args) {
    Point p = new Point(-66, -9.45);
    Point p1 = new Point(-8.34, -6.56);

    System.out.println("Расстояние между точкой x с координатами x1=" + p.x + " и y1=" + p.y + " и точкой y с координатами x2=" + p1.x + " и y2=" + p1.y + " = " + p1.distance(p));

    Square s = new Square(10.26);
    Rectangle r = new Rectangle(5.31, 45);

    System.out.println("Площадь квадрата со стороной " + s.a + " равна " + s.area());
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());
  }

}
