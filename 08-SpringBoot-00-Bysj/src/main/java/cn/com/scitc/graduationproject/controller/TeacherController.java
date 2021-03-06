package cn.com.scitc.graduationproject.controller;

import cn.com.scitc.graduationproject.dao.*;
import cn.com.scitc.graduationproject.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Controller
@RequestMapping("/")
public class TeacherController {
    static Logger logger = LoggerFactory.getLogger(TeacherController.class);
    HttpSession session;
    @Autowired
    ClassDao classDao;
    @Autowired
    UsersDao usersDao;
    @Autowired
    SubjectDao subjectDao;
    @Autowired
    CourseDao courseDao;
    @Autowired
    ExamDao examDao;
    @Autowired
    StudentexamDao studentexamDao;
    @Autowired
    StudentsubjectDao studentsubjectDao;
    @Autowired
    PaperDao paperDao;
    @RequestMapping("/TeacherManage")
    private String TeacherManage(){
        return "/teacher/manage";
    }
    @RequestMapping("/addexam")
    private String addexam(){
        return "/teacher/addexam";
    }

//    @RequestMapping("/StudentList")
//    private String StudentList(HttpServletRequest request, HttpServletResponse response, Model model, Integer pageNum){
//        HttpSession session = request.getSession(true);
//         Integer classid= (Integer) session.getAttribute("Tclassid");
//        Pjclass pjclass = classDao.findByClassid(classid);
//        model.addAttribute("pj",pjclass);
//        if (pageNum == null){
//            pageNum = 1;
//        }
//        Sort sort = new Sort(Sort.Direction.ASC, "userid");  // θΏιη"recordNo"ζ―ε?δ½η±»ηδΈ»ι?οΌθ?°δ½δΈε?θ¦ζ―ε?δ½η±»ηε±ζ§οΌθδΈθ½ζ―ζ°ζ?εΊηε­ζ?΅
//        Pageable pageable = new PageRequest(pageNum - 1, 6, sort); // οΌε½ει‘΅οΌ ζ―ι‘΅θ?°ε½ζ°οΌ ζεΊζΉεΌοΌ
//        Page<Users> lis = usersDao.findByClassid(classid,pageable);
//        logger.info("pageNum==" + pageNum);
//        Iterable<Pjclass> list = classDao.findAll();
//        model.addAttribute("list",list);
//        model.addAttribute("pageInfo", lis);
//        response.addHeader("x-frame-options","SAMEORIGIN");
//        return "/teacher/StudentList";
//    }
    //ε ι€ε­¦η
    @RequestMapping("/DeleteStu")
    private String DeleteStu(HttpServletRequest request){
        Integer userid = Integer.parseInt(request.getParameter("userid"));
       Integer sc= usersDao.deleteByUserid(userid);
       if (sc==1){
           System.out.println("ε ι€ζεοΌ");
       }
        return "redirect:/StudentList";
    }
    //ζ·»ε ε­¦η
    @RequestMapping("/addStu")
    private String addStu(String username,String userpwd,String truename,Integer classid){
        Users users = new Users();
        System.out.println(username);
      Users byname= usersDao.findByUsername(username);
      if (byname==null){
          users.setRoleid(2);
          users.setUsername(username);
          users.setUserpwd(userpwd);
          users.setTruename(truename);
          users.setClassid(classid);
          usersDao.save(users);
          return  "redirect:/StudentList";
      }else {
          System.out.println("θ―₯ε­¦ηε­ε¨οΌ");
      }
       return "";
    }
    //ζ₯ζζη­ηΊ§
    @ResponseBody
    @RequestMapping("/findAllClass")
    private Iterable<Pjclass> pjclassList(){
        Iterable<Pjclass> pjclasses = classDao.findAll();
        return pjclasses;
    }
    //ζuseridζ₯θ―’
    @ResponseBody
    @RequestMapping("/StuEdit")
    private Users StuEdit(@RequestBody Users users){
        Users user = usersDao.findByUserid(users.getUserid());
        if (user!= null) {
            return user;
        } else {
            return null;
        }
    }
//δΏ?ζΉε­¦η
    @RequestMapping("/updateStu")
    private String updateStu(Users user ){
      usersDao.save(user);
        return "redirect:/StudentList";
    }
    //ζΉιε ι€ε­¦η
    @RequestMapping("/deleteManyStu")
    private String ManyStu(String ids){
        // ζ₯ζΆεε«stuIdηε­η¬¦δΈ²οΌεΉΆε°ε?εε²ζε­η¬¦δΈ²ζ°η»
        String[] stuList = ids.split(",");
        // ε°ε­η¬¦δΈ²ζ°η»θ½¬δΈΊList<Intger> η±»ε
        List<Integer> LString = new ArrayList<Integer>();
        for(String str : stuList){
            LString.add(new Integer(str));
        }
        List<Users> users = usersDao.findAllById(LString);
        usersDao.deleteInBatch(users);
        return "redirect:/StudentList";
    }
    //ε ι€ζζε­¦η
    @RequestMapping("/deleteAll")
    private String deleteAll(HttpServletRequest request){
        HttpSession session = request.getSession(true);
        Integer classid= (Integer) session.getAttribute("classid");
        usersDao.deleteByClassid(classid);
        return "redirect:/StudentList";
    }
    //ζ₯θ―’ζζθθ―
//    @RequestMapping("/selectexam")
//    private String selectexam(Model model,Integer pageNum){
//        if (pageNum == null){
//            pageNum = 1;
//        }
//        Sort sort = new Sort(Sort.Direction.ASC, "eid");  // θΏιη"recordNo"ζ―ε?δ½η±»ηδΈ»ι?οΌθ?°δ½δΈε?θ¦ζ―ε?δ½η±»ηε±ζ§οΌθδΈθ½ζ―ζ°ζ?εΊηε­ζ?΅
//        Pageable pageable = new PageRequest(pageNum - 1, 5, sort); // οΌε½ει‘΅οΌ ζ―ι‘΅θ?°ε½ζ°οΌ ζεΊζΉεΌοΌ
//        Page<Exam> examlist = examDao.findAll(pageable);
//        model.addAttribute("examlist",examlist);
//        return "teacher/SelectExam";
//    }

