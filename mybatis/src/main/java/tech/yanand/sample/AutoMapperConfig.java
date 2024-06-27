package tech.yanand.sample;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tech.yanand.flyingmybatis.AutoMapperProcessor;

@Configuration
@Import(AutoMapperProcessor.class)
class AutoMapperConfig {
}