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
}
