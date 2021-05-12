package com.boot.repository;

import com.boot.entity.NguoiDung;

public interface NguoiDungRepositoryCustom {
    NguoiDung getNguoiDungByUserId(int userId);
}
