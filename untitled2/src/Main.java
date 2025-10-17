public class Main {
    public static void main(String[] args) {
        String phone = "90-68-90+56 76";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
              phone = "7" + phone;
        } else if (phone.length() > 11){
                throw new RuntimeException("Телефон длинный");
        } else if (phone.length() < 10) {
                throw new RuntimeException("Телефон короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != 7){
            throw new RuntimeException("Тут шпиён!!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79068905676";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача!!");
        }
        String str1 = new String("Привет");
        String str2 = new String("Привет");

        if (str1 == str2) {
            System.out.println("Ссылки совпадают");
        } else {
            System.out.println("Ссылки разные");
        }

        if (str1.equals(str2)) {
            System.out.println("Содержимое совпадает");
        } else {
            System.out.println("Содержимое разное");
        }


    }
}

