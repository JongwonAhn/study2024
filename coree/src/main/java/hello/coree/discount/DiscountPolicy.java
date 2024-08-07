package hello.coree.discount;

import hello.coree.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
