public class FolhaPGTO {

    public static void main (String args[]){
        Mensalista men1, men2;
        Horista hora1, hora2;
    
        men1 = new Mensalista("Vanessa", "Rua Paraibuna","Junior");
        men1.calcularSalario();
        men1.calcularINSS();
        System.out.println("Nome: " + men1.getNome());
    
        System.out.println("EnderecoNome: " + men1.getEndereço());
        System.out.println("Salário: " + men1.getSalario ());

        men2 = new Mensalista("Ana", "Rua Feliz", "Pleno");
        men2.calcularSalario();
        men2.calcularINSS();
        System.out.println("Nome: " + men2.getNome());
        System.out.println("EnderecoNome: " + men2.getEndereço());
        System.out.println("Salário: " + men2.getSalario ());

        hora1 = new Horista("Carlos", "Rua: Central", 20);
        hora1.calcularSalario();
        System.out.println("Nome: " + hora1.getNome());
        System.out.println("EnderecoNome: " + hora1.getEndereço());
        System.out.println("Salário: " + hora1.getSalario ());

        hora2 = new Horista("Cristina", "Rua: das Flores", 100);
        hora2.calcularSalario();
        System.out.println("Nome: " + hora2.getNome());
        System.out.println("EnderecoNome: " + hora2.getEndereço());
        System.out.println("Salário: " + hora2.getSalario ());
    }
        
}
