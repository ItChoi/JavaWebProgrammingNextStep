package test.next.step.chapter03.ex01board.service;

import java.util.List;

import test.next.step.chapter03.ex01board.domain.Board;
import test.next.step.chapter03.ex01board.domain.Member;

public interface MemberService {
	public void register(Member member);
	public boolean loginTest(Member member);
}
