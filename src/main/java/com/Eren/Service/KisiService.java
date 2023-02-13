package com.Eren.Service;

import com.Eren.Repository.AracRepository;
import com.Eren.Repository.KisiRepository;
import com.Eren.Repository.entity.Arac;
import com.Eren.Repository.entity.Kisi;
import com.Eren.Utility.MyFactoryService;

import java.util.Scanner;

public class KisiService extends MyFactoryService<KisiRepository, Kisi,Long> {
    Scanner scanner;
    public KisiService() {
        super(new KisiRepository());
        this.scanner = new Scanner(System.in);
    }
    public void kisiKaydet(){
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("********** KAYIT EKRANI *************");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Musteri isim soyisim giriniz.");
        String isimSoyisim = scanner.nextLine();
        save(Kisi.builder().isimSoyisim(isimSoyisim).build());
        System.out.println("Kayit basarili....");
    }

    public String getString(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public void ismeGoreMusteriID(String isimsoyisim){
        findAllByColumnNameAndValue("isim-soyisim",isimsoyisim);
    }
}
