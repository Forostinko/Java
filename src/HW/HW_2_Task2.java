package HW;//Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
//половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
//Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
//Вывести на экран кому сколько пиастров полагается.
//Дополнительное задание со звездочкой
//Попробовать придумать как программа может проверить правильность дележа.

public class HW_2_Task2 {
    public static void main(String[] args) {

//        1 variant:
//        int totalLoot = 500;   // пиастры
//        int crewSize = 25;    // пираты
//
//        int ownerShare = totalLoot / 2;
//        int capitainsShare = (totalLoot - ownerShare) / 2;
//        int commonShare = (totalLoot - ownerShare - capitainsShare) / crewSize;
//
//        int totalDistributed = commonShare + capitainsShare + ownerShare * crewSize;
//
//        System.out.print("пират: ");
//        System.out.println(commonShare);
//        System.out.print("капитану: ");
//        System.out.println(capitainsShare + commonShare);
//        System.out.print("владельцу: ");
//        System.out.println(ownerShare);
//        System.out.print("ITOGO: ");
//        System.out.println(totalDistributed);
//        System.out.print("Ostatok: ");
//        System.out.println(totalLoot - totalDistributed);


//        2 variant:

        int loot = 45 + 100;   // пиастры
        int crewCount = 4;    // пираты

//        owner will get of all loot
        int owner = loot / 2;

//        capitan gets hals of remaining
        int capitan = (loot - owner) / 2;

//        each crew member including capitan gets equal amount of the rest
        int crewEach = (loot - owner - capitan) / (crewCount + 1);
        capitan = capitan + crewEach;

        System.out.println("loot = " + loot);
        System.out.println("owner gets = " + owner / 100.0);
        System.out.println("capitan gets = " + capitan / 100.0);
        System.out.println("each crew member gets =" + crewEach /100.0);
        System.out.println("remainder is = " + (loot - owner - capitan - crewCount + crewEach) / 100.0);

    }
}
