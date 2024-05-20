package microservices.UserServices.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import microservices.UserServices.Entity.UserEntity;
import microservices.UserServices.Model.UserModel;
import microservices.UserServices.Repository.UserRepo;

@Service
public class UserServices {
	@Autowired
	UserRepo userRepo;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	public void createUser(UserModel userModel) {
		UserEntity userEntity = modelMapper.map(userModel, UserEntity.class);
		userRepo.save(userEntity);
		kafkaTemplate.send("createUser",userEntity);
	}
	public int tongUser() {
		kafkaTemplate.send("tongUser",userRepo.findAll().size());
		return userRepo.findAll().size();
	}
}
