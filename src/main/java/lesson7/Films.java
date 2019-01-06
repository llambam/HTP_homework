package lesson7;

public class Films {


    public void filmsCollection() {

        Inner inner = new Inner();

        Inner[] films = new Inner[inner.numberOfFilmsInCollection];
        for (int i = 0; i < inner.numberOfFilmsInCollection - 1; i++) {
            System.out.println(films[i] = new Inner ("Li Jonson", 156+i,"Comedy"));
        }

    }

    class Inner extends Films {
        private String producer;
        private int duration;
        private String genr;
        private int numberOfFilmsInCollection=5;

        @Override
        public String toString() {
            return "Film{" +
                    "producer='" + producer + '\'' +
                    ", duration=" + duration +
                    ", genr='" + genr + '\'';

        }

        public Inner() {
        }

        public Inner(String producer, int duration, String genr) {
            this.producer = producer;
            this.duration = duration;
            this.genr = genr;
        }
    }

}
//    Создать класс Фильм с внутренним классом, с помощью объектов которого можно хранить информацию
// о продолжительности, жанре и режиссерах фильма. Создать коллекцию фильмов и вывести ее.
