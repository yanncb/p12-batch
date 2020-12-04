package com.ocr.batch.service;

import com.ocr.batch.proxy.ProxyBatchToBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private ProxyBatchToBack proxyBatchToBack;

    /**
     * méthode du back pour envoyé un mail
     */
    public void envoieMail() {
        proxyBatchToBack.envoieMail();
    }
}
