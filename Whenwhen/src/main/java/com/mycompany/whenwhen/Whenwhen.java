package com.mycompany.whenwhen;

public class Whenwhen {

    public static void main(String[] args) {
        Character Homero = new Character("Homero", "inspector de seguridad nuclear", 33 , "dou" );
        Homero.greeting();
        Character Bart = new Character("Bartolomeo", "Vago", 10 , "Ay caramba" );
        Bart.greeting();
    }
    
    static class Character{
       String name;
       String job;
       int age;
       String phrase;
       
       Character(String name, String job, int age, String phrase){
        this.name = name;
        this.job = job;
        this.age = age;
        this.phrase = phrase;
       }
       
       
       void greeting(){
       System.out.println(this.phrase);
       }
    }
}
