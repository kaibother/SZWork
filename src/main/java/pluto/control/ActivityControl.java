package pluto.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import pluto.entity.ActiveGrade;
import pluto.entity.ActiveSignUp;
import pluto.entity.ActiveType;
import pluto.service.ActivityService;
import pluto.service.UserService;
import pluto.util.DateConveter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//RequestMapping，表明处理用户的请求的处理器，Controller声明这是一个处理器

@Controller
public class ActivityControl {
    @Autowired
    private  ActivityService activityService;
    @Autowired
    private UserService userService;
    @RequestMapping("/selectActivity.action")
    public void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("activetypelist",activityService.queryAllActivityType());
        request.setAttribute("activegradelist",activityService.queryAllActiveGrade());
        request.getRequestDispatcher("activity_signup.jsp").forward(request,response);


    }
    @RequestMapping("/activesign.action")
    public String signup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        ActiveType activetype=activityService.queryActiveTypeByName(request.getParameter("activename"));
        Date date=new Date();
        if(activetype.getDeclinetime().getTime()>date.getTime()){
            ActiveGrade Grade=activityService.queryByActiveGrade(request.getParameter("selectedGrade"));
            ActiveSignUp activeSignUp=new ActiveSignUp(userService.queryByUserId(1),new Date(),activetype,Grade);
            activityService.addActiveSignUp(activeSignUp);
            Integer Activetypeid=activetype.getActivetypeid();


            if(request.getSession().getAttribute("activesigns")==null){
                List<Integer>activesigns=new LinkedList<Integer>();
                activesigns.add(Activetypeid);
                request.getSession().setAttribute("activesigns",activesigns);
            }else{
                Object activesigns=request.getSession().getAttribute("activesigns");
                ((List)activesigns).add(Activetypeid);
                request.getSession().setAttribute("activesigns",activesigns);
            }



            return "redirect:/selectActivity.action?flag=1&activetypeid="+Activetypeid;
        }else{
            return "redirect:/selectActivity.action?flag=0";

        }



    }


}
