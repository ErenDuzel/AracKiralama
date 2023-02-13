package com.Eren.Repository;

import com.Eren.Repository.entity.Arac;
import com.Eren.Utility.MyFactoryRepository;

public class AracRepository extends MyFactoryRepository<Arac,Long> {
    public AracRepository() {
        super(new Arac());
    }
}
