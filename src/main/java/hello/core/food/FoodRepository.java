package hello.core.food;

import java.util.List;
import java.util.Optional;

public interface FoodRepository {
    KoreanFood save(KoreanFood food);
    Optional<KoreanFood> findById(Long id);
    Optional<KoreanFood> findByName(String name);
    List<KoreanFood> findAll();
}
