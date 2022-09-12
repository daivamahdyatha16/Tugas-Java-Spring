package tugas1.tugas1.data;

import tugas1.tugas1.data.depedency.Ekor;
import tugas1.tugas1.data.depedency.Mulut;

public class Hewan {

    private Ekor ekor;
    private Mulut mulut;

    public Hewan(Ekor ekor, Mulut mulut) {
        this.ekor = ekor;
        this.mulut = mulut;
    }

    public Ekor getEkor() {
        return ekor;
    }

    public Mulut getMulut() {
        return mulut;
    }

}