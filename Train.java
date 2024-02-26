public class Train {
    String PunktNazn;
    int train_num, num_of_all_places, num_of_coupe, num_of_plackart;
    short timestartm, timestarth, timeendm, timeendh;


    public String getPunktNazn() {
        return PunktNazn;
    }

    public int getTrain_num() {
        return train_num;
    }

    public int getNum_of_all_places() {
        return num_of_all_places;
    }

    public int getNum_of_coupe() {
        return num_of_coupe;
    }

    public int getNum_of_plackart() {
        return num_of_plackart;
    }

    public short getTimestartm() {
        return timestartm;
    }

    public short getTimestarth() {
        return timestarth;
    }

    public short getTimeendm() {
        return timeendm;
    }

    public short getTimeendh() {
        return timeendh;
    }

    /*Инициализирующий конструктор без параметров */
    public Train() {
        this.PunktNazn = "";
        this.train_num = 0;
        this.num_of_all_places = 0;
        this.num_of_coupe = 0;
        this.num_of_plackart = 0;
        this.timestartm = 0;
        this.timestarth = 0;
        this.timeendm = 0;
        this.timeendh = 0;
    }

    @Override
    public String toString() {
        return "Train{" +
                "PunktNazn='" + PunktNazn + '\'' +
                ", timestartm='" + timestartm + '\'' +
                ", timestarth='" + timestarth + '\'' +
                ", timeendm='" + timeendm + '\'' +
                ", timeendh='" + timeendh + '\'' +
                ", train_num=" + train_num +
                ", num_of_all_places=" + num_of_all_places +
                ", num_of_coupe=" + num_of_coupe +
                ", num_of_plackart=" + num_of_plackart +
                '}';
    }

    public void train_in_way() {
        System.out.println("Поезд в пути");
    }

    public void train_in_end() {
        System.out.println("Поезд прибыл на конечную станцию");
    }

    public void train_not_start() {
        System.out.println("Поезд не начинал движение");
    }
}

