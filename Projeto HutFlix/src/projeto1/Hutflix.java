package projeto1;

import javax.swing.JOptionPane;

public class Hutflix {

	public static void main(String[] args) {
		int telefone, filmes=0;
		String nome = null, endereco, t, f; 
		String humor,q, h, o, pizza, pizza1, pizza2;
		int inum = 1, opcao, op;

			while (inum <= 5) {
				
				nome = JOptionPane.showInputDialog("Seja bem vindo ao HutFlix!!\n\nDigite seu nome:");
				endereco = JOptionPane.showInputDialog("Digite seu endere�o:");
				t = JOptionPane.showInputDialog("Digite seu telefone:");
				telefone = Integer.parseInt(t);
				
				f = JOptionPane.showInputDialog("Por favor, qual � seu filme preferido? (Digite o numero)\n1 - Se Beber N�o Case (Com�dia/Aventura)\n2 - Os Vingadores (A��o/Fic��o Cient�fica)\n3 - O Iluminado (Terror/Suspense)\n4 - Titanic (Romance/Drama)\n5 - Harry Potter (Fantasia/Literatura)");
				opcao = Integer.parseInt(f);
				
				//if ((filmes = Integer.parseInt(f))<1 || (filmes = Integer.parseInt(f))>5 ) {JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida");filmes = Integer.parseInt(f);}

			// filme Se Beber N�o Case
			if (filmes == 1) {
				o = JOptionPane.showInputDialog("Escolha uma caracteristica (Digite um numero):\n1 - Imaginativos\n2 - Originais\n3 - Criativos ");
				opcao = Integer.parseInt(o);
				
				//if ((filmes = Integer.parseInt(f))<1 || (filmes = Integer.parseInt(f))>3 ) {JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida");filmes = Integer.parseInt(f);}
				
				q = JOptionPane.showInputDialog(" Gostaria de 1 ou 2 pizza? PROMO��O - Levando 2 ganha um Refri! ");
				op = Integer.parseInt(q);
				
				//op��o 1
				
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nBaiana\nBacon\nChocolate com confeitos");
					JOptionPane.showMessageDialog(null, "Sua pizza ser� enviada para o endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				else if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nBaiana\nBacon\nChocolate com confeitos");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nBaiana\nBacon\nChocolate com confeitos");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza: " + pizza2);
				}
				
				//op��o 2
				
				else if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nMu�arela\nCalabresa\nAlho");
					JOptionPane.showMessageDialog(null," Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				else if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nMu�arela\nCalabresa\nAlho");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nMu�arela\nCalabresa\nAlho");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o endere�o " + endereco + " a pizza 1: " + pizza1 + " e a pizza 2: " + pizza2);
				}
				
				//op��o 3
				
				else if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nSushi\nBatata Palha\nMilho c/ Catupiry");
					JOptionPane.showMessageDialog(null," Ser� enviado para o endere�o " + endereco + " a pizza: " + pizza);
				}
				
				else if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nSushi\nBatata Palha\nMilho c/ Catupiry)");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nSushi\nBatata Palha\nMilho c/ Catupiry)");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o endere�o " + endereco + " a pizza 1: " + pizza1 + " e a pizza 2: " + pizza2);
				}
			}
			
			// filme os vingadores
		
			if (filmes == 2) {
				o = JOptionPane.showInputDialog(" Escolha uma caracteristica (Digite um numero): \n1 - Ambiciosas\n2 - Disciplinadas\n3 - Confi�veis "); opcao = Integer.parseInt(o);
				opcao = Integer.parseInt(o);
				
				if ((filmes = Integer.parseInt(o))<1 || (filmes = Integer.parseInt(o))>3 ) {
					JOptionPane.showMessageDialog(null, "Digite uma op��o v�lida");
					filmes = Integer.parseInt(o);
				}
				
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? PROMO��O - Levando 2 ganha um refri! ");
				op = Integer.parseInt(q);
				
				//op��o 1
				
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nFrango com Catupiry\nRucula com tomate seco\nRomeu e Julieta\n"); 
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nFrango com Catupiry\nRucula com tomate seco\nRomeu e Julieta\n");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nFrango com Catupiry\nRucula com tomate seco\nRomeu e Julieta\n");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 2
				
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nAliche\nPortuguesa\nNapolitano\n");
					JOptionPane.showMessageDialog(null," Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nAliche\nPortuguesa\nNapolitano\n");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nAliche\nPortuguesa\nNapolitano\n");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 3
				
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog(" Digite o sabor da sua pizza:\nFrango Catupiry\nBacon\nMargarita");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o endere�o " + endereco + " a pizza: " + pizza);
				}
				
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nFrango Catupiry\nBacon\nMargarita");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nFrango Catupiry\nBacon\nMargarita");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
			}
			
			// filme O Iluminado
			
			if (filmes == 3) {
				o = JOptionPane.showInputDialog( "Escolha uma caracteristica (Digite um numero): \n1 - Pessimistas \n2 - Ansiosas \n3 - Autocr�ticas \n4 - Vulner�veis ao Estresse");
				opcao = Integer.parseInt(o);
				
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? PROMO��O - Levando 2 ganha um refri! ");
				op = Integer.parseInt(q);
				
				// op��o 1
				
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nMarguerita\nMilho\nBr�colis");
					JOptionPane.showMessageDialog(null," Ser� enviado para o endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane.showInputDialog(" Digite o primeiro sabor da sua pizza:\nMarguerita\nMilho\nBr�colis");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nMarguerita\nMilho\nBr�colis");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 2
				
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nQuatro Queijos\nBaiana\nCalifornia");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o endere�o:" + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nQuatro Queijos\nBaiana\ncalifornia");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nQuatro Queijos\nBaiana\ncalifornia");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 3
				
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nBrigadeiro\nLombo\nQuatro Queijos");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nBrigadeiro\nLombo\nQuatro Queijos");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nBrigadeiro\nLombo\nQuatro Queijos");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 4
				
				if (opcao == 4 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nMu�arela\nCalabresa\nNapolitano");
					JOptionPane.showMessageDialog(null," Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 4 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nMu�arela\nCalabresa\nNapolitano");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nMu�arela\nCalabresa\nNapolitano");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
			}
			
			// filme Titanic
			
			if (filmes == 4) {
				o = JOptionPane.showInputDialog(" Escolha uma caracteristica (Digite um numero): \n1 - Determinada\n2 - Centrada \n3 - Romantica ");
				opcao = Integer.parseInt(o);
				
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? levando 2 ganha um refri ! ");
				op = Integer.parseInt(q);
				
				//op��o 1
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nBr�colis\nAtum\nAlcachofra");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nBr�colis\nAtum\nAlcachofra");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nBr�colis\nAtum\nAlcachofra");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// opcao2
				
				if  (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nMu�arela\nCalabresa\nNapolitana");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nMu�arela\nCalabresa\nNapolitana");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nMu�arela\nCalabresa\nNapolitana");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 3
				
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nRomeu e Julieta\nQuatro Queijos\nBrigadeiro");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nRomeu e Julieta\nQuatro Queijos\nBrigadeiro");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nRomeu e Julieta\nQuatro Queijos\nBrigadeiro");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
			}
			
			// filme Harry Potter
			
			if (filmes == 5) {
				o = JOptionPane.showInputDialog( "Escolha uma caracteristica (Digite um numero):\n1 - Criativos\n2 - Curiosos\n3 - Inovador ");
				opcao = Integer.parseInt(o);
				
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? levando 2 ganha um refri ! ");
				op = Integer.parseInt(q);
				
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nFrango Catupiry\nPepperoni\nCanguru");
					JOptionPane.showMessageDialog(null," Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nFrango Catupiry\nPepperoni\nCanguru");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nFrango Catupiry\nPepperoni\nCanguru");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: "+ pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 2
				
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nSushi\nAliche\nHot-dog");
					JOptionPane.showMessageDialog(null," Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nSushi\nAliche\nHot-dog");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nSushi\nAliche\nHot-dog");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
				
				// op��o 3
				
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite o sabor da sua pizza:\nMu�arela\nAlho\nBacon");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o " + endereco + " a pizza de: " + pizza);
				}
				
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite o primeiro sabor da sua pizza:\nMu�arela\nAlho\nBacon");
					pizza2 = JOptionPane.showInputDialog("Digite o segundo sabor da sua pizza:\nMu�arela\nAlho\nBacon");
					JOptionPane.showMessageDialog(null, " Ser� enviado para o seu endere�o: " + endereco + " a pizza de: " + pizza1 + " e a pizza de: " + pizza2);
				}
			}
		}

		System.out.println("Voc� � o cliente n�mero: " + inum);
		inum++;
		
		JOptionPane.showMessageDialog(null, "Senhore " + nome + "\n Obrigada pela Compra e Volte sempre!!");
	}

}
