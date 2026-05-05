package org.example;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append(" 456");
        myStringBuilder.append(" 789");
        myStringBuilder.append(" qaz");
        myStringBuilder.append(" wsx");
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        myStringBuilder.append(" wsx");
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
    }
}