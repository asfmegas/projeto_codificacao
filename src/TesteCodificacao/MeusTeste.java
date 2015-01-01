package TesteCodificacao;
import java.io.IOException;

import javax.swing.JOptionPane;

import br.com.asf.Codec;
import br.com.asf.Decodec;
import br.com.asf.SaveCode;


public class MeusTeste {

	/**
	 * @param Alexsandro Façanha
	 * @since 2013
	 */
	public static void main(String[] args) {
		
		/*
		Codec codec = new Codec();
		SaveCode sv = new SaveCode();
		
		String codigo = codec.criarCodigo("senha cartão de crédito: 2585d4dq9913q");
		
		try{
			sv.verificarArquivo("minha_senha", codigo);
			System.out.println("Salvo com sucesso!");
		}catch(IOException e){
			System.out.println("Erro ao salvar dados");
		}
		
		*/
		Decodec dec = new Decodec();
		String cod = JOptionPane.showInputDialog("Digite o código:");
		JOptionPane.showMessageDialog(null, dec.receberDados(cod));
	}
}