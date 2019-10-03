package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {//동적인 웹페이지가 만들어짐->사용자가입력한 값에 따라 항상 다른 결과가 나오기때문
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpServletRequest에 대한 객체 request HttpServletResponse에 대한 객체 response
		//request, response에 (HttpServletRequest, HttpServletResponse이 만든 객체의 주소값이 들어감
		
		//read form data
		String username = request.getParameter("username");//index.html의 Username의 name값과 일치해야함
		String password = request.getParameter("password");
		
		//Process :access to database, perform business logic
		
		//Build HTML code
		
		PrintWriter out = response.getWriter();
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> Your username is " + username + "<br>";
		htmlResponse += "<h2> Your password is " + password + "</h2>";
		htmlResponse += "</html>";

		
		out.println(htmlResponse);
	
		
	}

}
