import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Laptop l1 = new Laptop(12365425, 8 ,500, "Asus","Windows 7","черный");
        Laptop l2 = new Laptop(12323654, 16 ,250, "Acer","Windows 10","черный");
        Laptop l3 = new Laptop(45685231, 16 ,500, "HP","Windows 11","черный");
        Laptop l4 = new Laptop(12365854, 8 ,500, "Asus","Windows 7","черный");
        Laptop l5 = new Laptop(12365452, 4 ,500, "Lenovo","Windows 7","черный");

    var laptops = new HashSet<Laptop>(Arrays.asList(l1, l2, l3, l4, l5));
        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);
        laptops.add(l4);
        laptops.add(l5);
        System.out.println("1 - Объем оперативной памяти");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Модель ноутбука");
                System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        int val = input.nextInt();
if(val == 1) {
    System.out.print("Какой объем оперативной памяти вам нужен? ");
    int val1 = input.nextInt();
    if (val1 <= 4) {
        System.out.println(l5);
    } else if (4 < val1 && val1 < 8) {
        System.out.println(l1);
        System.out.println(l4);
    } else if (val1 > 8 && val1 <= 16 || val1 > 16) {
        System.out.println(l2);
        System.out.println(l3);
    }
    input.close();
} else if (val == 2) {
    System.out.print("Какой объем жесткого диска вам нужен? ");
    int val3 = input.nextInt();
    if(val3 <= 250 ){
        System.out.println(l2);
    } else if (val3 > 250 && val3 <= 500 || val3 > 500) {
        System.out.println(l1);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
    }
    input.close();
} else if (val == 3) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Asus, Acer, HP, Lenovo");
    System.out.print("Какая модель ноутбука вам нужна? ");
    String val4 = input1.nextLine();
    if(val4.equals("Asus")){
        System.out.println(l1);
    } else if (val4.equals("Acer")) {
        System.out.println(l2);
    } else if (val4.equals("HP")) {
        System.out.println(l3);
    } else if (val4.equals("Lenovo")) {
        System.out.println(l5);
    }else System.out.println("таких моделей нет");
    input1.close();
}

    }
}
