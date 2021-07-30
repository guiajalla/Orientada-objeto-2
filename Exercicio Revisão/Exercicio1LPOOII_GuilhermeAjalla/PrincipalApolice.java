
/**
 * Escreva a descrição da classe PrincipalApolice aqui.
 * 
 * @author (Guilherme Ajalla e Miguel Bomfanti) 
 * @version (número de versão ou data)
 */
public class PrincipalApolice
{
    public static void main(String[] args){
         Apolice novoObj = new Apolice();
         
         novoObj.getNome("Guilherme");
         novoObj.getIdade(25);
         novoObj.getPremio(8000.00);
         
         novoObj.Imprimir();
         
         novoObj.calcularPremioApolice();
         novoObj.Imprimir();
         
         novoObj.oferecerDesconto("Curitiba");
         novoObj.Imprimir();
         
    }
}
