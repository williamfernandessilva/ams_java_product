package fatec.product_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.product_backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}

