package com.Eren.Repository;

import com.Eren.Repository.entity.Kiralama;
import com.Eren.Repository.entity.Kisi;
import com.Eren.Utility.MyFactoryRepository;

public class KisiRepository extends MyFactoryRepository<Kisi,Long> {
    public KisiRepository() {
        super(new Kisi());
    }
}
