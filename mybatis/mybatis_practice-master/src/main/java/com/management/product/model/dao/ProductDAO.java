package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public interface ProductDAO {


    static int insertProduct(SqlSession sqlSession, ProductDTO product) {
        return  sqlSession.insert("MenuMapper,insertProduct"); // maaper.xml생성해서 쿼리문 작성하기
    }

    List<ProductDTO> selectAllProductList(SqlSession sqlSession);

    List<ProductDTO> selectProductByCondition(SqlSession sqlSession, SearchCondition searchCondition);

    int deleteProduct(SqlSession sqlSession, Map<String, String> parameter);

    int updateProduct(SqlSession sqlSession, ProductDTO product);

    // * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.

}
