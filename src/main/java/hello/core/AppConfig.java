package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.food.FoodRepository;
import hello.core.food.FoodService;
import hello.core.food.FoodServiceImpl;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {
    private final FoodRepository foodRepository;

    public AppConfig(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    @Bean
    public
    MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        //return new MemberServiceImpl(new MemoryMemberRepository());
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    MemberRepository memberRepository(){
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    FoodService foodService() {
        System.out.println("call AppConfig.foodService");
        return new FoodServiceImpl(foodRepository);
    }

    @Bean
    OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy(); // 사용영역 수정 없이 할인정책 변경
    }
}
