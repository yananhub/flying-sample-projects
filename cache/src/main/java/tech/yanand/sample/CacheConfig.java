package tech.yanand.sample;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.yanand.flyingcache.ThreadCacheManager;

@Configuration
@EnableCaching
class CacheConfig {

    @Bean
    ThreadCacheManager threadCacheManager1() {
        return new ThreadCacheManager();
    }
}
