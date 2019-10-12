package com.zhiyou100.servlet.user;

	import java.io.IOException;


	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;


	
	import com.zhiyou100.model.User;
import com.zhiyou100.service.LoginService;
import com.zhiyou100.service.impl.LoginServiceImpl;
	/**
	 * ���Ʒ��ʲ�:���ղ���,����Service,������ת
	 */
	@WebServlet("/user/login")
	public class LoginServlet extends HttpServlet {
		
		LoginService service = new LoginServiceImpl();
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// ���ղ���
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			// ����ҵ�����Ա����� ,���������ҵ��û�������
			User user = service.findUserByUsername(username);
			
			// ҳ����ת
			if(user!= null && user.getU_password().equals(password)) {
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}else {
				req.setAttribute("msg", "�û������������");
				resp.sendRedirect(req.getContextPath()+"/index.jsp");
			}
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}
	}


