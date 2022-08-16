package ru.stqa.pft.sandbox;

import org.junit.Test;
import org.testng.Assert;

public class PointDistanceTests {
  @Test
 public void testDistance1(){
   Point p = new Point(1000, 5000);
   Point p1 = new Point(10000, 60000);

   Assert.assertEquals(p.distance(p1), 55731.49917237109);
 }
  @Test
 public void testDistance2(){
    Point p = new Point(15, 29);
    Point p1 = new Point(60, 27);
    Assert.assertEquals(p.distance(p1), 45.044422518220834);
 }
 @Test
  public void testDistance3(){
    Point p = new Point(1.52, 2.95);
    Point p1 = new Point(0.91, 1.43);
    Assert.assertEquals(p.distance(p1), 1.6378339354159204);
  }
  @Test
  public void testDistance4(){
    Point p = new Point(-66, -9.45);
    Point p1 = new Point(-8.34, -6.56);
    Assert.assertEquals(p.distance(p1), 57.73237999597799);
  }
  @Test
  public void testDistance5(){
    Point p = new Point(-66, -9.45);
    Point p1 = new Point(-66, -9.45);
    Assert.assertEquals(p.distance(p1), 0);
  }
}
