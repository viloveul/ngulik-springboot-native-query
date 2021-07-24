package com.example.viloveul.ngulik;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Fajrul Akbar Zuhdi 2021-07-25
 */
public interface ArtikelStatistik {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.label}")
    String getLabel();

    @Value("#{target.total}")
    Long getTotal();
}
