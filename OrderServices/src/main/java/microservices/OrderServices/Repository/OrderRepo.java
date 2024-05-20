package microservices.OrderServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.OrderServices.Entity.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {

}
