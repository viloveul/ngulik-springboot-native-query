package com.example.viloveul.ngulik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fajrul Akbar Zuhdi 2021-07-21
 */
@Service
public class ArtikelServiceImpl implements ArtikelService {

    @Autowired
    private ArtikelRepository artikelRepository;

    @Override
    public Page<Artikel> loadAll(Pageable pageable) {
        return this.artikelRepository.findAll(pageable);
    }

    @Override
    public Page<ArtikelStatistik> getStatistik(ArtikelStatistikFilter filter, Pageable pageable) {
        return this.artikelRepository.getStatistik(filter, pageable);
    }
}
