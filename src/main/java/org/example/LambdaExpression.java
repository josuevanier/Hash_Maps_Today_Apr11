package org.example;
interface Drawable{
    void draw();
}
public class LambdaExpression {
    public static void main(String[] args) {
        int width = 19;

        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Width " + width);
            }
        };
        d.draw();


}}
