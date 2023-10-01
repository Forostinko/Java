package HW;
//Дана строка:
//String s = “Посмотрите как Рите нравится ритм”;
//необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//Для указанной строки ответ будет 6, 15, 29.

public class HW_5_String3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";

        for (int i = 0; i < s.length() - 3; i++) {
//            if (s.substring(i, i + 3).toLowerCase().equals("рит"))
            if (s.substring(i, i + 3).equalsIgnoreCase("рит")) {
                System.out.println(i);
            }
        }

//        s = s.toLowerCase();
//
//        int index = s.indexOf("рит");
//        while (index != -1) {
//            System.out.println(index);
//            index = s.indexOf("рит", index + 1);
//        }
    }
}
