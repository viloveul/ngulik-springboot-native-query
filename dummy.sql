-- tbl_kategori definition

CREATE TABLE `tbl_kategori` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `label` varchar(100) NOT NULL,
  `tanggal` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


-- tbl_artikel definition

CREATE TABLE `tbl_artikel` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `judul` varchar(100) NOT NULL,
  `isi` varchar(100) NOT NULL,
  `tanggal` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;


-- tbl_artikel_kategori definition

CREATE TABLE `tbl_artikel_kategori` (
  `id_artikel` bigint(20) unsigned NOT NULL,
  `id_kategori` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id_artikel`,`id_kategori`),
  KEY `tbl_artikel_kategori_FK` (`id_kategori`),
  CONSTRAINT `tbl_artikel_kategori_FK` FOREIGN KEY (`id_kategori`) REFERENCES `tbl_kategori` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbl_artikel_kategori_FK_1` FOREIGN KEY (`id_artikel`) REFERENCES `tbl_artikel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;