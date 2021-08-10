public class Arquiteto extends Funcionario{

    public Arquiteto(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Arquiteto(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Arquiteto(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.15;
    }
}
