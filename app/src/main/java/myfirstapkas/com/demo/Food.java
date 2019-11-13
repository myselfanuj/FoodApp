package myfirstapkas.com.demo;

public class Food {
    private String name;
    private String description;


   public static final Food[] foods = {
            new Food("Pizza","This is Crust Pizza with extra cheese"),
             new Food("Burger","Veg Burger with healthy Staff"),
              new Food("Sandwich","whole wheat sandwich"),

    };
    public Food(String name,String description)
        {
            this.name = description;
        }
        public  String getname(){
        return name ;
        }
        public String getDescription(){
        return  description;
        }
        public String toString(){
        return this.name;
        }

}
