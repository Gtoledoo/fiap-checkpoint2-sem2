package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Pedido;
import lombok.Data;

@Data
public class PedidoRequestUpdateDto {
	private Long idCliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;
    private static final ModelMapper modelMapper = new ModelMapper();
    
	
	public Pedido toModel(Long id) {
		Pedido result = modelMapper.map(this, Pedido.class);
        result.setId(id);
        return result;
    }   
}
