package ru.stqa.pft.sandbox;

public class PointDistance {

  public static void main(String[] args)
  {
    Point p = new Point(1.77,4.04); //х1
    Point p1 = new Point(66,11); //х2

    System.out.println("Расстояние между точкой p1 с координатами x1=" + p.x + " и y1=" + p.y + " и точкой y с координатами x2=" + p1.x + " и y2=" + p1.y + " = " + p1.distance(p));
  }

}
