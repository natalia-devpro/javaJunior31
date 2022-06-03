package lesson8.praktica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student vasya = new Student("Иванов", "Вася", "Москва, Шлюзовая", "8987654346"); // вызов конструктора
        Student petya = new Student();

        Otliсhnik sveta = new Otliсhnik();
        sveta.setName("Света");
        sveta.setAdress("Нижний Новгород");
        sveta.setPhoneNumber("8374834836");
        sveta.setSurname("Петрова");

        ArrayList<Student> students = new ArrayList<>();
        students.add(vasya);
        students.add(sveta);
        students.add(petya);

        // for each (когда нужно пройтись по всем объектам в одном хранилище
        for(Student st:students){
            st.doDomashka(); // полиморфизм
        }





    }
}
