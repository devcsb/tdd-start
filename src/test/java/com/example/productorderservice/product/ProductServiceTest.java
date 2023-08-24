package com.example.productorderservice.product;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductServiceTest {

    private ProductService productService;

    @Test
    void 상품조회() throws Exception {
        //상품등록
        productService.addProduct(ProductSteps.상품등록요청_생성());
        final long productId = 1L;

        //상품을 조회
        final GetProductResponse response = productService.getProduct(productId);

        //상품의 응답을 검증
        assertThat(response).isNotNull();
    }
}