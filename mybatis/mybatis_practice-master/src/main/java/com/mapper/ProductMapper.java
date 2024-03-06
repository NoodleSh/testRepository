package com.mapper;

import com.management.product.model.dto.ProductDTO;

import java.util.List;

public interface ProductMapper {

    List<ProductDTO> selectAllProductList();
}
