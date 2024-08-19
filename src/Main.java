public class Main {
    public static void main(String[] args) {
        //Declaração das variaveis e manipulação
        String nome = "Gabriel";
        int idade1 = 17;
        float sal_bruto = 3598.32f;
        double meses_traba = 9.5;
        int qnt_itens_comp = 498;
        double sal_bruto_ano = sal_bruto * meses_traba;
        double sal_liq_ano = sal_bruto_ano  - 2000;
        double med_valor_itens = 38.90;
        String retorno = "Olá "+nome+" seu salário líquido anual é de: "+sal_liq_ano;
        //Exibição dos resultados
        System.out.println(retorno);
        System.out.println("Sua idade é "+idade1+" ano(s)");
        System.out.println("Seu salário bruto mensal é de: "+sal_bruto+" e seu salário bruto anual é de: "+sal_bruto_ano);
        System.out.println("Foram comprados: "+qnt_itens_comp+" itens, com um media por item de: "+med_valor_itens);
        System.out.println("Você gastou, nesse ano, "+qnt_itens_comp*med_valor_itens+" reais em itens");+
    }
}