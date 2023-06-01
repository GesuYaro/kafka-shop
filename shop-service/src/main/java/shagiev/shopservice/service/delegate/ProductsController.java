package shagiev.shopservice.service.delegate;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import shagiev.shopservice.openapi.api.ProductsApiDelegate;
import shagiev.shopservice.openapi.model.ProductDto;

import java.util.UUID;

@Service
public class ProductsController implements ProductsApiDelegate {

    @Override
    public ResponseEntity<ProductDto> listProducts() {
        return new ResponseEntity<ProductDto>(new ProductDto(UUID.randomUUID(), "name", UUID.randomUUID(), 200.0), HttpStatusCode.valueOf(200));
    }
}
