package composicao;

import java.util.Date;

public class Contratos {
	
	private Date data; 
	private Double valorHora; 
	private Integer Hora; 
	
	
	public Contratos() {
		
	}

	public Contratos(Date data, Double valorHora, Integer hora) {
		super();
		this.data = data;
		this.valorHora = valorHora;
		Hora = hora;
	}

	protected Date getData() {
		return data;
	}

	protected void setData(Date data) {
		this.data = data;
	}

	protected Double getValorHora() {
		return valorHora;
	}

	protected void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	protected Integer getHora() {
		return Hora;
	}

	protected void setHora(Integer hora) {
		Hora = hora;
	}

	public double total() {
		return valorHora * Hora;
	}

}
