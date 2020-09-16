import java.util.Scanner;

public class lab1{
        public static void main(String[] args){
//4 вася записан, Петя вводится с клавиатуры
                Person Vasya = new Person();
                Vasya.name = "Vasya";
                Vasya.age = "23";
                Vasya.phonenumber = "+7888888888";
                Vasya.phonename = "Lenovo"
                Person Petya = new Person();
                Scanner in =new Scanner(System.in);
                System.out.print("Input a name");
                Petya.name = in.nextLine();
                System.out.print("Input age");
                Petya.age = in.nextInt();
                System.out.print("Input phonename");
                Petya.phonename = in.nextLine();
                System.out.print("Input a phonenumber");
                Petya.phonenumber = in.nextLine();
                in.close();
//5                
                Vasya.aboutPerson();
                Petya.aboytPerson();
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
                System.out.printf("Имя: %s Возраст: %d Модель телефона: %s Номер телефона: \n ",name,age,phonename, phonenumber);
        }
}
