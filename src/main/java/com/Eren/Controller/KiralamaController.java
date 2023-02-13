package com.Eren.Controller;

import com.Eren.Service.KiralamaService;

import java.util.Scanner;

public class KiralamaController {

    KiralamaService kiralamaService;
    Scanner scanner;

    public KiralamaController() {
        this.kiralamaService = new KiralamaService();
        this.scanner = new Scanner(System.in);
    }

    public void kiralamaYap(){
        kiralamaService.kiralamaYap();
    }

    public void kiradakiAraclar(){
        kiradakiAraclar();
    }

    public void garajdakiAraclar(){
        garajdakiAraclar();
    }

    public void musteridekiAraclar(){
        musteridekiAraclar();
    }

}
