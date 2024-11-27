package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	
	private String nome; 
	private NivelTrabalhador nivel; 
	private Double baseSalarial; 
	
	private Departamento departamento; 
	private List<Contratos>contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double baseSalarial, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected NivelTrabalhador getNivel() {
		return nivel;
	}

	protected void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	protected Double getBaseSalarial() {
		return baseSalarial;
	}

	protected void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	protected Departamento getDepartamento() {
		return departamento;
	}

	protected void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	protected List<Contratos> getContratos() {
		return contratos;
	}

	
	public void addContrato(Contratos contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(Contratos contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		Calendar cal = Calendar.getInstance();
		double soma = baseSalarial;
		for (Contratos c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
		    int c_mes = 1+cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.total();
			}
		}
		return soma;
	}
	
	
}
