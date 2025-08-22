## Coding Exercise 36: Cylinder Class with Circle Inheritance
```java
public class Circle {
    // write code here
    private double radius;

    public Circle(double radius) {
        if (radius < 0) this.radius = 0;
        else
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
```