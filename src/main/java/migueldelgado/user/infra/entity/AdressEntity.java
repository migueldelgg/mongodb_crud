package migueldelgado.user.infra.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collection= "adress_entity")
@Builder
public class AdressEntity {

    @Id
    private String id;
    private Long userId;
    private String rua;
    private Long numero; 
    private String bairro; 
    private String complemento; 
    private String cidade;
    private String cep;
}
