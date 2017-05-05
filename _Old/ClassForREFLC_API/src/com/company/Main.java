package com.company;

import javax.naming.Name;
import java.lang.reflect.Field;


class Phone {

    int Number;
    int Battary;
    String Name;
    String OS;

    public Phone(int number, int battary, String name, String OS) {
        Number = number;
        Battary = battary;
        Name = name;
        this.OS = OS;
    }

    public void call(){
        System.out.println("Hello!");

    }

    public void Charge(int Time){
        this.Battary = this.Battary +  this.Battary*(Time/180) ;
    }

}

public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone(223345,75,"Moto","Android");

        System.out.println(phone.getClass());
        System.out.println(Phone.class.getCanonicalName());
        System.out.println(phone.getClass().getAnnotations());

        try {
            try {
                System.out.println(phone.getClass().getMethod("call").getReturnType());
                Class aClass = phone.getClass();
                Field field = aClass.getField("battary");
                field.set(Name,"Moto");

            } catch (NoSuchMethodException e) {}
        } catch (NoSuchFieldException e) {}








//        for (Method method:phone.getClass().getMethods()){
//            System.out.println(method.getName());
//            for(Parameter parameter:method.getParameters()){
//                System.out.println(parameter.getName());
//            }
//
//        }




        try {
            Class cls = Class.forName("com.company.Phone");
            //cls phone2 = new cls();

            for(Field field: Class.forName("com.company.Phone").getFields()){
                System.out.println(field.getName());
                System.out.println(field.getType().getName());
                System.out.println(field.isAccessible());
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



}}
