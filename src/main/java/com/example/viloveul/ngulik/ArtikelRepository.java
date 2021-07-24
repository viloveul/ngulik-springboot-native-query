package com.example.viloveul.ngulik;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Fajrul Akbar Zuhdi 2021-07-21
 */
@Repository
public interface ArtikelRepository extends JpaRepository<Artikel, Long> {

    @Query(
            value = "select kategori.id, kategori.label, count(distinct pivot.id_artikel) as total " +
                    "from tbl_kategori kategori " +
                    "left join tbl_artikel_kategori pivot on pivot.id_kategori = kategori.id and " +
                        "exists( " +
                            "select artikel.id from tbl_artikel artikel where artikel.id = pivot.id_artikel and " +
                            "(artikel.status = :#{#filter.getStatus()} or :#{#filter.getStatus()} is null) and " +
                            "(artikel.isi like concat('%', :#{#filter.getKeyword()}, '%') or :#{#filter.getKeyword()} is null) " +
                        ") " +
                    "group by kategori.id, kategori.label ",
            nativeQuery = true,
            countQuery = "select count(*) from tbl_kategori "
    )
    Page<ArtikelStatistik> getStatistik(@Param("filter") ArtikelStatistikFilter filter, Pageable pageable);
}
