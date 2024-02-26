public class Train {
    String PunktNazn;
    int train_num, num_of_all_places, num_of_coupe, num_of_plackart;
    short timestartm, timestarth, timeendm, timeendh;


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