    //ζΉιε ι€θθ― deleteManyExam
    @RequestMapping("/deleteManyExam")
    private String  deleteManyExam(String ids){
        // ζ₯ζΆεε«stuIdηε­η¬¦δΈ²οΌεΉΆε°ε?εε²ζε­η¬¦δΈ²ζ°η»
        String[] stuList = ids.split(",");
        // ε°ε­η¬¦δΈ²ζ°η»θ½¬δΈΊList<Intger> η±»ε
        List<Integer> LString = new ArrayList<Integer>();
        for(String str : stuList){
            LString.add(new Integer(str));
            Integer eid = new Integer(str);
            paperDao.deleteByEid(eid);
            studentsubjectDao.deleteByEid(eid);
            studentexamDao.deleteByEid(eid);
        }
        List<Exam> exams = examDao.findAllById(LString);
        examDao.deleteInBatch(exams);
        return "redirect:/selectexam";
    }
    //ε ι€θθ―
    @RequestMapping("/deleteExam")
    private String deleteExam(Integer eid){
        paperDao.deleteByEid(eid);
        studentsubjectDao.deleteByEid(eid);
        studentexamDao.deleteByEid(eid);
        examDao.deleteByEid(eid);
        return "redirect:/selectexam";
    }
    //ζ₯θ―’δΈεΊθθ―δΏ‘ζ―
    @ResponseBody
    @RequestMapping("/findByOneExam")
    private Exam findByOneExam(@RequestBody Exam exams){
        Exam exam = examDao.findByEid(exams.getEid());
        if (exam != null) {
            return exam ;
        } else {
            return null;
        }
    }
    //δΏ?ζΉθθ―
    @RequestMapping("/updateExam")
    private String updateExam(Exam exam ){
        Integer eid = exam.getEid();
        String pname = exam.getPname();
        studentexamDao.updatePname(pname,eid);
        examDao.save(exam);
        return "redirect:/selectexam";
    }
    //θ―ε·θ―¦ζ
    @RequestMapping("/paperDetails")
    private String paperDetails (Integer eid,Model model){
        List<Paper> tm = paperDao.finbyEid(eid);
        Exam exam = examDao.findByEid(eid);
        model.addAttribute("exam",exam);
        model.addAttribute("tm",tm);
        return "teacher/paperDetails";
    }

