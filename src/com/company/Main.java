package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     static ArrayList<Student> list = new ArrayList<>();    // создаем Arraylist

    public static void main(String[] args) throws IOException {

        //Добавляем в динамический массив два объекта
        list.add(new Student("Авсюкевич", "Максим", "Александрович", 951006, 8.75f, 1000));
        list.add(new Student("Костюкевич", "Павел", "Юрьевич", 951006, 8f, 600));
        while (true) {        // постоянный вызов меню

            //Вывод меню
            System.out.println("\t\t\t\t\tМеню\t\t\t\t\t");
            System.out.println("1-Добавить объект в конец");
            System.out.println("2-Добавить объект по индексу");
            System.out.println("3-Вывести все объекты на экран");
            System.out.println("4-Удалить объект по индексу");
            System.out.println("5-Установить новый объект по индексу");
            System.out.println("6-Вывести информацию о студентах, у которых доход на члена семьи менее двух минимальных зарплат");
            System.out.println("7-Записать список в файл");
            System.out.println("8-Вывести список из файла");
            System.out.println("9-Выход из программы");
            System.out.println();
            System.out.println("Введите число");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()) {         // проверка на ввод целого числа
                System.out.println("Введите число из списка");
                input.next();
            }
            int number = input.nextInt();
            if (!(number >= 1) || !(number <= 9)) {    // проверка на ввод числа из списка меню
                System.out.println("Вы ввели число,которого нет в списке");
            } else {
                if (number == 1) {                     // пункт меню при вводе 1
                    System.out.println("Введите фамилию");
                    Scanner Surname = new Scanner(System.in);
                    while (Surname.hasNextInt()|| Surname.hasNextDouble()) {  //ввод фамилии
                        System.out.println("Введите строку");
                        Surname.nextLine();
                    }
                    String surName = Surname.nextLine();


                    System.out.println("Введите имя");
                    Scanner Name = new Scanner(System.in);
                    while (Name.hasNextInt()||Name.hasNextDouble()) {     //ввод имени
                        System.out.println("Введите строку");
                        Name.nextLine();
                    }
                    String name = Name.nextLine();

                    System.out.println("Введите отчество");
                    Scanner Lastname = new Scanner(System.in);
                    while (Lastname.hasNextInt()|| Lastname.hasNextDouble()) {   //ввод отчества
                        System.out.println("Введите строку");
                        Lastname.nextLine();
                    }
                    String lastName = Lastname.nextLine();

                    System.out.println("Введите группу");
                    Scanner Group = new Scanner(System.in);
                    while (!Group.hasNextInt()) {                    //ввод группы
                        System.out.println("Введите целое число");
                        Group.next();
                    }
                    int group = Group.nextInt();

                    System.out.println("Введите средний балл");
                    Scanner Mark = new Scanner(System.in);
                    while (!Mark.hasNextFloat()) {                    //ввод среднего балла
                        System.out.println("Введите дробное число");
                        Mark.next();
                    }
                    float mark = Mark.nextFloat();

                    System.out.println("Введите доход на члена семьи");
                    Scanner Benefit = new Scanner(System.in);
                    while (!Benefit.hasNextInt()) {                       //ввод дохода на члена семьи
                        System.out.println("Введите целое число");
                        Benefit.next();
                    }
                    int benefit = Benefit.nextInt();
                    add_in_end(surName, name, lastName, group, mark, benefit);  //вызов метода с передачей необходимых параметров
                } else if (number == 2) {                   // пункт меню при вводе 2
                    System.out.println("Введите фамилию");
                    Scanner Surname = new Scanner(System.in);
                    while (Surname.hasNextInt()|| Surname.hasNextDouble()) {    //ввод фамилии
                        System.out.println("Введите строку");
                        Surname.nextLine();
                    }
                    String surName = Surname.nextLine();


                    System.out.println("Введите имя");
                    Scanner Name = new Scanner(System.in);
                    while (Name.hasNextInt()|| Name.hasNextDouble()) {       //ввод имени
                        System.out.println("Введите строку");
                        Name.nextLine();
                    }
                    String name = Name.nextLine();

                    System.out.println("Введите отчество");
                    Scanner Lastname = new Scanner(System.in);
                    while (Lastname.hasNextInt()|| Lastname.hasNextDouble()) {   //ввод отчества
                        System.out.println("Введите строку");
                        Lastname.nextLine();
                    }
                    String lastName = Lastname.nextLine();

                    System.out.println("Введите группу");
                    Scanner Group = new Scanner(System.in);
                    while (!Group.hasNextInt()) {                         //ввод группы
                        System.out.println("Введите целое число");
                        Group.next();
                    }
                    int group = Group.nextInt();

                    System.out.println("Введите средний балл");
                    Scanner Mark = new Scanner(System.in);
                    while (!Mark.hasNextFloat()) {                       //ввод среднего балла
                        System.out.println("Введите дробное число");
                        Mark.next();
                    }
                    float mark = Mark.nextFloat();

                    System.out.println("Введите доход на члена семьи");
                    Scanner Benefit = new Scanner(System.in);
                    while (!Benefit.hasNextInt()) {                       //ввод дохода на члена семьи
                        System.out.println("Введите целое число");
                        Benefit.next();
                    }
                    int benefit = Benefit.nextInt();
                    System.out.println("Введите индекс по которому хотите добавить");
                    Scanner index = new Scanner(System.in);
                    while (!index.hasNextInt()) {                       //ввод индекса,по которому доабавляем объект
                        System.out.println("Введите целое число");
                        index.next();
                    }
                    int id = index.nextInt();
                    if (id >= 1 && id <= list.size()) {         //проверка на наличие элемента под этим индексом
                        add_on_index(surName, name, lastName, group, mark, benefit, id-1);  //вызов метода с передачей необходимых параметров

                    } else {
                        System.out.println("Такого индекса нет в списке");
                    }


                } else if (number == 3) {        // пункт меню при вводе 3
                    display();                   //вызов метода

                } else if (number == 4) {        // пункт меню при вводе 4
                    System.out.println("Введите индекс объекта,который ходите удалить");
                    Scanner index = new Scanner(System.in);
                    while (!index.hasNextInt()) {                 //ввод индекса для удаления объекта
                        System.out.println("Введите целое число");
                        index.next();
                    }
                    int id = index.nextInt();
                    if(id >= 1 && id <= list.size()){          //проверка на существование объекта под этим индексом
                        remove(id-1);                      //вызов метода с передачей индекса
                    }
                    else {
                        System.out.println("Такого индекса нет в списке");
                    }


                } else if (number == 5) {                     // пункт меню при вводе 5
                    System.out.println("Введите фамилию");
                    Scanner Surname = new Scanner(System.in);
                    while (Surname.hasNextInt()|| Surname.hasNextDouble()) {   //ввод фамилии
                        System.out.println("Введите строку");
                        Surname.nextLine();
                    }
                    String surName = Surname.nextLine();


                    System.out.println("Введите имя");
                    Scanner Name = new Scanner(System.in);
                    while (Name.hasNextInt()|| Name.hasNextDouble()) {   //ввод имени
                        System.out.println("Введите строку");
                        Name.nextLine();
                    }
                    String name = Name.nextLine();

                    System.out.println("Введите отчество");
                    Scanner Lastname = new Scanner(System.in);
                    while (Lastname.hasNextInt()|| Lastname.hasNextDouble()) {   //ввод отчества
                        System.out.println("Введите строку");
                        Lastname.nextLine();
                    }
                    String lastName = Lastname.nextLine();

                    System.out.println("Введите группу");
                    Scanner Group = new Scanner(System.in);
                    while (!Group.hasNextInt()) {                        //ввод группы
                        System.out.println("Введите целое число");
                        Group.next();
                    }
                    int group = Group.nextInt();

                    System.out.println("Введите средний балл");
                    Scanner Mark = new Scanner(System.in);
                    while (!Mark.hasNextFloat()) {                      //ввод среднего балла
                        System.out.println("Введите дробное число");
                        Mark.next();
                    }
                    float mark = Mark.nextFloat();

                    System.out.println("Введите доход на члена семьи");
                    Scanner Benefit = new Scanner(System.in);
                    while (!Benefit.hasNextInt()) {                       //ввод дохода на члена семьи
                        System.out.println("Введите целое число");
                        Benefit.next();
                    }
                    int benefit = Benefit.nextInt();

                    System.out.println("Введите индекс, по которому хотите заменить объект");
                    Scanner index = new Scanner(System.in);
                    while (!index.hasNextInt()) {                         //ввод индекса для замены
                        System.out.println("Введите целое число");
                        index.next();
                    }
                    int ind = index.nextInt();
                    if (ind >= 1 && ind <= list.size()) {      //проверка на существование объекта под этим индексом
                        setObject(surName, name, lastName, group, mark, benefit, ind-1); //вызов метода с передачей
                    } else {                                                                  //необходимых параметров
                        System.out.println("Такого индекса нет в списке");
                    }

                } else if (number == 6) {             // пункт меню при вводе 6
                    exercise();                       // вызов метода
                }
                else if (number==7){                  // пункт меню при вводе 7
                    write_in_file();                  // вызов метода
                }
                else if(number==8){                   // пункт меню при вводе 8
                    read_on_file();                   // вызов метода
                }
                else if(number==9){                   // пункт меню при вводе 8
                    System.exit(0);            // завершение программы
                }


            }
        }

        }
        //метод  для добавления объекта в конец списка
    public static void add_in_end(String surName, String name,String lastName,int group, float mark,int benefit){
        list.add(new Student(surName,name,lastName,group,mark,benefit));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    //метод для добавления объекта под индексом
    public static void add_on_index(String surName, String name,String lastName,int group, float mark,int benefit,int id){
        list.add(id,new Student(surName,name,lastName,group,mark,benefit));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    // метод для отображения текущего списка
    public static void display(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    // метод для удаления объекта по индексу
    public static void remove(int id){
        list.remove(id);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    // метод для замены объекта по индексу
    public static void setObject(String surName, String name,String lastName,int group, float mark,int benefit,int ind){
        list.set(ind,new Student(surName,name,lastName,group,mark,benefit));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    // метод для вывода информации о студентах, у которых доход на члена семьи менее двух минимальных зарплат
    public static void exercise(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getBenefit()<750){
                System.out.println(list.get(i));
            }
        }
    }
    // метод для записи списка в файл
    public static void write_in_file() throws IOException {
        FileWriter pw=new FileWriter("file.txt");
        pw.write("id"+"|"+"Фамилия"+"|"+"Имя"+"|"+"Отчество"+"|"+"Группа"+"|"+"СБ"+"|"+"Доход"+"\n");
        for(int i=0;i<list.size();i++){
            pw.write(i+1+"|"+list.get(i)+"\n");
        }
        pw.close();
    }
    // метод для чтениия списка из файла
    public static void read_on_file() throws IOException {
        ArrayList<String> list= (ArrayList<String>) Files.readAllLines(Paths.get("file.txt"));
        for(String a:list){
            System.out.println(a);
        }
    }
}
