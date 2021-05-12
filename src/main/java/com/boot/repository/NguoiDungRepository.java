package com.boot.repository;

import com.boot.entity.User;
import org.springframework.data.repository.CrudRepository;

import com.boot.entity.NguoiDung;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepository extends CrudRepository<NguoiDung, Integer>, NguoiDungRepositoryCustom {

}
