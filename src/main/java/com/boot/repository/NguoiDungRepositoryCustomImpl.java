package com.boot.repository;

import com.boot.entity.NguoiDung;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class NguoiDungRepositoryCustomImpl implements NguoiDungRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public NguoiDung getNguoiDungByUserId(int userId) {
        NguoiDung nguoiDung = (NguoiDung) entityManager.createNativeQuery("Select * from NguoiDung where user_id = "+userId, NguoiDung.class);
        return nguoiDung;
    }
}
