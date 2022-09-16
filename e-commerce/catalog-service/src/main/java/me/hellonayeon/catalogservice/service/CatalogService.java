package me.hellonayeon.catalogservice.service;

import me.hellonayeon.catalogservice.entity.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();

}
