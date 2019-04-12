package test.next.step.chapter03.ex01board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import test.next.step.chapter03.ex01board.domain.Board;
import test.next.step.chapter03.ex01board.domain.Member;
import test.next.step.chapter03.ex01board.service.MemberService;

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
	public String boardPosts(Model model) {
		
		List<Board> boardList = memberService.getBoardList();
		
		model.addAttribute("boardList", boardList);
		
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
		
		System.out.println("post register ����zz");
		
		return "redirect:list";
	}
	
	
	@GetMapping("/login")
	public String boardLogin(HttpServletRequest req, Model model, String babo) {
		
		System.out.println("babo::: " + babo);
		
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("userId");
		
		System.out.println("�α��� �� userId: " + userId);
		
		model.addAttribute("userId", userId);
		
		return "/chapter03/board/login";
	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> boardLoginPost(Member member, HttpServletRequest request) {

		boolean loginTest = false;
		
		// �α��� ����
		loginTest = memberService.loginTest(member);
		
		if (loginTest) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", member.getUserId());
			System.out.println("�α��� ���� ���� ���!");
		}
			
		System.out.println("loginTest: " + loginTest);
		return new ResponseEntity<>(loginTest, HttpStatus.OK);
	}
	
	
	@GetMapping("/logout")
	public String boardLogout(HttpServletRequest req, Model model) {
		
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("userId");
		
		if (userId != null) {
			session.invalidate();
		} else {
			model.addAttribute("babo", "�α��� ���ϼ��ݾƿ�.");
		}
		
		return "redirect:login"; 
	}
	
	
	@GetMapping("/info")
	public String boardInfo() {
		
		return "/chapter03/board/form";
	}
	
	
	
	
}