public class lab1{
public static void main(String[] args){
Person Vasya = new Person();
Vasya.name = "Vasya";
Vasya.age = "23";
Vasya.phonenumber = "";
Vasya.phonename = ""
Person Petya = new Person();
}
}
// 1
class Person{
int age;
string name;
string phonename;
string  phonenumber;

// 2 
public Person(){
age = 0;
name="none";
phonename="none";
phonename="none";
}
//3
void aboutPerson(){
        System.out.println("Имя: " + name +","+"Возраст: " + age + ","+"Модель телефона: " + phonename + ","+"Номер телефона: " + phonenumber);
    }

}
