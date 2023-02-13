package com.Eren.Repository;

import com.Eren.Repository.entity.Kiralama;
import com.Eren.Utility.MyFactoryRepository;

public class KiralamaRepository extends MyFactoryRepository<Kiralama,Long> {
    public KiralamaRepository() {
        super(new Kiralama());
    }
}
