package sample;

// Создаём класс телефон и его характеристики.
public class SmartPhone {
    private String name; // Название модели.
    private String color; // Цвет.
    private int price; // Цена в эвро.
    private String description; // Описание.

    public SmartPhone(String name, String color, int price, String description){
      super();
      this.name = name;
      this.color = color;
      this.price = price;
      this.description = description;
    }

    public SmartPhone(){
        super();
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public  void setDescription(String description){
        this.description = description;
    }

    public String getString(){
        return "Phone Name = " + name + " Color = " + color + " Price = " + price + "EUR" + " Description = " + description;
    }
}

