package migueldelgado.user.infra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import migueldelgado.user.infra.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, Long>{
    
}