    //ζ·»ε θθ―
    @RequestMapping("/insertexam")
    private String insertexam(String pname,Integer userid, Integer cno,  Integer classid, Integer singlenumber, Integer singlecore, Integer multiplenumber, Integer multiplecore, Date examdate,Date examtime,Integer testtime,Model model){
        Exam exam = new Exam();
        exam.setPname(pname);
        exam.setCno(cno);
        exam.setUserid(userid);
        exam.setClassid(classid);
        exam.setSinglenumber(singlenumber);
        exam.setSinglecore(singlecore);
        exam.setMultiplenumber(multiplenumber);
        exam.setMultiplecore(multiplecore);
        exam.setExamdate(examdate);
        exam.setExamtime(examtime);
        exam.setTesttime(testtime);
        examDao.save(exam);
        Integer eid = exam.getEid();
        System.out.println(eid);
        //ειιζΊη»ι’
        List<Subject> singlelsit = subjectDao.finbytype(1, cno);
        List<Subject> resultList1 = new ArrayList<Subject>();
        Random random = new Random();
        if(singlenumber>0){
            for(int i=1;i<=singlenumber;i++){
                int n=random.nextInt(singlelsit .size());
                Subject q=singlelsit .get(n);
                if(resultList1 .contains(q)){
                    i--;
                }else{
                    resultList1.add(singlelsit.get(n));
                 Paper paper = new Paper();
                 paper.setEid(eid);
                 paper.setSid(q.getSid());
                 paper.setStype(q.getStype());
                 paper.setScontent(q.getScontent());
                 paper.setSa(q.getSa());
                 paper.setSb(q.getSb());
                 paper.setSc(q.getSc());
                 paper.setSd(q.getSd());
                 paper.setSkey(q.getSkey());
                 paperDao.save(paper);
                }
            }
        }
        //ε€ιιζΊη»ι’
        List<Subject> multiplelsit = subjectDao.finbytype(2, cno);
        List<Subject> resultList2 = new ArrayList<Subject>();
        if(multiplenumber>0){
            for(int i=1;i<=multiplenumber;i++){
                int n1=random.nextInt(multiplelsit .size());
                Subject q1=multiplelsit .get(n1);
                if(resultList2 .contains(q1)){
                    i--;
                }else{
                    resultList2.add(multiplelsit.get(n1));
                    Paper p = new Paper();
                    p.setEid(eid);
                    p.setSid(q1.getSid());
                    p.setStype(q1.getStype());
                    p.setScontent(q1.getScontent());
                    p.setSa(q1.getSa());
                    p.setSb(q1.getSb());
                    p.setSc(q1.getSc());
                    p.setSd(q1.getSd());
                    p.setSkey(q1.getSkey());
                    paperDao.save(p);
                }
            }
        }
        return "redirect:/selectexam";
    }

