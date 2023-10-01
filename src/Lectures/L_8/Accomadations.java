package Lectures.L_8;

public class Accomadations {
    Housing[] housings;

    public int totalCapacity() {
        int sum = 0;
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];  //Создаём временную переменную и присваеваем очередной элемент.
                                  // На 0 проходе это будет Tourist
                                  // На 1м проходе будет Hilton
            sum += h.getCapacity();
        }
        return sum;
    }
    //1)print for all hotels
    public void printAll() {
        System.out.println("All housing:");
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            System.out.println(h.getPrintable());
        }
    }

    //2)find people
    public Housing findForGroup(int groupSize) {
        for (int i = 0; i < housings.length; i++) {
            Housing h = housings[i];
            if (h.getCapacity() >= groupSize) {
                return h;
            }
        }
        return null;  // it's not hotel, not exist  -> not result

    }

}
