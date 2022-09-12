package tugas1.tugas1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tugas1.tugas1.data.Manusia;
import tugas1.tugas1.data.depedency.Tangan;
import tugas1.tugas1.data.depedency.Kaki;

@Configuration
public class BeanConfiguration {

    @Bean
    public Tangan tangan() {
        return new Tangan();
    }

    @Bean
    public Kaki kaki() {
        return new Kaki();
    }

    @Bean
    public Manusia manusia(Tangan tangan, Kaki kaki) {
        return new Manusia(tangan, kaki);
    }

}
