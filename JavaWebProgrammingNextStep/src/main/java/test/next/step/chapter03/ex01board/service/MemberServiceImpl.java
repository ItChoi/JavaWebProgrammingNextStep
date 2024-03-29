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
		memberMapper.register(member);
	}

	@Override
	public boolean loginTest(Member member) {
		int loginCount = memberMapper.loginTest(member);
		return loginCount > 0 ? true : false;
	}

}
