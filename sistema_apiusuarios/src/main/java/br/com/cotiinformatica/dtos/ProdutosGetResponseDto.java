package br.com.cotiinformatica.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProdutosGetResponseDto {

	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Double total;
}
