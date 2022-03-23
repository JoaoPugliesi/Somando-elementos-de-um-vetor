
public class SomarVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor[] = {2,4,6,8};
		int soma = 0;
		for(int i = 0; i <= 3; i++) {
			System.out.println("O índice " + i + " recebe o valor " + valor[i]);
			soma += valor[i];
		}
		System.out.println("A soma dos elementos do vetor é igual a " + soma + "!");
	}

}
