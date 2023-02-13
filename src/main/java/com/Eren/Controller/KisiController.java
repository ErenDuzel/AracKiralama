package com.Eren.Controller;

import com.Eren.Repository.entity.Arac;
import com.Eren.Repository.entity.Kisi;
import com.Eren.Service.AracService;
import com.Eren.Service.KisiService;

import java.util.Scanner;

public class KisiController {

    private KisiService kisiService;
    private Scanner scanner;
    public KisiController() {
        this.scanner = new Scanner(System.in);
        this.kisiService = new KisiService();
    }

    public void kisiKaydet(){
       kisiService.kisiKaydet();
    }

}