    //ζ₯θ―’ειι’
//    @RequestMapping("/finddanxuan")
//    private String danxuan(Model model,Integer pageNum,HttpServletResponse response ){
//        if (pageNum == null){
//            pageNum = 1;
//        }
//        Sort sort = new Sort(Sort.Direction.ASC, "sid");  // θΏιη"recordNo"ζ―ε?δ½η±»ηδΈ»ι?οΌθ?°δ½δΈε?θ¦ζ―ε?δ½η±»ηε±ζ§οΌθδΈθ½ζ―ζ°ζ?εΊηε­ζ?΅
//        Pageable pageable = new PageRequest(pageNum - 1, 5, sort); // οΌε½ει‘΅οΌ ζ―ι‘΅θ?°ε½ζ°οΌ ζεΊζΉεΌοΌ
//        Page<Subject> lis = subjectDao.findByStype(1,pageable);
//        logger.info("pageNum==" + pageNum);
//        for (Subject subject : lis){
//            Course byCno = courseDao.findByCno(subject.getCno());
//            subject.setCourse(byCno);
//        }
//       model.addAttribute("pageInfo", lis);
//        response.addHeader("x-frame-options","SAMEORIGIN");
//        return "/teacher/Single";
//    }
    //ζ₯θ―’ζζθ―Ύη¨
    @ResponseBody
    @RequestMapping("findAllCourse")
    private Iterable<Course> courselist(){
        Iterable<Course> courses = courseDao.findAll();
        return courses;
    }
    //ειζ·»ε ι’η?
    @RequestMapping("/addSingle")
    private String addSingle(Integer stype,String scontent,String sa,String sb,String sc,String sd,String skey,Integer cno){
        Subject sub = new Subject();
        sub.setCno(cno);
        sub.setStype(stype);
        sub.setScontent(scontent);
        sub.setSa(sa);
        sub.setSb(sb);
        sub.setSc(sc);
        sub.setSd(sd);
        sub.setSkey(skey);
        subjectDao.save(sub);
        return "redirect:/finddanxuan";
    }
    //ζsidζ₯θ―’ι’η?
    @ResponseBody
    @RequestMapping("/findBySid")
    private Subject findBySid(@RequestBody Subject subjects){
        Subject subject = subjectDao.findBySid(subjects.getSid());
        if (subject != null) {
            return subject ;
        } else {
            return null;
        }
    }
    //ειδΏ?ζΉι’η?
    @RequestMapping("/updateSingle")
    private String updateSingle(Subject subject ){
        subjectDao.save(subject);
        return "redirect:/finddanxuan";
    }
    //ειε ι€
    @RequestMapping("deleteSingle")
    private String deleteSingle(@RequestParam Integer sid){
        subjectDao.deleteById(sid);
        return "redirect:/finddanxuan";
    }
    //ζΉιε ι€ει
    @RequestMapping("/deleteManySingle")
    private String deleteManySingle(String ids){
        // ζ₯ζΆεε«stuIdηε­η¬¦δΈ²οΌεΉΆε°ε?εε²ζε­η¬¦δΈ²ζ°η»
        String[] singleList = ids.split(",");
        // ε°ε­η¬¦δΈ²ζ°η»θ½¬δΈΊList<Intger> η±»ε
        List<Integer> LString = new ArrayList<Integer>();
        for(String str : singleList){
            LString.add(new Integer(str));
        }
        List<Subject> subjects = subjectDao.findAllById(LString);
        subjectDao.deleteInBatch(subjects);
        return "redirect:/finddanxuan";
    }
    //ζ₯θ―’ε€ιιι’
//    @RequestMapping("/findMultiple")
//    private String findMultiple(Model model,Integer pageNum,HttpServletResponse response ){
//        if (pageNum == null){
//            pageNum = 1;
//        }
//        Sort sort = new Sort(Sort.Direction.ASC, "sid");  // θΏιη"recordNo"ζ―ε?δ½η±»ηδΈ»ι?οΌθ?°δ½δΈε?θ¦ζ―ε?δ½η±»ηε±ζ§οΌθδΈθ½ζ―ζ°ζ?εΊηε­ζ?΅
//        Pageable pageable = new PageRequest(pageNum - 1, 5, sort); // οΌε½ει‘΅οΌ ζ―ι‘΅θ?°ε½ζ°οΌ ζεΊζΉεΌοΌ
//        Page<Subject> lis = subjectDao.findByStype(2,pageable);
//        logger.info("pageNum==" + pageNum);
//        model.addAttribute("pageInfo", lis);
//        response.addHeader("x-frame-options","SAMEORIGIN");
//        return "/teacher/multiple";
//    }
    //ζ·»ε ε€ι
    @RequestMapping("/addMultiple")
    private String addMultiple(Integer stype,String scontent,String sa,String sb,String sc,String sd,String skey,Integer cno){
        Subject sub = new Subject();
        sub.setCno(cno);
        sub.setStype(stype);
        sub.setScontent(scontent);
        sub.setSa(sa);
        sub.setSb(sb);
        sub.setSc(sc);
        sub.setSd(sd);
        sub.setSkey(skey);
        subjectDao.save(sub);
        return "redirect:/findMultiple";
    }
    //ειδΏ?ζΉι’η?
    @RequestMapping("/updateMultiple")
    private String updateMultiple(Subject subject ){
        subjectDao.save(subject);
        return "redirect:/findMultiple";
    }
    //ειε ι€
    @RequestMapping("deleteMultiple")
    private String deleteMultiple(@RequestParam Integer sid){
        subjectDao.deleteById(sid);
        return "redirect:/findMultiple";
    }
    //ζΉιε ι€ει
    @RequestMapping("/deleteManyMultiple")
    private String deleteManyMultiple(String ids){
        // ζ₯ζΆεε«stuIdηε­η¬¦δΈ²οΌεΉΆε°ε?εε²ζε­η¬¦δΈ²ζ°η»
        String[] singleList = ids.split(",");
        // ε°ε­η¬¦δΈ²ζ°η»θ½¬δΈΊList<Intger> η±»ε
        List<Integer> LString = new ArrayList<Integer>();
        for(String str : singleList){
            LString.add(new Integer(str));
        }
        List<Subject> subjects = subjectDao.findAllById(LString);
        subjectDao.deleteInBatch(subjects);
        return "redirect:/findMultiple";
    }
    //ζ₯θ―’ζη»©
//    @RequestMapping("/findAllScore")
//  private String findAllScore(HttpServletRequest request,Integer pageNum,Model model){
//        HttpSession session = request.getSession(true);
//        Integer classid = (Integer)session.getAttribute("Tclassid");
//        Pjclass cs = classDao.findByClassid(classid);
//        model.addAttribute("cs",cs);
//        if (pageNum == null){
//            pageNum = 1;
//        }
//        Sort sort = new Sort(Sort.Direction.ASC, "seid");  // θΏιη"recordNo"ζ―ε?δ½η±»ηδΈ»ι?οΌθ?°δ½δΈε?θ¦ζ―ε?δ½η±»ηε±ζ§οΌθδΈθ½ζ―ζ°ζ?εΊηε­ζ?΅
//        Pageable pageable = new PageRequest(pageNum - 1, 5, sort);
//        Page<Studentexam> byClassid = studentexamDao.findByClassid(classid, pageable);
//        for (Studentexam studentexam :byClassid){
//            Users users = usersDao.findByUserid(studentexam.getUserid());
//            studentexam.setUsers(users);
//        }
//        model.addAttribute("score",byClassid);
//        return "teacher/AllScore";
//    }
}
