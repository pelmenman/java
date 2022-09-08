public class HelloWorld {
    public static void main(String[] args) {
        Frog jaba = new Frog("Буе", 20, EyeColor.BLACK);
        jaba.about();

        Frog leg = new Frog("Петруха", EyeColor.RED);
        leg.about();
    }
}

enum EyeColor {
    BLACK, YELLOW, RED;
}

class Frog {
    private String name = "Жаба";
    private static String surname = "Жабич";
    private int age = 5;
    private String cvet = "черный";

    public Frog(String name, int age, EyeColor color) {
        this.name = name;
        this.age = age;

        System.out.println("Вы создали жабу по имени " + name + " " + surname);
        System.out.println("Ей " + age + " лет. У нее " + getColor(color) + " цвет глаз.");
        System.out.println(name + ", поздоровайся!!");
        sayKva();
        System.out.println("\n");
    };

    public Frog(String name, EyeColor color) {
        Frog frog = new Frog(name, age, color);
    };

    public String getColor(EyeColor color) {
        switch (color) {
            case BLACK:
                cvet = "черный";
                break;
            case YELLOW:
                cvet = "желтый";
                break;
            case RED:
                cvet = "красный";
                break;
        }

        return cvet;
    }

    public void about() {
        System.out.println("Вашу жабу зовут  " + name + " " + surname);
        System.out.println("Ей " + age + " лет. У нее " + cvet + " цвет глаз\n");
    }

    public void sayKva() {
        System.out.println(name + ": Кваааа!!!");
    }

    public void changeName(String name) {
        this.name = name;
        System.out.println("Вы поменяли жабе имя. Теперь ее зовут " + name + "\n");
    }
}