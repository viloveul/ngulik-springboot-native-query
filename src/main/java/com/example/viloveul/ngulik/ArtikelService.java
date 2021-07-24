package com.example.viloveul.ngulik;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fajrul Akbar Zuhdi 2021-07-21
 */
@Service
public interface ArtikelService {

    Page<Artikel> loadAll(Pageable pageable);

    Page<ArtikelStatistik> getStatistik(ArtikelStatistikFilter filter, Pageable pageable);

}
