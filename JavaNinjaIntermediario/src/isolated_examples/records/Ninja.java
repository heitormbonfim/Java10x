package isolated_examples.records;

public record Ninja(String name, String email, String phone) {
  public String nameUpperCased() {
    return this.name.toUpperCase();
  }
  // PEGADINHAS DE RECORDS
  // 1. Todos os atributos são finals
  // 2. Records não tem setters (pq são finals)
  // 3. Não pode acessar os mesmos métodos que uma class teria.
  // 4. getters já são padrão, não são chamdos como .getValue(), seria só .value()
  // // ex: ninja.getName(); seria -> ninja.name();
}
