package com.ocr.batch.tasklet;

import com.ocr.batch.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnvoieDeMailTasklet implements Tasklet, StepExecutionListener {

    @Autowired
    MailService mailService;

    private final Logger logger = LoggerFactory.getLogger(EnvoieDeMailTasklet.class);

    @Override
    public void beforeStep(StepExecution stepExecution) {
        logger.debug("Custom step initialized.");

    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

        mailService.envoieMail();

        return RepeatStatus.FINISHED;
    }


    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        logger.debug("Custom step ended.");

        return ExitStatus.COMPLETED;
    }
}
