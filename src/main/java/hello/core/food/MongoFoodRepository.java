package hello.core.food;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoFoodRepository extends MongoRepository<KoreanFood, String>, FoodRepository {
    
}
