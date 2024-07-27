package migueldelgado.user.infra.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;


@Data
@Document(collection= "user_entity")
@Builder
public class UserEntity {
    
    @Id
    private String id;

    private String name; 

    private String email;

    private String documento; 

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    

}
