package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chi_tiet")
public class ChiTiet implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private SanPham sanPham;

    @Column(name = "thuoc_tinh", nullable = false)
    private String key;

    @Column(name = "gia_tri", nullable = false)
    private String value;
}
