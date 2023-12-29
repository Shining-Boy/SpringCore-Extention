package hello.core.food;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "KoreanFood")
@Getter
@Setter
@NoArgsConstructor
public class KoreanFood {
    @Id
    private String id;
    private String name;
    private String calorie;

    public KoreanFood(String id, String name, String calorie) {
        super();
        this.id = id;
        this.name = name;
        this.calorie = calorie;
    }
}
