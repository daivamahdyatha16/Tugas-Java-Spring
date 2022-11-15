package tugas1.tugas1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tugas1.tugas1.data.Hewan;
import tugas1.tugas1.data.Manusia;
import tugas1.tugas1.data.Tumbuhan;
import tugas1.tugas1.data.depedency.Tangan;
import tugas1.tugas1.data.depedency.Kaki;
import tugas1.tugas1.data.depedency.Mulut;
import tugas1.tugas1.data.depedency.Ekor;
import tugas1.tugas1.data.depedency.Akar;
import tugas1.tugas1.data.depedency.Daun;

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

    @Bean
    public Mulut mulut() {
        return new Mulut();
    }

    @Bean
    public Ekor ekor() {
        return new Ekor();
    }

    @Bean
    public Hewan hewan(Mulut mulut, Ekor ekor) {
        return new Hewan(ekor, mulut);
    }

    @Bean
    public Daun daun() {
        return new Daun();
    }

    @Bean
    public Akar akar() {
        return new Akar();
    }

    @Bean
    public Tumbuhan tumbuhan(Daun daun, Akar akar) {
        return new Tumbuhan(daun, akar);
    }
}
