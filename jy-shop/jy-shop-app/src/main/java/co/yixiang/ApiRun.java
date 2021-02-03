package co.yixiang;

import co.yixiang.utils.SpringContextHolder;
import com.binarywang.spring.starter.wxjava.miniapp.config.WxMaAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author hupeng
 * @date 2019/10/1 9:20:19
 */
@EnableAsync
@EnableTransactionManagement
@EnableCaching
@MapperScan(basePackages ={"co.yixiang.modules.*.service.mapper", "co.yixiang.config"})
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class , WxMaAutoConfiguration.class})
public class ApiRun {

    public static void main(String[] args) {
        SpringApplication.run(ApiRun.class, args);
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
