package com.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.vo.Member;
import com.kh.member.service.MemberService;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/updatePwd.me")
public class UpdatePwdMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePwdMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String updatePwd = request.getParameter("updatePwd");
		HttpSession session = request.getSession();
		
		Member updateMember = new MemberService().updatePwdMember(userId, userPwd, updatePwd);
		
		if(updateMember != null) {
			session.setAttribute("alertMsg", "성공적으로 비밀번호를 변경했습니다");
			session.setAttribute("loginUser", updateMember);
		} else {
			session.setAttribute("alertMsg", "비밀번호 변경에 실패했습니다");
		}
		
		response.sendRedirect(request.getContextPath() + "/myPage.me");
	}
}