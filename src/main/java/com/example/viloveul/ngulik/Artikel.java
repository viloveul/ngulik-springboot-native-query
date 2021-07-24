package com.example.viloveul.ngulik;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Fajrul Akbar Zuhdi 2021-07-21
 */
@Getter
@Setter
@Entity
@Table(name = "tbl_artikel")
@NoArgsConstructor
public class Artikel implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "judul")
    private String judul;

    @Column(name = "isi")
    private String isi;

    @Column(name = "tanggal")
    private Date tanggal;
}
