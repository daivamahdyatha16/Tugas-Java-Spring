package tugas1.tugas1.data;

import tugas1.tugas1.data.depedency.Tangan;
import tugas1.tugas1.data.depedency.Kaki;

public class Manusia {

    private Tangan tangan;
    private Kaki kaki;

    public Manusia(Tangan tangan, Kaki kaki) {
        this.tangan = tangan;
        this.kaki = kaki;
    }

    public Tangan getTangan() {
        return tangan;
    }

    public Kaki getKaki() {
        return kaki;
    }

}
