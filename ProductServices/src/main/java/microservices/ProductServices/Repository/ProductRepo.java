package microservices.ProductServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.ProductServices.Entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
