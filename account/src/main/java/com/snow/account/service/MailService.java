package com.snow.account.service;

public interface MailService {
    void sendHtmlMail(String to, String subject, String content, String filePath);
}
