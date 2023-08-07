import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static int count = 0;
    public static void main (String[] args){
        method();

    }
    public static  String method() {
        String[] indeksKan= new String[]{"Welcome to the Samsung SMART TV ",

                "+--------------------------------------------+\n" +
                        "  channel name                           KTRK \n" +
                        "                                              \n" +
                        "channel number        1                       \n" +
                        "                                              \n" +
                        "+---------------------------------------------+",
                "+--------------------------------------------+\n" +
                        "  channel name                     Ala Too 24 \n" +
                        "                                              \n" +
                        "channel number        2                       \n" +
                        "                                              \n" +
                        "+---------------------------------------------+",


                "+--------------------------------------------+\n" +
                        "  channel name                       Balastan \n" +
                        "                                              \n" +
                        "channel number        3                       \n" +
                        "                                              \n" +
                        "+---------------------------------------------+",

                "+--------------------------------------------+\n" +
                        "  channel name                           ELTR \n" +
                        "                                              \n" +
                        "channel number        4                       \n" +
                        "                                              \n" +
                        "+---------------------------------------------+",

                "+--------------------------------------------+\n" +
                        "  channel name                     KTRK Sport \n" +
                        "                                              \n" +
                        "channel number        5                       \n" +
                        "                                              \n" +
                        "+---------------------------------------------+",

                "+--------------------------------------------+\n" +
                        "  channel name                      Madaniyat \n" +
                        "                                              \n" +
                        "channel number         6                      \n" +
                        "                                              \n" +
                        "+---------------------------------------------+",
                "+--------------------------------------------+\n" +
                        "  channel name                         Muzyka \n" +
                        "                                              \n" +
                        "channel number        7                       \n" +
                        "                                              \n" +
                        "+---------------------------------------------+",

                "+--------------------------------------------+\n" +
                        "  channel name                             NTS\n" +
                        "                                              \n" +
                        "channel number        8                       \n" +
                        "                                              \n" +
                        "+---------------------------------------------+"};

        System.out.println("              TV  пульт         \n" +
                "+-------------------------------------+\n" +
                "|      off                   on       |\n" +
                "|        <-back  (menu)  next->       |\n" +
                "|         1      2     3     4        |\n" +
                "+-------------------------------------|\n" +
                "Телевизорду куйгузуу учун 'on' созун жазыныз\n" +
                "Телевизорду очуруу учун 'off' созун жазыныз \n" +
                "Менюга кируу учун 'menu' созун жазыныз \n" +
                "Каалаган каналга отуу учун каналдын номерин жазыныз\n" +
                "Кийинки канлага отуу учун 'next' созун жазыныз\n" +
                "Арткы каналга отуу учун 'back' созун жазыныз\n");


        Scanner scan = new Scanner(System.in);
        String mainOn = scan.next();

        if (mainOn.equals("on")) {
            System.out.println(
                    "+-------------------------------------+\n" +
                            "          WELCOME TO \n" +
                            "       SAMSUNG SMART TV   \n" +
                            "               TV  пульт               \n" +
                            "+-------------------------------------+\n" +
                            "|      off                   on       |\n" +
                            "|        <-back  (menu)  next->       |\n" +
                            "|         1      2     3     4        |\n" +
                            "+-------------------------------------|\n" +
                            "Телевизорду куйгузуу учун 'on' созун жазыныз\n" +
                            "Телевизорду очуруу учун 'off' созун жазыныз \n" +
                            "Менюга кируу учун 'menu' созун жазыныз \n" +
                            "Каалаган каналга отуу учун каналдын номерин жазыныз\n" +
                            "Кийинки канлага отуу учун 'next' созун жазыныз\n" +
                            "Арткы каналга отуу учун 'back' созун жазыныз\n");
        }else if(mainOn.equals("off")){
            System.exit(0);
        }

            String mainMenu = scan.next();
            if (mainMenu.equals("menu")) {
                for (int i = 0; i < indeksKan.length; i++) {
                    System.out.println(indeksKan[i]);
                }
            } else if(mainMenu.equals("off")){
            System.exit(0);
                } else System.out.println(" Error ");


            String mainNum = scan.next();
             if (mainNum.equals(1) ) {
            System.out.println(indeksKan[1]);
            count = 1;
            }else if (mainNum.equals(2)) {
                    System.out.println(indeksKan[2]);
                    count = 2;
            }else if (mainNum.equals(3)) {
                System.out.println(indeksKan[3]);
                count = 3;
            }else if (mainNum.equals(4)) {
                System.out.println(indeksKan[4]);
                count = 4;
            }else if (mainNum.equals(5)) {
                System.out.println(indeksKan[5]);
                count = 5;
            }else if (mainNum.equals(6)) {
                System.out.println(indeksKan[6]);
                count = 6;
            }else if (mainNum.equals(7)) {
                System.out.println(indeksKan[7]);
                count = 7;
            }else if (mainNum.equals(8)) {
                System.out.println(indeksKan[8]);

            }else if (mainNum.equals("next")) {
                count = (count + 1) % indeksKan.length;
                System.out.println("Switching to channel: " + indeksKan[count]);
                method();
             }


       return method();




    }
}

