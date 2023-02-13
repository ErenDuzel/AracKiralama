package com.Eren.Service;

import com.Eren.Repository.AracRepository;
import com.Eren.Repository.entity.Arac;
import com.Eren.Utility.MyFactoryService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AracService extends MyFactoryService<AracRepository, Arac,Long> {
    Scanner scanner;
    public AracService() {
        super(new AracRepository());
        this.scanner = new Scanner(System.in);

    }

    public void aracKaydet(){
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("********** KAYIT EKRANI *************");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("Arac markasi giriniz");
        String marka = scanner.nextLine();
        System.out.println("Arac modeli giriniz");
        String model = scanner.nextLine();
        save(Arac.builder().marka(marka).model(model).build());
        System.out.println("Kayit basarili....");
    }
    public String getString(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public Optional<Arac> aracArama(){
        System.out.println("Lutfen arac modelini giriniz");
        String model=getString();
        List<Arac> list = findAllByColumnNameAndValue("model",model);
        if(list.size()>0){
//            System.out.println(Optional.of(list.get(0)));
            return Optional.of(list.get(0));
        }else{
            return Optional.empty();
        }
    }
}
