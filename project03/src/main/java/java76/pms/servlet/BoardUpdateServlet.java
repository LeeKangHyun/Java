package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

public class BoardUpdateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  // GET 요청이 들어오면 해당 게시물의 상세 정보를 출력한다.
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    int no = Integer.parseInt(request.getParameter("no"));

    ApplicationContext iocContainer = 
        (ApplicationContext)this.getServletContext()
        .getAttribute("iocContainer");
    BoardDao boardDao = iocContainer.getBean(BoardDao.class);
    Board board = boardDao.selectOne(no);

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>게시판 정보</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h1>게시물 정보</h1>");

    if (board != null) {
      out.println("  <form id='form1' action='update' method='post'>");
      out.println("  <table border='1'>");
      out.println("  <tr>");
      out.println("    <th>번호</th>");
      out.printf("    <td><input type='text' name='no' value='%d' readonly></td>\n", 
          board.getNo());
      out.println("  </tr>");
      out.println("  <tr>");
      out.println("    <th>제목</th>");
      out.printf("    <td><input type='text' name='title' value='%s'></td>\n", 
          board.getTitle());
      out.println("  </tr>");
      out.println("  <tr>");
      out.println("    <th>내용</th>");
      out.printf("    <td><textarea name='content' rows='10' cols='60'>%s</textarea></td>", 
          board.getContent());
      out.println("  </tr>");
      out.println("  <tr>");
      out.println("    <th>조회수</th>");
      out.printf("    <td>%d</td>\n", board.getViews());  
      out.println("  </tr>");
      out.println("  <tr>");
      out.println("    <th>등록일</th>");
      out.printf("    <td>%s</td>\n", board.getCreatedDate());
      out.println("  </tr>");
      out.println("  <tr>");
      out.println("    <th>암호</th>");
      out.println("    <td><input type='password' name='password'></td>");
      out.println("  </tr>");
      out.println("  </table>");

      out.println("  <p>");
      out.println("  <button name='update' type='submit'>변경</button>");
      out.println("  <button name='delete' type='submit' onclick='deleteBoard()'>삭제</button>");
      out.println("  </p>");
      
      out.println("  </form>");
    } else {
      out.println("<p>해당 번호의 게시물을 찾을 수 없습니다.</p>");
    }
    RequestDispatcher rd = request.getRequestDispatcher("/copyright");
    rd.include(request, response);
    
    out.println("<script>");
    out.println("function deleteBoard() {");
    out.println("  document.getElementById('form1').action = 'delete';");
    out.println("}");
    out.println("</script>");

    out.println("</body>");
    out.println("</html>");
  }

  // POST 요청이 들어오면 해당 게시물을 입력한 값으로 변경한다.
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    try {
      Board board = new Board();
      board.setNo(Integer.parseInt(request.getParameter("no")));
      board.setTitle(request.getParameter("title"));
      board.setContent(request.getParameter("content"));
      board.setPassword(request.getParameter("password"));


      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
          .getAttribute("iocContainer");
      BoardDao boardDao = iocContainer.getBean(BoardDao.class);

      if (boardDao.update(board) > 0) {
        response.sendRedirect("list");  // 상대경로
        return;
      } 
      
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("  <meta charset='UTF-8'>");
      out.println("  <title>게시판 변경</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("  <h1>게시물 변경오류</h1>");
      out.println("  <p>해당 게시물이 존재하지 않거나 암호가 맞지 않습니다.</p>");
      
      RequestDispatcher rd = request.getRequestDispatcher("/copyright");
      rd.include(request, response);
      
      out.println("</body>");
      out.println("</html>");

      response.setHeader("Refresh", "2; url=list");
      
    }catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      request.setAttribute("error", e); // 오류 정보를 ErrorServlet에게 전달한다.
      rd.forward(request, response);
    }
  }
}









