package model;

public class Kotik {

   private String name = "Adolf";
   private int totalSatiety = 100;
   final private int satietyPlay = 20;
   final private int satietySleep = 25;
   final private int satietyMeow = 5;
   final private int satietyChaseMouse = 30;
   final private int satietyHunter = 35;
   private static int countObject;
   private String meow;
   private String foodName = "Sheba";

   public Kotik(String name, int totalSatiety, String foodName) {
       this.name = name;
       this.totalSatiety = totalSatiety;
       this.foodName = foodName;
       countObject ++;
   }

   public Kotik() {
       countObject ++;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getName() {
        return name;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setTotalSatiety(int totalSatiety) {
        this.totalSatiety = totalSatiety;
    }

    public void play() {
        totalSatiety -= satietyPlay;
        action(" играет");
    }

public void meow() {
    totalSatiety -= satietyMeow;
    action(" мяукает");
}

public void chaseMouse() {
    totalSatiety -= satietyChaseMouse;
    action(" ловит мышку");
}

public void sleep() {
    totalSatiety -= satietySleep;
    action(" спит");
}

    public void eat(int totalSatiety) {
       this.totalSatiety += totalSatiety;
        satietyLevel();
        System.out.printf("%s ест %s\n", name, foodName);
        satiety();
    }

    public void eat(int totalSatiety, String foodName) {
       this.totalSatiety += totalSatiety;
       this.foodName = foodName;
        satietyLevel();
        System.out.printf("%s ест %s\n", name, foodName);
        satiety();
    }

    public void eat() {
        eat(40, "Royal Canin");
    }

    public void hunter() {
       totalSatiety -= satietyHunter;
       action(" охотится");
    }

    public void action(String action) {
        System.out.println(name + action);
    }

    public void hunger() {
           System.out.println("Покорми " + name);
    }

    public void satietyLevel() {
        if (totalSatiety >= 100){
            totalSatiety = 100;
            System.out.println(name + " полон энергии");
        }
    }

    public void liveAnotherDay() {
       for (int i = 0; i < 24; i++){
           int callMethodRandom = (int)(Math.random() * 5) + 1;
           switch (callMethodRandom){
               case 1:
                   if (totalSatiety < satietyHunter) {
                       hunger();
                       eat();
                   } else {
                       hunter();
                   }
                   break;
               case 2:
                   if (totalSatiety < satietySleep) {
                       hunger();
                       eat();
                   } else {
                       sleep();
                   }
                   break;
               case 3:
                   if (totalSatiety < satietyChaseMouse) {
                       hunger();
                       eat();
                   } else {
                       chaseMouse();
                   }
                   break;
               case 4:
                   if (totalSatiety < satietyMeow) {
                       hunger();
                       eat();
                   } else {
                       meow();
                   }

                   break;
               default:
                   if (totalSatiety < satietyPlay) {
                       hunger();
                       eat();
                   } else {
                       play();
                   }
           }
       }
    }

    public void satiety() {
        System.out.printf("Уровень сытости: %s\n", totalSatiety);
    }

    public void printInfo() {
        System.out.printf("Имя: %s, сытость: %d, еда: %s\n", name, totalSatiety, foodName);
    }

    public static void printCountObject() {
        System.out.printf("Создано объектов экземпляра класса Kotik: %d\n", countObject);
    }
}
