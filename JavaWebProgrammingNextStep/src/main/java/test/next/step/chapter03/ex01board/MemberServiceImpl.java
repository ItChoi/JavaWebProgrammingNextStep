package test.next.step.chapter03.ex01board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.next.step.chapter03.ex01board.domain.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public void register(Member member) {
		System.out.println("�������?");
		memberMapper.register(member);
	}

}
