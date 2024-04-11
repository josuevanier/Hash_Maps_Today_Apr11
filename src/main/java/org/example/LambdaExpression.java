package org.example;
interface Drawable{
    void draw();
}
public class LambdaExpression {
    public static void main(String[] args) {
        int width = 19;

      Drawable d2 =()->{
          System.out.println("Drawing" + width);
      };
      d2.draw();

}}
