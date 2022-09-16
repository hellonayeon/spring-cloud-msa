package me.hellonayeon.catalogservice.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import me.hellonayeon.catalogservice.entity.CatalogEntity;
import me.hellonayeon.catalogservice.entity.CatalogRepository;
import org.springframework.stereotype.Service;

@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService {

    CatalogRepository catalogRepository;

    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
