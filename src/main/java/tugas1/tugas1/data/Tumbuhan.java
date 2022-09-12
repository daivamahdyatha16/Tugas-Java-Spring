package tugas1.tugas1.data;

import tugas1.tugas1.data.depedency.Daun;
import tugas1.tugas1.data.depedency.Akar;

public class Tumbuhan {

    private Daun daun;
    private Akar akar;

    public Tumbuhan(Daun daun, Akar akar) {
        this.daun = daun;
        this.akar = akar;
    }

    public Daun getDaun() {
        return daun;
    }

    public Akar getAkar() {
        return akar;
    }

}