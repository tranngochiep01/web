package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hiep
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/Controller"})
public class servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String menu = request.getParameter("submit");
        HttpSession ss = request.getSession();
        SQLServerConnUtils_SQLJDBC db = new SQLServerConnUtils_SQLJDBC();
        String username = "";
        String password = "";
        switch (menu) {
            case "login": {
                try {
                    username = request.getParameter("txtUsername");
                    password = request.getParameter("txtPassword");

                    if (db.getSQLServerConnUtils_SQLJDBC(username, password) != null) {
                        ss.setAttribute("username1", username);
                        ss.setAttribute("password1", password);
                        request.setAttribute("error", "Username and Password invalid !" + username + "," + password);
                        if (username.equals("sv")) {

                            response.sendRedirect("xacnhansv.jsp");

                        } else {
                            if (username.equals("sa")) {
                                response.sendRedirect("displayadmind.jsp");
                            } else {
                                response.sendRedirect("displaygiangvien.jsp");
                            }
                        }
                        // response.sendRedirect("homeView.jsp");

                    } else {
                       // response.getWriter().write("lỗi");
                        request.setAttribute("error", "Username and Password invalid ! Again " + menu);
                        RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
                        dis.forward(request, response);
                    }
                } finally {
                    //out.close();
                }
                break;
            }
            case "Đăng ký": {
                try {
                    db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                    String lanthi = request.getParameter("lanthi");
                    int lt = Integer.parseInt(lanthi);
                    String socauhoi = request.getParameter("socauhoi");
                    int sch = Integer.parseInt(socauhoi);
                    String lop = request.getParameter("lop");
                    String mon = request.getParameter("mon");
                    String trinhdo = request.getParameter("trinhdo");
                    String ngaythi = request.getParameter("ngay");
                    int tgbatdau = Integer.parseInt(request.getParameter("thoigian"));
                    String mamh = "";
                    String malop = "";
                    //String tgketthuc=request.getParameter("thoigiankt");
                    //Connection conn= db.conn();
                    String sql1 = "select mamh from monhoc where tenmh=rtrim(N'" + mon + "')";
                    String sql2 = "select malop from lop where tenlop=rtrim(N'" + lop + "')";
                    ResultSet rs = db.query(sql1);
                    try {
                        while (rs.next()) {
                            mamh = rs.getString("mamh");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ResultSet rs1 = db.query(sql2);
                    try {
                        while (rs1.next()) {
                            malop = rs1.getString("malop");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String sql3 = "insert into DKthi(mamh,malop,ngaythi,trinhdo,thoigian,socauhoi,lan) values('" + mamh + "','" + malop + "','" + ngaythi + "','" + trinhdo + "'," + tgbatdau + "," + sch + "," + lt + ")";
                    if (db.registerExam(sql3)) {
                        // System.out.println("them thanh cong");
                        String sql4 = "insert into ctdethi(IDTHI,macauhoi) select (select max(IDTHI) from DKthi ),cauhoi.macauhoi "
                                + "from (SELECT top " + socauhoi + " * FROM Cauhoi WHERE trinhdo ='" + trinhdo + "' ORDER BY newid()) as cauhoi ";
                        db.registerExam(sql4);
                        //request.setAttribute("error","them thanh cong");
                        RequestDispatcher dis = request.getRequestDispatcher("dangky.jsp?thongbao=ok");
                        dis.forward(request, response);
                    } else {
                        // out.println("them that bai");
                        //request.setAttribute("error", "that bai");
                        RequestDispatcher dis = request.getRequestDispatcher("dangky.jsp");
                        dis.forward(request, response);
                    }
                    /*System.out.println("them thanh cong");
                     request.setAttribute("error", sql1);
                     RequestDispatcher dis = request.getRequestDispatcher("dangky.jsp");
                     dis.forward(request, response);*/

                } finally {
                    //out.close();
                }
                break;
            }
            case "ok": {
                try {
                    db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                    String masv = request.getParameter("masv");
                    String sqlmasv = "select masv from sinhvien where masv='" + masv + "'";

                    if (db.ktsinhvien(sqlmasv)) {
                        ss.setAttribute("masv", masv);
                        RequestDispatcher dis = request.getRequestDispatcher("displaysinhvien.jsp");
                        dis.forward(request, response);
                    } else {
                        RequestDispatcher dis = request.getRequestDispatcher("xacnhansv.jsp");
                        dis.forward(request, response);
                    }
                } finally {
                    //out.close();
                }
                break;
            }
            case "thi": {
                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                int idthi = Integer.parseInt(request.getParameter("idthi"));
                request.setAttribute("idthi", idthi);
                RequestDispatcher dis = request.getRequestDispatcher("thi1.jsp");
                dis.forward(request, response);
                break;
            }
            case "Thêm câu hỏi": {
                String loai = request.getParameter("loai");
                String dapan = request.getParameter("dapan");
                String tenmh = request.getParameter("monhoc");
                String trinhdo = request.getParameter("trinhdo");
                String noidung = request.getParameter("noidung");
                String mamh = "";

                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                String sql = "select mamh from monhoc where tenmh=N'" + tenmh + "'";
                ResultSet rs = db.query(sql);
                try {
                    while (rs.next()) {
                        mamh = rs.getString("mamh");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                String sql1 = "insert into cauhoi(loai,dapan,mamh,trinhdo,noidung,magv) values('" + loai + "','" + dapan + "','" + mamh + "','" + trinhdo + "',N'" + noidung + "','" + ss.getAttribute("username1") + "')";
                if (db.insert(sql1)) {

                    int mach = 0;
                    db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                    String sql2 = "select max(macauhoi) as mach from cauhoi";
                    rs = db.query(sql2);
                    try {
                        while (rs.next()) {
                            mach = rs.getInt("mach");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for (int i = 1; i <= 4; i++) {
                        String mapa = String.valueOf(mach) + String.valueOf(i);
                        String tenpa = request.getParameter("tenpa" + i);
                        String noidungpa = request.getParameter("noidung" + i);
                        String sql3 = "insert into phuongan(mapa,tenluachon,noidung,macauhoi) values('" + mapa + "','" + tenpa + "','" + noidungpa + "'," + mach + ")";
                        db.insert(sql3);
                    }
                    RequestDispatcher dis = request.getRequestDispatcher("themcauhoi.jsp");
                    dis.forward(request, response);
                } else {
                    request.setAttribute("error", "that bai" + loai + "'" + dapan + "," + mamh + "," + trinhdo + "," + noidung + "," + ss.getAttribute("username1"));
                    RequestDispatcher dis = request.getRequestDispatcher("themcauhoi.jsp");
                    dis.forward(request, response);
                }
                break;
            }
            /*case "thêm phương án": {
                int mach = 0;
                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                String sql = "select max(macauhoi) as mach from cauhoi";
                ResultSet rs = db.query(sql);
                try {
                    while (rs.next()) {
                        mach = rs.getInt("mach");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 1; i <= 4; i++) {
                    String mapa = String.valueOf(mach) + String.valueOf(i);
                    String tenpa = request.getParameter("tenpa" + i);
                    String noidung = request.getParameter("noidung" + i);
                    String sql1 = "insert into phuongan(mapa,tenluachon,noidung,macauhoi) values('" + mapa + "','" + tenpa + "','" + noidung + "'," + mach + ")";
                    db.insert(sql1);
                }
                RequestDispatcher dis = request.getRequestDispatcher("themcauhoi.jsp");
                dis.forward(request, response);
                break;
            }*/
            case "Thêm giảng viên": {
                String magv = request.getParameter("magv");
                String matkhau = request.getParameter("matkhau");
                String hogv = request.getParameter("hogv");
                String tengv = request.getParameter("tengv");
                String emailgv = request.getParameter("emailgv");
                String sdtgv = request.getParameter("sdtgv");
                String gioitinh = request.getParameter("gioitinh");

                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                // String sql = "select magv from giangvien where magv=N'" + magv + "'";
                String sql = "execute THEM_LOGINGV ?,?,?,?";
                try {
                    PreparedStatement prstm = db.conn.prepareCall(sql);
                    prstm.setString(1, magv);
                    prstm.setString(2, matkhau);
                    prstm.setString(3, magv);
                    prstm.setString(4, "giangvien");
                    if (prstm.executeUpdate() == 1) {

                    }

                    String sql2 = "insert into giangvien(magv,ho,ten,email,sdt,gioitinh) values('" + magv + "','" + hogv + "','" + tengv + "','" + emailgv + "'," + Integer.parseInt(sdtgv) + ",'" + gioitinh + "')";
                    db.insert(sql2);
                } catch (SQLException ex) {
                    Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                RequestDispatcher dis = request.getRequestDispatcher("themgiangvien.jsp");
                dis.forward(request, response);
                break;
            }
            case "Thêm sinh viên": {
                String masv = request.getParameter("masv");
                String hosv = request.getParameter("hosv");
                String tensv = request.getParameter("tensv");
                String ngaysinh = request.getParameter("ngaysinh");
                String diachi = request.getParameter("diachi");
                String malop = request.getParameter("malop");
                String gioitinh = request.getParameter("gioitinh");

                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                String sql1 = "insert into Sinhvien(masv,ho,ten,diachi,malop,gioitinh) values('" + masv + "','" + hosv + "','" + tensv + "','" + ngaysinh + "',N'" + diachi + "','" + malop + "','" + gioitinh + "')";
                db.insert(sql1);
            }
            case "Thêm lớp": {
                String malop = request.getParameter("malop");
                String tenlop = request.getParameter("tenlop");
                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                String sql1 = "insert into Lop(malop,tenlop) values('" + malop + "','" + tenlop + "')";
                db.insert(sql1);
            }
            case "Thêm môn học": {
                String mamon = request.getParameter("mamon");
                String tenmon = request.getParameter("tenmon");
                String sotinchi = request.getParameter("sotinchi");
                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                String sql1 = "insert into Monhoc(mamh,tenmh,sotinchi) values('" + mamon + "','" + tenmon + "','" + sotinchi + "')";
                db.insert(sql1);
            }
            case "thaydoiluachon": {
                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                String luachon = request.getParameter("luachon");
                int macauhoi = Integer.parseInt(request.getParameter("macauhoi"));
                int id = Integer.parseInt(request.getParameter("id"));
                String sql1 = "update Thitam set luachonsv='" + luachon + "' where macauhoi=" + macauhoi + " and id=" + id;

                db.update(sql1);

               // RequestDispatcher dis = request.getRequestDispatcher("thi1.jsp");
                // dis.forward(request, response);
                break;
            }
            case "thaydoithoigian": {
                db.getSQLServerConnUtils_SQLJDBC(SQLServerConnUtils_SQLJDBC.username, SQLServerConnUtils_SQLJDBC.Password);
                int thoigian = Integer.parseInt(request.getParameter("thoigian"));

                int id = Integer.parseInt(request.getParameter("id"));
                String sql1 = "update Dkthitam set thoigian=" + thoigian + " where id=" + id;

                db.update(sql1);

               // RequestDispatcher dis = request.getRequestDispatcher("thi1.jsp");
                // dis.forward(request, response);
                break;
            }

        }
        // db.conn=null;
        processRequest(request, response);
    }

}
