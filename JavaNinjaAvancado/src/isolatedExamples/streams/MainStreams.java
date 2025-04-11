package isolatedExamples.streams;

import java.util.ArrayList;
import java.util.List;

public class MainStreams {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto", "Folha", 19));
        ninjas.add(new Ninja("Sasuke", "Folha", 17));
        ninjas.add(new Ninja("Gaara", "Areia", 18));
        ninjas.add(new Ninja("Temari", "Areia", 20));

        System.out.println("========= Filtering ==========");
        ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Folha"))
                .forEach(System.out::println); // soutc

        System.out.println("========== Sorting ===========");
        ninjas.stream()
                .sorted((o1, o2) -> o1.getNome().compareTo(o2.getNome()))
                .forEach(System.out::println);


        System.out.println("============ Mapping ============");
        ninjas.stream()
                .map(Ninja::getNome
                )
                .forEach(System.out::println);


        System.out.println("=========== Elder ninja ============");
        Ninja elseNinja = ninjas.stream()
                .max((o1, o2) -> Integer.compare(o1.getIdade(), o2.getIdade()))
                .orElse(null);

        System.out.println(elseNinja);
    }
}
