package test.next.step.chapter03.ex01board.mapper;

import test.next.step.chapter03.ex01board.domain.Member;

public interface MemberMapper {
	void register(Member member);
	int loginTest(Member member);
}
