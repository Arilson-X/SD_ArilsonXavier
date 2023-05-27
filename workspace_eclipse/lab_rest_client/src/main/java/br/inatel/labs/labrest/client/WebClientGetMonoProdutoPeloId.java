package br.inatel.labs.labrest.client;

import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.labs.labrest.client.model.dto.ProdutoDTO;
import reactor.core.publisher.Mono;

public class WebClientGetMonoProdutoPeloId {
	
	public static void main(String[] args) {
		
		Mono<ProdutoDTO> monoProduto = WebClient.create("http://localhost:8080")
				.get()
				.uri("/produto/99")
				.retrieve()
				.bodyToMono(ProdutoDTO.class);
		
		monoProduto.subscribe();
		
		ProdutoDTO produto = monoProduto.block();
			
	}

}
