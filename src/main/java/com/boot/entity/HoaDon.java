package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "HOA_DON")
public class HoaDon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "thoi_gian_lap", nullable = false)
    private Calendar thoiGianLap;

    @Column(name = "trang_thai", nullable = false)
    @Enumerated(EnumType.STRING)
    private TrangThai trangThai;

    @Column(name = "thoi_gian_giao")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id", nullable = false)
    private NguoiDung nguoiDung;
}
