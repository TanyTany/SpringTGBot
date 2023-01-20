package database;


import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Data
@Entity(name = "tg_data") //привязываемся к существующей таблице с готовыми колонками
public class User {

        @Id
        private long id; //BigInt
        private String name; //Text
        private int msg_numb; //Integer

}
