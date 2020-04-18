package csu.db.bankmanage.controller;


import csu.db.bankmanage.domain.Message;
import csu.db.bankmanage.domain.Subscribe;
import csu.db.bankmanage.domain.User;
import csu.db.bankmanage.persistence.SignOnMapper;
import csu.db.bankmanage.service.MessageService;
import csu.db.bankmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private MessageService messageService;

    // 登录
    @GetMapping({"", "/login"})
    public String login(){
        return "user/login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpSession session){
        String userNum = request.getParameter("userId");
        String password = request.getParameter("password");
        // System.out.println(userId + password);
        User findUser = userService.findUserByUserNum(userNum);
//        System.out.println(findUser);
        // 存在账号
        if(findUser != null){
            String isRight = userService.findUserByIDANDPassword(userNum, password);
//            System.out.println(isRight);
            // 密码正确
            if(isRight != null){
                String username = findUser.getFirstName() + " " + findUser.getLastName();
                session.setAttribute("username", username);
                session.setAttribute("userNum", userNum);
                return "redirect:/home";
            }
        }
        return "redirect:/login";
    }

    // 注册
    @GetMapping("/register")
    public String returnRegister(){
        return "user/register";
    }

    @PostMapping("/register")
    public String register(HttpServletRequest request, Map<String,String> parm){
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userNum = request.getParameter("userId");
        String password = request.getParameter("password");
//        System.out.println(firstName + lastName + userId + password);

        // 注册到登录表中
        userService.insertUser(userNum, password);
        // 记录到用户信息表
//        parm = new HashMap<String,String>();
//        parm.put("firstName", firstName);
//        parm.put("lastName", lastName);
//        parm.put("email", null);
//        parm.put("phone", null);
//        parm.put("userNum", userNum);
//        parm.put("position", null);
//        parm.put("city", null);
//        parm.put("address", null);
//        parm.put("description", null);
        userService.registerUser(firstName, lastName, userNum);

        return "user/login";
    }

    // 重置密码
    @RequestMapping("resetPassword")
    public String resetPassword(){
        return "user/resetPassword";
    }

    // 个人信息
    @RequestMapping("/profile")
    public String profile(HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        User user = userService.findUserByUserNum(userNum);
        model.addAttribute("user", user);
        return "user/profile";
    }

    @GetMapping("/changeProfile")
    public String getChangeProfile(HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        User user = userService.findUserByUserNum(userNum);
        model.addAttribute("user", user);
        return "user/changeProfile";
    }

    @PostMapping("/changeProfile")
    public String changeProfile(HttpServletRequest request, HttpSession session, Model model){
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String position = request.getParameter("position");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
        String description = request.getParameter("description");
        String password = request.getParameter("password");

        String userNum = session.getAttribute("userNum").toString();
//        System.out.println(description);

        String isRight = userService.findUserByIDANDPassword(userNum, password);

        if(isRight != null){
            userService.updateUserInfoByUserNum(firstName, lastName, phone, email, position, city, address, description, userNum);
            model.addAttribute("info", "信息修改成功！");
        }else{
            model.addAttribute("info", "密码错误！");
        }

        User newUser = userService.findUserByUserNum(userNum);
        model.addAttribute("user", newUser);
//        System.out.println(newUser.getDescription());
        return "user/changeProfile";
    }

    @GetMapping("/password")
    public String password(){
        return "user/password";
    }

    @PostMapping("/password")
    public String changePassword(HttpServletRequest request, HttpSession session, Model model){
        String newPassword = request.getParameter("newPassword");
        String repeatPassword = request.getParameter("repeatPassword");
        String password = request.getParameter("password");

        String userNum = session.getAttribute("userNum").toString();

        if(newPassword.equals(repeatPassword)){
            String isRight = userService.findUserByIDANDPassword(userNum, password);

            if(isRight != null){
                userService.changePassword(userNum, newPassword);
                return "redirect:/login";
            }else{
                model.addAttribute("info", "密码错误！");

            }
        }else {
            model.addAttribute("info", "两次输入的新密码不一致！");
        }

        return "user/password";
    }

    @RequestMapping("/message")
    public String message(HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Message> messageArrayList;
        messageArrayList = messageService.findMessageRecordByUserNum(userNum);
        model.addAttribute("messageArrayList", messageArrayList);

        return "user/message";
    }

    @RequestMapping("/messageDetail")
    public String messageDetail(){
        return "user/messageDetail";
    }

    // 业务提醒
    @GetMapping("/remindBusiness")
    public String getRemindBusiness(HttpServletRequest request, HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        Subscribe depositSubscribe = messageService.getServiceByUserNum(userNum, "deposit");
        if(depositSubscribe != null){
            model.addAttribute("depositStatus", "True");
        }else{
            model.addAttribute("depositStatus", "False");
        }

        Subscribe withdrawSubscribe = messageService.getServiceByUserNum(userNum, "withdraw");
        if(withdrawSubscribe != null){
            model.addAttribute("withdrawStatus", "True");
        }else{
            model.addAttribute("withdrawStatus", "False");
        }

        Subscribe loanSubscribe = messageService.getServiceByUserNum(userNum, "loan");
        if(loanSubscribe != null){
            model.addAttribute("loanStatus", "True");
        }else{
            model.addAttribute("loanStatus", "False");
        }

        Subscribe repayLoanSubscribe = messageService.getServiceByUserNum(userNum, "repayLoan");
        if(repayLoanSubscribe != null){
            model.addAttribute("repayLoanStatus", "True");
        }else{
            model.addAttribute("repayLoanStatus", "False");
        }

        return "user/remindBusiness";
    }

    @PostMapping("/remindBusiness")
    public String remindBusiness(HttpServletRequest request, HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();

        String[] checkboxs = request.getParameterValues("checkbox");
        Boolean isDeposit = false;
        Boolean isWithdraw = false;
        Boolean isLoan = false;
        Boolean isRepayLoan = false;
        if(checkboxs != null){
            for(String checkbox: checkboxs){
                if(checkbox.equals("1")){
                    isDeposit = true;
                }
                if(checkbox.equals("2")){
                    isWithdraw = true;
                }
                if(checkbox.equals("3")){
                    isLoan = true;
                }
                if(checkbox.equals("4")){
                    isRepayLoan = true;
                }
            }
        }

        Subscribe depositSubscribe = messageService.getServiceByUserNum(userNum, "deposit");
        if(isDeposit){
            if(depositSubscribe == null){
                messageService.addServiceByUserNum(userNum, "deposit");
            }
        }else{
            if(depositSubscribe != null){
                messageService.cancelServiceByUserNum(userNum, "deposit");
            }
        }

        Subscribe withdrawSubscribe = messageService.getServiceByUserNum(userNum, "withdraw");
        if(isWithdraw){
            if(withdrawSubscribe == null){
                messageService.addServiceByUserNum(userNum, "withdraw");
            }
        }else{
            if(withdrawSubscribe != null){
                messageService.cancelServiceByUserNum(userNum, "withdraw");
            }
        }

        Subscribe loanSubscribe = messageService.getServiceByUserNum(userNum, "loan");
        if(isLoan){
            if(loanSubscribe == null){
                messageService.addServiceByUserNum(userNum, "loan");
            }
        }else{
            if(loanSubscribe != null){
                messageService.cancelServiceByUserNum(userNum, "loan");
            }
        }

        Subscribe repayLoanSubscribe = messageService.getServiceByUserNum(userNum, "repayLoan");
        if(isRepayLoan){
            if(repayLoanSubscribe == null){
                messageService.addServiceByUserNum(userNum, "repayLoan");
            }
        }else{
            if(repayLoanSubscribe != null){
                messageService.cancelServiceByUserNum(userNum, "repayLoan");
            }
        }


        return "redirect:/remindBusiness";
    }
}
