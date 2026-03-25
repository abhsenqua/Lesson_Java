import model.Kotik;

import static model.Kotik.printCountObject;

public class Application {
    public static void main(String[] args) {
        Kotik kotikOne = new Kotik("Adolf", 100, "Royal Canin");
        kotikOne.setMeow("mau-mau");
        kotikOne.printInfo();

        Kotik kotikTwo = new Kotik();
        kotikTwo.setFoodName("Протеин");
        kotikTwo.setTotalSatiety(50);
        kotikTwo.setName("Albert");
        kotikTwo.setMeow("мяу-мяу");

        System.out.println(kotikTwo.getName());

        boolean meowEqualsResult = kotikOne.getMeow().equals(kotikTwo.getMeow());
        System.out.println(meowEqualsResult);
        kotikOne.liveAnotherDay();
        printCountObject();
    }
}