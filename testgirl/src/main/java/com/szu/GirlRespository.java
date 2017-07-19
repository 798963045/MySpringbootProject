package com.szu;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by hao on 2017/7/18.
 */
public interface GirlRespository extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);
}
