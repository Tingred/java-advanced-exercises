package anonymous;

import java.util.Scanner;

public class MenuDemo {

    static Scanner scanner = new Scanner(System.in);
    static int var1;
    static int var2;
    public static void main(String[] args) {

        MenuItem loadItem = new MenuItem("Wczytaj pierwszą zmienną", 1);
        MenuItem loadItem2 = new MenuItem("Wczytaj drugą zmienną", 2);
        MenuItem calcItem = new MenuItem("Oblicz sumę zmiennych", 3);
        MenuItem endItem = new MenuItem("Koniec", 0);

        CallBack loadVar1CallBack =new CallBack() {
            @Override
            public void aciton() {
                System.out.println("Podaj liczbę pierwszą");
                var1 =scanner.nextInt();
            }
        };
        loadItem.setCallBack(loadVar1CallBack);

        CallBack loadVar2CallBack = new CallBack() {
            @Override
            public void aciton() {
                System.out.println("Podaj liczbę drugą");
                var2 =scanner.nextInt();
            }
        };
        loadItem2.setCallBack(loadVar2CallBack);

        CallBack addVarsCallBack = new CallBack() {
            @Override
            public void aciton() {
                System.out.println("Suma obu liczb: "+ (var1+var2));
            }
        };
        calcItem.setCallBack(addVarsCallBack);

        CallBack endCallBack = new CallBack() {
            @Override
            public void aciton() {
                System.exit(0);
            }
        };
        endItem.setCallBack(endCallBack);

        Menu menu = new Menu(new MenuItem[]{loadItem, loadItem2, calcItem, endItem});



  /*      Menu menu = new Menu(new MenuItem[]{
                new MenuItem("Polecenie 1", 1),
                new MenuItem("Polecenie 2", 2),
                new MenuItem("Koniec", 0)
        }
        );
        */
        while (true) {
            menu.print();
            int itemNumber = scanner.nextInt();
            menu.process(itemNumber);

        }
    }
}
