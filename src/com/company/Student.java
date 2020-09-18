package com.company;
public class Student {
    private String surName;   // поле для хранения фамилии
    private String name;      // поле для хранения имени
    private String lastName;  // поле для хранения отчества
    private int group;        // поле для хранения группы
    private float mark;       // поле для хранения среднего балла
    private int benefit;      // поле для хранения дохода на члена семьи
    // конструктор
     Student(String surName,String name,String lastName,int group,float mark,int benefit){
        this.surName=surName;
        this.name=name;
        this.lastName=lastName;
        this.group=group;
        this.mark=mark;
        this.benefit=benefit;
    }
    // переопределение метода для вывода информации о студентах
    @Override
    public String toString(){
       return this.surName+"|"+this.name+"|"+this.lastName+"|"+this.group+"|"+this.mark+"|"+this.benefit;
    }
    // метод для получения информации о доходе на члена семьи каждого студента
    public int getBenefit(){
        return this.benefit;
    }
}
