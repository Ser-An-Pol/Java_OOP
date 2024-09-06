//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Полынский С.А. Группа (не нашел, где указана)



Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
заложенную в программе.
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */
public class Main {
    public static void main(String[] args) {
        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();
        System.out.println(hotDrinksMachine.getMoneyBank());
        System.out.println(hotDrinksMachine.getProduct("Espresso", 70, 80));
        System.out.println(hotDrinksMachine.getMoneyBank());
    }
}