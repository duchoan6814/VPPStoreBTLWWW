package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "san_pham")
public class SanPham implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "ten", nullable = false)
    private String ten;

    @Column(name = "thuong_hieu", nullable = true)
    private String thuongHieu;

    @Column(name = "gia", nullable = false)
    private double gia;

    @Column(name = "mo_ta")
    private String moTa;

    @ElementCollection
    @CollectionTable(name = "hinh_anh", joinColumns = @JoinColumn(name = "id"))
    private Set<String> listHinh;

    @OneToMany(mappedBy = "sanPham")
    private Set<ChiTiet> chiTiets;

    @OneToMany(mappedBy = "sanPham")
    private Set<MauSac> mauSacs;

    @OneToOne
    @JoinColumn(name = "the_loai_id", nullable = false)
    private TheLoai theLoai;

    @Column(name = "so_luong_ton", nullable = false)
    private int soLuongTon;

    @OneToMany(mappedBy = "sanPham")
    private Set<ChiTietHoaDon> chiTietHoaDons;
}
