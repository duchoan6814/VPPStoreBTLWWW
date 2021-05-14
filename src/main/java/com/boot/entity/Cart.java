package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "gio_hang")
public class Cart implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private NguoiDung nguoiDung;

    @OneToMany(mappedBy = "cart")
    private Set<ChiTietHoaDon> chiTietHoaDons;

}
