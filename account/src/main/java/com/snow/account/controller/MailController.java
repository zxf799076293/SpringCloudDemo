package com.snow.account.controller;

import com.snow.account.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailService mailService;
    @Autowired
    private TemplateEngine templateEngine;


    @PostMapping("/send")
    public String send() {
        Context context = new Context();
        context.setVariable("siteTitle", "鸟不拉屎");
        context.setVariable("permalink", "https://niaobulashi.com/archives/canteen.html/comment-page-1#comment-1152");
        context.setVariable("title", "公司食堂伙食看起来还不错的亚子（体重有所回升）");
        context.setVariable("author", "测试员");
        context.setVariable("time", "2019-07-16 08:52:46");
        context.setVariable("text", "真的很不错！");
        context.setVariable("ip", "127.0.0.1");
        context.setVariable("mail", "123321@qq.com");
        context.setVariable("status", "通过");
        context.setVariable("manage", "https://niaobulashi.com");

        //将字段加载到页面模板中
        String emailContent = templateEngine.process("sendMail", context);
        // 添加附件
        String filePath="E:\\workspace\\javaWorkspace\\spring-boot-learning\\spring-boot-21-schedule-mail\\doc\\test.log";

        mailService.sendHtmlMail("799076293@qq.com", "主题，这是模板邮件", emailContent, null);

        return "success";
    }
}
