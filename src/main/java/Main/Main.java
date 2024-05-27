package Main;

public class Main {
    public static void main(String[] args) {
        String primeiroNome = "italo";
        String segundoNome = "Rafael";

        // no caso aqui o valor da variavel abaixo e a chamada de um metodo
        String nomeCompleto = nomeCompleto(primeiroNome , segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeeiroNome , String segundoNone){
        return primeeiroNome.concat(" ").concat(segundoNone).toUpperCase();
    }
}
