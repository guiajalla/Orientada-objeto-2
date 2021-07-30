
/**
 * Exercício 1. Desenvolver uma classe Java chamada Apolice com os seguintes 
 * atributos: nomeSegurado, idade e valorPremio. A classe Apolice deverá 
 * conter os seguintes métodos:
 * 
 * Método:
 * imprimir() -> Este método não retorna valor e deverá mostrar na 
 * tela todos os atributos da classe Apolice. Para 
 * imprimir em Java usa-se o comando
 * System.out.println(NOME_ATRIBUTO).
 * 
 * calcularPremioApolice()-> Este método não retorna valor e deverá calcular o 
 * valor do prêmio seguindo as seguintes regras: 
 * caso a idade seja superior a 18 e menor ou igual a 
 * 25 anos, use a fórmula: valorPremio+=(valorPremio * 20)/100. Quando a idade for 
 * superior a 25 e menor ou igual a 36 anos, use a fórmula valorPremio += (valorPremio * 15)/100. 
 * Quando a idade for superior a 36, use a fórmula valorPremio += (valorPremio * 10)/100.
 * 
 * oferecerDesconto() -> Este método não retorna valor, mas recebe o 
 * parâmetro cidade, que irá conter o nome da 
 * cidade para o cálculo do desconto. Caso a cidade 
 * seja Curitiba, dê um desconto no valor do prêmio 
 * de 20%. Caso seja Rio de Janeiro, dê um desconto 
 * no valor do prêmio de 15%. Caso seja São Paulo, 
 * dê um desconto no valor do prêmio de 10%. Caso 
 * a cidade seja Belo Horizonte, dar um desconto no 
 * valor do prêmio de 5%.
 */
public class Apolice
{
    private String nomeSegurado;
    private int idade;
    private double valorPremio;
    
    
    public void getNome(String nomeSegurado){
        this.nomeSegurado = nomeSegurado;
    }
    
    public void getIdade(int idade){
        this.idade = idade;
    }
    
    public void getPremio(double valorPremio){
        this.valorPremio = valorPremio;
    }
    
    public void Imprimir(){
        System.out.println(nomeSegurado);
        System.out.println(idade);
        System.out.println(valorPremio);    
    }
    
    public void calcularPremioApolice(){
        if(idade>18 && idade<=25){
            valorPremio+=(valorPremio*20)/100;
        }
        else if(idade>25 && idade<=36){
            valorPremio += (valorPremio * 15)/100;
        }
        else{
            valorPremio += (valorPremio * 10)/100;
        }
    }
    
    public void oferecerDesconto(String nomeCidade){
        if(nomeCidade=="Curitiba"){
            valorPremio*=0.20;
        }
        else if(nomeCidade=="Rio de Janeiro"){
            valorPremio*=0.15;
        }
        else if(nomeCidade=="Sao Paulo"){
            valorPremio*=0.10;
        }
        else if(nomeCidade=="Belo Horizonte"){
            valorPremio*=0.5;
        }
    }
}
