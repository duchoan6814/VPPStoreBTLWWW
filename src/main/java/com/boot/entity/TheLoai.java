package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "the_loai")
public class TheLoai implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "ten", nullable = false)
    private String ten;

    @OneToOne(mappedBy = "theLoai")
    private SanPham sanPham;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public TheLoai() {
    }

    public TheLoai(String id, String ten, SanPham sanPham) {
        this.id = id;
        this.ten = ten;
        this.sanPham = sanPham;
    }
}
