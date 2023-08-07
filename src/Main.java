import java.util.Scanner;
public class Main {
    private static int count = 0;
    public static void main (String[] args){
        method();

    }
    public static  String method() {

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
        String mainNum = scan.next();
        if (mainNum.equals("on")) {
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
            String pultNum = scan.next();
            if (pultNum.equals("menu")) {
                System.out.println("~~~~~~~~~~~All channels, number of channels 8~~~~~~~~~~\n" +
                        "-----------------------------\n" +
                        "channel name             KTRK\n" +
                        "                             \n" +
                        "   channel number          1 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
                        "channel name       Ala Too 24\n" +
                        "                             \n" +
                        "   channel number          2 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
                        "channel name         Balastan\n" +
                        "                             \n" +
                        "   channel number          3 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
                        "channel name             ELTR\n" +
                        "                             \n" +
                        "   channel number          4 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
                        "channel name       KTRK Sport\n" +
                        "                             \n" +
                        "   channel number          5 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
                        "channel name        Madaniyat\n" +
                        "                             \n" +
                        "   channel number          6 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
                        "channel name           Muzyka\n" +
                        "                             \n" +
                        "   channel number          7 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
                        "channel name              NTS\n" +
                        "                             \n" +
                        "   channel number          8 \n" +
                        "                             \n" +
                        "-----------------------------\n" +
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
                int menuNum = scan.nextInt();
                if (menuNum == 1) {
                    System.out.println(indeksKan[1]);
                    count=1;
                }else if (menuNum==0){
                    count++;

                    System.out.println(indeksKan[count]);
                }
                if (menuNum == 2) {
                    System.out.println(indeksKan[2]);
                    count =2;
                }else if (menuNum==0){
                    count++;

                    System.out.println(indeksKan[count]);
                }
                if (menuNum == 3) {
                    System.out.println(indeksKan[3]);
                    count = 3;
                }else if (menuNum==0){
                    count++;

                    System.out.println(indeksKan[count]);
                }
                if (menuNum == 4) {
                    System.out.println(indeksKan[4]);
                    count=4;
                }else if (menuNum==0){
                    count++;

                    System.out.println(indeksKan[count]);
                }
                if (menuNum == 5) {
                    System.out.println(indeksKan[5]);
                    count=5;
                }else if (menuNum==0){
                    count++;

                    System.out.println(indeksKan[count]);
                }
                if (menuNum == 6) {
                    System.out.println(indeksKan[6]);
                    count=6;
                }else if (menuNum==0){
                    count++;

                    System.out.println(indeksKan[count]);
                }
                if (menuNum == 7) {
                    System.out.println(indeksKan[7]);
                    count=7;
                }else if (menuNum==0){
                    count++;

                    System.out.println(indeksKan[count]);
                }
                if (menuNum == 8) {
                    System.out.println(indeksKan[8]);

                }else if (menuNum==0){
                    count++;
                    System.out.println(indeksKan[count]);
                }





            }else if(pultNum.equals("off")){
                System.exit(0);
            } else System.out.println(" Error ");


        }else if(mainNum.equals("off")){
            System.exit(0);
        }


        return method();
    }
}
