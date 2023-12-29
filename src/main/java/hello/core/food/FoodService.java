package hello.core.food;

import java.util.Optional;

public interface FoodService {
    void register(KoreanFood food);
    Optional<KoreanFood> find(Long foodId);
}