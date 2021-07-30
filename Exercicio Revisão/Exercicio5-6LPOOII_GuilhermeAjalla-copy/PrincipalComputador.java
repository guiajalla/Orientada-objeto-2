
/**
 * Escreva a descrição da classe PrincipalComputador aqui.
 * 
 * @author (Guilherme Ajalla + Miguel Bomfanti) 
 * @version (número de versão ou data)
 */
public class PrincipalComputador
{
    public static void main(String[] args){
        Computador novoPc = new Computador();
        
        novoPc.getMarca("HP");
        novoPc.getCor("Branca");
        novoPc.getModelo("2HC");
        novoPc.getNumeroSerie("123456");
        novoPc.getPreco(2500.00);
        novoPc.Imprimir();
        novoPc.calcularValor();
        
        Computador novoPc2 = new Computador();
        
        novoPc2.getMarca("IBM");
        novoPc2.getCor("Preto");
        novoPc2.getModelo("2CHJ");
        novoPc2.getNumeroSerie("123456");
        novoPc2.getPreco(2500.00);
        novoPc2.calcularValor();
        novoPc2.Imprimir();
        novoPc2.alterarValor(100.00);
        novoPc2.alterarValor(-100.00);
        novoPc2.Imprimir();
    }
}
