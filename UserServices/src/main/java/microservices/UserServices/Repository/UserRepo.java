package microservices.UserServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.UserServices.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
