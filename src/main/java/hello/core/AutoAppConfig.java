package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import hello.core.food.FoodController;
import hello.core.food.FoodServiceImpl;
import hello.core.food.MongoFoodRepository;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
    //basePackages = "hello.core.member",
    //basePackageClasses = AutoAppConfig.class,
    excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = FoodController.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = FoodServiceImpl.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MongoFoodRepository.class)
    }
)
public class AutoAppConfig {
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
