package org.example;
interface Drawable{
    void draw();
}
interface Sayable {
    String say(String name);
}
interface Addable{
    int add(int a, int b);

}
public class LambdaExpression {
    public static void main(String[] args) {
        Addable ad1 = (a, b)->(a+b);
        System.out.println(ad1.add(10,20));

}}
