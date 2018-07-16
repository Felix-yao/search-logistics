package com.felix.searchlogistics.service.impl;

import com.felix.searchlogistics.service.EmailUtilService;
import javafx.util.Pair;

import java.io.File;
import java.util.List;
import java.util.Map;

public class EmailServiceImpl implements EmailUtilService {

    @Override
    public void sendSimpleMail(String sendTo, String titel, String content) {

    }

    @Override
    public void sendAttachmentsMail(String sendTo, String titel, String content, List<Pair<String, File>> attachments) {

    }

    @Override
    public void sendTemplateMail(String sendTo, String titel, Map<String, Object> content, List<Pair<String, File>> attachments) {

    }
}
