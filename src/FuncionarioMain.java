public class FuncionarioMain {

    public static void main(String[] args){

        Funcionario funcionario = FuncionarioBuilder.criaFuncionario("ANALISTA", 1, "Ana", "12345678988", 8000.00);
        System.out.println("Funcionário: " + funcionario.getNome());

        // Folha de julho
        System.out.println(">> Folha de julho");
        System.out.println("Salário Bruto: " + funcionario.getSalarioBruto());
        Folha folhaJulho = new Folha(1, funcionario, "10/07/2021");
        folhaJulho.calcular();
        System.out.println("Salário Líquido: " + folhaJulho.getSalarioLiquido());

        // Folha de agosto
        System.out.println();
        System.out.println(">> Folha de agosto");
        Folha folhaAgosto = new Folha(2, funcionario, "10/08/2021");
        Desconto[] descontos = new Desconto[3];
        descontos[0] = new Desconto(1,"UNIMED: ",100.00);
        descontos[1] = new Desconto(2,"FARMÁCIA: ",250.00); //400,00
        descontos[2] = new Desconto(3,"SINDICATO: ",50.00);
        folhaAgosto.calcular(descontos);
        System.out.println("Salário Líquido: " + folhaAgosto.getSalarioLiquido());

        // Folha de setembro
        System.out.println();
        System.out.println(">> Folha de setembro");
        Folha folhaSetembro = new Folha(3, funcionario, "10/09/2021");
        Desconto[] descontosSetembro = new Desconto[3];
        descontosSetembro[0] = new Desconto(1,"UNIMED",100.00);
        descontosSetembro[1] = new Desconto(2,"FARMACIA",250.00); //400,00
        descontosSetembro[2] = new Desconto(3,"SINDICATO",50.00);
        folhaSetembro.calcular(descontosSetembro,1000.00);
        System.out.println("Salario Liquido::" + folhaSetembro.getSalarioLiquido());

    }
}
