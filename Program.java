package sample;

public class Program {

    public static void main(String[] args) {

     SmartPhone phoneEn = new SmartPhone("Samsung","Black",1500,"It's new Samsung S22 Ultra Phantom Black");
     SmartPhone phoneTo = new SmartPhone("Iphone","White",0,"It's new Iphone 14ProMax White");


     phoneEn.setColor("Phantom Black"); // Меняем цвет в 1-вой модели телефона на чёрный
     phoneTo.setPrice(1650); // Выставляем цену в 1650 эвро.


     System.out.println(phoneEn.getString()); // Выводим значение на консоль.
     System.out.println(phoneTo.getString()); // Выводим значение на консоль.

    }
}