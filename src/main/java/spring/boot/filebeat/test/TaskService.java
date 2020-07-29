package spring.boot.filebeat.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration      //1.主要用于标记配置类，兼备Component的效果。
public class TaskService {
    private final static Logger logger = LoggerFactory.getLogger(TaskService.class);

    //添加定时任务
    @Scheduled(cron = "0/10 * * * * ?")
    //或直接指定时间间隔，例如：10秒
    private void configureTasks1() {
        logger.info("执行静态定时任务时间: " + LocalDateTime.now());
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }

    //添加定时任务
    @Scheduled(cron = "0/10 * * * * ?")
    //或直接指定时间间隔，例如：10秒
    private void configureTasks2() {
        logger.info("TaskService configureTasks2: " + LocalDateTime.now());
        System.err.println("TaskService configureTasks2: " + LocalDateTime.now());
    }

    //添加定时任务
    @Scheduled(cron = "0/10 * * * * ?")
    //或直接指定时间间隔，例如：10秒
    private void configureTasks3() {
        try{
            if(1/0==1){
                logger.info("TaskService configureTasks3: true");
            }
        }catch(Exception e){
            logger.info("TaskService configureTasks3: " + e.getStackTrace()+"====="+e.getMessage());
            System.err.println("TaskService configureTasks3 Error: " + LocalDateTime.now());
        }
    }

}
