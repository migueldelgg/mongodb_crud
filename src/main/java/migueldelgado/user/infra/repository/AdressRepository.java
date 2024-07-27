package migueldelgado.user.infra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import migueldelgado.user.infra.entity.AdressEntity;

public interface AdressRepository extends MongoRepository<AdressEntity, Long>{

    
}
