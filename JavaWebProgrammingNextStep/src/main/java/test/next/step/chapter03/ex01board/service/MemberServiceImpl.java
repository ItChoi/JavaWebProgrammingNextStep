package test.next.step.chapter03.ex01board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.next.step.chapter03.ex01board.domain.Member;
import test.next.step.chapter03.ex01board.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public void register(Member member) {
		System.out.println("오긴오나?: " + member.getUserId());
		memberMapper.register(member);
	}

	@Override
	public boolean loginTest(Member member) {
		System.out.println("여기오니???zzzzzz");
		int loginCount = memberMapper.loginTest(member);
		System.out.println("여기오니??? : " + loginCount);
		return loginCount > 0 ? true : false;
	}

}
