package com.szu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import javax.transaction.Transactional;

/**
 * Created by hao on 2017/7/18.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRespository girlRespository;

    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRespository.save(girlA);

        Girl girlB=new Girl();
        girlB.setAge(19);
        girlB.setCupSize("BBBBBB");
        girlRespository.save(girlB);
    }

}
