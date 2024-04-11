package org.example;
interface Drawable{
    void draw();
}
interface Sayable{
    String say(String name);
}
public class LambdaExpression {
    public static void main(String[] args) {

        Sayable s1 = (name)->{
            return "say " + name;
        } ;
        System.out.println(s1.say("noo"));


}}
