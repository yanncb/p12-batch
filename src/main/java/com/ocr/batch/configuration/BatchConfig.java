package com.ocr.batch.configuration;

import com.ocr.batch.tasklet.EnvoieDeMailTasklet;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    public final JobBuilderFactory jobBuilderFactory;

    public final StepBuilderFactory stepBuilderFactory;

    public final EnvoieDeMailTasklet envoieDeMailTasklet;

    @Autowired
    public BatchConfig(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory, EnvoieDeMailTasklet envoieDeMailTasklet) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
        this.envoieDeMailTasklet = envoieDeMailTasklet;
    }

    @Bean
    public Job sendReminderJob() {
        return jobBuilderFactory.get("sendReminderJob")
                .incrementer(new RunIdIncrementer())
                .start(stepOne()).build();
    }

    @Bean
    public Step stepOne() {
        return stepBuilderFactory.get("stepOne").tasklet(envoieDeMailTasklet).build();
    }


}
