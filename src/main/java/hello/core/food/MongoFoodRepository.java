package hello.core.food;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoFoodRepository extends MongoRepository<KoreanFood, String>, FoodRepository {
    
}
