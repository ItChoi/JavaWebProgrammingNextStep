package test.next.step.chapter03.ex01board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import test.next.step.chapter03.ex01board.domain.Member;

@RequestMapping("/chapter03/board")
@Controller
public class BoardController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/list")
	public void boardList() {
		System.out.println("�ٸ���Ʈ");
	}
	
	@GetMapping("/posts")
	public String boardPosts() {
		System.out.println("get posts");
		return "/chapter03/board/posts";
	}
	@GetMapping("/register")
	public String boardRegister(@ModelAttribute("member") Member member) {
		System.out.println("get resgister");
		return "/chapter03/board/form";
	}
	
	@PostMapping("/register")
	public String boardRegisterPost(Member member) {
		System.out.println("member: " + member.getUserId());
		
		memberService.register(member);
		
		System.out.println("post register ����");
		
		return "list";
	}
	
	
	@GetMapping("/login")
	public String boardLogin() {
		
		return "/chapter03/board/login";
	}
	@GetMapping("/logout")
	public void boardLogout() {
		
	}
	@GetMapping("/info")
	public String boardInfo() {
		
		return "/chapter03/board/form";
	}
	
	
	
	
}
