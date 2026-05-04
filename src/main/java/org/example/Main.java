package org.example;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        MyStringBuilder myStringBuilder = new MyStringBuilder(" 123");
        //MyStringBuilder myStringBuilder = new MyStringBuilder();
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
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
        myStringBuilder.undo();
        System.out.println(myStringBuilder.toString());
    }
}