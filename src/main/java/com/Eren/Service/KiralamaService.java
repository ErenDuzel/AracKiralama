package com.Eren.Service;

import com.Eren.Repository.KiralamaRepository;
import com.Eren.Repository.entity.Arac;
import com.Eren.Repository.entity.Kiralama;
import com.Eren.Repository.entity.Kisi;
import com.Eren.Utility.MyFactoryService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama,Long> {
    public KiralamaService() {
        super(new KiralamaRepository());
        this.aracService = new AracService();
        this.kisiService = new KisiService();
    }
    AracService aracService;
    KisiService kisiService;

    public String getString(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
    public Long getNumber(){
        Scanner scanner = new Scanner(System.in);
        Long number = scanner.nextLong();
        return number;
    }

    public void kiralamaYap(){
        List<Arac> aracList = aracService.findAll().stream().filter(x->x.getDurum()==0).toList();
        Optional<Arac> arac = null;
//        List<Kisi> kisiList = kisiService.findAll().stream().toList();
       Kisi kisi = null;
        aracList.stream().forEach(x->{
            System.out.println(x.getMarka()+x.getModel());
        });
        System.out.println("Secmek istediginiz id'yi giriniz.");
        arac = aracService.findById(getNumber());
        if(arac.isPresent()){
            arac.get().setDurum(1);
//            aracService.update(arac.get());
            System.out.println("Lutfen musteri ad soyadi giriniz.");
            save(Kiralama.builder().kisi(Kisi.builder().isimSoyisim(getString()).build()).arac(arac.get()).build());
            System.out.println("Basariyla guncellendi");
        }
    }
    public void kiradakiAraclar(){
        List<Arac> kiradakiler = aracService.findAll().stream().filter(x->x.getDurum()==0).toList();
        kiradakiler.stream().forEach(x->{
            System.out.println();
        });
    }
    public void garajdakiAraclar(){
        List<Arac> garaj = aracService.findAll().stream().filter(x->x.getDurum()==1).toList();
        garaj.stream().forEach(x->{
            System.out.println();
        });
    }
    public List<Arac> musteridekiAraclar(){
        System.out.println("Musteri numarasini giriniz...");
        Long numara = getNumber();
        List<Arac> musteridekiAraclar = null;
        kisiService.findById(numara).get().getKiralama().stream().forEach(x->{
            musteridekiAraclar.add(x.getArac());
        });
        return musteridekiAraclar;
    }
}
