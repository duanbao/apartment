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
	 * 控制访问层:接收参数,调用Service,控制跳转
	 */
	@WebServlet("/user/login")
	public class LoginServlet extends HttpServlet {
		
		LoginService service = new LoginServiceImpl();
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// 接收参数
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			// 调用业务处理层对比密码 ,根据姓名找到用户并返回
			User user = service.findUserByUsername(username);
			
			// 页面跳转
			if(user!= null && user.getU_password().equals(password)) {
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				req.getRequestDispatcher("/admin.jsp").forward(req, resp);
			}else {
				req.setAttribute("msg", "用户名或密码错误");
				resp.sendRedirect(req.getContextPath()+"/index.jsp");
			}
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}
	}


