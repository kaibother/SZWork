package pluto.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pluto.entity.DogHouseGrade;
import pluto.service.HostelService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HostelControl {
    @Autowired
    private HostelService hostelService;
    @RequestMapping("/selectHostel.action")
    public void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("doghouselist",hostelService.queryAllHouse());
        request.getRequestDispatcher("hostel_index.jsp").forward(request,response);

    }

    @RequestMapping("/selectHostelDetail.action")
    public void selectHostelDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("doghouse",hostelService.queryHouseById(Integer.parseInt(request.getParameter("doghouseid"))));

        request.getRequestDispatcher("hostel_detail.jsp").forward(request,response);

    }
    @RequestMapping("/selectHostelDetailMoney.action")
    public @ResponseBody Double selectHostelMoney(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DogHouseGrade dogHouseGrade=hostelService.queryDogHouseGradeById(Integer.parseInt(request.getParameter("doghousegradeid")));
        System.out.println(dogHouseGrade.getDoghouseprice());
        return (dogHouseGrade.getDoghouseprice());

    }
}
