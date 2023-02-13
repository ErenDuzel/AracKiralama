package com.Eren.Utility;

import com.Eren.Controller.AracController;
import com.Eren.Controller.KiralamaController;
import com.Eren.Controller.KisiController;

import java.util.Scanner;

public class RaporMenu {

    private KiralamaController kiralamaController;

    public RaporMenu() {
        this.kiralamaController = new KiralamaController();
    }

    public void anaMenu(){
        int secim;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*******************************************");
            System.out.println("*******     RENT-A-Car UYGULAMASI    ******");
            System.out.println("*******************************************");
            System.out.println();
            System.out.println("1- Arac Olustur");
            System.out.println("2- Musteri olustur");
            System.out.println("3- Kiralama Yap");
            System.out.println("4- Arac modeline gore arama");
            System.out.println("5- Rapor Menusu");
            System.out.println("0- ÇIKIS YAP");
            System.out.println("Seciniz.....:");
            secim = scanner.nextInt();
            switch (secim){
                case 1: new AracController().aracKaydet();break;
                case 2: new KisiController().kisiKaydet();break;
                case 3: new KiralamaController().kiralamaYap();break;
                case 4: new AracController().aracArama();break;
                case 5: new RaporMenu().raporMenu(); break;
            }
        }while ((secim!=0));
        System.out.println("Bir sonraki seferde gorusmek uzere :)");
    }

    public void raporMenu(){
        int selection;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("**********   RAPOR MENU  ************");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("1- Kirada olan araclar");
        System.out.println("2- Bosta olan araclar");
        System.out.println("3- Herhangi bir musterinin kiraladigi araclar");
        System.out.println("0- ÇIKIS YAP");
        selection = scanner.nextInt();
        switch (selection){
            case 1: kiralamaController.kiradakiAraclar();break;
            case 2: kiralamaController.garajdakiAraclar();break;
            case 3: kiralamaController.musteridekiAraclar();break;
        }
    }while ((selection!=0));
    }

}
