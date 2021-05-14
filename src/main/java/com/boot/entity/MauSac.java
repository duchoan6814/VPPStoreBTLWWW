package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mau_sac")
public class MauSac implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private SanPham sanPham;

    @Column(name = "ten", nullable = false)
    private String ten;
    @Column(name = "ma_mau", nullable = false)
    private String maMau;
}
