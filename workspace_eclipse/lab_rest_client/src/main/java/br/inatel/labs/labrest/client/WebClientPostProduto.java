package br.inatel.labs.labrest.client;

import java.math.BigDecimal;

import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.labs.labrest.client.model.dto.ProdutoDTO;
import reactor.core.publisher.Flux;

public class WebClientPostProduto {
	
	public static void main(String[] args) {
		ProdutoDTO novoProduto = new ProdutoDTO();
		novoProduto.setDescricao("Martelo");
		novoProduto.setPreco(new BigDecimal(25.00));
		
		Flux<ProdutoDTO> produtoCriado = WebClient.create("http://localhost:8080")
				.post()
				.uri("/produto")
				.retrieve()
				.bodyToFlux(ProdutoDTO.class);
	}
}
